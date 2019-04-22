package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.Helpers.Errors;
import be.unamur.info.b314.compiler.main.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Filler;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.symbols.*;

import java.util.Iterator;

public class DefPhase extends PlayPlusBaseListener implements Filler {

    private SymbolTable symTable;
    private Errors errors;

    public DefPhase(Errors errors) {
        this.errors = errors;
    }

    private void defineVar(String varName, String varTypeName)  {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        Scope currentScope = symTable.getCurrentScope();
        if (currentScope.getEnclosingScope() == null) {
            if (currentScope.resolve(SymbolNamesHelper.generateName("VariableSymbol", varName)) != null) {
                errors.badNameError.add("Deux variables globales ne peuvent pas porter le même nom");
            }
        } else {
            if (currentScope instanceof FunctionSymbol) {
                if (((FunctionSymbol) currentScope).getBody().resolve(SymbolNamesHelper.generateName("VariableSymbol", varName)) != null) {
                    errors.badNameError.add("Deux variables ne peuvent pas porter le même nom dans une même fonction");
                }
            }
        }

        this.symTable.define(new VariableSymbol(varName, varType));
    }

    private Object resolveType(String varTypeName) {
        return this.symTable.getGlobals().resolve(SymbolNamesHelper.generateName("BuiltInTypeSymbol",varTypeName));
    }

    private void defineFunctArg(String varName, String varTypeName) {
        Type varType = (BuiltInTypeSymbol) resolveType(varTypeName);

        if (symTable.getCurrentScope().getSymbols().get(SymbolNamesHelper.generateName("VariableSymbol", varName)) != null) {
            errors.badNameError.add("Deux paramètres d'une fonction ne peuvent pas porter le même nom");
        }

        ((FunctionSymbol) this.symTable.getCurrentScope()).defineArg(new VariableSymbol(varName, varType));
    }

    private FunctionSymbol defineFunction(String name, String funcTypeName) {
        Type functype = (BuiltInTypeSymbol) resolveType(funcTypeName);
        Scope currentScope = this.symTable.getCurrentScope();

        if (currentScope.resolve(SymbolNamesHelper.generateName("FunctionSymbol" ,name)) != null) {
            errors.badNameError.add("Deux fonctions ne peuvent pas porter le même nom");
        }

        FunctionSymbol function = new FunctionSymbol(name, functype, currentScope);
        currentScope.define(function);
        this.symTable.setCurrentScope(function);

        return function;
    }

    private StructSymbol defineStruct(String name) {
        Scope currentScope = this.symTable.getCurrentScope();
        StructSymbol struct = new StructSymbol(name, currentScope);
        System.out.println(struct.getEnclosingScope().getScopeName());
        currentScope.define(struct);
        this.symTable.setCurrentScope(struct);

        return struct;
    }

    /**
     *
     * @return La HashMap contenue par symTable
     */
    @Override
    public SymbolTable getSymTable() {
        return this.symTable;
    }

    @Override
    public void enterProgram(PlayPlusParser.ProgramContext ctx) {
        this.symTable = new SymbolTable();
    }

    @Override
    public void exitProgram(PlayPlusParser.ProgramContext ctx) {
        System.out.println(this.symTable.toString());
    }

    /**
     *  Ajoute un symbole lors de la déclaration d'une variable à la table des symboles
     *
     * @param ctx
     */
    @Override
    public void enterVarDecl(PlayPlusParser.VarDeclContext ctx) {
        String varTypeName = ctx.mytype().getText();
        Iterator vars = ctx.subVarDecl().listIterator();

        while (vars.hasNext()) {
            Object var = vars.next();
            String varName = ((PlayPlusParser.SubVarDeclContext) var).ID().getText();
            defineVar(varName, varTypeName);
        }
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        String name = ctx.ID().getText();
        String funcTypeName;
        if (ctx.VOID() != null) {
            funcTypeName = "void";
        } else {
            funcTypeName = ctx.mytype().getText();
        }
        FunctionSymbol function = defineFunction(name, funcTypeName);

        this.symTable.saveScope(ctx, function);
    }

    @Override
    public void exitFuncArg(PlayPlusParser.FuncArgContext ctx) {
        String varName = ctx.exprG().ID().getText();
        String varTypeName = ctx.mytype().getText();

        defineFunctArg(varName, varTypeName);
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
//        System.out.println(this.symTable.getCurrentScope());
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    @Override
    public void enterStructDecl(PlayPlusParser.StructDeclContext ctx) {
        String name = ctx.structures().ID().getText();
        StructSymbol struct = defineStruct(name);

        this.symTable.saveScope(ctx, struct);
    }

    @Override
    public void exitStructField(PlayPlusParser.StructFieldContext ctx) {
        String varTypeName = ctx.mytype().getText();
        Iterator vars = ctx.fieldDecl().listIterator();

        while (vars.hasNext()) {
            Object var = vars.next();
            String varName = ((PlayPlusParser.FieldDeclContext) var).ID().getText();

            defineVar(varName, varTypeName);
        }

    }

    @Override
    public void exitStructDecl(PlayPlusParser.StructDeclContext ctx) {
        this.symTable.setCurrentScopeToEnclosingOne();
    }

    private MapSymbol defineMap(String name, String mapTypeName) {
        Type mtype= new BuiltInTypeSymbol("map");
        MapSymbol map = new MapSymbol(name, mtype);
        return map;
    }

    @Override
    public void enterMapfile(PlayPlusParser.MapfileContext ctx) {
        this.symTable = new SymbolTable();
        String name = ctx.getChild(0).getText();
        String funcTypeName =ctx.getChild(1).getText();
        MapSymbol mp = defineMap(name, funcTypeName);
        //****************
        String mapX = ctx.mapsize().coordX().getText();
        String mapY = ctx.mapsize().coordY().getText();

        String mapLine = ctx.world().getText();
        String typeError = mp.createCarte(mapX,mapY,mapLine);
        if (typeError != null){
            //this.errors.mapError.add(typeError);
            // Trouver un moyen de stocker et d'afficher les erreurs
        }
        //****************
        this.symTable.define(mp);
    }
    @Override
    public void exitMapfile(PlayPlusParser.MapfileContext ctx) {
        System.out.println(this.symTable.toString());
    }

    private void defineConstante(String constName, String constTypeName)  {
        Type varType = (BuiltInTypeSymbol) this.symTable.getGlobals().resolve(constTypeName);

        this.symTable.define(new ConstanteSymbol(constName, varType));
    }
    @Override
    public void enterConstDecl(PlayPlusParser.ConstDeclContext ctx) {
        String constTypeName = ctx.mytype().getText();
        String varName = ctx.ID().get(0).getText();
        defineConstante(varName, constTypeName);
    }

}
