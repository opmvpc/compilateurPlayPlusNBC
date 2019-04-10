package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

public class FunctionSymbol extends Symbol {

    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type, scope);
    }
}
