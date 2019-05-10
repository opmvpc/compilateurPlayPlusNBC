package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;

public class FuncCallSymbol extends Symbol {

    private FunctionSymbol parent;

    public FuncCallSymbol(String name, Type type, FunctionSymbol parent) {
        super(name, type);
        this.parent = parent;
    }

    public FunctionSymbol getParent() {
        return parent;
    }

}
