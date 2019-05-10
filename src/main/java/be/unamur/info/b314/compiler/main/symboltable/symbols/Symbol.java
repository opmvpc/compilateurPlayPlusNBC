package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * Class Symbol
 */
public abstract class Symbol {

    private String name;
    private Type type;
    private Integer value;

    public Symbol(String name) {
        setName(name);
    }

    public Symbol(String name, Type type) {
        setName(name);
        this.type = type;
    }

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
     *
     * @return le nom du symbol sans la concaténation avec le type du symbol
     */
    public String getNiceName(){
        return SymbolNamesHelper.generateNiceName(name);
    }

    /**
     *
     * @param name
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

    public Integer getValue() {
        return value;
    }

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
        return this.getClass().getSimpleName() + " {" +
                "\n\t\tname = '" + name + '\'' +
                (type != null ? ", \n\t\ttype = " + type.getName() : "") +
                "\n\t}";
    }
}
