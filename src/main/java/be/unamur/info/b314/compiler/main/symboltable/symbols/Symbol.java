package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * @overview Symbol
 * @specfiled name: String
 * @specfiled type : Type
 * @specfiled value: Integer
 */
public abstract class Symbol {

    private String name;
    private Type type;
    private Integer value;

    public Symbol(String name) {
        setName(name);
    }

    /**
     * @effects Initialise le symbol avec un nom et un type
     * @param name
     * @param type
     */
    public Symbol(String name, Type type) {
        setName(name);
        this.type = type;
    }

    /**
     * @effects Initialise de Symbol avec un nom, un type et un scope
     * @param name
     * @param type
     * @param scope
     */
    public Symbol(String name, Type type, Scope scope) {
        setName(name);
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
     * @modifies this.name
     * @param name
     *            le nom du symbol
     */
    public void setName(String name) {
        this.name = name;
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
     *
     * @return value du symbol
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @modifies this.value
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" + "\n\t\tname = '" + name + '\''
                + (type != null ? ", \n\t\ttype = " + type.getName() : "")
                + (value != null ? ", \n\t\tvalue = " + value : "") + "\n\t}";
    }
}
