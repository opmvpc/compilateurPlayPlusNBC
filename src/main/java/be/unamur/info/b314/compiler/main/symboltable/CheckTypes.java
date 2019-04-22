package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;

public class CheckTypes extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private Errors errors;

    public CheckTypes(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;
    }

//    @Override
//    public void exitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
//        ctx.exprBool().get
//    }
}
