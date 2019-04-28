package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class CheckTypes extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private ArrayList<Expression> expressions;
    private Errors errors;

    public CheckTypes(SymbolTable symTable, ArrayList expressions, Errors errors) {
        this.symTable = symTable;
        this.expressions = expressions;
        this.errors = errors;
    }

    private Optional<Expression> findExprByText(String expText) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText))
                .findFirst();

        return expression;
    }

    /**
     *
     * @param expText
     * @param parent
     * @return expression
     */
    private Optional<Expression> findExprByTextParent(String expText, String parent) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x ->  x.getParent() != null && x.getParent().getText().equals(parent) && x.getText().equals(expText))
                .findFirst();
        // le retour peut etre une variable globale
        if (!expression.isPresent()){
            expression = this.expressions.stream()
                    .filter(x -> x.getText().equals(expText))
                    .findFirst();
        }
        return expression;
    }

    private Optional<Expression> findExprByTextAndSymbolType(String expText, String type) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText) && x.getSymbolTypeName().equals(type))
                .findFirst();

        return expression;
    }


    private Optional<Expression> findExprArrayByText(String expText, RuleContext ctx) {
        try {
//            System.out.println("FUNCTION : "+ctx.getParent().getParent().getParent().getText());
            PlayPlusParser.FuncDeclContext parentFunction = (PlayPlusParser.FuncDeclContext) ctx.getParent().getParent().getParent();
//            System.out.println("FUNCTION ID : "+parentFunction.ID().getText());
            Optional<Expression> functExpr = findExprByText(parentFunction.ID().getText());
//            System.out.println("FUNCTION EXPR : "+functExpr.get());

            Optional<Expression> expression = this.expressions.stream()
                    .filter(x -> x.getParent() != null && x.getParent().getText().equals(functExpr.get().getText()) && ctx.getChild(0).getText().equals(x.getText()))
                    .findFirst();

            if (expression.isPresent()){
//                System.out.println("Expr Local : "+ expression.get().getText());
                return expression;
            }

        } catch (ClassCastException e) {
//            System.out.println("Pas une fonction");
        }

        String finalExpText = expText;
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(finalExpText))
                .findFirst();

        if (!expression.isPresent()) { // Si on ne la  trouve pas directement on va voir si ce n'est pas un tableau
            if (expText.contains("[")) {
                expText = StringUtils.substringBefore(expText,"[");
//                System.out.println("expText" + expText);

            String finalExpText1 = expText;
            expression = this.expressions.stream()
                    .filter(x -> x.getSymbolTypeName().equals("arrayVariable") && x.getText().equals(finalExpText1))
                    .findFirst();
            }if (expText.contains("(")) {
                expText =StringUtils.substringBefore(expText,"(");
                String finalExpText2 = expText;
                expression = findExprByText(finalExpText2);
            }
            else{
                // Maybe c'est une expression  on va chercher juste la 1ére valeur  vu que le reste est deja calculé dans ExprEnt ou Bool
                expText =StringUtils.substringBefore(expText,"+");
//                System.out.println("exprG: " + StringUtils.substringBefore(expText,"+-*/"));
                expression = findExprByText(expText);
            }
        }
        return expression;
    }

    @Override
    public void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        evalAFFECT(ctx);
    }

    private void evalAFFECT(PlayPlusParser.AffectInstrContext ctx) {
//        System.out.println("AFFECT : "+ctx.getText());
        if (ctx.getChildCount() < 3) {
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprArrayByText(leftPartName, ctx);
        Optional<Expression> rightPart = findExprArrayByText(rightPartName, ctx);

//        System.out.println(leftPartName + " : leftPart " + leftPart.toString());
//        System.out.println(rightPartName + " : rightPart " + rightPart.toString());

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
//            System.out.println("types Ok");
        } else {
            errors.badTypeError.add("Error Types Affectation in"+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" et "+rightPart.get().getText());
        }
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String text = ctx.ID().getText();
        Optional<Expression>  expr = findExprArrayByText(text,ctx);

        String typeRet= ctx.returnInstr().getChild(1).getText();

        System.out.println("Return instruction " + typeRet);
        Optional<Expression>  exprRet = findExprByTextParent(typeRet,text);

        if (!expr.get().getBuiltInTypeName().equals(exprRet.get().getBuiltInTypeName())) {
            errors.badTypeError.add("Error avec le type de retour de la fonction " + text + " type attendu " +expr.get().getBuiltInTypeName() + " recu " + exprRet.get().getBuiltInTypeName() );
        }

    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        checknbArgsFunctCall(ctx);
    }

    private void checknbArgsFunctCall(PlayPlusParser.FuncCallContext ctx) {
        String funName =ctx.ID().getText();// SymbolNamesHelper.generateName("FunctionSymbol", ctx.ID().getText());
        int nbArgs = 0;

        Optional<Expression> funExpr = findExprByText(funName);
        long  size =countArgumentFonct(funName) ;

        // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
        Iterator vars = ctx.funcCallArgs().funcCallArg().listIterator();
        while (vars.hasNext()) {
            System.out.println("");
            Object var = vars.next();
            String varName = ((PlayPlusParser.FuncCallArgContext) var).exprD().children.get(0).getText();
            String val = ((PlayPlusParser.FuncCallArgContext) var).exprD().getText();

            if (varName.length() != 0) { // Si la chaine au bout est vide, car il crée l'arborescence meme s'il n'y a pas de parametre
                nbArgs++;
                checkArgsFunctCall(varName, nbArgs);
            }
        }


        if (size!= nbArgs) {
            this.errors.functionError.add("Le nombre de paramètres de la fonction " + nbArgs + " ne corresponde pas à ceux de la déclaration (" + size + ")");
            return;
        }
        System.out.println("");
    }

    private long countArgumentFonct(String parent) {
        long args = this.expressions.stream()
                .filter(x ->  x.getSymbolTypeName().equals("argument") && x.getParent().getText().equals(parent))
                .count();
        System.out.println("args " + args );
        return args;
    }

    private void checkArgsFunctCall(String argNameCall, int pos) {
        // essayer de faire un getType sur la valeur qu'on recoit
        //System.out.println("argNameCall " + argNameCall );

        Optional<Expression> resultArgs = findExprByTextAndSymbolType(argNameCall,"expr");
        // on check les types des arguments de la fonction

       // Optional<Expression> argFunc = findExprByTextAndSymbolType(argNameDecl,"argument");

        if (! resultArgs.isPresent()) {
            this.errors.badTypeError.add("APPEL DE FONCTION (def): not find arguments");
            return;
        }

        Optional<Expression> argFunc = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals("argument") && x.getPosition()== pos)
                .findFirst();

        if (! argFunc.isPresent()) {
            this.errors.badTypeError.add("APPEL DE FONCTION (call) : not find arguments");
            return;
        }


        System.out.println("Argument " + argFunc.toString());
        System.out.println("Argument call  " + resultArgs.toString());

        // Reste a checker que les types correspondent bien
        if (!argFunc.get().getBuiltInTypeName().equals(resultArgs.get().getBuiltInTypeName())) {
            this.errors.badTypeError.add("APPEL DE FONCTION : types incompatibles : attendu " + argFunc.get().getBuiltInTypeName() + " recu " + resultArgs.get().getBuiltInTypeName());
        }

        System.out.println("");
    }

    private Symbol getFunc(String funName){
        Scope currentScope = this.symTable.getCurrentScope();
        Symbol func = resolveSymbolRec(funName, currentScope);
        if (func == null) {
             this.errors.symbolNotFound.add("Function "+ funName +" do not exist");
        }
        if (func instanceof VariableSymbol) {
            this.errors.functionError.add(funName +" is not a function");
        }
        return func;
    }

    private Symbol resolveSymbolRec(String name, Scope currentScope) {
        Symbol symbol = currentScope.resolve(name);

        if (symbol == null && currentScope.getEnclosingScope() == null) {
            return null;
        }

        if (symbol != null) {
            return symbol;
        }

        return resolveSymbolRec(name, currentScope.getEnclosingScope());
    }

    @Override
    public void exitWhileStmt(PlayPlusParser.WhileStmtContext ctx) {
//        System.out.println(ctx.getText());
        String conditionText = ctx.boolCondition().getText();
        if (isBoolCondition(conditionText)) {
            errors.badTypeError.add("ERROR WHILE condition in "+conditionText+" n'est pas une expression booléenne");
        }
    }

    @Override
    public void exitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
//        System.out.println(ctx.getText());
        String conditionText = ctx.boolCondition().getText();
        if (isBoolCondition(conditionText)) {
            errors.badTypeError.add("ERROR IF condition in "+conditionText+" n'est pas une expression booléenne");
        }
    }

    private boolean isBoolCondition(String conditionText) {
        Optional<Expression> condition = findExprByText(conditionText);

        if (! condition.isPresent()) {
            return false;
        }

        if (! condition.get().getBuiltInTypeName().equals("bool")) {
            return true;
        }

        return false;
    }

    @Override
    public void exitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx) {
        System.out.println(ctx.getText());
        String conditionText = ctx.repeatCondition().getText();
        checkIntConditionType(conditionText);
    }

    private void checkIntConditionType(String conditionText) {
        Optional<Expression> condition = findExprByText(conditionText);

        if (! condition.isPresent()) {
            return;
        }

        if (! condition.get().getBuiltInTypeName().equals("int")) {
            errors.badTypeError.add("ERROR Repeat condition in "+conditionText+" n'est pas une expression entière");
        }
    }
}
