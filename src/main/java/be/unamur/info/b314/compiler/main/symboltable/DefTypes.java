package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.SymbolNamesHelper;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Types;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.StructSymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DefTypes extends PlayPlusBaseListener {
    private ArrayList<Expression> expressions;
    private SymbolTable symtable;

    public DefTypes(SymbolTable symtable) {
        this.expressions = new ArrayList();
        this.symtable = symtable;
    }

    private void addExpr(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    public void exitExprBool(PlayPlusParser.ExprBoolContext ctx) {
        System.out.println(ctx.getText());

        String text = ctx.getText();
        try {
            Boolean.valueOf(text);
        } catch (Exception e) {
            return;
        }

        String type ="bool";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    @Override
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        System.out.println(ctx.getText());

        String text = ctx.getText();

        try {
            Integer.valueOf(text);
        } catch (Exception e) {
            return;
        }

        String type ="int";
        String symbolType = "expr";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

    @Override
    public void exitVarDecl(PlayPlusParser.VarDeclContext ctx) {
//        System.out.println(ctx.getText());
        String type = ctx.mytype().getText();
        String symbolType = "variable";

        Iterator vars = ctx.subVarDecl().listIterator();

        while (vars.hasNext()) {
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            String text = var.ID().getText();
            Boolean isAssigned = false;
            if (var.AFFECT() != null) {
                isAssigned = true;
            }

            Expression expr = new Expression(text, type, symbolType, isAssigned);
            addExpr(expr);
        }
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
//        System.out.println(ctx.getText());

        String text = ctx.ID().getText();
        String type = ctx.mytype() == null ? "void" : ctx.mytype().getText();
        String symbolType = "function";

        Expression expr = new Expression(text, type, symbolType);
        addExpr(expr);
    }

//    @Override
//    public void exitStructDecl(PlayPlusParser.StructDeclContext ctx) {
////        System.out.println(ctx.getText());
//
//        String text = ctx.structures().ID().getText();
//        String type = "structure";
//        String symbolType = "structure";
//
//        Expression expr = new Expression(text, type, symbolType);
//        addExpr(expr);
//    }


    @Override
    public void exitStructRef(PlayPlusParser.StructRefContext ctx) {
        System.out.println(ctx.getText());
        String structName = SymbolNamesHelper.genStructName(ctx.ID().getText());
        StructSymbol struct = (StructSymbol) this.symtable.getGlobals().resolve(structName);
        Iterator members = ctx.members().member().listIterator();
        while (members.hasNext()) {
            PlayPlusParser.MemberContext member = (PlayPlusParser.MemberContext) members.next();
            if (members.hasNext()) {
                structName = SymbolNamesHelper.genStructName(member.ID().getText());
                struct = (StructSymbol) struct.resolve(structName);
            } else {
                String varName = SymbolNamesHelper.genVarName(member.ID().getText());
                System.out.println(struct.resolve(varName));
            }
        }
    }

    @Override
    public void exitRoot(PlayPlusParser.RootContext ctx) {
        for (Expression exp : this.expressions) {
            System.out.println(exp.toString());
        }
//        System.out.println(this.expressions.toString());
    }
}
