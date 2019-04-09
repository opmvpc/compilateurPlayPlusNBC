package be.unamur.info.b314.compiler.main.symbols;

import be.unamur.info.b314.compiler.main.symbols.interfaces.Type;

public class BuiltInTypeSymbol extends Symbol implements Type {

    public BuiltInTypeSymbol(String name) {
        super(name);
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "BuiltInTypeSymbol {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                "\n\t}";
    }
}
