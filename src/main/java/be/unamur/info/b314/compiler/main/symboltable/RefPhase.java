package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;

public class RefPhase extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private Errors errors;

    public RefPhase(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;
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
//        match aussi les référence de tableau et structs donc on stop là si c'est la cas
        if (ctx.arrayRef() != null || ctx.structRef() != null) {
//            System.out.println(ctx.getText());
            return;
        }

        String varName = ctx.ID().getText();

//        si le scope est un LocalScope (body d'une fonction) on ne regarde que dans le scope local
//        Scope currentScope = this.symTable.getCurrentScope();
//        if (currentScope instanceof FunctionSymbol) {
//            System.out.println(currentScope.getScopeName());
//            Symbol var = resolveLocalSymbol(varName, (FunctionSymbol) currentScope);
//            if (var == null) {
//                this.errors.symbolNotFound.add("Variable "+ varName +" do not exist");
//            }
//        }

        try {
            resolveVar(varName);
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }

    private void resolveStruct(String varName) {
        varName = SymbolNamesHelper.generateName("StructSymbol", varName);
        Symbol struct = this.symTable.getCurrentScope().resolve(varName);
        if (struct == null) {
            this.errors.symbolNotFound.add("Structure "+ varName +" do not exist");
        }
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        String funName = ctx.ID().getText();
        try {
            resolveFunc(SymbolNamesHelper.generateName("FunctionSymbol", funName));
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }

    //    Attention, on dirait que les arguments de fonctions matchent expGauche
    private void resolveVar(String varName) throws SymbolNotFoundException {
//        System.out.println("current Scope = "+ this.symTable.getCurrentScope().getScopeName() +"\t varName = "+ varName);
//        Symbol var = this.symTable.getCurrentScope().resolve(varName);
//        Pas encore bien test donc je garde l'ancienne
        varName = SymbolNamesHelper.generateName("VariableSymbol", varName);
        Symbol var = resolveSymbolRec(varName, this.symTable.getCurrentScope());
        if (var == null) {
            throw new SymbolNotFoundException("Variable "+ varName +" do not exist");
        }
        if (var instanceof FunctionSymbol) {
            throw new SymbolNotFoundException(varName +" is not a variable");
        }
    }

    private void resolveFunc(String funName) throws SymbolNotFoundException {
        Scope currentScope = this.symTable.getCurrentScope();
        Symbol func = resolveSymbolRec(funName, currentScope);
        if (func == null) {
            throw new SymbolNotFoundException("Function "+ funName +" do not exist");
        }
        if (func instanceof VariableSymbol) {
            throw new SymbolNotFoundException(funName +" is not a function");
        }
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

    private Symbol resolveLocalSymbol(String name, FunctionSymbol localScope) {
        Symbol symbol = localScope.resolve(name);

        return symbol;
    }

    @Override
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
        String name = ctx.ID().getText();
        ctx.member().listIterator();
        resolveStruct(name);
    }

    private Symbol resolveMap(String mapName){
        mapName = SymbolNamesHelper.generateName("MapSymbol",mapName);
        Symbol maps = resolveSymbolRec(mapName, this.symTable.getGlobals()); // soucis avec le resolve
        if (maps == null) {
            this.errors.mapError.add("Map is null ");
        }else {
            String typeErrors = ((MapSymbol) maps).isMapConfigCorrect();
            if (typeErrors != null) {
                this.errors.mapError.add(typeErrors);
            }
        }

        return resolveSymbolRec(mapName, this.symTable.getGlobals());
    }

    @Override
    public void exitMapfile(PlayPlusParser.MapfileContext ctx) {
        String varName = ctx.getChild(0).getText();
        resolveMap(varName);

        this.symTable.setCurrentScope(this.symTable.getCurrentScope().getEnclosingScope());

//        System.out.println(errors.toString());
    }


    private void resolveConst(String constName) throws SymbolNotFoundException {
        constName = SymbolNamesHelper.generateName("ConstanteSymbol", constName);
        Symbol consts = resolveSymbolRec(constName, this.symTable.getCurrentScope());
        if (consts == null) {
            throw new SymbolNotFoundException("Constante "+ constName +" do not exist");
        }
        if (consts instanceof VariableSymbol) {
            throw new SymbolNotFoundException(constName +" is not a constante");
        }
    }

    @Override
    public void exitConstDecl(PlayPlusParser.ConstDeclContext ctx) {
        String varName = ctx.ID().get(0).getText();
        try {
            resolveConst(varName);
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }



    @Override
    public void exitProgram(PlayPlusParser.ProgramContext ctx) {
//        System.out.println(errors.toString());
    }
}

