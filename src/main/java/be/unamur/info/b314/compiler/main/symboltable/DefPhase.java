package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Filler;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;

import java.util.Iterator;

public class DefPhase extends PlayPlusBaseListener implements Filler {

    private SymbolTable symTable;

    public DefPhase() {

    }

    private void defineVar(String varName, String varTypeName)  {
        Type varType = (BuiltInTypeSymbol) this.symTable.getGlobals().resolve(varTypeName);

        this.symTable.define(new VariableSymbol(varName, varType));
    }

    private FunctionSymbol defineFunction(String name, String funcTypeName) {
        Type functype = (BuiltInTypeSymbol) this.symTable.getType(funcTypeName);
        Scope currentScope = this.symTable.getCurrentScope();
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

    @Override
    public void enterProgram(PlayPlusParser.ProgramContext ctx) {
        this.symTable = new SymbolTable();
    }

    @Override
    public void exitProgram(PlayPlusParser.ProgramContext ctx) {
        System.out.println(this.symTable.toString());
    }

    /**
     *  Ajoute un symbole lors de la déclaration d'une variable à la table des symboles
     *
     * @param ctx
     */
    @Override
    public void enterVarDecl(PlayPlusParser.VarDeclContext ctx) {

        String varName = ctx.ID().get(0).getText();
        String varTypeName = ctx.mytype().getText();

        defineVar(varName, varTypeName);
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String name = ctx.ID().getText();
        String funcTypeName = ctx.mytype().getText();
        FunctionSymbol function = defineFunction(name, funcTypeName);

        this.symTable.saveScope(ctx, function);
    }

    @Override
    public void exitFuncArg(PlayPlusParser.FuncArgContext ctx) {
        String varName = ctx.exprG().ID().getText();
        String varTypeName = ctx.mytype().getText();

        defineVar(varName, varTypeName);
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
    }

    @Override
    public void exitStructField(PlayPlusParser.StructFieldContext ctx) {
        String varTypeName = ctx.mytype().getText();
        Iterator vars = ctx.fieldDecl().listIterator();

        while (vars.hasNext()) {
            Object var = vars.next();
            String varName = ((PlayPlusParser.FieldDeclContext) var).ID().getText();

            defineVar(varName, varTypeName);
        }

    }

    @Override
    public void exitStructDecl(PlayPlusParser.StructDeclContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterMapfile(PlayPlusParser.MapfileContext ctx) {
        this.symTable = new SymbolTable();
        System.out.println(ctx.monde().getChildCount());
    }
}
