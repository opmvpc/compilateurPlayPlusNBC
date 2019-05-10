package be.unamur.info.b314.compiler.main.symboltable.contracts;

import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public interface Scope {

    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public Optional<Symbol> resolveByName(String name);
    public Optional<Symbol> resolveByNameAndType(String name, String type);

    ArrayList<Symbol> getSymbols();
}
