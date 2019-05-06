package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;
import org.apache.commons.jexl3.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

public class ExpressionCalculator extends PlayPlusBaseListener {

    private ArrayList expressions;
    private MapContext global;
    private HashMap<String,Integer> global2;

    public ExpressionCalculator(ArrayList<Expression> expressions) {
        this.expressions = expressions;
        //this.test();
        this.global = new MapContext();
    }

    /**
     * Ajoute d'une exepression de déclaration de variable (fonctionne aussi pour les arrays, on a juste besoin du type
     * @param ctx
     */
    @Override
    public void exitVarDecl(PlayPlusParser.VarDeclContext ctx) {
        System.out.println(global.toString());
        System.out.println("currenttest : " + ctx.getText());
        String type = ctx.mytype().getText();
        String symbolType = "variable";

        Iterator vars = ctx.subVarDecl().listIterator();

        while (vars.hasNext()) {
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            String text = var.ID().getText();
            // init 0 for convenience
            global.set(text,0);
            if (var.AFFECT() != null) {
                evalGlobal(text,var.getText());
            }
            if (var.arrays()!= null){
                symbolType = "arrayVariable";
            }

        }
    }

    @Override
    /**
     * Affectation d'une variable de structure ou tableau
     */
    public void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        System.out.println(global.toString());
        if (ctx.exprG().arrayRef() != null){
            //arrayAffectExpression(ctx);
        }

        if (ctx.exprG().structRef() != null) {
            //structAffectExpression(ctx);
        }

        String text = ctx.exprG().getText();

        evalGlobal("d",ctx.exprD().getText());

    }

    private void evalGlobal(String key, String expr){

        System.out.println("key : " + key + ", expr : " + expr);
        JexlEngine jexl = new JexlBuilder().create();
        JexlExpression e = jexl.createExpression(expr);
        System.out.println("e :" + e.toString());
        Object o = e.evaluate(global);
        System.out.println("key : " + key + " is " + o.toString());
        global.set(key,e.toString());


    }


/**
    @staticmethod
    def parsexpr(self,expression):
    operators = ['','/','+','-']
            for ops in operators:
    r = (expression).split(ops,1)
            if (len(r) == 2):
    exprL = r[0]
    exprR = r[1]
            try:
    exprL = float(exprL)
    except:
    exprL = self.parsexpr(self,exprL)
            try:
    exprR = float(exprR)
    except:
    exprR = self.parsexpr(self,exprR)
    result = self.calc(exprL,exprR,ops)
            return result

    @staticmethod
    def calc(a,b,ops):
            if ops == "":
            return a*b
        if ops == "+":
            return a+b
        if ops == "-":
            return a-b
        if ops == "/":
            return a/b
        return a+b
**/

    public void test() {
        JexlContext jc = new MapContext();
        jc.set("x", 2);

        JexlEngine jexl = new JexlBuilder().create();
        JexlExpression e = jexl.createExpression("x+2");
        Object o = e.evaluate(jc);
        System.out.println(o.toString());
    }
}
