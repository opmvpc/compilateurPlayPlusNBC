package be.unamur.info.b314.compiler.main.symboltable.contracts;

import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

public interface Scope {

    String getScopeName();

    Scope getEnclosingScope();

    void define(Symbol symbol);

    Optional<Symbol> resolveByName(String name);

    ArrayList<Symbol> getSymbols();
}
