package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * Class Symbol
 */
public class Symbol {

    private String name;
    private Type type;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Symbol(String name, Type type, Scope scope) {
        this.name = name;
        this.type = type;
    }

    /**
     * Renvoie le nom du symbol
     *
     * @return le nom du symbol
     */
    public String getName() {
        return name;
    }

    /**
     * Renvoie le type du symbol
     *
     * @return Type type
     */
    public Type getType() {
        return type;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "Symbol" + " {" +
            "\n\t\tname = '" + name + '\'' +
            ", \n\t\ttype = " + type +
            "\n\t}";
    }
}
