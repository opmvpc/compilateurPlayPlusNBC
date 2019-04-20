package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.LocalScope;

import java.util.HashMap;

public class FunctionSymbol extends ScopedSymbol implements Scope {
    private HashMap<String, Symbol> symbols;
    private LocalScope body;

    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type, scope);
        this.body = new LocalScope("body", this);
        this.symbols = new HashMap<>();
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    public void defineArg(Symbol symbol) {
        this.symbols.putIfAbsent(symbol.getName(), symbol);
    }

    @Override
    public void define(Symbol symbol) {
        this.body.define(symbol);
    }

    @Override
    public Symbol resolve(String name) {
        Symbol symbol = this.symbols.get(name);
        if (symbol == null) {
            this.body.resolve(name);
        }
        return symbol;
    }

    @Override
    public HashMap<String, Symbol> getSymbols() {
        return this.symbols;
    }

    public LocalScope getBody() {
        return body;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "FunctionSymbol" + " {" +
                "\n\t\tname = '" + SymbolNamesHelper.generateNiceName(super.getName()) + '\'' +
                (super.getType() != null ? ", \n\t\ttype = " + SymbolNamesHelper.generateNiceName(super.getType().getName()) : "") +
                ", \n\t\targuments = " + this.symbols +
                ", \n\t\tbody = " + this.body.getSymbols() +
                "\n\t}";
    }
}
