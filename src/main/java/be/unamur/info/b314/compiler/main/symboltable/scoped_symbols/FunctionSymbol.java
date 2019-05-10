package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.LocalScope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

public class FunctionSymbol extends ScopedSymbol implements Scope {
    private LocalScope body;

    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type, scope);
        this.body = new LocalScope("body", this);
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    public void defineArg(Symbol symbol) {
        super.getSymbols().add(symbol);
    }

    @Override
    public void define(Symbol symbol) {
        this.body.define(symbol);
    }

    @Override
    public Optional<Symbol> resolveByName(String name) {
        Optional<Symbol> symbol = super.resolveByName(name);

        if (! symbol.isPresent()){
            symbol = body.resolveByName(name);
        }

        return symbol;
    }

    @Override
    public Optional<Symbol> resolveByNameAndType(String name, String type) {
        Optional<Symbol> symbol = super.resolveByNameAndType(name, type);

        if (! symbol.isPresent()){
            symbol = body.resolveByNameAndType(name, type);
        }

        return symbol;
    }

    @Override
    public ArrayList<Symbol> getSymbols() {
        return super.getSymbols();
    }

//    Alias, obligé d'avoir une fonction getSymbols() et une propriété symbols
    public  ArrayList<Symbol> getArgs() { return getSymbols();}

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
                "\n\t\tname = '" + super.getName() + '\'' +
                (super.getType() != null ? ", \n\t\ttype = " + super.getType().getName() : "") +
                ", \n\t\targuments = " + super.getSymbols()+
                ", \n\t\tbody = " + this.body.getSymbols() +
                "\n\t}";
    }
}
