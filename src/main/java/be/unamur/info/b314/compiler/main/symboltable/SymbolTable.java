package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scopes.GlobalScope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.ScopedSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * @Overview la table des symbol
 * @specfiled scopes: ParseTreeProperty<Scope>
 * @specfiled globals: GlobalScope
 * @specfiled currentScope: Scope
 */
public class SymbolTable {

    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope;

    /**
     * Constructeur de la table des symboles
     * @effects Initialise la table des symboles
     */
    public SymbolTable() {
        this.scopes = new ParseTreeProperty<>();
        this.globals = new GlobalScope(null);
        this.currentScope = this.globals;
    }

    /**
     * Renvoie la tables des scopes
     * @return this.scopes
     */
    public ParseTreeProperty getScopes() {
        return this.scopes;
    }

    /**
     * @return globals le GlobalScope
     */
    public GlobalScope getGlobals() {
        return globals;
    }

    /**
     * @return currentScope le scope actuel
     */
    public Scope getCurrentScope() {
        return currentScope;
    }

    /**
     * @modifies this.currentScope avec le scope parent
     */
    public void setCurrentScopeToEnclosingOne() {
        this.currentScope = this.getCurrentScope().getEnclosingScope();
    }

    /**
     * @modifies  this.currentScope
     * @param currentScope
     */
    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    /**
     * @modifies this.currentScope
     * @param symbol
     */
    public void define(Symbol symbol) {
        this.currentScope.define(symbol);
    }

    /**
     *
     * @param name
     * @return le symbole correspondant au nom recu en paramètre
     */
    public Symbol getType(String name) {
        return this.getGlobals().resolveByName(name).get();
    }

    /**
     * Sauvegarde le scope dans la table des symboles
     * @modifies this.scope
     * @param ctx
     * @param scope
     */
    public void saveScope(RuleContext ctx, ScopedSymbol scope) {
        this.scopes.put(ctx, scope);
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "scopes=" + scopes +
                ", globals=" + globals +
                '}';
    }
}
