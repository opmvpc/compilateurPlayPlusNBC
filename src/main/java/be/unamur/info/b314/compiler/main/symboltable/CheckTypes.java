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

    private Optional<Expression> findExprArrayByText(String expText) {
        String finalExpText = expText;
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(finalExpText))
                .findFirst();

        if (!expression.isPresent()) { // Si on ne la  trouve pas directement on va voir si ce n'est pas un tableau
            if (expText.contains("[")) {
                expText = StringUtils.substringBefore(expText,"[");
                System.out.println("expText" + expText);

            String finalExpText1 = expText;
            expression = this.expressions.stream()
                    .filter(x -> x.getSymbolTypeName().equals("arrayVariable") && x.getText().equals(finalExpText1))
                    .findFirst();
            }else{
                // Maybe c'est une expression  on va chercher juste la 1ére valeur  vu que le reste est deja calculé dans ExprEnt ou Bool
                expText =StringUtils.substringBefore(expText,"+");
                System.out.println("exprG: " + StringUtils.substringBefore(expText,"+-*/"));
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
        if (ctx.getChildCount() < 3) {
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprArrayByText(leftPartName);
        Optional<Expression> rightPart = findExprArrayByText(rightPartName);

        System.out.println(leftPartName + " : leftPart " + leftPart.toString());
        System.out.println(rightPartName + " : rightPart " + rightPart.toString());

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
            System.out.println("types Ok");
        } else {
            errors.badTypeError.add("Error Types Affectation in"+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" et "+rightPart.get().getText());
        }
    }


    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        checknbArgsFunctCall(ctx);

      /*  String funName = SymbolNamesHelper.generateName("FunctionSymbol", ctx.ID().getText());
        int nbArgs = 0;

        Boolean isAssigned = true;

        Optional<Expression> result = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals("function") && x.getText().equals(ctx.ID().getText()))
                .findFirst();

       if (! result.isPresent()) {
            System.out.println("erreur");
            return;
        }
        System.out.println("funCall : " + result);

      // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
        Iterator vars = ctx.funcCallArgs().funcCallArg().listIterator();
        while (vars.hasNext()) {
            Object var = vars.next();
            String varName = ((PlayPlusParser.FuncCallArgContext) var).exprD().children.get(0).getText();
            // defcall.addExpr(varName,resolveType("int"));
            if (varName.length() != 0) { // Si la chaine au bout est vide, car il crée l'arborescence meme s'il n'y a pas de parametre
                nbArgs++;
            }
            String val = ((PlayPlusParser.FuncCallArgContext) var).exprD().getText();
            System.out.println("varName" + varName +"value " + val );// le contenu
            // essayer de faire un getType sur la valeur qu'on recoit
            Optional<Expression> resultArgs = this.expressions.stream()
                    .filter(x -> x.getSymbolTypeName().equals("expr") && x.getText().equals(varName))
                    .findFirst();
            System.out.println("resultArgs"+ resultArgs);

            if (!result.isPresent()) {
                System.out.println("erreur"+ resultArgs);
                return;
            }else{
                // on check les types
            }
        }
        checknbArgsFunctCall1(funName, nbArgs);
        System.out.println("");
*/
    }

    private void checknbArgsFunctCall(PlayPlusParser.FuncCallContext ctx) {
        System.out.println("checknbArgsFunctCall");
        String funName = SymbolNamesHelper.generateName("FunctionSymbol", ctx.ID().getText());
        FunctionSymbol f = (FunctionSymbol) getFunc(funName);
        int nbArgs = 0;

        Boolean isAssigned = true;

        // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
        Iterator vars = ctx.funcCallArgs().funcCallArg().listIterator();
        while (vars.hasNext()) {
            Object var = vars.next();
            String varName = ((PlayPlusParser.FuncCallArgContext) var).exprD().children.get(0).getText();
            String val = ((PlayPlusParser.FuncCallArgContext) var).exprD().getText();

            if (varName.length() != 0) { // Si la chaine au bout est vide, car il crée l'arborescence meme s'il n'y a pas de parametre
                nbArgs++;

                System.out.println("varName: " + varName + "- value: " + val);// le contenu
                // essayer de faire un getType sur la valeur qu'on recoit
                Optional<Expression> resultArgs = this.expressions.stream()
                        .filter(x -> x.getSymbolTypeName().equals("expr") && x.getText().equals(varName))
                        .findFirst();

                if (!resultArgs.isPresent()) {
                    System.out.println("Erreur recherche varName ");
                    return;
                } else {
                    Expression e = resultArgs.get();
                    // on check les types des arguments de la fonction
                    if (f.getSymbols().size() > 0) { // Il y a des arguments à la fonction
                        for (Map.Entry<String, Symbol> entry : f.getSymbols().entrySet()) {
                            String cle = entry.getKey();
                            Symbol valeur = entry.getValue();
                            String typeName = SymbolNamesHelper.generateNiceName(valeur.getType().getName());

                            // Reste a checker que les types correspondent bien
                            if (!typeName.equals(e.getBuiltInTypeName())) {
                                this.errors.badTypeError.add("APPEL DE FONCTION : types incompatibles : attendu " + typeName + " recu " + e.getBuiltInTypeName());
                            }
                        }
                    }
                }
            }
        }
        if (f.getSymbols().size() != nbArgs) {
            this.errors.functionError.add("Le nombre de paramètres de la fonction " + nbArgs + " ne corresponde pas à ceux de la déclaration (" + f.getSymbols().size() + ")");
            return;
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
}
