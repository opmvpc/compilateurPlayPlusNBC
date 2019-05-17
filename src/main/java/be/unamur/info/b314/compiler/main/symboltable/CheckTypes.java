package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.Iterator;
import java.util.Optional;

/**
 * @overview Vérififcation des types
 * @specfiled symTable : SymbolTable la table des symboles
 * @specfiled errors:Errors
 *
 */
public class CheckTypes extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private Errors errors;

    /**
     * Constructeur
     * 
     * @param symTable
     *            la table des symboles
     * @param errors
     *            les erreurs
     */
    public CheckTypes(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));
    }

    @Override
    public void enterMainProgram(PlayPlusParser.MainProgramContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));
    }

    @Override
    public void exitMainProgram(PlayPlusParser.MainProgramContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));

    }

    @Override
    public void enterWhileStmt(PlayPlusParser.WhileStmtContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));
    }

    private Optional<Symbol> resolveFunc(String funName) {
        Scope currentScope = this.symTable.getCurrentScope();
        System.out.println("currentscope : " + currentScope.getScopeName());
        Optional<Symbol> func = resolveSymbolRec(funName, currentScope);
        if (!func.isPresent()) {
            this.errors.symbolNotFound.add("Function " + funName + " do not exist");
        }
        return func;

    }

    private Optional<Symbol> resolveSymbolRec(String name, Scope currentScope) {
        System.out.println("resolveSymbolRec : scope = " + currentScope.getScopeName());
        System.out.println("resolveSymbolRec : expr = " + name);
        Optional<Symbol> symbol = currentScope.resolveByName(name);
        if (!symbol.isPresent() && currentScope.getEnclosingScope() == null) {
            return Optional.empty();
        }
        if (symbol.isPresent()) {
            return symbol;
        }
        return resolveSymbolRec(name, currentScope.getEnclosingScope());
    }

    @Override
    public void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        evalAFFECT(ctx);
    }

    /**
     * Vérifie s'il n'y a pas d'erreur de type dans une affectation
     * 
     * @param ctx
     *            AffectInstrContext
     */
    private void evalAFFECT(PlayPlusParser.AffectInstrContext ctx) {
        // System.out.println("AFFECT : "+ctx.getText());
        if (ctx.getChildCount() < 3) {
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Symbol> leftPart = resolveSymbolRec(leftPartName, symTable.getCurrentScope());
        Optional<Symbol> rightPart = resolveSymbolRec(rightPartName, symTable.getCurrentScope());

        // System.out.println(leftPartName + " : leftPart " + leftPart.toString());
        // System.out.println(rightPartName + " : rightPart " + rightPart.toString());

        if (!leftPart.isPresent() || !rightPart.isPresent()) {
            return;
        }
        if (leftPart.get().getType().getName().equals(rightPart.get().getType().getName())) {
            // System.out.println("types Ok");
        } else {
            errors.badTypeError.add("Error Types Affectation in" + ctx.getText()
                    + " : Les types des variables suivantes sont imcompatibles : " + leftPart.get().getName() + " et "
                    + rightPart.get().getName());
        }
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String text = ctx.ID().getText();
        FunctionSymbol functExpr = (FunctionSymbol) this.symTable.getScopes().get(ctx);

        String typeRet = ctx.returnInstr().getChild(1).getText();

        // System.out.println("Return instruction " + typeRet);// Erreur lorsque void
        if (typeRet.equals("void") && functExpr.getType().getName().equals(typeRet)) {
            // errors.badTypeError.add("Error avec le type de retour de la fonction " + text + " recu " + typeRet);
            return;
        }

        // Optional<Symbol> exprRet = functExpr.resolveByNameAndType(text, typeRet);

        Optional<Symbol> exprRet = resolveSymbolRec(typeRet, symTable.getCurrentScope());

        if (!functExpr.getType().getName().equals(exprRet.get().getType().getName())) {
            errors.badTypeError.add("Error avec le type de retour de la fonction " + text + " type attendu "
                    + functExpr.getType().getName() + " recu " + exprRet.get().getType().getName());
        }

        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        checknbArgsFunctCall(ctx);
    }

    /**
     * Verifie que le nombre d'arguments recu est correct et decompose ces arguments pour vérifier qu'il sont corrects
     * 
     * @param ctx
     *            FuncCallContext
     */
    private void checknbArgsFunctCall(PlayPlusParser.FuncCallContext ctx) {
        String funName = ctx.ID().getText();// SymbolNamesHelper.generateName("FunctionSymbol", ctx.ID().getText());
        int nbArgs = 0;

        Optional<Symbol> funExpr = resolveFunc(funName);

        if (funExpr.isPresent()) {
            FunctionSymbol function = (FunctionSymbol) funExpr.get();

            long size = function.getArgs().size();
            // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
            Iterator vars = ctx.funcCallArgs().funcCallArg().listIterator();
            while (vars.hasNext()) {
                Object var = vars.next();
                String varName = ((PlayPlusParser.FuncCallArgContext) var).exprD().getText();
                // System.out.println("ARGNAME = "+varName);
                if (varName.length() != 0) { // Si la chaine au bout est vide, car il crée l'arborescence meme s'il n'y
                                             // a pas de parametre
                    nbArgs++;
                    // trouver l'argument déclaré
                    Symbol funcDeclArg = function.getArgs().get(nbArgs - 1);
                    // trouvé l'expression utilisée comme argument dans l'appel de la fonction
                    Optional<Symbol> funcCallArg = resolveSymbolRec(varName, symTable.getCurrentScope());
                    // comparer les types

                    if (!funcDeclArg.getType().getName().equals(funcCallArg.get().getType().getName())) {
                        this.errors.badTypeError.add("APPEL DE FONCTION " + funName + " pour ( "
                                + funcCallArg.get().getName() + " ) : types incompatibles : attendu "
                                + funcDeclArg.getType().getName() + " recu " + funcCallArg.get().getType().getName());
                    }

                }
            }

            if (size != nbArgs) {
                this.errors.functionError.add("Le nombre de paramètres " + nbArgs + " de la fonction  " + funName
                        + " ne corresponde pas à ceux de la déclaration (" + size + ")");
                return;
            }

        } else {
            this.errors.functionError.add("La fonction " + funName + " n'a pas été déclaré ");

        }
    }

    // /**
    // *
    // * @param parent nom de la fonction
    // * @return le nombre d'argument de la fonction parent
    // */
    // private long countArgumentFonct(String parent) {
    // long args = this.expressions.stream()
    // .filter(x -> x.getSymbolTypeName().equals("argument") && x.getParent().getText().equals(parent))
    // .count();
    // return args;
    // }

    // /**
    // * Comparaison entre un argument reçu en paramètre et l'argument correspondant dans la déclaration de la fonction
    // * @param argNameCall nom de l'argument de l'appel de fonction
    // * @param pos position dans l'appel
    // * @param funName nom de la fonction parent
    // */
    // private void checkArgsFunctCall(String argNameCall, int pos , String funName) {
    // // essayer de faire un getType sur la valeur qu'on recoit
    // //System.out.println("argNameCall " + argNameCall + "funName" + funName);
    //
    // Optional<Expression> resultArgsCall = findExprByTextParent(argNameCall,funName);
    // if (!resultArgsCall.isPresent()) {
    // this.errors.badTypeError.add("APPEL DE FONCTION (def): not find arguments");
    // return;
    // }
    //
    // Optional<Expression> argFuncDecl = findExprByTextAndSymbolType("argument", pos , funName);
    // if (!argFuncDecl.isPresent()) {
    // this.errors.badTypeError.add("APPEL DE FONCTION : pas d'argument dans la déclaration de la fonction " + funName+
    // " à cette position ");
    // return;
    // }
    //
    // // System.out.println("Argument " + argFuncDecl.toString());
    // // System.out.println("Argument call " + resultArgsCall.toString());
    //
    // // Reste a checker que les types correspondent bien
    // if (!argFuncDecl.get().getBuiltInTypeName().equals(resultArgsCall.get().getBuiltInTypeName())) {
    // this.errors.badTypeError.add("APPEL DE FONCTION "+ funName +" pour ( "+ resultArgsCall.get().getText() +" ) :
    // types incompatibles : attendu " + argFuncDecl.get().getBuiltInTypeName() + " recu " +
    // resultArgsCall.get().getBuiltInTypeName());
    // }
    //
    // }

    @Override
    public void exitWhileStmt(PlayPlusParser.WhileStmtContext ctx) {
        // System.out.println(ctx.getText());
        String conditionText = ctx.boolCondition().getText();
        if (isBoolCondition(conditionText)) {
            errors.badTypeError
                    .add("ERROR WHILE condition in " + conditionText + " n'est pas une expression booléenne");
        }

        symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void exitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
        // System.out.println(ctx.getText());
        String conditionText = ctx.boolCondition().getText();
        if (isBoolCondition(conditionText)) {
            errors.badTypeError.add("ERROR IF condition in " + conditionText + " n'est pas une expression booléenne");
        }

        symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void exitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx) {
        System.out.println(ctx.getText());
        String conditionText = ctx.repeatCondition().getText();
        checkIntConditionType(conditionText);
        // symTable.setCurrentScopeToEnclosingOne();
    }

    /**
     *
     * @param conditionText
     * @return true si c'est une expression booléenne
     */
    private boolean isBoolCondition(String conditionText) {
        // System.out.println("Condition Bool = "+conditionText);
        Optional<Symbol> condition = resolveSymbolRec(conditionText, symTable.getCurrentScope());

        if (!condition.isPresent()) {
            return false;
        }

        System.out.println(condition.get().getType().getName());

        if (!condition.get().getType().getName().equals("bool")) {
            return true;
        }

        return false;
    }

    /**
     * Vérifie si la condition est une expression entière
     * 
     * @param conditionText
     */
    private void checkIntConditionType(String conditionText) {
        Optional<Symbol> condition = resolveSymbolRec(conditionText, symTable.getCurrentScope());

        if (!condition.isPresent()) {
            return;
        }

        if (!condition.get().getType().getName().equals("int")) {
            errors.badTypeError.add("ERROR Repeat condition in " + conditionText + " n'est pas une expression entière");
        }
    }
}
