package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.*;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.StructSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DefTypes extends PlayPlusBaseListener {
    private ArrayList<Expression> expressions;
    private ArrayList<FunctionDecl> functionDecls;
    private SymbolTable symtable;
    private Errors errors;
    private Expression currentFuncCall;

    public DefTypes(SymbolTable symtable, Errors errors) {
        this.expressions = new ArrayList();
        this.functionDecls = new ArrayList<>();
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

    /**
     * Ajoute une déclaration de fonction à la arraylist des fonctions.
     * @param functionDecl
     */
    private void addFunctionDecl(FunctionDecl functionDecl) {
        this.functionDecls.add(functionDecl);
    }

    @Override
    /**
     * Evalue le type des expressions booléennes
     */
    public void exitExprBool(PlayPlusParser.ExprBoolContext ctx) {
        System.out.println(ctx.getText());

        String text = ctx.getText();

//        négation (ex: !x)
        if (ctx.getChildCount() == 2) {
//            System.out.println("Neg Exp bool : "+ctx.getText());
            evalNegBool(ctx);
            return;
        }

        if (ctx.getChildCount() >= 3) {
//            System.out.println("Exp bool 3 termes : "+ctx.getText());
            evalExpBool(ctx);
            return;
        }

        try {
            Boolean.valueOf(text);
        } catch (Exception e) {
            System.out.println("Erreur bool : "+ctx.getText());
        }

        String type ="bool";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
        expr.setValue(getBoolVal(text));
    }

    private int getBoolVal(String text) {
        System.out.println("BOOLVAL = "+text);
        return Boolean.parseBoolean(text) == true ? 1 : 0;
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
//            inversion de la valeur
            expr.setValue(rightPart.get().getValue() == 1 ? 0 : 1);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Le type de la variable suivante est imcompatible : "+rightPart.get().getText());
        }
    }

    /**
     *
     * @param ctx
     */
    private void evalExpBool(PlayPlusParser.ExprBoolContext ctx) {
        if (ctx.getChildCount() < 3) {
            return;
        }

//        Expression parenthesée
        if (ctx.getChild(0).getText().equals("(")) {
//            System.out.println("parent bool :"+ ctx.getText());
            addParentheseExpr(ctx);
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String operator = ctx.getChild(1).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprByText(leftPartName);
        Optional<Expression> rightPart = findExprByText(rightPartName);

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            System.out.println("Error , left or right part not in expressions");
            return;
        }

        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
            System.out.println("types Ok");
            Expression expr = new Expression(ctx.getText(), "bool", "expr");
            addExpr(expr);
            int value = computeBoolExpr(leftPart.get(), rightPart.get(), operator);
            expr.setValue(value);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" "+rightPart.get().getText());
        }
    }

    private int computeBoolExpr(Expression leftPart, Expression rightPart, String operator) {
        int value = 0;
        ArrayList<String> compareOps = setCompareOpsList();
        ArrayList<String> boolOps = setBoolOpsList();

        if (compareOps.contains(operator)) {
            boolean boolVal = false;
            switch (operator) {
                case "==" :
                    boolVal = leftPart.getValue() == rightPart.getValue();
                    break;
                case "!=" :
                    boolVal = leftPart.getValue() != rightPart.getValue();
                    break;
                case "<" :
                    boolVal = leftPart.getValue() < rightPart.getValue();
                    break;
                case ">" :
                    boolVal = leftPart.getValue() > rightPart.getValue();
                    break;
                case "<=" :
                    boolVal = leftPart.getValue() <= rightPart.getValue();
                    break;
                case ">=" :
                    boolVal = leftPart.getValue() >= rightPart.getValue();
                    break;
            }
            System.out.println(boolVal);
            value = getBoolVal(String.valueOf(boolVal));
        }
        if (boolOps.contains(operator)) {
            boolean boolVal = false;
            switch (operator) {
                case "&&" :
                    boolVal = Boolean.logicalAnd(intToBoolean(leftPart.getValue()), intToBoolean(rightPart.getValue()));
                    break;
                case "||" :
                    boolVal = Boolean.logicalOr(intToBoolean(leftPart.getValue()), intToBoolean(rightPart.getValue()));
                    break;
            }
            value = getBoolVal(String.valueOf(boolVal));
        }
        return value;
    }

    private boolean intToBoolean(int value) {
        return value == 0 ? false : true;
    }

    @Override
    /**
     * Evalue le type d'une expression entières
     * Ajoute une expression entiere si elle est simple (Ex: 34, -1)
     */
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
//        System.out.println("exitExprEnt :"+ctx.getText());

        String text = ctx.getText();
        int value = 0;
        try {
            value = Integer.valueOf(text);
        } catch (Exception e) {
            evalExprEnt(ctx);
        }

        String type ="int";
        String symbolType = "expr";

        if (!findExprByText(text).isPresent()){

            Expression expr = new Expression(text, type, symbolType);
            addExpr(expr);
            expr.setValue(value);

        }

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
     * Trouve une functionDecl qui match le text dans la table des functiondecls
     * @param functText
     * @return
     */
    private Optional<FunctionDecl> findFunctionDeclByText(String functText) {
        Optional<FunctionDecl> functionDecl = this.functionDecls.stream()
                .filter(x -> x.getText().equals(functText))
                .findFirst();
        return functionDecl;
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

    private Optional<Expression>findExprByTextAndParentName(String expText, String parentName){

        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText) && x.getParent() != null && x.getParent().getText().equals(parentName))
                .findFirst();

        return expression;

    }

    private Optional<Expression>findExprByTextAndOrphaned(String expText){

        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText) && x.getParent() == null)
                .findFirst();

        return expression;

    }

    private List<Expression> findExprBySymbolTypenameAndParentName(String symbol, String parentName){

        List<Expression> localArgExprs = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals(symbol)  && x.getParent().getText().equals(parentName))
                .collect(Collectors.toList());
        return localArgExprs;

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
        String operateur = ctx.operateurEntier().getText();
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
            int value = evaluateExprEnt(leftPart.get(),rightPart.get(),operateur);
            expr.setValue(value);
        } else {
            errors.badTypeError.add("INT EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getText()+" "+rightPart.get().getText());
        }
    }

    private int evaluateExprEnt(Expression left, Expression right, String operateur) {
        int result = 0;
        switch(operateur) {
            case "+":
                // code block
                result = left.getValue() + right.getValue();
                break;
            case "-":
                // code block
                result = left.getValue() - right.getValue();
                break;
                case "*":
                    result = left.getValue()  * right.getValue();
                    break;
            case "/":
                result = left.getValue() / right.getValue();
                //
                break;
            case "^":
                result = (int)Math.pow(left.getValue(), right.getValue());
                //
                break;
            case "%":
                result = left.getValue() % right.getValue();
                break;

            default:
                // code block

        }

        return result;

    }

    /**
     * Ajoute une expression parenthésée
     * @param ctx
     */
    private void addParentheseExpr(RuleContext ctx) {
//        System.out.println("add parentExp "+ctx.getText());
        String exprText = ctx.getChild(1).getText();
//        System.out.println(exprText);

        Optional<Expression> expression = findExprByText(exprText);
//        System.out.println("exp : " +expression);

        if (! expression.isPresent()) {
            return;
        }

        Expression expr = new Expression(ctx.getText(), expression.get().getBuiltInTypeName(), "expr");
        addExpr(expr);

        expr.setValue(expression.get().getValue());
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
            int value = 0;
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            String text = var.ID().getText();
            Boolean isAssigned = false;
            if (var.AFFECT() != null) {
                isAssigned = true;
                // recuperation de la valeur dans la table
                Optional<Expression> variable = findExprByText(var.initVariable().getText());
                System.out.println("InitVariable Test : " + var.initVariable().getText());
                if (variable.isPresent()) {
                    value = variable.get().getValue();
                }

            }
            if (var.arrays()!= null){
//                instancier les vars des tableaux
                symbolType = "arrayVariable";
            }

            if (var.initVariable() != null && var.initVariable().initArrays() != null){
                Iterator values = var.initVariable().initArrays().initVariable().listIterator();
                int i = 0;
                while (values.hasNext()){

                    PlayPlusParser.InitVariableContext cellValue = (PlayPlusParser.InitVariableContext) values.next();
                    String cellText = cellValue.getText();
                    System.out.println(cellText);

                    String cellName = text + "["+ String.valueOf(i) + "]";
                    Expression expr = new Expression(cellName,type,"cell" );
                    addExpr(expr);
                    Optional<Expression> cellExprValue = findExprByText(cellText);
                    expr.setValue(cellExprValue.get().getValue());

                    i++;

                }
            }

            // cas du body d'une fonction
            Expression parent = null;
            try {
//                System.out.println(ctx.getParent().getParent().getText());
                PlayPlusParser.FuncDeclContext parentFunction = (PlayPlusParser.FuncDeclContext) ctx.getParent().getParent();
                System.out.println(parentFunction.ID().getText());
                Optional<Expression> functExpr = findExprByText(parentFunction.ID().getText());
                parent = functExpr.get();  //System.out.println(functExpr.get());
                //Expression expr = new Expression(text, type, symbolType, isAssigned, functExpr.get());
                //addExpr(expr);
                //expr.setValue(12);
                //return;

            } catch (ClassCastException e) {
//                System.out.println("Pas une fonction");
            }

            Expression expr = new Expression(text, type, symbolType, isAssigned,parent);
            addExpr(expr);
            expr.setValue(value);
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


        // si la fonction est deja dans la table des expressions on ne l'ajoute pas.
        Optional<Expression> functExpr = findExprByText(text);

        if (! functExpr.isPresent()){
            Expression expr = new Expression(text, type, symbolType);
            addExpr(expr);
        }

        FunctionDecl fct = new FunctionDecl(text,ctx);
        addFunctionDecl(fct);
        System.out.println(fct.toString());
        String ret= ctx.returnInstr().getChild(1).getText();


    }

    @Override
    public void exitFuncCallArgs(PlayPlusParser.FuncCallArgsContext ctx) {
        int position = 0;
        Optional<Expression> functExpr = null;

        try {

            System.out.println("Parent :" + ctx.getParent().getText());
            PlayPlusParser.FuncCallContext parentFunction = (PlayPlusParser.FuncCallContext) ctx.getParent();
            System.out.println(parentFunction.ID().getText());
            functExpr = findExprByText(parentFunction.ID().getText());
            // System.out.println("functExpr " + functExpr.get());

        } catch (ClassCastException e) {
            //System.out.println("Pas une fonction");
        }
        // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
        PlayPlusParser.FuncCallContext parentFunction = (PlayPlusParser.FuncCallContext) ctx.getParent();
        Iterator vars = ctx.funcCallArg().listIterator();
        List<Expression> argsDeclexpressions = findExprBySymbolTypenameAndParentName("argument",parentFunction.ID().getText());
        int count = argsDeclexpressions.size();
        System.out.println("count" + count);
        while (vars.hasNext()) {
            System.out.println("");
            Object var = vars.next();

             String exprDText = ((PlayPlusParser.FuncCallArgContext) var).exprD().getText();

            System.out.println("NEWTEST : +" + exprDText);
            Optional<Expression> exprD = findExprByText(exprDText);

            if (exprD.isPresent() && ! argsDeclexpressions.isEmpty()) {
                System.out.println("exprd" + exprDText);
                //Expression exprG = new Expression(id, var.get().getBuiltInTypeName(), var.get().getSymbolTypeName(), true);
                //addExpr(exprG);
                //exprG.setValue(exprD.get().getValue());
                Expression arg  = argsDeclexpressions.get(position);
                arg.setValue(exprD.get().getValue());
                System.out.println("NEW TEST :"+  arg.toString());
            //.setValue(exprD.get().getValue());
                position++;
            }

            String symbolType = "argumentCall";


        }
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
//        System.out.println(ctx.getText());
        String funcName = ctx.ID().getText();

        Optional<Expression> function = findExprByText(funcName);

        if (! function.isPresent()) {
            return;
        }

        String type = function.get().getBuiltInTypeName();
        String symbolType = "functionCall";

        PlayPlusParser.FuncDeclContext funcDeclContext = findFunctionDeclByText(funcName).get().getCtx();

        Expression expr = new Expression(ctx.getText(), type, symbolType);
        addExpr(expr);

        ParseTreeWalker walker = new ParseTreeWalker();

        // on rewalk la fonction pour l'executer :-)
        currentFuncCall = expr;
         walker.walk(this, funcDeclContext);

        //enterFuncDecl( funcDeclContext );
     //   funcDeclContext

        System.out.println(funcDeclContext.toString());




    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {

        String nameFunction = ctx.ID().getText();
        String returnInst = ctx.returnInstr().getChild(1).getText();
        System.out.println("Return INST : " + returnInst);
        System.out.println("Return INST Name fct : " + nameFunction);
        Optional<Expression> exprReturn = findExprByTextAndParentName(returnInst,nameFunction);

        if (exprReturn.isPresent()){

            int returnValue = exprReturn.get().getValue();
            if (currentFuncCall != null){

                currentFuncCall.setValue(returnValue);
            }


        } else {

            Optional<Expression> exprReturnOrphaned = findExprByTextAndOrphaned(returnInst);

            if (exprReturnOrphaned.isPresent()){
                int returnValueOrphaned = exprReturnOrphaned.get().getValue();
                if (currentFuncCall != null){

                    currentFuncCall.setValue(returnValueOrphaned);
                }

            }

        }


    }

    @Override
    public void enterFuncArgs(PlayPlusParser.FuncArgsContext ctx) {
      //  System.out.println("enterFuncArgs: " + ctx.funcArg().size());
        int position = 1;
        Optional<Expression> functExpr = null;
        try {
            System.out.println("Parent :" + ctx.getParent().getText());
            PlayPlusParser.FuncDeclContext parentFunction = (PlayPlusParser.FuncDeclContext) ctx.getParent();
            System.out.println(parentFunction.ID().getText());

            functExpr = findExprByText(parentFunction.ID().getText());
           // System.out.println("functExpr " + functExpr.get());
        } catch (ClassCastException e) {
            //System.out.println("Pas une fonction");
        }
        // On va chercher l'appel de la fonction ainsi que les arguments et leurs nombres
        Iterator vars = ctx.funcArg().listIterator();
        while (vars.hasNext()) {
            System.out.println("");
            Object var = vars.next();
            String name = ((PlayPlusParser.FuncArgContext) var).exprG().getText();
            String type = ((PlayPlusParser.FuncArgContext) var).mytype().getText();
            String symbolType = "argument";


            Optional<Expression> expArgument = findExprByTextAndParentName(name,functExpr.get().getText());
            if ( ! expArgument.isPresent()){
                Expression expr = new Expression(name, type, symbolType, false, functExpr.get(), position);
                addExpr(expr);

            }

            position++;
            System.out.println("Name " + name + " type: " + type + "position" + position);

        }

    }


    /**
     * ajouts d'une expression de reference d'une variable contenue dans une structure
     */
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
//        System.out.println(ctx.getText());
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
            return;
        }

        if (ctx.exprG().structRef() != null) {
            structAffectExpression(ctx);
            return;
        }

        affectVar(ctx);
    }

    private void affectVar(PlayPlusParser.AffectInstrContext ctx) {
        String id = ctx.exprG().ID().getText();
        Optional<Expression> var = Optional.empty();

        // cas du body d'une fonction
        try {
            System.out.println(ctx.getParent().getParent().getParent().getText());
            PlayPlusParser.FuncDeclContext parentFunction = (PlayPlusParser.FuncDeclContext) ctx.getParent().getParent().getParent();
            Optional<Expression> functExpr = findExprByText(parentFunction.ID().getText());
            System.out.println("FUNC = "+functExpr.get().getText());

//            trouver la variable dans le scope de la fonction
            var = this.expressions.stream()
                    .filter(x -> x.getText().equals(id) && x.getParent()!=null && x.getParent().getText().equals(functExpr.get().getText()))
                    .findFirst();

            //System.out.println("VAR = "+var.get().getText()); // broken print get may be null
        } catch (ClassCastException e) {
            System.out.println("Pas dans le body d'une fonction");
        }

//       cas variable globale
        if (! var.isPresent()) {
            var = findExprByText(id);
        }

//        Enregistrement de la nouvelle valeur de la variable
        Optional<Expression> exprD = findExprByText(ctx.exprD().getText());
        if (var.isPresent() && exprD.isPresent()) {

            //Expression exprG = new Expression(id, var.get().getBuiltInTypeName(), var.get().getSymbolTypeName(), true);
            //addExpr(exprG);
            //exprG.setValue(exprD.get().getValue());

            var.get().setValue(exprD.get().getValue());
        }
    }

    /**
     * Ajoute une expression d'affectation d'une variarble contenue dans un tableau
     * @param ctx
     */
    private void arrayAffectExpression(PlayPlusParser.AffectInstrContext ctx) {
        String varName = ctx.exprG().getText();
//        System.out.println("arrayAffect exprD "+ctx.exprD().getText());
        Boolean isAssigned = true;

        Optional<Expression> result = this.expressions.stream()
                .filter(x -> x.getSymbolTypeName().equals("arrayVariable") && x.getText().equals(ctx.exprG().arrayRef().ID().getText()))
                .findFirst();

        if (! result.isPresent()) {
            return;
        }

        Optional<Expression> valueExpr = findExprByText(ctx.exprD().getText());

        Expression expr = new Expression(varName, result.get().getBuiltInTypeName(), "variable", isAssigned);
        addExpr(expr);
        if (valueExpr.isPresent()){

            expr.setValue(valueExpr.get().getValue());

        }

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


        Optional<Expression> exprStruct = findExprByText(varName);


        if (! exprStruct.isPresent()){

            Expression expr = new Expression(varName, result.get().getBuiltInTypeName(), "structVariable", isAssigned);
            addExpr(expr);

        } else {

            Optional<Expression> valueExpr = findExprByText(ctx.exprD().getText());
            if (valueExpr.isPresent()){

                exprStruct.get().setValue(valueExpr.get().getValue());

            }

        }



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
        int value = ctx.getText().charAt(1);
        expr.setValue(value);
    }

    @Override
    public void exitBoolVal(PlayPlusParser.BoolValContext ctx) {

        if (ctx.boolLiteral() != null) {
            Expression expr = new Expression(ctx.getText(), "bool", "expr", true);
            addExpr(expr);
            expr.setValue(getBoolVal(ctx.getText()));
        }
    }

    @Override
    public void exitBoolLiteral(PlayPlusParser.BoolLiteralContext ctx) {
        System.out.println("BOOL = "+ctx.getText());
        Expression expr = new Expression(ctx.getText(), "bool", "expr", true);
        addExpr(expr);
        expr.setValue(getBoolVal(ctx.getText()));
    }

    @Override
    /**
     * Affiche la liste d'expressions
     */
    public void exitRoot(PlayPlusParser.RootContext ctx) {
        for (Expression exp : this.expressions) {
            System.out.println(exp.toString());
        }
        for (FunctionDecl fcd : this.functionDecls){
            System.out.print(fcd.toString());
        }
//        System.out.println(this.expressions.toString());
    }


    private ArrayList<String> setCompareOpsList() {
        ArrayList<String> compareOps = new ArrayList<>();
        compareOps.add("==");
        compareOps.add("!=");
        compareOps.add("<=");
        compareOps.add(">=");
        compareOps.add("<");
        compareOps.add(">");

        return compareOps;
    }

    private ArrayList<String> setBoolOpsList() {
        ArrayList<String> boolOps = new ArrayList<>();
        boolOps.add("&&");
        boolOps.add("||");

        return boolOps;
    }


}
