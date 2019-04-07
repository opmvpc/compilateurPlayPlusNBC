package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.main.symbols.interfaces.Type;

public class VariableSymbol extends Symbol {

    public VariableSymbol(String name, Type type) {
        super(name, type);
    }
}
