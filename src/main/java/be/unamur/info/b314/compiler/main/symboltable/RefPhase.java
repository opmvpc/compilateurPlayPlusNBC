package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.Helpers.Errors;
import be.unamur.info.b314.compiler.main.Main;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;

import java.util.ArrayList;

public class RefPhase extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private Errors errors;

    public RefPhase(SymbolTable symTable) {
        this.symTable = symTable;
        this.errors = new Errors();
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        this.symTable.setCurrentScope(this.symTable.getCurrentScope().getEnclosingScope());
    }

    @Override
    public void exitExprG(PlayPlusParser.ExprGContext ctx) {
        String varName = ctx.ID().getText();
        try {
            resolveVar(varName);
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        String funName = ctx.ID().getText();
        try {
            resolveFunc(funName);
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }

    //    Attention, on dirait que les arguments de fonctions matchent expGauche
    private void resolveVar(String varName) throws SymbolNotFoundException {
//        System.out.println("current Scope = "+ this.symTable.getCurrentScope().getScopeName() +"\t varName = "+ varName);
//        Symbol var = this.symTable.getCurrentScope().resolve(varName);
//        Pas encore bien test donc je garde l'ancienne
        Symbol var = resolveSymbolRec(varName, this.symTable.getCurrentScope());
        if (var == null) {
            throw new SymbolNotFoundException("Variable "+ varName +" do not exist");
        }
        if (var instanceof FunctionSymbol) {
            throw new SymbolNotFoundException(varName +" is not a variable");
        }
    }

    private void resolveFunc(String funName) throws SymbolNotFoundException {
        Symbol func = resolveSymbolRec(funName, this.symTable.getCurrentScope());
        if (func == null) {
            throw new SymbolNotFoundException("Function "+ funName +" do not exist");
        }
        if (func instanceof VariableSymbol) {
            throw new SymbolNotFoundException(funName +" is not a function");
        }
    }

    public Errors getErrors() {
        return errors;
    }

    private Symbol resolveSymbolRec(String name, Scope currentScope) {
        Symbol symbol = currentScope.resolve(name);

        if (symbol == null && currentScope.getEnclosingScope() == null) {
            return null;
        }

        if (symbol != null) {
            return symbol;
        }

        return resolveSymbolRec(name, currentScope.getEnclosingScope());
    }
}
