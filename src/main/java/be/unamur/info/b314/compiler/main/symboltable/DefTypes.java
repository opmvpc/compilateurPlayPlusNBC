package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Types;

import java.util.HashMap;

public class DefTypes extends PlayPlusBaseListener {
    private HashMap<String, String> expressions;

    public DefTypes() {
        this.expressions = new HashMap();
    }

    public void addExpr(String name, Types type) {
        String typeName = type.toString().toLowerCase();
        this.expressions.put(name, typeName);
    }

    @Override
    public void exitExprBool(PlayPlusParser.ExprBoolContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        System.out.println(ctx.getText());
    }
}
