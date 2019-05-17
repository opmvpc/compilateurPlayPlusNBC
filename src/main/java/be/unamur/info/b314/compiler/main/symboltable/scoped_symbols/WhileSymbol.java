package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

/**
 * @overview : Representation des whiles
 * @specfiled condition:String
 * @specfiled whileContext:PlayPlusParser.WhileStmtContext
 */
public class WhileSymbol extends ScopedSymbol {
    private String condition;
    private PlayPlusParser.WhileStmtContext whileContext;

    /**
     * @param name
     * @param type
     * @param scope
     * @param whileContext
     * @param condition
     * @effects Initialise un While
     */
    public WhileSymbol(String name, Type type, Scope scope, PlayPlusParser.WhileStmtContext whileContext,
            String condition) {
        super(name, type, scope);
        this.condition = condition;
        this.whileContext = whileContext;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "WhileSymbol" + " {" + "\n\t\tname = '" + super.getName() + '\'' + "\n\t\tEnclosingScope = '"
                + super.getEnclosingScope().getScopeName() + '\'' + ", \n\t\tbody = " + super.getSymbols()
                + ", \n\t\tcondition = " + this.condition + "\n\t}";
    }
}
