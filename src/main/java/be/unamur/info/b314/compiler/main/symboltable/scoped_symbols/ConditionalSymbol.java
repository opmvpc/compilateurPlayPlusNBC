package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * @overview Représente les conditions (If)
 * @specfiled condition : String
 * @specfiled  ifContext : PlayPlusParser.ConditionalStmtContext
 */
public class ConditionalSymbol extends ScopedSymbol {

    private String condition;
    private PlayPlusParser.ConditionalStmtContext ifContext;

    /**
     * @effects Initialise un symbole de condition
     * @param name
     * @param type
     * @param scope
     * @param ifContext
     * @param condition
     */

    public ConditionalSymbol(String name, Type type, Scope scope, PlayPlusParser.ConditionalStmtContext ifContext, String condition ){
        super(name, type, scope);
        this.condition = condition;
        this.ifContext = ifContext;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "ConditionalSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                ", \n\t\tbody = " + super.getSymbols()+
                ", \n\t\tcondition = " + this.condition+
                "\n\t}";
    }
}
