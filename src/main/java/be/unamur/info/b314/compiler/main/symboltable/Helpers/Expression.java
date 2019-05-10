package be.unamur.info.b314.compiler.main.symboltable.Helpers;

public class Expression {
    private String text;
    private String builtInTypeName;
    private String symbolTypeName;
    private Boolean isAssigned;
    private Expression parent;
    private int position;
    private int value;

    /**
     * Constructeur
     * @param text
     * @param builtInTypeName
     * @param symbolTypeName
     */
    public Expression(String text, String builtInTypeName, String symbolTypeName) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
    }

    /**
     * Constructeur
     * @param text
     * @param builtInTypeName
     * @param symbolTypeName
     * @param isAssigned
     */
    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
    }

    /**
     *  Constructeur , utilisé pour les symboles ayant un parent comme les paramètres des fonctions
     * @param text
     * @param builtInTypeName
     * @param symbolTypeName
     * @param isAssigned
     * @param parent
     */
    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned, Expression parent) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
        this.parent = parent;
    }

    /**
     * Constructeur , utilisé surtout pour les symboles qui ont une position comme les arguments d'une fonction
     * @param text
     * @param builtInTypeName
     * @param symbolTypeName
     * @param isAssigned
     * @param parent
     * @param position
     */
    public Expression(String text, String builtInTypeName, String symbolTypeName, Boolean isAssigned, Expression parent , int position) {
        this.text = text;
        this.builtInTypeName = builtInTypeName;
        this.symbolTypeName = symbolTypeName;
        this.isAssigned = isAssigned;
        this.parent = parent;
        this.position = position;
    }

    /**
     *
     * @return text , le nom de l'expression
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @return symbolTypeName le type du symbole
     */
    public String getSymbolTypeName() {
        return symbolTypeName;
    }

    /**
     *
     * @return Le type BuiltInTypeName du symbole
     */
    public String getBuiltInTypeName() {
        return builtInTypeName;
    }

    /**
     *
     * @return isAssigned true si le symbole à été assigné
     */
    public Boolean getIsAssigned() {
        return isAssigned;
    }

    /**
     *
     * @return l'expression parent
     */
    public Expression getParent() {
        return parent;
    }

    /**
     *
     * @return la position de l'argument dans une déclaration de fonction
     */
    public int getPosition() {
        return position;
    }

    /**
     *
     * @return la valeur de l'expression
     */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "ExpressionSymbol{" +
                "text='" + text + '\'' +
                ", builtInTypeName='" + builtInTypeName + '\'' +
                ", symbolTypeName='" + symbolTypeName + '\'' +
                ", isAssigned='" + isAssigned + '\'' +
                ", value='" + value + '\'' +
                (parent != null ? ", parent = " + parent.getText() : "") +
                '}';
    }


}
