package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @overview Représentation de LocalScope
 * @specfiled name:String
 * @specfiled enclosingScope:Scope
 * @specfiled symbols:ArrayList<Symbol>
 */
public abstract class BaseScope implements Scope {

    private String name;
    private Scope enclosingScope;
    private ArrayList<Symbol> symbols;

    /**
     * @effects Initialisation
     * @param enclosingScope
     */
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
        Optional<Symbol> symbol = this.symbols.stream().filter(s -> s.getName().equals(name)).findFirst();

        return symbol;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" + "name='" + name + '\'' + ", enclosingScope=" + enclosingScope
                + ", symbols=" + symbols + '}';
    }
}
