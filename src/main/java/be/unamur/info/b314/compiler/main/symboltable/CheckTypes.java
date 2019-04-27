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


}
