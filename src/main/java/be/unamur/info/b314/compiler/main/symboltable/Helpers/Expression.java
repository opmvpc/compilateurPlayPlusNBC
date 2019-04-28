package be.unamur.info.b314.compiler.main.symboltable.Helpers;

public class Expression {
    private String text;
    private String builtInTypeName;
    private String symbolTypeName;
    private Boolean isAssigned;
    private Expression parent;
    private int position;

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

    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned, Expression parent) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
        this.parent = parent;
    }
    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned, Expression parent , int position) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
        this.parent = parent;
        this.position = position;
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

    public Expression getParent() {
        return parent;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "text='" + text + '\'' +
                ", builtInTypeName='" + builtInTypeName + '\'' +
                ", symbolTypeName='" + symbolTypeName + '\'' +
                ", isAssigned='" + isAssigned + '\'' +
                (parent != null ? ", parent = " + parent.getText() : "") +
                '}';
    }
}
