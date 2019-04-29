package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.SymbolNotFoundException;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.StructSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;

import java.util.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

//    @Override
//    public void enterStructRef(PlayPlusParser.StructDeclContext ctx) {
//        String structName = SymbolNamesHelper.generateName("StructSymbol", ctx.structures().ID().getText());
//        StructSymbol structSymbol = (StructSymbol) this.symTable.getGlobals().resolve(structName);
//        this.symTable.setCurrentScope(structSymbol);
//    }


    @Override
    public void enterStructRef(PlayPlusParser.StructRefContext ctx) {
        String structName = SymbolNamesHelper.generateName("StructSymbol", ctx.ID().getText());
        StructSymbol structSymbol = (StructSymbol) this.symTable.getGlobals().resolve(structName);
        this.symTable.setCurrentScope(structSymbol);
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
                String structName = SymbolNamesHelper.generateName("StructSymbol", member.ID().getText());
                StructSymbol struct = (StructSymbol) structScope.resolve(structName);
                if (struct == null) {
                    this.errors.symbolNotFound.add("Structure "+ structName +" do not exist");
                }
                this.symTable.setCurrentScope(struct);
            } else {
                String varName = SymbolNamesHelper.generateName("VariableSymbol", member.ID().getText());
                System.out.println(structScope.getScopeName());
                VariableSymbol var = (VariableSymbol) structScope.resolve(varName);
                if (var == null) {
                    this.errors.symbolNotFound.add("Variable "+ varName +" do not exist in structure");
                }
            }
        }
        this.symTable.setCurrentScope(structScope);
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

