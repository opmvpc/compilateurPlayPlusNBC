package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;

public class RepeatSymbol extends ScopedSymbol {
    private String condition;
    private PlayPlusParser.RepeatStmtContext repeatContext;

    public RepeatSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type, enclosingScope);
    }


    public RepeatSymbol(String name, Type type, Scope scope, PlayPlusParser.RepeatStmtContext repeatContext, String condition ){
        super(name, type, scope);
        this.condition = condition;
        this.repeatContext = repeatContext;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "RepeatSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                (super.getType() != null ? ", \n\t\ttype = " + super.getType().getName() : "") +
                ", \n\t\tbody = " + super.getSymbols()+
                ", \n\t\tcondition = " + this.condition+
                "\n\t}";
    }
}
