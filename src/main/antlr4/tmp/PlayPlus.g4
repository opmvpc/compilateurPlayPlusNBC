grammar PlayPlus;
import PlayPlusWords;
/************
PARSER RULES
************/

root : implDecl
            (varDecl | constDecl | structDecl | enumDecl | typedefDecl)*
            'void main()' LBRACE
            statements
            DIG LPAREN RPAREN SEMICOLON
            'return void;'
            RBRACE
            EOF;

statements : statement+;

statement :
    affectInstr
    | constantExpr
    | (actionType) SEMICOLON
    | (conditionalStmt) | (repeatStmt) | (whileStmt) ;

affectInstr :
   ( exprG AFFECT exprD ) SEMICOLON
   ;

constantExpr :
    ID SEMICOLON
    ;

variableExpr :
    ID SEMICOLON
    ;

/** **/
implDecl : IMPORT DOUBLEQUOTE fileDecl DOUBLEQUOTE SEMICOLON;
fileDecl :  LETTRE (LETTRE)* '.map'  ;
///fileName : ;


exprD :
    exprEnt
    | exprBool
    | STRING
    | CHARACTER
    | exprG
    | ID LPAREN (exprD (COMMA exprD)*)? RPAREN
    | LPAREN exprD RPAREN;

exprEnt : MINUS exprEnt
    | exprEnt (MUL | DIV) exprEnt
    | exprEnt (PLUS | MINUS) exprEnt
    | ENTIER;

exprBool : TRUE | FALSE
    | exprBool AND exprBool
    | exprBool OR exprBool
    | NOT exprBool
    | exprBool SMALLER exprBool
    | exprBool GREATER exprBool
    | exprBool EQUAL exprBool
    | exprBool EGREATER exprBool
    | exprBool ESMALLER exprBool
    | exprBool NOTEQUAL exprBool;

exprG : ID
        | ID LBRACKET exprD (COMMA exprD)? RBRACKET
        | exprG.ID;





conditionalStmt : IF LPAREN exprD RPAREN LBRACE statement+ RBRACE (ELSE LBRACE statement* RBRACE)? ;
repeatStmt : REPEAT LPAREN exprD RPAREN LBRACE statement+ RBRACE ;
whileStmt : WHILE LPAREN exprD RPAREN LBRACE statement+ RBRACE ;

actionType : LEFT LPAREN (exprD)? RPAREN
    | LEFT LPAREN (exprD)? RPAREN
    | RIGHT LPAREN (exprD)? RPAREN
    | UP LPAREN (exprD)? RPAREN
    | DOWN LPAREN (exprD)? RPAREN
    | FIGHT LPAREN RPAREN
    | DIG LPAREN RPAREN;
// type pose probleme en python

mytype : scalar | structures;
scalar : BOOL | INT | CHAR;
structures : STRUCT (ID)? LBRACE (listVarName)? RBRACE;
arrays : LBRACKET (CHIFFRE)+ (COMMA (CHIFFRE)+)? RBRACKET;
structDecl : structures;

listVarName : (mytype ID (arrays)? (COMMA  ID (arrays)? ))*;


varDecl : mytype ID (arrays)? (AFFECT initVariable)? (COMMA ID(arrays)?(AFFECT initVariable)?)* SEMICOLON ;

initVariable : TRUE | FALSE | ENTIER | STRING | CHARACTER | exprD | initArrays | initStruct | LPAREN initVariable RPAREN;


initArrays : LBRACE (initVariable)(COMMA initVariable)*? RBRACE ;
initStruct : LBRACE (ID COLON initVariable (COMMA ID COLON initVariable)*)? RBRACE ;


constDecl : CONST mytype ID (arrays?) ((AFFECT initVariable))? (COMMA ID (arrays))? SEMICOLON ;

enumDecl: ENUM (ID)? LBRACE ID (COMMA ID)*? RBRACE SEMICOLON  ;

typedefDecl: TYPEDEF mytype ID SEMICOLON ;



