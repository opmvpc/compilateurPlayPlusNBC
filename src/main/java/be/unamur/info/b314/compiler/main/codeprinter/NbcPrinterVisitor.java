package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
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

    public NbcPrinterVisitor(String fileName, SymbolTable symtable) {
        this.fileName = fileName;
        this.symbolTable = symtable;
        initTemplates();
        this.code = new StringBuilder();
    }

    private void initTemplates() {

        this.templates = new HashMap<>();
        this.templates.put("actions", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/actions.stg"));

    }

    @Override
    public Object visitMainProgram(PlayPlusParser.MainProgramContext ctx) {

        Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName("main");
        if (result.isPresent()){
            this.symbolTable.setCurrentScope(((FunctionSymbol) result.get()).getBody());
        }
        return super.visitMainProgram(ctx);
    }

    @Override
    public Integer visitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        String debugString = ctx.getText();
        //System.out.println("VisitExprEnt :" + debugString );
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


        try {

            value = Integer.valueOf(ctx.getText());
            System.out.println("casted value : " + value);

        } catch (Exception exception){

            System.out.println("Aller voir dans la table avant de cast :" + exception.toString());

            Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(ctx.getText());

            if (result.isPresent()) {
                System.out.println("valueof "+ctx.getText() + " value :"+result.get().getValue());
                //result.get().getValue();
                if (result.get().getValue() != null){

                    value = result.get().getValue();
                }

            } else {
                System.out.println("ERROR : valueof "+ctx.getText() +"");

            }

        }

        return value;
    }




        @Override
        public Integer visitSubVarDecl(PlayPlusParser.SubVarDeclContext ctx) {
            int value = 0;
            System.out.println("visitSubVarDecl :"+ctx.getText());
            String varName = ctx.ID().getText();
            if (ctx.initVariable() != null) {
                value = this.visitInitVariable(ctx.initVariable());
                Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(varName);
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
            Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(varName);
            value = this.visitExprD(ctx.exprD());
            if (result.isPresent()) {
                System.out.println("setting value of  "+ ctx.getText() + "value : "+ value);

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


}
