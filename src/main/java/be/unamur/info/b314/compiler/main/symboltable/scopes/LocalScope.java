package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.HashMap;

public class LocalScope extends BaseScope {

    public LocalScope(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }

}
