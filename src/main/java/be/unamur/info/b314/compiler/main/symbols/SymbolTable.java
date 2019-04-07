package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.main.symbols.interfaces.Scope;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Scope {

    private HashMap<String, Symbol> symbols;

    public SymbolTable() {
        this.symbols = new HashMap<String, Symbol>();
        this.initTypeSystem();
    }

    /**
     * Ajoute les symboles pour les types définis par le language dans la table des symboles
     */
    protected void initTypeSystem() {
        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("bool"));
        define(new BuiltInTypeSymbol("char"));
        define(new BuiltInTypeSymbol("string"));
    }

    /**
     * Renvoie le nom du scope
     *
     * @return String scope
     */
    @Override
    public String getScopeName() {
        return "global";
    }

    /**
     * Renvoie le nom du scope parent
     *
     * @return String scope
     */
    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    /**
     * Ajoute un nouveau symbole à la table des symboles
     *
     * @param symbol
     */
    @Override
    public void define(Symbol symbol) {
        this.symbols.put(symbol.getName(), symbol);
    }

    /**
     * Renvoie un symbol trouvé dans la table à l'aide de son nom
     *
     * @param name
     * @return Symbol symbol
     */
    @Override
    public Symbol resolve(String name) {
        return this.symbols.get(name);
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "SymbolTable {" +
                "\n\tscopeName = "+ getScopeName() +
                "\n\tsymbols = " + symbols +
                "\n}";
    }

    /**
     * Renvoie la tables des symboles
     * @return HashMap symbols
     */
    public HashMap getSymbols() {
        return this.symbols;
    }
}
