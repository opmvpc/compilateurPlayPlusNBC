package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

public abstract class ScopedSymbol extends Symbol implements Scope {
    private Scope enclosingScope;
    private ArrayList<Symbol> symbols;

    public ScopedSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
    }

    public ScopedSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    @Override
    public void define(Symbol symbol) {
        symbols.add(symbol);
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

    @Override
    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
}
