package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import org.apache.commons.jexl3.*;

import java.util.ArrayList;

public class ExpressionCalculator extends PlayPlusBaseListener {

    private ArrayList expressions;

    public ExpressionCalculator(ArrayList<Expression> expressions) {
        this.expressions = expressions;
        this.test();
    }

    public void test() {
        JexlContext jc = new MapContext();
        jc.set("x", 2);

        JexlEngine jexl = new JexlBuilder().create();
        JexlExpression e = jexl.createExpression("x+2");
        Object o = e.evaluate(jc);
        System.out.println(o.toString());
    }
}
