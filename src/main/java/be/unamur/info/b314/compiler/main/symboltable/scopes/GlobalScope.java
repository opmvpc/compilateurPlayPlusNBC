package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Types;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.BuiltInTypeSymbol;

public class GlobalScope extends BaseScope {

    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
        initTypeSystem();
    }

    /**
     * Ajoute les symboles pour les types définis par le language dans la table des symboles
     */
    protected void initTypeSystem() {
        for (Types type : Types.values()) {
            define(new BuiltInTypeSymbol((String) type.toString().toLowerCase()));
        }
    }

}
