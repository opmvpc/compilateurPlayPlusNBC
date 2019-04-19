package be.unamur.info.b314.compiler.main.symboltable.symbols;

import be.unamur.info.b314.compiler.main.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import org.apache.commons.lang3.StringUtils;
/**
 * Class Symbol
 */
public abstract class Symbol {

    private String name;
    private Type type;

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

    public String getNiceName(){
        return SymbolNamesHelper.generateNiceName(name);
    }

    public void setName(String name) {
        this.name = SymbolNamesHelper.generateName(this.getClass().getSimpleName(),name);
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
        return this.getClass().getSimpleName() + " {" +
                "\n\t\tname = '" + name + '\'' +
                (type != null ? ", \n\t\ttype = " + type.getName() : "") +
                "\n\t}";
    }
}
