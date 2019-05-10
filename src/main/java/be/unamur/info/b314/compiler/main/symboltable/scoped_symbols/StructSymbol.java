package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

public class StructSymbol extends ScopedSymbol implements Scope, Type {

    public StructSymbol(String name, Scope enclosingScope) {
        super(name, enclosingScope);
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
    public String toString() {
        return "StructSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                ", \n\t\tfields = " + super.getSymbols() +
                "\n\t}";
    }
}
