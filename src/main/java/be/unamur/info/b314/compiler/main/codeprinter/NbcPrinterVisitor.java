package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseVisitor;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.Errors;
import be.unamur.info.b314.compiler.main.symboltable.Helpers.FunctionDecl;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import be.unamur.info.b314.compiler.main.symboltable.contracts.Scope;
import be.unamur.info.b314.compiler.main.symboltable.scoped_symbols.FunctionSymbol;
import be.unamur.info.b314.compiler.main.symboltable.symbols.Symbol;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

public class NbcPrinterVisitor extends PlayPlusBaseVisitor {
    private File outputFile;
    private SymbolTable symbolTable;
    private StringBuilder code;
    private HashMap<String, STGroup> templates;
    private ArrayList<FunctionDecl> functionDecls;
    private Game game;
    private Errors errors;

    public NbcPrinterVisitor(File outputFile, SymbolTable symtable, Errors errors) {
        this.outputFile = outputFile;
        this.symbolTable = symtable;
        initTemplates();
        this.code = new StringBuilder();
        this.functionDecls = new ArrayList<>();
        this.game = new Game(symbolTable, errors);
        this.errors = errors;
    }

    private void initTemplates() {

        this.templates = new HashMap<>();
        this.templates.put("actions",
                new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/actions.stg"));

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

        // ajout des macros actions dans le code nbc
        ST st = this.templates.get("actions").getInstanceOf("actiondeclaration");
        String result = st.render();
        this.code.append(result + "\n\n");
        this.code.append("thread main\n");

        // setting main scope and visiting children

        FunctionSymbol mainscope = (FunctionSymbol) symbolTable.getScopes().get(ctx);
        System.out.println("BEFORE SET SCOPE :" + symbolTable.getCurrentScope().getScopeName());
        this.symbolTable.setCurrentScope(mainscope);
        System.out.println("AFTER SET SCOPE : " + symbolTable.getCurrentScope().getScopeName());

        // visit du code du main
        visitChildren(ctx);



        // ajoute le code au fichier .nbc
//        Check if cody won
        if (this.errors.gameError.isEmpty()) { // this.game.isWin()
            this.code.append("\t PlayTone(TONE_C5,500)\n");
            // fin du code nbc
            this.code.append("exit\n");
            this.code.append("endt\n");

        } else {
            this.code.append('"');

        }

        try {
            printFile();
        } catch (Exception e) {
            System.out.println("Error Writing NBC code to File");
        }
        System.out.println("CODE NBC :");
        System.out.println(this.code);
        return 0;

    }

    @Override
    public Object visitWhileStmt(PlayPlusParser.WhileStmtContext ctx) {
        System.out.println("visitWhileStmt");
        System.out.println("avant set While Scope " + symbolTable.getCurrentScope().getScopeName());
        symbolTable.setCurrentScope((Scope) symbolTable.getScopes().get(ctx));
        System.out.println("debut apres set  While Scope " + symbolTable.getCurrentScope().getScopeName());
        int value = 0;
        if (ctx.boolCondition() != null) {
            value = visitBoolCondition(ctx.boolCondition());
            System.out.println("visitWhileStmt = value" + value);
            if (value == 1) {
                visitChildren(ctx);
                visitWhileStmt(ctx);
            } else {
                symbolTable.setCurrentScopeToEnclosingOne();
            }
        }

        return 0;
    }

    @Override
    public Object visitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx) {
        System.out.println("visitRepeatStmt");
        int value = 0;
        if (ctx.repeatCondition() != null) {
            value = visitExprEnt(ctx.repeatCondition().exprEnt());
            System.out.println("visitRepeatStmt = value" + value);
            for (int i = 0; i < value; i++) {
                visitChildren(ctx);
            }

        }

        return 0;
    }

    @Override
    public Object visitConditionalStmt(PlayPlusParser.ConditionalStmtContext ctx) {
        System.out.println("visitConditionalStmt " + ctx.getText());
        int value = 0;
        symbolTable.setCurrentScope((Scope) symbolTable.getScopes().get(ctx));
        if (ctx.boolCondition() != null) {
            value = visitBoolCondition(ctx.boolCondition());
            System.out.println("visitConditionalStmt = value" + value);
            if (value == 1) {
                if (ctx.ifStmt() != null) {
                    visitChildren(ctx.ifStmt());
                }

            } else {
                if (ctx.elseStmt() != null) {
                    visitChildren(ctx.elseStmt());
                    ;
                }
            }
        }
        // visitChildren(ctx);
        symbolTable.setCurrentScopeToEnclosingOne();
        return 0;
    }

    @Override
    public Integer visitBoolCondition(PlayPlusParser.BoolConditionContext ctx) {
        int value = visitExprBool(ctx.exprBool());

        return value;
    }

    @Override
    public Integer visitExprBool(PlayPlusParser.ExprBoolContext ctx) {
        int value = 0;
        String debugString = ctx.getText();
        System.out.println("VisitExprBool :" + debugString);

        if (ctx.getChild(0).getText().charAt(0) == '(') {
            System.out.println("Parenthese : " + ctx.getChild(0).getText());
            value = visitExprBool(ctx.exprBool(0));
            return value;
        }

        if (ctx.getChildCount() == 1) { // soucis lorsque c'est un funcCall , la valeur n'est pas presente dan sla table
                                        // des symboles
            if (ctx.boolVal(0).boolLiteral() != null) {
                value = visitBoolLiteral(ctx.boolVal(0).boolLiteral());
                return value;
            }
            if (ctx.boolVal(0).funcCall() != null) {
                value = visitFuncCall(ctx.boolVal(0).funcCall());
                return value;
            }
            System.out.println("Expr Bool search expression ");
            Optional<Symbol> result = resolveSymbolRec(ctx.getText(), symbolTable.getCurrentScope());

            if (result.isPresent()) {
                System.out.println("result get" + result.get());
                System.out.println("valueof " + ctx.getText() + " value :" + result.get().getValue());
                if (result.get().getValue() != null) {
                    value = result.get().getValue();
                }
            } else {
                System.out.println("Scope ExprBool : " + symbolTable.getCurrentScope().getScopeName());
                System.out.println("ERROR : valueof " + ctx.getText() + "");
            }
            return value;
        }
        if (ctx.getChildCount() == 2) {
            System.out.println("Neg Exp bool : " + ctx.getText());
            // evalNegBool(ctx);
            if (ctx.exprBool(0) != null) {
                value = visitExprBool(ctx.exprBool(0));
                return value == 1 ? 0 : 1;
            }
        }

        if (ctx.getChildCount() >= 3) {
            System.out.println("Exp bool 3 termes : " + ctx.getText());
            // Check sur les parenthese
            System.out.println("ctx.getChild(0).getText() = " + ctx.getChild(0).getText());
            System.out.println("ctx.getChild(2).getText() = " + ctx.getChild(2).getText());
            int leftPart = 0;
            int rightPart = 0;
            String operator = ctx.getChild(1).getText();

            leftPart = (Integer) visit(ctx.getChild(0));
            rightPart = (Integer) visit(ctx.getChild(2));

            System.out.println(
                    "ExprBool : leftPart: " + leftPart + "operateur: " + operator + " rightPart: " + rightPart);
            boolean boolVal = false;
            switch (operator) {
            case "==":
                boolVal = leftPart == rightPart;
                break;
            case "!=":
                boolVal = leftPart != rightPart;
                break;
            case "<":
                boolVal = leftPart < rightPart;
                break;
            case ">":
                boolVal = leftPart > rightPart;
                break;
            case "<=":
                boolVal = leftPart <= rightPart;
                break;
            case ">=":
                boolVal = leftPart >= rightPart;
                break;
            case "&&":
                boolVal = Boolean.logicalAnd(intToBoolean(leftPart), intToBoolean(rightPart));
                break;
            case "||":
                boolVal = Boolean.logicalOr(intToBoolean(leftPart), intToBoolean(rightPart));
                break;
            }

            value = (boolVal == true) ? 1 : 0;
            System.out.println("Bool calculated value in boolean : " + boolVal);
            return value;

        }

        try {
            boolean val = Boolean.valueOf(ctx.getText());
            value = val == true ? 1 : 0;

        } catch (Exception e) {
            System.out.println("Erreur bool : " + ctx.getText());
        }
        System.out.println("");
        return value; // super.visitExprBool(ctx);
    }

    private boolean intToBoolean(int value) {
        return value == 0 ? false : true;
    }

    @Override
    public Integer visitBoolVal(PlayPlusParser.BoolValContext ctx) {
        String debugString = ctx.getText();
        System.out.println("VisitBoolVal :" + debugString);
        int value = 0;
        if (ctx.funcCall() != null) {
            value = visitFuncCall(ctx.funcCall());
        }
        if (ctx.exprG() != null) {
            value = visitExprG(ctx.exprG());
        }
        if (ctx.boolLiteral() != null) {
            value = visitBoolLiteral(ctx.boolLiteral());
        }
        return value;
    }

    @Override
    public Integer visitBoolLiteral(PlayPlusParser.BoolLiteralContext ctx) {
        String debugString = ctx.getText();
        System.out.println("VisitBoolLoteral :" + debugString);
        boolean boolval = Boolean.valueOf(ctx.getText());
        int value = (boolval == true) ? 1 : 0;
        return value;
    }

    @Override
    public Integer visitExprG(PlayPlusParser.ExprGContext ctx) {
        String debugString = ctx.getText();
        System.out.println("VisitExprG :" + debugString);
        int value = 0;

        if (ctx.ID() != null) {
            Optional<Symbol> result = resolveSymbolRec(ctx.ID().getText(), symbolTable.getCurrentScope());

            if (result.isPresent()) {
                System.out.println("result get" + result.get());
                if (result.get().getValue() != null) {
                    value = result.get().getValue();
                }
            } else {
                System.out.println("ERROR : valueof " + ctx.getText() + "");
            }
            return value;
        }
        System.out.println("Cas pas traité");
        return value;
    }

    @Override
    public Integer visitExprEnt(PlayPlusParser.ExprEntContext ctx) {
        String debugString = ctx.getText();
        System.out.println("VisitExprEnt :" + debugString);
        String op = "";
        int value = 0;

        if (ctx.operateurEntier() != null) {
            op = ctx.operateurEntier().getText();
            PlayPlusParser.ExprEntContext left = ctx.exprEnt(0);
            PlayPlusParser.ExprEntContext right = ctx.exprEnt(1);
            int valueleft = this.visitExprEnt(left);
            int valueright = this.visitExprEnt(right);
            // System.out.println("valueleft : " + valueleft);
            // System.out.println("valuerigth : " + valueright);
            value = evaluateExprEnt(valueleft, valueright, op);
            System.out.println("calculated value : " + value);
            return value;
        }

        if (ctx.MINUS() != null) {

            value = -1 * this.visitExprEnt(ctx.exprEnt(0));
            return value;
        }

        if (ctx.getText().charAt(0) == '(') {
            System.out.println("Parenthese : " + ctx.exprEnt(0));
            value = this.visitExprEnt(ctx.exprEnt(0));
            return value;
        }

        if (ctx.funcCall() != null) {

            value = visitFuncCall(ctx.funcCall());// value of execution.

            return value;
        }

        try {

            value = Integer.valueOf(ctx.getText());
            System.out.println("casted value : " + value);

        } catch (Exception exception) {

            Optional<Symbol> result = resolveSymbolRec(ctx.getText(), symbolTable.getCurrentScope());

            if (result.isPresent()) {
                System.out.println("result get" + result.get());
                System.out.println("valueof " + ctx.getText() + " value :" + result.get().getValue());

                if (result.get().getValue() != null) {

                    value = result.get().getValue();
                }

            } else {
                System.out.println("Scope ExprEnt : " + symbolTable.getCurrentScope().getScopeName());
                System.out.println("ERROR : valueof " + ctx.getText() + "");

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
        System.out.println("visitVarDecl :" + ctx.getText());
        Iterator subVarDecls = ctx.subVarDecl().listIterator();
        while (subVarDecls.hasNext()) {
            PlayPlusParser.SubVarDeclContext subVarDecl = (PlayPlusParser.SubVarDeclContext) subVarDecls.next();
            value = this.visitSubVarDecl(subVarDecl);
            symbolTable.getCurrentScope().resolveByName(subVarDecl.ID().getText()).get().setValue(value);
        }

        return value;
    }

    @Override
    public Integer visitSubVarDecl(PlayPlusParser.SubVarDeclContext ctx) {
        int value = 0;
        System.out.println("visitSubVarDecl :" + ctx.getText());
        // System.out.println(symbolTable.getCurrentScope());
        String varName = ctx.ID().getText();

        if (ctx.initVariable() != null) {
            value = this.visitInitVariable(ctx.initVariable());
            Optional<Symbol> result = resolveSymbolRec(varName, symbolTable.getCurrentScope());
            if (result.isPresent()) {

                result.get().setValue(value);

            }
        }

        return value;
    }

    @Override
    public Integer visitInitVariable(PlayPlusParser.InitVariableContext ctx) {
        int value = 0;
        if (ctx.exprEnt() != null) {
            value = visitExprEnt(ctx.exprEnt());
        }
        if (ctx.exprBool() != null) {
            value = visitExprBool(ctx.exprBool());
        }
        return value;

    }

    @Override
    public Integer visitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        int value = 0;
        System.out.println("VisitAffectInstr :" + ctx.getText());
        if (ctx.exprG().ID() != null) {
            String varName = ctx.exprG().ID().getText();

            System.out.println("Scope Affect : " + symbolTable.getCurrentScope().getScopeName());
            Optional<Symbol> result = resolveSymbolRec(varName, symbolTable.getCurrentScope());

            value = this.visitExprD(ctx.exprD());

            if (result.isPresent()) {
                System.out.println("setting value of  " + varName + " in " + ctx.getText() + "value : " + value);

                result.get().setValue(value);

            } else {
                System.out.println("ERROR : valueof " + ctx.getText() + "");
            }

        }

        return value;
    }

    @Override
    public Integer visitExprD(PlayPlusParser.ExprDContext ctx) {
        int value = 0;
        if (ctx.exprEnt() != null) {
            value = visitExprEnt(ctx.exprEnt());
        }
        if (ctx.funcCall() != null) {
            value = visitFuncCall(ctx.funcCall());

        }
        if (ctx.exprBool() != null) {
            value = visitExprBool(ctx.exprBool());

        }
        if (ctx.charVal() != null) {
            value = visitCharVal(ctx.charVal());
        }
        return value;
    }

    @Override
    public Integer visitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        System.out.println("VisitFuncDecl : " + ctx.getText());
        int value = 0;
        String funcName = ctx.ID().getText();
        FunctionDecl fct = new FunctionDecl(funcName, ctx);
        addFunctionDecl(fct);

        if (ctx.returnInstr().exprD() != null) {
            value = visitExprD(ctx.returnInstr().exprD());
            System.out.println("TEst = " + value);
        }

        if (ctx.returnInstr().exprG() != null && ctx.returnInstr().exprG().ID() != null) {
            System.out.println("rtrninst ID :" + ctx.returnInstr().exprG().ID());
            // System.out.println("current scope : "+ symbolTable.getCurrentScope().getScopeName());
            // System.out.println("current scope : "+ symbolTable.getCurrentScope());
            String varName = ctx.returnInstr().exprG().ID().getText();
            Optional<Symbol> result = symbolTable.getCurrentScope().resolveByName(varName);
            if (result.isPresent()) {
                // value = result.get().setValue();
                // value = result.get().getValue();
            }
        }

        System.out.println("out");

        return value;
    }

    @Override
    public Integer visitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        int value = 0;
        int exprdvalue = 0;
        System.out.println("VisitFuncCall : " + ctx.getText());
        String funcName = ctx.ID().getText();

        Optional<Symbol> result = symbolTable.getGlobals().resolveByName(funcName);
        Scope currentScope = symbolTable.getCurrentScope();
        System.out.println("Out Current Scope Last Error : " + currentScope);
        if (result.isPresent()) {


            Iterator callargs = ctx.funcCallArgs().funcCallArg().listIterator();
            int i = 0;
            while (callargs.hasNext()) {
                PlayPlusParser.ExprDContext exprDContext = ((PlayPlusParser.FuncCallArgContext) callargs.next())
                        .exprD();
                if (exprDContext.getText().length() > 0) {
                    if ( exprDContext.exprG() != null && exprDContext.exprG().ID() != null){
                        exprdvalue = resolveSymbolRec(exprDContext.exprG().ID().getText(),currentScope).get().getValue();
                    } else {
                        exprdvalue = visitExprD(exprDContext);
                    }

                    System.out.println(exprdvalue);
                    ((FunctionSymbol) result.get()).getArgs().get(i).setValue(exprdvalue);
                    i++;
                }

            }
            this.symbolTable.setCurrentScope(((FunctionSymbol) result.get()));
            PlayPlusParser.FuncDeclContext funcDeclContext = findFunctionDeclByText(funcName).get().getCtx();
            // value = visitFuncDecl(funcDeclContext);
            visitChildren(funcDeclContext);

            if (!(funcDeclContext.returnInstr().getChild(1).getText().equals("void"))) {

                // value = ((FunctionSymbol)
                // result.get()).resolveByName(funcDeclContext.returnInstr().getChild(1).getText()).get().getValue();
                System.out.println("return expr :" + funcDeclContext.returnInstr().getChild(1).getText());
                if (funcDeclContext.returnInstr().exprD() != null) {
                    value = visitExprD(funcDeclContext.returnInstr().exprD());
                } else {
                    value = resolveSymbolRec(funcDeclContext.returnInstr().getChild(1).getText(),
                            symbolTable.getCurrentScope()).get().getValue();

                }
            }
            System.out.println("TEst = " + value);
            // super.visitFuncDecl(funcDeclContext);
            // visitChildren(ctx);
            System.out.println("SETTING SCOPE TO :" + currentScope.getScopeName());
            this.symbolTable.setCurrentScope(currentScope);
            symbolTable.getCurrentScope().resolveByName(ctx.getText()).get().setValue(value);
        }
        System.out.println("reutn visiFuncCall :" + value);
        return value;
    }

    private int evaluateExprEnt(int left, int right, String operateur) {
        int result = 0;
        switch (operateur) {
        case "+":
            // code block
            result = left + right;
            break;
        case "-":
            // code block
            result = left - right;
            break;
        case "*":
            result = left * right;
            break;
        case "/":
            result = left / right;
            //
            break;
        case "^":
            result = (int) Math.pow(left, right);
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
     * 
     * @param functText
     * @return
     */
    private Optional<FunctionDecl> findFunctionDeclByText(String functText) {
        Optional<FunctionDecl> functionDecl = this.functionDecls.stream().filter(x -> x.getText().equals(functText))
                .findFirst();
        return functionDecl;
    }

    private Optional<Symbol> resolveSymbolRec(String name, Scope currentScope) {
        System.out.println("resolveSymbolRec : " + currentScope.getScopeName());
        Optional<Symbol> symbol = currentScope.resolveByName(name);
        if (!symbol.isPresent() && currentScope.getEnclosingScope() == null) {
            return Optional.empty();
        }
        if (symbol.isPresent()) {
            return symbol;
        }
        return resolveSymbolRec(name, currentScope.getEnclosingScope());
    }

    @Override
    public Object visitActionType(PlayPlusParser.ActionTypeContext ctx) {
        System.out.println("VisitActionType : " + ctx.getText());
        int time = 500;
        int multiplicateur = 1;
        String pwr = "100";
        String actionkeyword = ctx.children.get(0).getText();
        System.out.println("ActionkeyWord :" + actionkeyword);

        if (ctx.exprEnt() != null) {
            try {
                multiplicateur = visitExprEnt(ctx.exprEnt());
            } catch (Exception exception) {
                // System.out.println(exception.toString());
            }
        }

        time *= multiplicateur;

        if (actionkeyword.equals("dig()")) {

            // System.out.println("If robot on treasure play tone");
            this.game.dig();

        } else if (actionkeyword.equals("fight")) {
            this.code.append("\t // I AM A PACIFIST \n");
        } else {
            // movement de cody sur la carte : Il faudra ajouter une erreur
            this.game.moveCody(actionkeyword, multiplicateur);
            ST st = this.templates.get("actions").getInstanceOf(actionkeyword);
            st.add("time", time);
            st.add("pwr", pwr);
            String result = st.render();
            this.code.append("\t" + result + "\n");

        }
        return 0;
    }

    @Override
    public Object visitDig(PlayPlusParser.DigContext ctx) {
        // System.out.println(symbolTable.toString());
        return 0;
    }

    public void printFile() throws IOException {
        FileWriter fileWriter = new FileWriter(this.outputFile);
        fileWriter.write(this.code.toString());
        fileWriter.close();
    }
}
