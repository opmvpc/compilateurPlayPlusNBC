package be.unamur.info.b314.compiler.main.codeprinter;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.main.symboltable.SymbolTable;
import org.stringtemplate.v4.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class NbcPrinter extends PlayPlusBaseListener {
    private String fileName;
    private SymbolTable symbolTable;
    private HashMap<String, STGroup> templates;
    private StringBuilder code;

    public NbcPrinter(String fileName, SymbolTable symbolTable) {
        this.fileName = fileName;
        this.symbolTable = symbolTable;
        initTemplates();
        this.code = new StringBuilder();
    }

    private void initTemplates() {
        this.templates = new HashMap<>();
        this.templates.put("expressions", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/expressions.stg"));
        this.templates.put("program", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/program.stg"));
        this.templates.put("actions", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/actions.stg"));
        this.templates.put("loops", new STGroupFile("src/main/java/be/unamur/info/b314/compiler/main/codeprinter/templates/loops.stg"));
    }

    @Override
    public void enterProgram(PlayPlusParser.ProgramContext ctx) {
        ST st = this.templates.get("actions").getInstanceOf("actiondeclaration");
        String result = st.render();
        this.code.append(result+"\n\n");
    }

    @Override
    public void enterImplDecl(PlayPlusParser.ImplDeclContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("include");
        st.add("text", ctx.FILE().getText());
        String result = st.render();
        this.code.append(result+"\n\n");
    }

    @Override
    public void enterVarDecl(PlayPlusParser.VarDeclContext ctx) {
        ST st = this.templates.get("expressions").getInstanceOf("varDecl");
        Iterator vars = ctx.subVarDecl().listIterator();
        while (vars.hasNext()) {
            PlayPlusParser.SubVarDeclContext var = (PlayPlusParser.SubVarDeclContext) vars.next();
            st.add("name", var.ID().getText());
            st.add("type", ctx.mytype().getText());
            st.add("value", var.initVariable()!=null?var.initVariable().getText():null);
            String result = st.render();
            this.code.append("\t"+result+"\n");
        }
    }

    @Override
    public void enterMainProgram(PlayPlusParser.MainProgramContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("threadMain");
        String result = st.render();
        this.code.append(result+"\n");
    }

    @Override
    public void exitMainRet(PlayPlusParser.MainRetContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("exitMain");
        String result = st.render();
        this.code.append("\t"+result+"\n");
    }

    @Override
    public void exitMainProgram(PlayPlusParser.MainProgramContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("endThread");
        String result = st.render();
        this.code.append(result+"\n");
    }

    @Override
    public void enterFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("subDecl");
        st.add("name", ctx.ID().getText());
        String result = st.render();
        this.code.append("\n"+result+"\n");
    }

    @Override
    public void exitReturnInstr(PlayPlusParser.ReturnInstrContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("return");
        String result = st.render();
        this.code.append("\t"+result+"\n");
    }

    @Override
    public void exitFuncDecl(PlayPlusParser.FuncDeclContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("endSubDecl");
        String result = st.render();
        this.code.append(result+"\n\n");
    }

    @Override
    public void exitFuncCall(PlayPlusParser.FuncCallContext ctx) {
        ST st = this.templates.get("program").getInstanceOf("subCall");
        st.add("name", ctx.ID().getText());
        String result = st.render();
        this.code.append("\t"+result+"\n");
    }

    @Override
    public String toString() {
        return code.toString();
    }

    public void printFile() throws IOException {
        FileWriter fileWriter = new FileWriter(this.fileName);
        fileWriter.write(this.code.toString());
        fileWriter.close();
    }


    @Override
    public void enterRepeatStmt(PlayPlusParser.RepeatStmtContext ctx) {
        String content = ctx.getText();
        String repeatcondition = ctx.repeatCondition().getText();
        ST stInit = this.templates.get("loops").getInstanceOf("initrepeatvariable");
        stInit.add("n", repeatcondition);
        String resultInit = stInit.render();
        this.code.insert(0,"\t"+resultInit +"\n");
        ST stResultCorpse = this.templates.get("loops").getInstanceOf("repeat");
        String resultCorpse = stResultCorpse.render();
        this.code.append("\t"+resultCorpse +"\n");
    }

    @Override
    public void exitRepeatStmt(PlayPlusParser.RepeatStmtContext ctx) {
        ST st = this.templates.get("loops").getInstanceOf("repeatend");
        String result = st.render();
        this.code.append("\t"+result +"\n");
    }

    @Override
    public void enterActionType(PlayPlusParser.ActionTypeContext ctx) {

        int time = 500;
        int multiplicateur = 1;
        String pwr = "100";
        String actionkeyword = ctx.children.get(0).getText();

        if (ctx.exprEnt() != null){
            try {
                multiplicateur = Integer.parseInt(ctx.exprEnt().getText());
            } catch(Exception exception) {
               // System.out.println(exception.toString());
            }
        }

        time *= multiplicateur;

        if (actionkeyword.equals("dig()")){

            //System.out.println("If robot on treasure play tone");

        } else {

            ST st = this.templates.get("actions").getInstanceOf(actionkeyword);
            st.add("time", time);
            st.add("pwr",pwr);
            String result = st.render();
            this.code.append("\t"+result+"\n");

        }


    }
}
