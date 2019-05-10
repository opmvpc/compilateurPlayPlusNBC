package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scopes.GlobalScope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.ScopedSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class SymbolTable {

    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope;

    /**
     * Constructeur de la table des symboles
     */
    public SymbolTable() {
        this.scopes = new ParseTreeProperty<>();
        this.globals = new GlobalScope(null);
        this.currentScope = this.globals;
    }

    /**
     * Renvoie la tables des symboles
     * @return HashMap symboltable
     */
    public ParseTreeProperty getScopes() {
        return this.scopes;
    }

    public GlobalScope getGlobals() {
        return globals;
    }

    /**
     *
     * @return currentScope
     */
    public Scope getCurrentScope() {
        return currentScope;
    }

    /**
     * met dans le currentScope l'enclosing Scope
     */
    public void setCurrentScopeToEnclosingOne() {
        this.currentScope = this.getCurrentScope().getEnclosingScope();
    }

    /**
     * On remplace le currentScope par celui reçu en paramètre
     * @param currentScope
     */
    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    /**
     *
     * @param symbol
     */
    public void define(Symbol symbol) {
        this.currentScope.define(symbol);
    }

    /**
     *
     * @param name
     * @return
     */
    public Symbol getType(String name) {
        return this.getGlobals().resolveByName(name).get();
    }

    /**
     * Sauvegarde le scope dans la table des symboles
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
