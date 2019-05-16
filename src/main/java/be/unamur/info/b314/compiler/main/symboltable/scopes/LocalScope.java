package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;

/**
 * @overview Représentation de LocalScope
 */
public class LocalScope extends BaseScope {

    public LocalScope(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }

}
