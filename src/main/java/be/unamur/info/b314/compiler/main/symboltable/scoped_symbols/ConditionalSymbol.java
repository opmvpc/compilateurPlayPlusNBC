package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.LocalScope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

public class ConditionalSymbol extends ScopedSymbol {

    private String condition;
    private PlayPlusParser.ConditionalStmtContext ifContext;

    public ConditionalSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type, enclosingScope);
    }


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
                (super.getType() != null ? ", \n\t\ttype = " + super.getType().getName() : "") +
                ", \n\t\tbody = " + super.getSymbols()+
                ", \n\t\tcondition = " + this.condition+
                "\n\t}";
    }
}
