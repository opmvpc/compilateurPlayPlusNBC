package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

public abstract class ScopedSymbol extends Symbol implements Scope {
    private Scope enclosingScope;

    public ScopedSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
    }

    public ScopedSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }
}
