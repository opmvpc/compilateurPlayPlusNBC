package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * @overview Representation des Structures
 */
public class StructSymbol extends ScopedSymbol implements Scope, Type {
    /**
     * @effects initialisation des Structures
     * @param name
     * @param enclosingScope
     */
    public StructSymbol(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }

    /**
     * @return le nom de la structure
     */
    @Override
    public String getScopeName() {
        return super.getName();
    }

    /**
     * @return le scope parent
     */
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
