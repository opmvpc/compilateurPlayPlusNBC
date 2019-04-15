package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

import java.util.HashMap;

public class FunctionSymbol extends Symbol implements Scope {
    private Scope enclosingScope;
    private HashMap<String, Symbol> symbols;

    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type);
        this.symbols = new HashMap<>();
        this.enclosingScope = scope;
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {
        this.symbols.putIfAbsent(symbol.getName(), symbol);
    }

    @Override
    public Symbol resolve(String name) {
        return this.symbols.get(name);
    }

    @Override
    public HashMap<String, Symbol> getSymbols() {
        return this.symbols;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "FunctionSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                ", \n\t\ttype = " + super.getType() +
                ", \n\t\tsymbols = " + this.symbols +
                "\n\t}";
    }
}
