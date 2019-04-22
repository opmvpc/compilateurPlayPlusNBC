package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.symbols.ConstanteSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;

import java.util.HashMap;

public class CheckNamingConventions {
    private SymbolTable symTable;
    private Errors errors;

    public CheckNamingConventions(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;

        checkNamingConventions();
    }

    private void checkNamingConventions(){
        checkGlobalVarNames();
        checkLocalVarNamesNotInArgs();
        checkLocalVarNameNotFunctName();
        checkArgNameNotFunctName();
        checkConstNames();
        checkLocalVarNames();
        checkLocalVarNotGlobalVarName();
    }

    private void checkLocalVarNotGlobalVarName() {
        HashMap globalScope =  this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, globalVar) -> {
            if(globalVar instanceof VariableSymbol){
                String globalVarName = ((VariableSymbol) globalVar).getName();
                System.out.println(globalVarName);
                globalScope.forEach((k2, funct) -> {
                    if (funct instanceof FunctionSymbol){
                        Symbol localVar = ((FunctionSymbol) funct).getBody().resolve(globalVarName);
                        if (localVar != null) {
                            if (!localVar.getType().getName().equals(((VariableSymbol) globalVar).getType().getName())){
                                System.out.println(localVar.getType().getName().equals(((VariableSymbol) globalVar).getType().getName()));
                            } else {
                                this.errors.badNameError.add("Le nom de la variable locale:" +
                                        ((VariableSymbol) globalVar).getNiceName() +
                                        " est déjà utilisé par une variable globale");
                            }

                        }
                    }
                });
            }
        });
    }

    private void checkGlobalVarNames() {
        HashMap globalScope =  this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, v) -> {
            if(v instanceof VariableSymbol){
                globalScope.forEach((k2, v2) -> {
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
        HashMap globalScope = this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, v) -> {
            String varName = ((Symbol) v).getName();
            globalScope.forEach((k2, v2) -> {
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
        HashMap globalScope = this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, v) -> {
            String varName = ((Symbol) v).getName();
            globalScope.forEach((k2, v2) -> {
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

    private void checkLocalVarNames() {
        HashMap globalScope =  this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, funct) -> {
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
        HashMap globalScope =  this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, funct) -> {
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
        HashMap globalScope =  this.symTable.getGlobals().getSymbols();
        globalScope.forEach((k, funct) -> {
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
}
