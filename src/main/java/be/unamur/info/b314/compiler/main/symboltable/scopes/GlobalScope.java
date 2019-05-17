package be.unamur.info.b314.compiler.main.symboltable.scopes;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Types;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.BuiltInTypeSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.ExpressionSymbol;
/**
 * @overview Représentation de Global Scope
 */
public class GlobalScope extends BaseScope {
    /**
     * @effects Initialisation 
     * @param enclosingScope
     */
    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
        initTypeSystem();
    }

    /**
     * Ajoute les symboles pour les types définis par le language dans la table des symboles
     */
    protected void initTypeSystem() {
        for (Types type : Types.values()) {
            define(new BuiltInTypeSymbol(type.toString().toLowerCase()));
        }
        define(new ExpressionSymbol("true", (Type) super.resolveByName("bool").get()));
        define(new ExpressionSymbol("false", (Type) super.resolveByName("bool").get()));
    }

}
