package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.symbols.ConstanteSymbol;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/**
 * @overview Classe utilisé pour les checks des noms des variables globales , locales de fonction,..
 * @specfiled symTable : SymbolTable la table des symboles
 * @specfiled errors: Errors
 */
public class CheckNamingConventions {
    private SymbolTable symTable;
    private Errors errors;

    public CheckNamingConventions(SymbolTable symTable, Errors errors) {
        this.symTable = symTable;
        this.errors = errors;

        checkNamingConventions();
    }

    private void checkNamingConventions() {
        checkGlobalVarNames();
        checkLocalVarNamesNotInArgs();
        checkLocalVarNameNotFunctName();
        checkArgNameNotFunctName();
        checkConstNames();
        checkLocalVarNames();
    }

    /**
     * Vérifie si le nom de la variable n'est pas déjà utilisé par une fonction ou par une autre variable globale
     */
    private void checkGlobalVarNames() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol globalVar = (Symbol) vars.next();
            if (globalVar instanceof VariableSymbol) {
                Iterator varsLocal = globalScope.listIterator();
                while (varsLocal.hasNext()) {
                    Symbol localVar = (Symbol) varsLocal.next();
                    if (localVar instanceof FunctionSymbol) {
                        if (globalVar.getName().equals(localVar.getName())) {
                            this.errors.badNameError.add("Le nom de la variable:" + globalVar.getName()
                                    + " est déjà utilisé par une fonction");
                        }
                    }
                    if (localVar instanceof VariableSymbol && globalVar != localVar) {
                        if (globalVar.getName().equals(localVar.getName())) {
                            this.errors.badNameError.add(" Le nom de la variable:" + globalVar.getName()
                                    + " est déjà utilisé par une variable globale");
                        }
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la constante n'est pas déjà utilisé par une variable
     */
    private void checkLocalVarNamesNotInArgs() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol var = (Symbol) vars.next();

            Iterator vars2 = globalScope.listIterator();
            while (vars2.hasNext()) {
                Symbol var2 = (Symbol) vars2.next();
                if (var instanceof VariableSymbol) {
                    if (var2 instanceof ConstanteSymbol) {
                        if (var.getName().equals(var2.getName()) && var != var2) {
                            this.errors.badNameError.add(
                                    "Le nom de la constante:" + var.getName() + " est déjà utilisé par une variable");
                        }
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la constante n'est pas déjà utilisé par une variable ou par une autre constante
     */
    private void checkConstNames() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol var = (Symbol) vars.next();

            Iterator vars2 = globalScope.listIterator();

            while (vars2.hasNext()) {
                Symbol var2 = (Symbol) vars2.next();
                if (var instanceof VariableSymbol) {
                    if (var2 instanceof ConstanteSymbol) {
                        if (var.getName().equals(var2.getName())) {
                            this.errors.badNameError.add(
                                    "Le nom de la constante:" + var.getName() + " est déjà utilisé par une variable");
                        }
                    }
                }
                if (var instanceof ConstanteSymbol && var2 instanceof ConstanteSymbol && var != var2) {
                    if (var.getName().equals(var2.getName())) {
                        this.errors.badNameError.add("Le nom de la constante:" + var.getName()
                                + " est déjà utilisé par une autre constante" + var2.getName());
                    }
                }
            }
        }
    }

    /**
     * Vérifie si le nom de la variable dans une fonction n'est pas déjà utilisé par un des paramètres de la fonction
     */
    private void checkLocalVarNames() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                Iterator args = ((FunctionSymbol) funct).getBody().getSymbols().listIterator();

                while (args.hasNext()) {
                    Symbol arg = (Symbol) args.next();

                    Symbol localVar = resolveArgsByName(arg.getName(), ((FunctionSymbol) funct));

                    if (localVar != null && localVar != funct) {
                        this.errors.badNameError.add("La variable locale : " + arg.getName() + " de la fonction : "
                                + funct.getName() + " ne peut avoir le même nom que l'un des paramètres");
                    }
                }
            }
        }
    }

    /**
     * @param name
     *            le nom de l'argument
     * @param fun
     *            le Symbole de la fonction
     * @return le symbole correspondant au nom name ou null si pas trouvé
     */
    public Symbol resolveArgsByName(String name, FunctionSymbol fun) {
        ArrayList<Symbol> listArgs = fun.getArgs();

        Iterator vars = listArgs.listIterator();

        while (vars.hasNext()) {
            Symbol arg = (Symbol) vars.next();

            if (arg.getName().equals(name)) {
                return arg;
            }
        }

        return null;
    }

    /**
     * Vérifie si la variable locale à le même nom que la fonction dans laquelle elle est déclarée
     */
    private void checkLocalVarNameNotFunctName() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();

        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                String functName = funct.getName();
                Optional<Symbol> var = ((FunctionSymbol) funct).getBody().resolveByName(functName);
                if (var.isPresent()) {
                    this.errors.badNameError.add("La variable locale : " + var.get().getName()
                            + " ne peut pas avoir le même nom que la fonction dans laquelle elle est déclarée");
                }
            }
        }
    }

    /**
     * Vérifie que les arguments d'une fonction n'ont pas le meme nom que la même fonction
     */
    private void checkArgNameNotFunctName() {
        ArrayList<Symbol> globalScope = this.symTable.getGlobals().getSymbols();
        Iterator vars = globalScope.listIterator();

        while (vars.hasNext()) {
            Symbol funct = (Symbol) vars.next();
            if (funct instanceof FunctionSymbol) {
                String funName = funct.getName();
                Symbol arg = resolveArgsByName(funName, ((FunctionSymbol) funct));
                if (arg != null) {
                    this.errors.badNameError.add("L'argument : " + arg.getName()
                            + " ne peut pas avoir le même nom que la fonction dans lequel il est déclaré");
                }
            }
        }
    }
}
