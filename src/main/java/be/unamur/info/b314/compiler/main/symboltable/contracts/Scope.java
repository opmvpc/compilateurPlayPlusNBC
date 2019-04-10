package be.unamur.info.b314.compiler.main.symboltable.contracts;

import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;

public interface Scope {

    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public Symbol resolve(String name);
    HashMap<String, Symbol> getSymbols();
}
