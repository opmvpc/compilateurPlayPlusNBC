package be.unamur.info.b314.compiler.main.symboltable.contracts;

import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

public interface Scope {

    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public Symbol resolve(String name);

}
