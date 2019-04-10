package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;

public abstract class BaseScope implements Scope {

    private String name;
    private Scope enclosingScope;
    private HashMap<String, Symbol> symbols;

    public BaseScope(Scope enclosingScope) {
        this.name = name;
        this.enclosingScope = null;
        this.symbols = symbols;
    }

    public BaseScope(String name, Scope enclosingScope, HashMap<String, Symbol> symbols) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.symbols = symbols;
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

    }

    @Override
    public Symbol resolve(String name) {
        return this.symbols.get(name);
    }
}
