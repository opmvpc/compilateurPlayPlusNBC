package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.Helpers.Errors;
import be.unamur.info.b314.compiler.main.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;

import java.util.HashMap;

public class RefPhase extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private Errors errors;

    public RefPhase(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;
        checkNamingConvention();
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
        Symbol func = resolveSymbolRec(funName, this.symTable.getCurrentScope());
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

    @Override
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
        String name = ctx.ID().getText();
        ctx.member().listIterator();
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

        System.out.println(errors.toString());

    }
    private void checkNamingConvention(){
        checkGlobalVarNames();
        checkLocalVarNamesNotInArgs();
        checkLocalVarNameNotFunctName();
        checkArgNameNotFunctName();
        checkConstNames();
        checkLocalVarNames();
    }

    private void checkGlobalVarNames() {
        HashMap globals =  this.symTable.getGlobals().getSymbols();
        globals.forEach((k, v) -> {
            if(v instanceof VariableSymbol){
                globals.forEach((k2, v2) -> {
                    if (v2 instanceof FunctionSymbol){
                       if (((VariableSymbol) v).getNiceName().equals(((Symbol) v2).getNiceName())){
                           this.errors.badNameError.add("Le nom de la variable:" +
                                   ((VariableSymbol) v).getNiceName() +
                                   " est déjà utilisé par une fonction");
                       }
                    }
                });
            }
        });
    }

    private void checkLocalVarNamesNotInArgs() {
        HashMap globals = this.symTable.getGlobals().getSymbols();
        globals.forEach((k, v) -> {
            String varName = ((Symbol) v).getName();
            globals.forEach((k2, v2) -> {
                if (v instanceof VariableSymbol) {
                    if (v2 instanceof ConstanteSymbol) {
                        if (((VariableSymbol) v).getNiceName().equals(((Symbol) v2).getNiceName())) {
                            this.errors.badNameError.add("Le nom de la constante:" + ((VariableSymbol) v).getNiceName() + " est déjà utilisé par une variable");
                        }
                    }
                }
            });
        });
    }

    private void checkConstNames() {
        HashMap globals = this.symTable.getGlobals().getSymbols();
        globals.forEach((k, v) -> {
            String varName = ((Symbol) v).getName();
            globals.forEach((k2, v2) -> {
                if (v instanceof VariableSymbol) {
                    if (v2 instanceof ConstanteSymbol) {
                        if (((VariableSymbol) v).getNiceName().equals(((Symbol) v2).getNiceName())) {
                            this.errors.badNameError.add("Le nom de la constante:" + ((VariableSymbol) v).getNiceName() + " est déjà utilisé par une variable");
                        }
                    }
                }
                if (v instanceof ConstanteSymbol && v2 instanceof ConstanteSymbol && k != k2) {
                    if (((ConstanteSymbol) v).getNiceName().equals(((Symbol) v2).getNiceName())) {
                        this.errors.badNameError.add("Le nom de la constante:" + ((ConstanteSymbol) v).getNiceName() + " est déjà utilisé par une autre constante" + ((Symbol) v2).getNiceName());
                    }
                }
            });

        });
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

    private void checkLocalVarNames() {
        HashMap globals =  this.symTable.getGlobals().getSymbols();
        globals.forEach((k, funct) -> {
            if (funct instanceof FunctionSymbol) {
                HashMap args = ((FunctionSymbol) funct).getSymbols();
                args.forEach((k1, arg) -> {
                    Symbol localVar = ((FunctionSymbol) funct).getBody().resolve(((Symbol) arg).getName());
                    if (localVar != null) {
                        this.errors.badNameError.add("La variable locale : " +
                                ((VariableSymbol) arg).getNiceName() +
                                " de la fonction : "+
                                ((FunctionSymbol) funct).getNiceName() +
                                " ne peut avoir le même nom que l'un des paramètres");
                    }
                });
            }
        });
    }

    private void checkLocalVarNameNotFunctName() {
        HashMap globals =  this.symTable.getGlobals().getSymbols();
        globals.forEach((k, funct) -> {
            if (funct instanceof FunctionSymbol) {
                String varName = SymbolNamesHelper.generateName("VariableSymbol", ((FunctionSymbol) funct).getNiceName());
                Symbol var = ((FunctionSymbol) funct).getBody().resolve(varName);
                if (var != null) {
                    this.errors.badNameError.add("La variable locale : " +
                            var.getNiceName() +
                            " ne peut pas avoir le même nom que la fonction dans laquelle elle est déclarée");
                }
            }
        });
    }

    private void checkArgNameNotFunctName() {
        HashMap globals =  this.symTable.getGlobals().getSymbols();
        globals.forEach((k, funct) -> {
            if (funct instanceof FunctionSymbol) {
                String argName = SymbolNamesHelper.generateName("VariableSymbol", ((FunctionSymbol) funct).getNiceName());
                Symbol var = ((FunctionSymbol) funct).getSymbols().get(argName);
                if (var != null) {
                    this.errors.badNameError.add("L'argument : " +
                            var.getNiceName() +
                            " ne peut pas avoir le même nom que la fonction dans lequel il est déclaré");
                }
            }
        });
    }

    @Override
    public void exitProgram(PlayPlusParser.ProgramContext ctx) {
        System.out.println(errors.toString());
    }
}

