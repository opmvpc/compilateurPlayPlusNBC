package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symbols.interfaces.Filler;
import be.unamur.info.b314.compiler.main.symbols.interfaces.Type;

import java.util.HashMap;

public class SymbolTableFiller extends PlayPlusBaseListener implements Filler {

    private SymbolTable symTable;

    public SymbolTableFiller() {
        this.symTable = new SymbolTable();
    }

    @Override
    public HashMap getSymTable() {
        System.out.println(this.symTable.toString());
        return this.symTable.getSymbols();
    }

    @Override
    public void enterVarDecl(PlayPlusParser.VarDeclContext ctx) {
        String varName = ctx.ID().get(0).getText();
        Type varType = (BuiltInTypeSymbol) symTable.resolve(ctx.mytype().getText());

        symTable.define(new VariableSymbol(varName, varType));
    }
}
