package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.FunctionDecl;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

public class NbcVisitor extends PlayPlusBaseVisitor {
    private String fileName;
    private SymbolTable symbolTable;
    private StringBuilder code;
    private HashMap<String, STGroup> templates;
    private ArrayList<FunctionDecl> functionDecls;

    public NbcVisitor(String fileName, SymbolTable symtable) {
        this.fileName = fileName;
        this.symbolTable = symtable;
        initTemplates();
        this.code = new StringBuilder();
        this.functionDecls = new ArrayList<>();
    }

    private void initTemplates() {

        this.templates = new HashMap<>();
        this.templates.put("actions", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/actions.stg"));

    }

    @Override
    public Integer visitRoot(PlayPlusParser.RootContext ctx) {
        int value = 0;
        symbolTable.setCurrentScope(symbolTable.getGlobals());
        visitChildren(ctx);
        symbolTable.setCurrentScopeToEnclosingOne();
        return value;

    }

    @Override
    public Object visitMainProgram(PlayPlusParser.MainProgramContext ctx) {


        //Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName("main");
        FunctionSymbol mainscope = (FunctionSymbol) symbolTable.getScopes().get(ctx);
        System.out.println("BEFORE SET SCOPE :" +symbolTable.getCurrentScope().getScopeName());
        this.symbolTable.setCurrentScope(mainscope);
        System.out.println("AFTER SET SCOPE : "  + symbolTable.getCurrentScope().getScopeName());
        return visitChildren(ctx);

    }

    @Override
    public Object visitWhileStmt(PlayPlusParser.WhileStmtContext ctx) {
        symbolTable.setCurrentScope((Scope) symbolTable.getScopes().get(ctx));
        visitChildren(ctx);
        symbolTable.setCurrentScopeToEnclosingOne();
        return 0;
    }

    @Override
    public Object visitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
        symbolTable.setCurrentScope((Scope) symbolTable.getScopes().get(ctx));
        visitChildren(ctx);
        symbolTable.setCurrentScopeToEnclosingOne();
        return 0;
    }

    @Override
    public Boolean visitBoolLiteral(PlayPlusParser.BoolLiteralContext ctx) {
        System.out.println("visitBoolLiteral");
        return Boolean.valueOf(ctx.getText());
    }

    @Override
    public Character visitCharVal(PlayPlusParser.CharValContext ctx) {
        return ctx.getText().charAt(1);
    }

    @Override
    public Object visitNaturel(PlayPlusParser.NaturelContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

//    @Override
//    public Object visitId(PlayPlusParser.IdContext ctx) {
//        System.out.println("VisitId ");
//        int value = 0;
//        Optional<Symbol> result =  resolveSymbolRec(ctx.getText(), symbolTable.getCurrentScope());
//
//        if (result.isPresent()) {
//            System.out.println("result get"+result.get());
//            if (result.get().getValue() != null){
//                value = result.get().getValue();
//            }
//        } else {
//            System.out.println("ERROR : valueof "+ctx.getText() +"");
//        }
//        return value;
//
//    }

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
}
