package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Filler;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.GlobalScope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.BuiltInTypeSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


public class DefPhase extends PlayPlusBaseListener implements Filler {

    private SymbolTable symTable;

    public DefPhase() {

    }

    /**
     *
     * @return La HashMap contenue par symTable
     */
    @Override
    public ParseTreeProperty getSymTable() {
        System.out.println(this.symTable.getSymbols().toString());

        return this.symTable.getSymbols();
    }

    @Override
    public void enterProgram(PlayPlusParser.ProgramContext ctx) {
        this.symTable = new SymbolTable();
    }

    @Override
    public void exitProgram(PlayPlusParser.ProgramContext ctx) {
        System.out.println(this.symTable.getGlobals().toString());
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
        Type varType = (BuiltInTypeSymbol) this.symTable.getGlobals().resolve(varTypeName);

        this.symTable.define(new VariableSymbol(varName, varType));
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String name = ctx.ID().getText();
        String funcTypeName = ctx.mytype().get(0).getText();
        System.out.println(name + " " + funcTypeName);
        Type functype = (BuiltInTypeSymbol) this.symTable.getType(funcTypeName);

        Scope currentScope = this.symTable.getCurrentScope();
        FunctionSymbol function = new FunctionSymbol(name, functype, currentScope);
        currentScope.define(function);
        this.symTable.saveScope(ctx, function);
        this.symTable.setCurrentScope((Scope) function);
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterMapfile(PlayPlusParser.MapfileContext ctx) {
        System.out.println(ctx.monde().getChildCount());
    }
}
