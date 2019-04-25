package be.unamur.info.b314.compiler.main.symboltable.Helpers;

public class Expression {
    private String text;
    private String builtInTypeName;
    private String symbolTypeName;
    private Boolean isAssigned;

    public Expression(String text, String builtInTypeName, String symbolTypeName) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
    }

    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
    }

    public String getText() {
        return text;
    }

    public String getSymbolTypeName() {
        return symbolTypeName;
    }

    public String getBuiltInTypeName() {
        return builtInTypeName;
    }

    public Boolean getIsAssigned() {
        return isAssigned;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "text='" + text + '\'' +
                ", builtInTypeName='" + builtInTypeName + '\'' +
                ", symbolTypeName='" + symbolTypeName + '\'' +
                ", isAssigned='" + isAssigned + '\'' +
                '}';
    }
}
