package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.VariableSymbol;

import java.util.Iterator;
import java.util.Optional;

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
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterMainProgram(PlayPlusParser.MainProgramContext ctx) {
        this.symTable.setCurrentScope((Scope) this.symTable.getScopes().get(ctx));
    }

    @Override
    public void exitMainProgram(PlayPlusParser.MainProgramContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void exitExprG(PlayPlusParser.ExprGContext ctx) {
//        match aussi les références de tableau et structs donc on stop là si c'est la cas
        if (ctx.arrayRef() != null || ctx.structRef() != null) {
//            System.out.println(ctx.getText());
            return;
        }

        String varName = ctx.ID().getText();

        try {
            resolveVar(varName);
        } catch (SymbolNotFoundException e) {
            this.errors.symbolNotFound.add(e.getMessage());
        }
    }

    @Override
    public void enterStructRef(PlayPlusParser.StructRefContext ctx) {
        String structName = ctx.ID().getText();
        Optional<Symbol> structSymbol = this.symTable.getGlobals().resolveByName(structName);
        if (structSymbol.isPresent()) {
            this.symTable.setCurrentScope((Scope) structSymbol.get());
        }
    }

    @Override
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
        Iterator members = ctx.members().member().listIterator();
        resolveStruct(members, this.symTable.getCurrentScope());
    }

    /**
     * Check si une variable existe dans une structure
     *
     * on part du scope de la structure référencée
     * pour chaque membre
     * si le membre est final, on resolve une variable
     * si le membre est une autre structure, on change de scope
     * si on trouve rien on revoie une erreur
     * à la fin on revient au scope de base
     *
     * @param members
     * @param structScope
     */
    private void resolveStruct(Iterator members, Scope structScope) {
        while (members.hasNext()) {
            PlayPlusParser.MemberContext member = (PlayPlusParser.MemberContext) members.next();
            System.out.println(member.ID().getText());
            if (members.hasNext()) {
                String structName = member.ID().getText();
                Optional<Symbol> struct = structScope.resolveByName(structName);
                if (! struct.isPresent()) {
                    this.errors.symbolNotFound.add("Structure "+ structName +" do not exist");
                } else {
                    this.symTable.setCurrentScope((Scope) struct.get());
                }
            } else {
                String varName = member.ID().getText();
                System.out.println(structScope.getScopeName());
                Optional<Symbol> var = structScope.resolveByName(varName);
                if (! var.isPresent()) {
                    this.errors.symbolNotFound.add("Variable "+ varName +" do not exist in structure");
                }
            }
        }
        this.symTable.setCurrentScope(structScope);
    }

    private void resolveVar(String varName) throws SymbolNotFoundException {
        Optional<Symbol> var = resolveSymbolRec(varName, this.symTable.getCurrentScope());
        if (! var.isPresent()) {
            throw new SymbolNotFoundException("Variable "+ varName +" do not exist");
        }
    }

    private Optional<Symbol> resolveSymbolRec(String name, Scope currentScope) {
        System.out.println("resolveSymbolRec : "+ currentScope.getScopeName());
        Optional<Symbol> symbol = currentScope.resolveByName(name);
        if (! symbol.isPresent() && currentScope.getEnclosingScope() == null) {
            return Optional.empty();
        }
        if (symbol.isPresent()) {
            return symbol;
        }
        return resolveSymbolRec(name, currentScope.getEnclosingScope());
    }

    /**
     *  Vérifie si la Map existe dans la table des symboles
     * @param mapName
     * @return un MapSymbol representant la Map
     */

    private Optional<Symbol> resolveMap(String mapName){
        Optional<Symbol> maps = resolveSymbolRec(mapName, this.symTable.getGlobals()); // soucis avec le resolve
        if (! maps.isPresent()) {
            this.errors.mapError.add("Map is null ");
        }
        return resolveSymbolRec(mapName, this.symTable.getGlobals());
    }

    @Override
    public void exitMapfile(PlayPlusParser.MapfileContext ctx) {
        String varName = ctx.getChild(0).getText();
        resolveMap(varName);

        this.symTable.setCurrentScope(this.symTable.getCurrentScope().getEnclosingScope());
    }

    /**
     * Vérifife si le nom de la constante existe dans la table des symboles
     * @param constName le nom de la constante
     * @throws SymbolNotFoundException
     */
    private void resolveConst(String constName) throws SymbolNotFoundException {
        Optional<Symbol> consts = resolveSymbolRec(constName, this.symTable.getCurrentScope());
        if (!consts.isPresent()) {
            throw new SymbolNotFoundException("Constante "+ constName +" do not exist");
        }
        if (consts.get() instanceof VariableSymbol) {
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

}

