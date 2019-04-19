package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;

public abstract class BaseScope implements Scope {

    private String name;
    private Scope enclosingScope;
    private HashMap<String, Symbol> symbols;

    public BaseScope(Scope enclosingScope) {
        this.name = "global";
        this.enclosingScope = enclosingScope;
        this.symbols = new HashMap<>();
    }

    public BaseScope(String name, Scope enclosingScope) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.symbols = new HashMap<>();
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {
        String name  = symbol.getName();
        this.symbols.put(name , symbol);
    }

    @Override
    public Symbol resolve(String name) {
        return this.symbols.get(name);
    }

    public HashMap<String, Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" {" +
                "name='" + SymbolNamesHelper.generateNiceName(name) + '\'' +
                ", enclosingScope=" + enclosingScope +
                ", symbols=" + symbols +
                '}';
    }
}
