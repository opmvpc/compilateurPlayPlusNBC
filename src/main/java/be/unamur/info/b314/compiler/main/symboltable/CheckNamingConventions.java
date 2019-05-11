package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.symbols.ConstanteSymbol;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

public class CheckNamingConventions {
    private SymbolTable symTable;
    private Errors errors;

    public CheckNamingConventions(SymbolTable symTable, Errors errors ) {
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

    /**
     * Vérifie si le nom de la variable local est déjà utilisé par une variable globale
     */
    private void checkLocalVarNotGlobalVarName() {
        ArrayList<Symbol> globalScope =  this.symTable.getGlobals().getSymbols();
      //  System.out.println(globalScope.toString());
        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol globalVar = (Symbol) vars.next();
            if (globalVar instanceof VariableSymbol) {
                String globalVarName = ((VariableSymbol) globalVar).getName();
                System.out.println("globalVarName " + globalVarName);

                Iterator varsCheck = globalScope.listIterator();

                while (varsCheck.hasNext()) {
                    Symbol funct = (Symbol) varsCheck.next();
                    System.out.println("function Name" + funct.getName());
                    if (funct instanceof FunctionSymbol) {
                        if (!((FunctionSymbol) funct).getScopeName().equals("main")) {
                            Optional<Symbol> localVar = ((FunctionSymbol) funct).resolveByName(globalVarName);
                            if (localVar.isPresent()) {
                                if (!localVar.get().getType().getName().equals(((VariableSymbol) globalVar).getType().getName())) {
                                    System.out.println(localVar.get().getType().getName().equals(((VariableSymbol) globalVar).getType().getName()));
                                } else {
                                    this.errors.badNameError.add("Le nom de la variable locale:" +
                                            ((VariableSymbol) globalVar).getNiceName() +
                                            " est déjà utilisé par une variable globale");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la variable est déjà utilisé par une fonction
     */
    private void checkGlobalVarNames() {
        ArrayList<Symbol> globalScope =  this.symTable.getGlobals().getSymbols();

        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol globalVar = (Symbol) vars.next();
            if(globalVar instanceof VariableSymbol){
                Iterator varsLocal =  globalScope.listIterator();
                while (varsLocal.hasNext()) {
                    Symbol localVar = (Symbol) varsLocal.next();
                    if (localVar instanceof FunctionSymbol) {
                        if (globalVar.getName().equals(localVar.getName())) {
                            this.errors.badNameError.add("Le nom de la variable:" +
                                    globalVar.getName() +
                                    " est déjà utilisé par une fonction");
                        }
                    }
                    if (localVar instanceof VariableSymbol && globalVar != localVar) {
                        if (globalVar.getName().equals(localVar.getName())) {
                            this.errors.badNameError.add(" Le nom de la variable:" +
                                    globalVar.getName() +
                                    " est déjà utilisé par une variable globale");
                        }
                    }
                }
            }
        }
    }


    /**
     *  Vérifie si le nom de la constante est déjà utilisé par une variable
     */
    private void checkLocalVarNamesNotInArgs() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol var = (Symbol) vars.next();
            String varName = ((Symbol) var).getName();
            Iterator vars2 =  globalScope.listIterator();
            while (vars2.hasNext()) {
                Symbol var2 = (Symbol) vars2.next();
                if (var instanceof VariableSymbol) {
                    if (var2 instanceof ConstanteSymbol) {
                        if (((VariableSymbol) var).getNiceName().equals(((Symbol) var2).getNiceName())) {
                            this.errors.badNameError.add("Le nom de la constante:" + var.getName() + " est déjà utilisé par une variable");
                        }
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la constante est déjà utilisé par une variable ou une autre constante
     */
    private void checkConstNames() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol var = (Symbol) vars.next();
            String varName = ((Symbol) var).getName();

            Iterator vars2 =  globalScope.listIterator();

            while (vars2.hasNext()) {
                Symbol var2 = (Symbol) vars2.next();
                if (var instanceof VariableSymbol) {
                    if (var2 instanceof ConstanteSymbol) {
                        if (var.getName().equals(((Symbol) var2).getName())) {
                            this.errors.badNameError.add("Le nom de la constante:" + var.getName() + " est déjà utilisé par une variable");
                        }
                    }
                }
                if (var instanceof ConstanteSymbol && var2 instanceof ConstanteSymbol  && var != var2  ) {
                    if (var.getName().equals(((Symbol) var2).getNiceName())) {
                        this.errors.badNameError.add("Le nom de la constante:" + var.getName() + " est déjà utilisé par une autre constante" +  var2.getName());
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la variable dans une fonction est déjà utilisé par un des paramètres de la fonction
     */
    private void checkLocalVarNames() {
        ArrayList<Symbol> globalScope =  this.symTable.getGlobals().getSymbols();

        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                Iterator args = ((FunctionSymbol) funct).getBody().getSymbols().listIterator();

                while (args.hasNext()) {
                    Symbol arg = (Symbol) args.next();

                    Symbol localVar = resolveArgsByName( arg.getName(), ((FunctionSymbol) funct));
                    System.out.println("arg.getName()" + arg.getName() );

                    if (localVar != null &&  localVar !=funct ) {
                        this.errors.badNameError.add("La variable locale : " +
                                 arg.getName() +
                                " de la fonction : "+
                                 funct.getName() +
                                " ne peut avoir le même nom que l'un des paramètres");
                    }
                }
            }
        }
    }

    public Symbol resolveArgsByName(String name, FunctionSymbol fun) {
        ArrayList<Symbol> listArgs =   fun.getArgs();

        Iterator vars =  listArgs.listIterator();

        while (vars.hasNext()) {
            Symbol arg = (Symbol) vars.next();

            if (arg.getName().equals(name)) {
                return arg;
            }
        }

        return null;
    }

    /**
     *  Vérifife si la variable locale  à le même nom que la fonction dans laquelle elle est déclarée
     */
    private void checkLocalVarNameNotFunctName() {
        ArrayList<Symbol> globalScope =  this.symTable.getGlobals().getSymbols();

        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                String functName =  ((FunctionSymbol) funct).getName();
                Optional<Symbol> var = ((FunctionSymbol) funct).getBody().resolveByName(functName);
                if (var.isPresent()) {
                    this.errors.badNameError.add("La variable locale : " +
                            var.get().getName() +
                            " ne peut pas avoir le même nom que la fonction dans laquelle elle est déclarée");
                }
            }
        }
    }

    /**
     * Vérifife que les arguments d'une fonction n'ont pas le meme nom que la même fonction
     */
    private void checkArgNameNotFunctName() {
        ArrayList<Symbol> globalScope =  this.symTable.getGlobals().getSymbols();
        Iterator vars =  globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                String funName =  funct.getName();
                Symbol arg = resolveArgsByName(funName,((FunctionSymbol) funct));
                if (arg != null) {
                    this.errors.badNameError.add("L'argument : " +
                            arg.getName() +
                            " ne peut pas avoir le même nom que la fonction dans lequel il est déclaré");
                }
            }
        }
    }
}
