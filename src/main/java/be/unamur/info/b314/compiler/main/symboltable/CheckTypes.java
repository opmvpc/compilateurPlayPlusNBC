package be.unamur.info.b314.compiler.main.symboltable;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Expression;

import java.util.ArrayList;
import java.util.Optional;

public class CheckTypes extends PlayPlusBaseListener {
    private SymbolTable symTable;
    private ArrayList<Expression> expressions;
    private Errors errors;

    public CheckTypes(SymbolTable symTable, ArrayList expressions, Errors errors) {
        this.symTable = symTable;
        this.expressions = expressions;
        this.errors = errors;
    }

    private Optional<Expression> findExprByText(String expText) {
        Optional<Expression> expression = this.expressions.stream()
                .filter(x -> x.getText().equals(expText))
                .findFirst();

        return expression;
    }

    @Override
    public void exitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        evalExprEnt(ctx);
    }

    private void evalExprEnt(PlayPlusParser.ExprEntContext ctx) {
        if (ctx.getChildCount() < 3) {
            return;
        }

        System.out.println(ctx.getText());

        if (ctx.getChild(0).getText().equals("(")) {
            System.out.println("parentExp "+ctx.getText());
            return;
        }

        String leftPartName = ctx.getChild(0).getText();
        String rightPartName = ctx.getChild(2).getText();

        Optional<Expression> leftPart = findExprByText(leftPartName);
        Optional<Expression> rightPart = findExprByText(rightPartName);

        if (! leftPart.isPresent() || ! rightPart.isPresent()) {
            return;
        }
        if (leftPart.get().getBuiltInTypeName().equals(rightPart.get().getBuiltInTypeName())) {
            System.out.println("types Ok");
        } else {
            errors.badTypeError.add("ENTIER : Les types des variables suivantes sont imcompatibles : "+leftPart+" "+rightPart);
        }
    }
}
