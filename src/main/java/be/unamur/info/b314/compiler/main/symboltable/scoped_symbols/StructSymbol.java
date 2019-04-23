package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StructSymbol extends ScopedSymbol implements Scope, Type {

    private LinkedHashMap<String, Symbol> fields;

    public StructSymbol(String name, Scope enclosingScope) {
        super(name, enclosingScope);
        this.fields = new LinkedHashMap<>();
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    @Override
    public Scope getEnclosingScope() {
        return super.getEnclosingScope();
    }

    @Override
    public void define(Symbol symbol) {
        this.fields.putIfAbsent(symbol.getName(), symbol);
    }

    @Override
    public Symbol resolve(String name) {
        return this.fields.get(name);
    }

    @Override
    public HashMap<String, Symbol> getSymbols() {
        return this.fields;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "StructSymbol" + " {" +
                "\n\t\tname = '" + SymbolNamesHelper.generateNiceName(super.getName()) + '\'' +
                ", \n\t\tfields = " + this.fields +
                "\n\t}";
    }
}
