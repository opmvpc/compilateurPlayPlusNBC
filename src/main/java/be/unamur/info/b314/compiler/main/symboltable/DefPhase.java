package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Filler;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.GlobalScope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.BuiltInTypeSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;

public class DefPhase extends PlayPlusBaseListener implements Filler {

    private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    private GlobalScope globals;
    private Scope currentScope;
    private SymbolTable symTable;

    public DefPhase() {
        this.symTable = new SymbolTable();
    }

    /**
     *
     * @return La HashMap contenue par symTable
     */
    @Override
    public HashMap getSymTable() {
        System.out.println(this.symTable.toString());
        return this.symTable.getSymbols();
    }

    /**
     *  Ajoute un symbole lors de la déclaration d'une variable à la table des symboles
     *
     * @param ctx
     */
    @Override
    public void enterVarDecl(PlayPlusParser.VarDeclContext ctx) {
        String varName = ctx.ID().get(0).getText();
        Type varType = (BuiltInTypeSymbol) symTable.resolve(ctx.mytype().getText());

        symTable.define(new VariableSymbol(varName, varType));
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        super.enterFuncDecl(ctx);
    }

    @Override
    public void enterMapfile(PlayPlusParser.MapfileContext ctx) {
        System.out.println(ctx.monde().getChildCount());
    }
}
