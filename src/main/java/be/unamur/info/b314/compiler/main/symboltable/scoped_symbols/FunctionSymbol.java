package be.unamur.info.b314.compiler.main.symboltable.scoped_symbols;

import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scopes.LocalScope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @overview FunctionSymbol est la classe representant les fonctions ,son scope, ses arguments et son body
 *
 */
public class FunctionSymbol extends ScopedSymbol implements Scope {
    private LocalScope body;

    /**
     * @effects initialise une FunctionSymbol avec un name, un type et un scope
     * @param name le nom de la fonction
     * @param type le type de retour de la fonction
     * @param scope son scope
     */
    public FunctionSymbol(String name, Type type, Scope scope) {
        super(name, type, scope);
        this.body = new LocalScope("body", this);
    }

    /**
     *
     * @return le nom du scope de la fonction
     */
    @Override
    public String getScopeName() {
        return super.getName();
    }

    /**
     * Définition des arguments de la fonction
     * @modifies this
     * @effects this._post = this U {symbol}
     * @param symbol représente un argument
     */
    public void defineArg(Symbol symbol) {
        super.getSymbols().add(symbol);
    }

    /**
     * Définition du body de la fonction
     * @modifies this
     * @effects this.body_post = this.body U {symbol}
     * @param symbol le body
     */
    @Override
    public void define(Symbol symbol) {
        this.body.define(symbol);
    }

    /**
     * Cherche le symbol à partir d'un nom
     * @param name le nom de la fonction qu'on cherche
     * @return un Optional<Symbol>
     */
    @Override
    public Optional<Symbol> resolveByName(String name) {
        Optional<Symbol> symbol = super.resolveByName(name);

        if (! symbol.isPresent()){
            symbol = body.resolveByName(name);
        }

        return symbol;
    }

    /**
     *
     * @param name le nom de la fonction
     * @param type le type de la fonction
     * @return Optional<Symbol> representant la fonction
     */
    @Override
    public Optional<Symbol> resolveByNameAndType(String name, String type) {
        Optional<Symbol> symbol = super.resolveByNameAndType(name, type);

        if (! symbol.isPresent()){
            symbol = body.resolveByNameAndType(name, type);
        }

        return symbol;
    }

    /**
     *
     * @return  Les arguments de la fonction sous la forme d'une ArrayList de Symbol
     */
    @Override
    public ArrayList<Symbol> getSymbols() {
        return super.getSymbols();
    }

    /**
     *
     * @return la liste des arguments sous la forme d'une ArrayList<Symbol>
     */
//    Alias, obligé d'avoir une fonction getSymbols() et une propriété symbols
    public  ArrayList<Symbol> getArgs() { return getSymbols();}

    /**
     *
     * @return LocalScope représentant le body de la fonction
     */
    public LocalScope getBody() {
        return body;
    }

    /**
     * Représentation de l'objet
     *
     * @return String str
     */
    @Override
    public String toString() {
        return "FunctionSymbol" + " {" +
                "\n\t\tname = '" + super.getName() + '\'' +
                (super.getType() != null ? ", \n\t\ttype = " + super.getType().getName() : "") +
                ", \n\t\targuments = " + super.getSymbols()+
                ", \n\t\tbody = " + this.body.getSymbols() +
                "\n\t}";
    }
}
