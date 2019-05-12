package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.FunctionDecl;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Type;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.StructRefSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import org.apache.commons.jexl3.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

public class NbcPrinterVisitor extends PlayPlusBaseVisitor {
    private String fileName;
    private SymbolTable symbolTable;
    private StringBuilder code;
    private HashMap<String, STGroup> templates;
    private ArrayList<FunctionDecl> functionDecls;

    public NbcPrinterVisitor(String fileName, SymbolTable symtable) {
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

    private void addFunctionDecl(FunctionDecl functionDecl) {
        this.functionDecls.add(functionDecl);
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
    public Integer visitExprBool(PlayPlusParser.ExprBoolContext ctx) {
        int value = 0;
        String debugString = ctx.getText();
        System.out.println("VisitExprBool :" + debugString );
        if (ctx.getChildCount() == 2) {
//            System.out.println("Neg Exp bool : "+ctx.getText());
            //evalNegBool(ctx);
            return value;
        }

        if (ctx.getChildCount() >= 3) {
            System.out.println("Exp bool 3 termes : "+ctx.getText());
            //evalExpBool(ctx);
            return value;
        }


        try {
            boolean val = Boolean.valueOf(ctx.getText());
            value = val == true ? 1 : 0;

        } catch (Exception e) {
            System.out.println("Erreur bool : "+ctx.getText());
        }

        return value; //super.visitExprBool(ctx);
    }

    @Override
    public Integer visitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        String debugString = ctx.getText();
        System.out.println("VisitExprEnt :" + debugString );
        String op = "";
        int value = 0;

        if (ctx.operateurEntier() != null){
            op = ctx.operateurEntier().getText();
            PlayPlusParser.ExprEntContext left = ctx.exprEnt(0);
            PlayPlusParser.ExprEntContext right = ctx.exprEnt(1);
            int valueleft = this.visitExprEnt(left);
            int valueright  = this.visitExprEnt(right);
           // System.out.println("valueleft : " + valueleft);
            //System.out.println("valuerigth : " + valueright);
            value = evaluateExprEnt(valueleft, valueright, op);
            System.out.println("calculated value : " + value);
            return value;
        }

        if (ctx.MINUS() != null){

            value = -1 * this.visitExprEnt(ctx.exprEnt(0));
            return value;
        }

        if (ctx.getText().charAt(0) == '(' ){
            System.out.println("Parenthese : "+ctx.exprEnt(0));
            value = this.visitExprEnt(ctx.exprEnt(0));
            return value;
        }

        if(ctx.funcCall() != null){


            value = visitFuncCall(ctx.funcCall());// value of execution.



            return value;
        }

        try {

            value = Integer.valueOf(ctx.getText());
            System.out.println("casted value : " + value);

        } catch (Exception exception){


            Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(ctx.getText());

            if (result.isPresent()) {
                System.out.println("result get"+result.get());
                System.out.println("valueof "+ctx.getText() + " value :"+result.get().getValue());

                if (result.get().getValue() != null){

                    value = result.get().getValue();
                }

            } else {
                System.out.println("Scope ExprEnt : "+ symbolTable.getCurrentScope().getScopeName());
                System.out.println("ERROR : valueof "+ctx.getText() +"");

            }

        }

        return value;
    }

    @Override
    public Integer visitCharVal(PlayPlusParser.CharValContext ctx) {
        int value = 0;
        value = ctx.CHARACTER().getText().charAt(1);
        return value;
    }

    @Override
    public Integer visitVarDecl(PlayPlusParser.VarDeclContext ctx) {

        int value = 0;
        System.out.println("visitVarDecl :"+ctx.getText());
       Iterator subVarDecls = ctx.subVarDecl().listIterator();
       while (subVarDecls.hasNext()){
           PlayPlusParser.SubVarDeclContext subVarDecl = (PlayPlusParser.SubVarDeclContext) subVarDecls.next();
           value = this.visitSubVarDecl(subVarDecl);
           symbolTable.getCurrentScope().resolveByName(subVarDecl.ID().getText()).get().setValue(value);
       }

       return value;
    }

    @Override
    public Integer visitSubVarDecl(PlayPlusParser.SubVarDeclContext ctx) {
        int value = 0;
        System.out.println("visitSubVarDecl :"+ctx.getText());
        //System.out.println(symbolTable.getCurrentScope());
        String varName = ctx.ID().getText();

        if (ctx.initVariable() != null) {
            value = this.visitInitVariable(ctx.initVariable());
            Optional<Symbol> result = resolveSymbolRec(varName,symbolTable.getCurrentScope());
            if (result.isPresent()){

                result.get().setValue(value);

            }
        }

            return value;
    }

    @Override
    public Integer visitInitVariable(PlayPlusParser.InitVariableContext ctx) {
        int value = 0;
        if (ctx.exprEnt() != null)
        { value = visitExprEnt(ctx.exprEnt());}
        return value;

    }

    @Override
    public Integer visitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        int value = 0;
        System.out.println("VisitAffectInstr :"+ctx.getText());
        if (ctx.exprG().ID() != null){
            String varName = ctx.exprG().ID().getText();


            System.out.println("Scope Affect : "+ symbolTable.getCurrentScope().getScopeName());
            Optional<Symbol> result = resolveSymbolRec(varName, symbolTable.getCurrentScope());

                value = this.visitExprD(ctx.exprD());

            if (result.isPresent()) {
                System.out.println("setting value of  "+ varName + " in " + ctx.getText() + "value : "+ value);

                result.get().setValue(value);

            } else {
                System.out.println("ERROR : valueof "+ctx.getText() +"");
            }

        }


        return value;
    }

    @Override
    public Integer visitExprD(PlayPlusParser.ExprDContext ctx) {
        int value = 0;
        if (ctx.exprEnt() != null)
        { value = visitExprEnt(ctx.exprEnt());}
        if (ctx.funcCall() != null){
            value = visitFuncCall(ctx.funcCall());

        }
        if (ctx.exprBool() != null){
            value = visitExprBool(ctx.exprBool());

        }
        if (ctx.charVal()  != null){
            value = visitCharVal(ctx.charVal());
        }
        return value;
    }

    @Override
    public Integer visitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        System.out.println("VisitFuncDecl : "+ ctx.getText());
        int value = 0;
        String funcName = ctx.ID().getText();
        FunctionDecl fct = new FunctionDecl(funcName ,ctx);
        addFunctionDecl(fct);



        if (ctx.returnInstr().exprD() != null) {
            value = visitExprD(ctx.returnInstr().exprD());
            System.out.println("TEst = " + value);
        }

        if (ctx.returnInstr().exprG() != null && ctx.returnInstr().exprG().ID() != null){
            System.out.println("rtrninst ID :" + ctx.returnInstr().exprG().ID() );
            //System.out.println("current scope : "+ symbolTable.getCurrentScope().getScopeName());
            //System.out.println("current scope : "+ symbolTable.getCurrentScope());
            String varName = ctx.returnInstr().exprG().ID().getText();
            Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(varName);
            if (result.isPresent()){
                //value = result.get().setValue();
                //value = result.get().getValue();
            }
        }

        System.out.println("out");


        return value;
    }

    @Override
    public Integer visitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        int value = 0;
        System.out.println("VisitFuncCall : "+ ctx.getText());
        String funcName = ctx.ID().getText();

        Optional<Symbol> result = symbolTable.getGlobals().resolveByName(funcName);
        Scope currentScope = symbolTable.getCurrentScope();
        if (result.isPresent()){
            this.symbolTable.setCurrentScope(((FunctionSymbol) result.get()));

            Iterator callargs = ctx.funcCallArgs().funcCallArg().listIterator();
            int i = 0;
                while (callargs.hasNext()) {
                    PlayPlusParser.ExprDContext exprDContext = ((PlayPlusParser.FuncCallArgContext) callargs.next()).exprD();
                    if (exprDContext.getText().length() > 0){
                        ((FunctionSymbol) result.get()).getArgs().get(i).setValue(visitExprD(exprDContext));
                        i++;
                    }

                }

            PlayPlusParser.FuncDeclContext funcDeclContext = findFunctionDeclByText(funcName).get().getCtx();
            //value  = visitFuncDecl(funcDeclContext);
            visitChildren(funcDeclContext);

            if (!(funcDeclContext.returnInstr().getChild(1).getText().equals("void"))) {

                    //value = ((FunctionSymbol) result.get()).resolveByName(funcDeclContext.returnInstr().getChild(1).getText()).get().getValue();
                value = resolveSymbolRec(funcDeclContext.returnInstr().getChild(1).getText(),symbolTable.getCurrentScope()).get().getValue();
                    System.out.println("TEst = " + value);

            }

            //super.visitFuncDecl(funcDeclContext);
            //visitChildren(ctx);
            System.out.println("SETTING SCOPE TO :" + currentScope.getScopeName());
            this.symbolTable.setCurrentScope(currentScope);
            symbolTable.getCurrentScope().resolveByName(ctx.getText()).get().setValue(value);
        }
        System.out.println("reutn visiFuncCall :" + value);
        return value;
    }

    private int evaluateExprEnt(int left, int right, String operateur) {
        int result = 0;
        switch(operateur) {
            case "+":
                // code block
                result = left + right;
                break;
            case "-":
                // code block
                result = left - right;
                break;
            case "*":
                result = left  * right;
                break;
            case "/":
                result = left / right;
                //
                break;
            case "^":
                result = (int)Math.pow(left, right);
                //
                break;
            case "%":
                result = left % right;
                break;

            default:
                // code block

        }

        return result;

    }

    /**
     * Trouve une functionDecl qui match le text dans la table des functiondecls
     * @param functText
     * @return
     */
    private Optional<FunctionDecl> findFunctionDeclByText(String functText) {
        Optional<FunctionDecl> functionDecl = this.functionDecls.stream()
                .filter(x -> x.getText().equals(functText))
                .findFirst();
        return functionDecl;
    }

    private Optional<Symbol> resolveFunc(String funName) {
        Scope currentScope = this.symbolTable.getCurrentScope();
        System.out.println("currentscope : "+ currentScope.getScopeName());
        Optional<Symbol> func = resolveSymbolRec(funName, currentScope);
        if (! func.isPresent()) {
            System.out.println("Function "+ funName +" do not exist");
        }
        return func;

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





}
