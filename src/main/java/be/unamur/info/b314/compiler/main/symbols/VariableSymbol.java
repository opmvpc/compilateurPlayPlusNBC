package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.main.symbols.interfaces.Type;

public class VariableSymbol extends Symbol {

    public VariableSymbol(String name, Type type) {
        super(name, type);
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "VariableSymbol {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                ", \n\t\ttype = " + super.getType().getName() +
                "\n\t}";
    }
}
