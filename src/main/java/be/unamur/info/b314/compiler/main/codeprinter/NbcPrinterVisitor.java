package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
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
            System.out.println("valueleft : " + valueleft);
            System.out.println("valuerigth : " + valueright);
            value = evaluateExprEnt(valueleft, valueright, op);
            System.out.println("calculated value : " + value);
            return value;
        }
        try {
            value = Integer.valueOf(ctx.getText());
            System.out.println("casted value : " + value);
        } catch (Exception exception){

            System.out.println("Aller voir dans la table avant de cast :" + exception.toString());
            //this.symbolTable.getCurrentScope().getSymbols().

        }
        System.out.println(op);
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
