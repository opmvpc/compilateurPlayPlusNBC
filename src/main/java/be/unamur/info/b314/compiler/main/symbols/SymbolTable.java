package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.main.symbols.interfaces.Scope;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Scope {

    private HashMap<String, Symbol> symbols;

    public SymbolTable() {
        this.symbols = new HashMap<String, Symbol>();
        this.initTypeSystem();
    }

    protected void initTypeSystem() {
        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("bool"));
        define(new BuiltInTypeSymbol("char"));
        define(new BuiltInTypeSymbol("string"));
    }

    @Override
    public String getScopeName() {
        return "global";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol symbol) {
        this.symbols.put(symbol.getName(), symbol);
    }

    @Override
    public Symbol resolve(String name) {
        return this.symbols.get(name);
    }

    @Override
    public String toString() {
        return "SymbolTable {" +
                "\n\tscopeName = "+ getScopeName() +
                "\n\tsymbols = " + symbols +
                "\n}";
    }

    public HashMap getSymbols() {
        return this.symbols;
    }
}
