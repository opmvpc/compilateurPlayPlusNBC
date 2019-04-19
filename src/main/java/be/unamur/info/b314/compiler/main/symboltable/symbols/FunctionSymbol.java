package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

import java.util.HashMap;

public class FunctionSymbol extends ScopedSymbol implements Scope {
    private HashMap<String, Symbol> symbols;

    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type, scope);
        this.symbols = new HashMap<>();
    }

    @Override
    public String getScopeName() {
        return super.getName();
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
                (super.getType() != null ? ", \n\t\ttype = " + super.getType().getName() : "") +
                ", \n\t\tsymbols = " + this.symbols +
                "\n\t}";
    }
}
