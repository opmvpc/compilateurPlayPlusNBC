package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @overview representation du ScopedSymbol
 * @specfiled enclosingScope: Scope
 * @specfiled symbols: ArrayList<Symbol>
 */
public abstract class ScopedSymbol extends Symbol implements Scope {
    private Scope enclosingScope;
    private ArrayList<Symbol> symbols;

    /**
     * @effects Initialise un ScopedSymbol avec un nom et un scope
     * @param name
     *            le nom du ScopedSymbol
     * @param enclosingScope
     *            le Scope
     */
    public ScopedSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
    }

    /**
     * @effects Initialise un ScopedSymbol avec un nom , un type et un scope
     * @param name
     *            le nom du ScopedSymbol
     * @param type
     *            le type du ScopedSymbol
     * @param enclosingScope
     *            le Scope
     */
    public ScopedSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
        this.symbols = new ArrayList<>();
    }

    /**
     * @return enclosingScope , le Scope Parent
     */
    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    /**
     * @return le nom du Scope
     */
    @Override
    public String getScopeName() {
        return super.getName();
    }

    /**
     * Ajout d'un symbole
     * 
     * @modifies this.symbols
     * @effects this.symbols_post = this.symbols U {symbol}
     * @param symbol
     *            à ajouter
     */
    @Override
    public void define(Symbol symbol) {
        symbols.add(symbol);
    }

    /**
     * @param name
     *            le nom du scope à chercher
     * @return Optional<Symbol> tq symbol E this
     */
    @Override
    public Optional<Symbol> resolveByName(String name) {
        Optional<Symbol> symbol = this.symbols.stream().filter(s -> s.getName().equals(name)).findFirst();

        return symbol;
    }

    /**
     *
     * @return une liste de symbols
     */
    @Override
    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
}
