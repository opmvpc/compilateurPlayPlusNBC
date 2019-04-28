package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Types;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.StructSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class DefTypes extends PlayPlusBaseListener {
    private ArrayList<Expression> expressions;
    private SymbolTable symtable;
    private Errors errors;

    public DefTypes(SymbolTable symtable, Errors errors) {
        this.expressions = new ArrayList();
        this.symtable = symtable;
        this.errors = errors;
    }

    /**
     * Récupère la liste des expressions
     * @return
     */
    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    /**
     * Ajoute une expression à la table des expressions
     * @param expression
     */
    private void addExpr(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    /**
     * Evalue le type des expressions booléennes
     */
    public void exitExprBool(PlayPlusParser.ExprBoolContext ctx) {
//        System.out.println(ctx.getText());

        String text = ctx.getText();

//        négation (ex: !x)
        if (ctx.getChildCount() == 2) {
            System.out.println("$ "+ctx.getText());
            evalNegBool(ctx);
            return;
        }

        if (ctx.getChildCount() >= 3) {
            System.out.println("$ "+ctx.getText());
            evalExpBool(ctx);
            return;
        }

        try {
            Boolean.valueOf(text);
        } catch (Exception e) {
//            System.out.println("$ "+ctx.getText());
//            evalExpBool(ctx);
        }

        String type ="bool";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    private void evalNegBool(PlayPlusParser.ExprBoolContext ctx) {
        String rightPartName = ctx.getChild(1).getText();

        Optional<Expression> rightPart = findExprByText(rightPartName);

        if (! rightPart.isPresent()) {
            return;
        }
        if (rightPart.get().getBuiltInTypeName().equals("bool")) {
            System.out.println("types Ok");
            Expression expr = new Expression(ctx.getText(), "bool", "expr");
            addExpr(expr);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Le type de la variable suivante est imcompatible : "+rightPart.get().getText());
        }
    }

    private void evalExpBool(PlayPlusParser.ExprBoolContext ctx) {
        if (ctx.getChildCount() < 3) {
            return;
        }

//        Expression parenthesée
        if (ctx.getChild(0).getText().equals("(")) {
            System.out.println("parent bool :"+ ctx.getText());
            addParentheseExpr(ctx);
            return;
        }


        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprByText(leftPartName);
        Optional<Expression> rightPart = findExprByText(rightPartName);

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
            System.out.println("types Ok");
            Expression expr = new Expression(ctx.getText(), "bool", "expr");
            addExpr(expr);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" "+rightPart.get().getText());
        }
    }

    @Override
    /**
     * Evalue le type d'une expression entières
     * Ajoute une expression entiere si elle est simple (Ex: 34, -1)
     */
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
//        System.out.println("exitExprEnt :"+ctx.getText());

        String text = ctx.getText();

        try {
            Integer.valueOf(text);
        } catch (Exception e) {
            evalExprEnt(ctx);
        }

        String type ="int";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    /**
     * Trouve un élément qui match le text dans la table des expressions
     * @param expText
     * @return
     */
    private Optional<Expression> findExprByText(String expText) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText))
                .findFirst();

        return expression;
    }

    /**
     * Trouve un élément qui match le text et le type dans la table des epxressions
     * @param expText
     * @param type
     * @return
     */
    private Optional<Expression> findExprByTextAndType(String expText, String type) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText) && x.getBuiltInTypeName().equals(type))
                .findFirst();

        return expression;
    }

    /**
     * Expressions entières à trois termes
     * @param ctx
     */
    private void evalExprEnt(PlayPlusParser.ExprEntContext ctx) {
//        On ne veut que des expressions à trois termes
        if (ctx.getChildCount() < 3) {
            return;
        }

//        System.out.println(ctx.getText());

//        Expression parenthesée
        if (ctx.getChild(0).getText().equals("(")) {
            addParentheseExpr(ctx);
            return;
        }

        addExprEntiere(ctx);
    }

    /**
     * Ajoute une expression entière à trois termes et check les types
     * @param ctx
     */
    private void addExprEntiere(PlayPlusParser.ExprEntContext ctx) {
        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprByText(leftPartName);
        Optional<Expression> rightPart = findExprByText(rightPartName);

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
//      Les types sont égaux
        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
//            System.out.println("types Ok");
            Expression expr = new Expression(ctx.getText(), leftPart.get().getBuiltInTypeName(), "expr");
            addExpr(expr);
        } else {
            errors.badTypeError.add("INT EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" "+rightPart.get().getText());
        }
    }

    /**
     * Ajoute une expression parenthésée
     * @param ctx
     */
    private void addParentheseExpr(RuleContext ctx) {
        System.out.println("add parentExp "+ctx.getText());
        String exprText = ctx.getChild(1).getText();
        System.out.println(exprText);

        Optional<Expression> expression = findExprByText(exprText);
        System.out.println("exp : " +expression);
        if (! expression.isPresent()) {
            return;
        }

        Expression expr = new Expression(ctx.getText(), expression.get().getBuiltInTypeName(), "expr");
        addExpr(expr);
    }


    /**
     * Ajoute d'une exepression de déclaration de variable (fonctionne aussi pour les arrays, on a juste besoin du type
     * @param ctx
     */
    @Override
    public void exitVarDecl(PlayPlusParser.VarDeclContext ctx) {
//        System.out.println(ctx.getText());
        String type = ctx.mytype().getText();
        String symbolType = "variable";

        Iterator vars = ctx.subVarDecl().listIterator();

        while (vars.hasNext()) {
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            String text = var.ID().getText();
            Boolean isAssigned = false;
            if (var.AFFECT() != null) {
                isAssigned = true;
            }
            if (var.arrays()!= null){
                symbolType = "arrayVariable";
            }

            try {
                System.out.println(ctx.getParent().getParent().getText());
                PlayPlusParser.FuncDeclContext parentFunction = (PlayPlusParser.FuncDeclContext) ctx.getParent().getParent();
                System.out.println(parentFunction.ID().getText());
                Optional<Expression> functExpr = findExprByText(parentFunction.ID().getText());
                System.out.println(functExpr.get());
                Expression expr = new Expression(text, type, symbolType, isAssigned, functExpr.get());
                addExpr(expr);
                return;
            } catch (ClassCastException e) {
                System.out.println("Pas une fonction");
            }

            Expression expr = new Expression(text, type, symbolType, isAssigned);
            addExpr(expr);
        }
    }

    @Override
    /**
     * Ajouts d'une expression pour la déclaration des fonctions
     */
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
//        System.out.println(ctx.getText());

        String text = ctx.ID().getText();

        String type = ctx.mytype() == null ? "void" : ctx.mytype().getText();
        String symbolType = "function";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        System.out.println(ctx.getText());
        String funcName = ctx.ID().getText();

        Optional<Expression> function = findExprByText(funcName);

        if (! function.isPresent()) {
            return;
        }

        String type = function.get().getBuiltInTypeName();
        String symbolType = "functionCall";

        Expression expr = new Expression(ctx.getText(), type, symbolType);
        addExpr(expr);
    }

    @Override
    /**
     * ajouts d'une expression de reference d'une variable contenue dans une structure
     */
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
        System.out.println(ctx.getText());
        Boolean isAssigned = false;
        String structCall = ctx.getText();
        String structName = SymbolNamesHelper.genStructName(ctx.ID().getText());
//        System.out.println("structName "+structName);
        StructSymbol struct = (StructSymbol) this.symtable.getGlobals().resolve(structName);
//        System.out.println("struct " + struct.getName());
        Iterator members = ctx.members().member().listIterator();
        while (members.hasNext()) {
            PlayPlusParser.MemberContext member = (PlayPlusParser.MemberContext) members.next();
//            System.out.println("member " + member.ID().getText());
            if (members.hasNext()) {
                structName = SymbolNamesHelper.genStructName(member.ID().getText());
                struct = (StructSymbol) struct.resolve(structName);
            } else {
                String varName = SymbolNamesHelper.genVarName(member.ID().getText());
//                System.out.println(struct.resolve(varName));
                VariableSymbol var = (VariableSymbol) struct.resolve(varName);
                String varType = SymbolNamesHelper.generateNiceName(var.getType().getName());
//                System.out.println(varType);
                Expression expr = new Expression(structCall, varType, "structVariable", isAssigned);
                addExpr(expr);
            }
        }
    }

    @Override
    /**
     * Affectation d'une variable de structure ou tableau
     */
    public void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        if (ctx.exprG().arrayRef() != null){
            arrayAffectExpression(ctx);
        }

        if (ctx.exprG().structRef() != null) {
            structAffectExpression(ctx);
        }
    }

    /**
     * Ajoute une expression d'affectation d'une variarble contenue dans un tableau
     * @param ctx
     */
    private void arrayAffectExpression(PlayPlusParser.AffectInstrContext ctx) {
        String varName = ctx.exprG().getText();
        System.out.println("arrayAffect exprD "+ctx.exprD().getText());
        Boolean isAssigned = true;

        Optional<Expression> result = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals("arrayVariable") && x.getText().equals(ctx.exprG().arrayRef().ID().getText()))
                .findFirst();

        if (! result.isPresent()) {
            return;
        }

        Expression expr = new Expression(varName, result.get().getBuiltInTypeName(), "variable", isAssigned);
        addExpr(expr);
    }

    /**
     * Ajoute une symbole d'acces à une variable de structure
     * @param ctx
     */
    private void structAffectExpression(PlayPlusParser.AffectInstrContext ctx) {
        String varName = ctx.exprG().getText();
//        System.out.println("structAffect "+varName);
        Boolean isAssigned = true;

        Optional<Expression> result = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals("structVariable") && x.getText().equals(varName))
                .findFirst();

        if (! result.isPresent()) {
            return;
        }

        Expression expr = new Expression(varName, result.get().getBuiltInTypeName(), "structVariable", isAssigned);
        addExpr(expr);
//        System.out.println("Result var" + result);
    }


    @Override
    /**
     * Ajoute des caracteres à la table
     */
    public void exitCharVal(PlayPlusParser.CharValContext ctx) {
        String text = ctx.getText();
        String type ="char";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    @Override
    /**
     * Affiche la liste d'expressions
     */
    public void exitRoot(PlayPlusParser.RootContext ctx) {
        for (Expression exp : this.expressions) {
            System.out.println(exp.toString());
        }
//        System.out.println(this.expressions.toString());
    }


}
