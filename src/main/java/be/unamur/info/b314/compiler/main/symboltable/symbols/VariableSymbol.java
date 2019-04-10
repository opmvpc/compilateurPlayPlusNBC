package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

public class VariableSymbol extends Symbol {

    public VariableSymbol(String name, Type type) {
        super(name, type);
    }

}
