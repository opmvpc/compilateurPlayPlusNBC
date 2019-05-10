package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

public class StructRefSymbol extends Symbol {
    public StructRefSymbol(String name, Type type) {
        super(name, type);
    }
}
