package be.unamur.info.b314.compiler.main.symboltable.Helpers;

import be.unamur.info.b314.compiler.PlayPlusParser;

public class FunctionDecl {
    private String text;
    private PlayPlusParser.FuncDeclContext ctx;

    public FunctionDecl(String text, PlayPlusParser.FuncDeclContext ctx) {
        this.text = text;
        this.ctx = ctx;
    }

    public String getText() {
        return text;
    }

    public PlayPlusParser.FuncDeclContext getCtx() {
        return ctx;
    }

    @Override
    public String toString() {
        return "FunctionDecl{" + "text='" + text + '\'' + "ctx ='" + ctx.getText() + '\'' + '}';
    }

}
