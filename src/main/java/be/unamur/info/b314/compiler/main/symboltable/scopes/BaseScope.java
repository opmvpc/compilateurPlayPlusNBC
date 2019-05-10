package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public abstract class BaseScope implements Scope {

    private String name;
    private Scope enclosingScope;
    private ArrayList<Symbol> symbols;

    public BaseScope(Scope enclosingScope) {
        this.name = "global";
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
    }

    public BaseScope(String name, Scope enclosingScope) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
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
        this.symbols.add(symbol);
    }

    @Override
    public Optional<Symbol> resolveByName(String name) {
        Optional<Symbol> symbol = this.symbols.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst();

        return symbol;
    }

    @Override
    public Optional<Symbol> resolveByNameAndType(String name, String type) {
        Optional<Symbol> symbol = this.symbols.stream()
                .filter(s -> s.getName().equals(name) && s.getType().getName().equals(type))
                .findFirst();

        return symbol;
    }

    public ArrayList<Symbol> getSymbols() {
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
