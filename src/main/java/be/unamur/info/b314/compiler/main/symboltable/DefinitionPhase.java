package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Filler;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.StructSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;
import org.antlr.v4.runtime.RuleContext;

import java.util.Iterator;
import java.util.Optional;

public class DefinitionPhase extends PlayPlusBaseListener implements Filler {
    private SymbolTable symTable;
    private Errors errors;

    public DefinitionPhase(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;
    }

    @Override
    public void exitRoot(PlayPlusParser.RootContext ctx) {
        System.out.println(symTable.toString());
    }

    private void defineVar(String varName, String varTypeName)  {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        Scope currentScope = symTable.getCurrentScope();
        if (currentScope.getEnclosingScope() == null) {
        } else {
            if (currentScope instanceof FunctionSymbol) {
                if (((FunctionSymbol) currentScope).getBody().resolveByName(varName).isPresent()) {
                    errors.badNameError.add("Deux variables ne peuvent pas porter le même nom dans une même fonction");
                }
            }
        }

        this.symTable.define(new VariableSymbol(varName, varType));
    }

    private void defineArray(String varName, String varTypeName) {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        Scope currentScope = symTable.getCurrentScope();
        if (currentScope.getEnclosingScope() == null) {
        } else {
            if (currentScope instanceof FunctionSymbol) {
                if (((FunctionSymbol) currentScope).getBody().resolveByName(varName).isPresent()) {
                    errors.badNameError.add("Deux tableaux ne peuvent pas porter le même nom dans une même fonction");
                }
            }
        }

        this.symTable.define(new ArraySymbol(varName, varType));
    }

    private void defineCell(String cellName, String varTypeName) {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        this.symTable.define(new CellSymbol(cellName, varType));
    }

    private Object resolveType(String varTypeName) {
        return this.symTable.getGlobals().resolveByName(varTypeName).get();
    }

    private void defineFunctArg(String varName, String varTypeName) {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        if (symTable.getCurrentScope().resolveByName(varName).isPresent()) {
            errors.badNameError.add("Deux paramètres d'une fonction ne peuvent pas porter le même nom");
        }

        ((FunctionSymbol) this.symTable.getCurrentScope()).defineArg(new VariableSymbol(varName, varType));
    }

    private FunctionSymbol defineFunction(String name, String funcTypeName) {
        Type functype = (BuiltInTypeSymbol) resolveType(funcTypeName);
        Scope currentScope = this.symTable.getCurrentScope();

        if (currentScope.resolveByName(name).isPresent()) {
            errors.badNameError.add("Deux fonctions ne peuvent pas porter le même nom");
        }

        FunctionSymbol function = new FunctionSymbol(name, functype, currentScope);
        currentScope.define(function);
        this.symTable.setCurrentScope(function);

        return function;
    }


    private StructSymbol defineStruct(String name) {
        Scope currentScope = this.symTable.getCurrentScope();
        StructSymbol struct = new StructSymbol(name, currentScope);
        System.out.println(struct.getEnclosingScope().getScopeName());
        currentScope.define(struct);
        this.symTable.setCurrentScope(struct);

        return struct;
    }

    /**
     *
     * @return La HashMap contenue par symTable
     */
    @Override
    public SymbolTable getSymTable() {
        return this.symTable;
    }

    /**
     *  Ajoute un symbole lors de la déclaration d'une variable à la table des symboles
     *
     * @param ctx
     */
    @Override
    public void exitVarDecl(PlayPlusParser.VarDeclContext ctx) {
        String varTypeName = ctx.mytype().getText();
        Iterator vars = ctx.subVarDecl().listIterator();

        while (vars.hasNext()) {
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            String varName = var.ID().getText();
            if (var.arrays()!= null){
//                instancier les vars des tableaux
                defineArray(varName, varTypeName);
            } if (var.initVariable() != null && var.initVariable().initArrays() != null){
                Iterator values = var.initVariable().initArrays().initVariable().listIterator();
                int i = 0;
                while (values.hasNext()) {

                    PlayPlusParser.InitVariableContext cellValue = (PlayPlusParser.InitVariableContext) values.next();
                    String cellText = cellValue.getText();
                    System.out.println(cellText);

                    String cellName = varName + "["+ String.valueOf(i) + "]";
                    defineCell(cellName, varTypeName);

                    i++;

                }
            } else {
                defineVar(varName, varTypeName);
            }
        }
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String name = ctx.ID().getText();
        String funcTypeName;
        if (ctx.VOID() != null) {
            funcTypeName = "void";
        } else {
            funcTypeName = ctx.mytype().getText();
        }
        FunctionSymbol function = defineFunction(name, funcTypeName);
        this.symTable.saveScope(ctx, function);
    }

    @Override
    public void exitFuncArg(PlayPlusParser.FuncArgContext ctx) {
        String varName = ctx.exprG().ID().getText();
        String varTypeName = ctx.mytype().getText();

        defineFunctArg(varName, varTypeName);
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
//        System.out.println(this.symTable.getCurrentScope());
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterStructDecl(PlayPlusParser.StructDeclContext ctx) {
        String name = ctx.structures().ID().getText();
        StructSymbol struct = defineStruct(name);

        this.symTable.saveScope(ctx, struct);
        this.symTable.setCurrentScope(struct);
    }

    @Override
    public void exitStructField(PlayPlusParser.StructFieldContext ctx) {
        System.out.println(this.symTable.getCurrentScope().getScopeName());
        if (ctx.structDecl() != null) {
            return;
        }

        String varTypeName = ctx.field().mytype().getText();
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);
        String varName = ctx.field().ID().getText();
        this.symTable.getCurrentScope().define(new VariableSymbol(varName, varType));
        defineVar(varName, varTypeName);
    }

    @Override
    public void exitStructDecl(PlayPlusParser.StructDeclContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    private MapSymbol defineMap(String name, String mapTypeName) {
        Type mtype= new BuiltInTypeSymbol("map");
        MapSymbol map = new MapSymbol(name, mtype);
        return map;
    }

    @Override
    public void enterMapfile(PlayPlusParser.MapfileContext ctx) {
        String name = ctx.getChild(0).getText();
        String funcTypeName =ctx.getChild(1).getText();
        MapSymbol mp = defineMap(name, funcTypeName);
        //****************
        String mapX = ctx.mapsize().coordX().getText();
        String mapY = ctx.mapsize().coordY().getText();

        String mapLine = ctx.world().getText();
        String typeError = mp.createCarte(mapX,mapY,mapLine);
        if (typeError != null){
            errors.mapError.add(typeError);
        }
        //****************
        this.symTable.define(mp);
    }

    private void defineConstante(String constName, String constTypeName)  {
        Type varType = (BuiltInTypeSymbol) this.symTable.getGlobals().resolveByName(constTypeName).get();
        this.symTable.define(new ConstanteSymbol(constName, varType));
    }

    @Override
    public void enterConstDecl(PlayPlusParser.ConstDeclContext ctx) {
        String constTypeName = ctx.mytype().getText();
        String varName = ctx.ID().get(0).getText();
        defineConstante(varName, constTypeName);
    }

    @Override
    public void enterMainProgram(PlayPlusParser.MainProgramContext ctx) {
        FunctionSymbol function = defineFunction("main", "void");
        this.symTable.saveScope(ctx, function);
    }

    @Override
    public void exitMainProgram(PlayPlusParser.MainProgramContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
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

        Type type = (BuiltInTypeSymbol) resolveType("bool");

        ExpressionSymbol expr = new ExpressionSymbol(text, type);
        symTable.define(expr);
    }

    private void evalNegBool(PlayPlusParser.ExprBoolContext ctx) {
        String rightPartName = ctx.getChild(1).getText();

        Optional<Symbol> rightPart = symTable.getCurrentScope().resolveByName(rightPartName);

        if (! rightPart.isPresent()) {
            return;
        }
        if (rightPart.get().getType().getName().equals("bool")) {
            System.out.println("types Ok");
            Type type = (BuiltInTypeSymbol) resolveType("bool");
            ExpressionSymbol expr = new ExpressionSymbol(ctx.getText(), type);
            symTable.define(expr);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Le type de la variable suivante est imcompatible : "+rightPart.get().getName());
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

//        ExpressionSymbol parenthesée
        if (ctx.getChild(0).getText().equals("(")) {
//            System.out.println("parent bool :"+ ctx.getText());
            addParentheseExpr(ctx);
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String operator = ctx.getChild(1).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Symbol> leftPart = symTable.getCurrentScope().resolveByName(leftPartName);
        Optional<Symbol> rightPart = symTable.getCurrentScope().resolveByName(rightPartName);

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            System.out.println("Error , left or right part not in expressions");
            return;
        }

        if (leftPart.get().getType().getName().equals(rightPart.get().getType().getName())) {
            System.out.println("types Ok");
            Type type = (BuiltInTypeSymbol) resolveType("bool");
            ExpressionSymbol expr = new ExpressionSymbol(ctx.getText(), type);
            symTable.define(expr);
        } else {
            errors.badTypeError.add("BOOL EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getName()+" "+rightPart.get().getName());
        }
    }

    @Override
    /**
     * Evalue le type d'une expression entières
     * Ajoute une expression entiere si elle est simple (Ex: 34, -1)
     */
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        System.out.println("exitExprEnt :"+ctx.getText());

        String text = ctx.getText();
        int value = 0;
        try {
            value = Integer.valueOf(text);
        } catch (Exception e) {
            evalExprEnt(ctx);
        }

        Type type = (BuiltInTypeSymbol) resolveType("int");

        if (!symTable.getCurrentScope().resolveByName(text).isPresent()){

            ExpressionSymbol expr = new ExpressionSymbol(text, type);
            symTable.define(expr);
        }

    }

    /**
     * Ajoute une expression parenthésée
     * @param ctx
     */
    private void addParentheseExpr(RuleContext ctx) {
//        System.out.println("add parentExp "+ctx.getText());
        String exprText = ctx.getChild(1).getText();
//        System.out.println(exprText);

        Optional<Symbol> expression = symTable.getCurrentScope().resolveByName(exprText);
//        System.out.println("exp : " +expression);

        if (! expression.isPresent()) {
            return;
        }

        Type type = (BuiltInTypeSymbol) resolveType("bool");
        ExpressionSymbol expr = new ExpressionSymbol(ctx.getText(), type);
        symTable.define(expr);
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

//        ExpressionSymbol parenthesée
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
        Optional<Symbol> leftPart = symTable.getCurrentScope().resolveByName(leftPartName);
        Optional<Symbol> rightPart = symTable.getCurrentScope().resolveByName(rightPartName);


        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
//      Les types sont égaux
        if (leftPart.get().getType().getName().equals(rightPart.get().getType().getName())) {
//            System.out.println("types Ok");
            ExpressionSymbol expr = new ExpressionSymbol(ctx.getText(), leftPart.get().getType());
            symTable.define(expr);
        } else {
            errors.badTypeError.add("INT EXPRESSION TYPE ERROR in "+ ctx.getText() +" : Les types des variables suivantes sont imcompatibles : "+leftPart.get().getName()+" "+rightPart.get().getName());
        }
    }

}
