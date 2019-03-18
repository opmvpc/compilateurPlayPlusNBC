grammar PlayPlus;
import PlayPlusWords;

/************
PARSER RULES
************/

root :fichier;

fichier: program | mapfile ;

program:
    implDecl
    minimalProgram
//        impDecl
//        (varDecl | constDecl | structDecl | enumDecl | typedefDecl)*
//        MAIN WS* LBRACE
//        statements
//        RBRACE
    EOF
    ;

mapfile: MAPSTART NATUREL NATUREL monde EOF;

monde:
    ( ROBOT| TRESOR| PELOUSE| PALMIER | PONT | BUISSON | TONNEAU | PUIT | VIDE | SQUELLETTE )+
      ;

minimalProgram :
//   globalImport
   globalVars
   mainDecl
   ;
//
//globalImport :
//

globalVars :
    (varDecl | constDecl | structDecl | enumDecl | typedefDecl)*
    ;

mainDecl :
    (mainStart) (mainInst);

mainStart :
    VOID MAIN RPAREN LBRACE
    ;

mainEND :
    (mainDig+)? mainRet RBRACE
    ;

mainInst :  statements  mainEND ( statements )?;

mainDig : (digInstr) (SEMICOLON) ;

mainRet : (returnInstr) (SEMICOLON);

implDecl : impKeyWord (DOUBLEQUOTE fileDecl DOUBLEQUOTE | FILE);
impKeyWord : HASHTAG IMPORT;
fileDecl : fileName MAP;
fileName: ID;

statements : statement+;

returnVoid : (RETURN) (VOID);

returnInstr : (RETURN) (ID|VOID);

statement :
    (returnInstr) (SEMICOLON)
    | affectInstr
    | constantExpr
    | (actionType) (SEMICOLON)
    | digInstr (SEMICOLON)
    | (conditionalStmt) | (repeatStmt) | (whileStmt) ;

affectInstr :
    plusMinusExpr
    |( exprG AFFECT exprD ) SEMICOLON
   ;

plusMinusExpr:
    ( exprG AFFECT  exprEnt (PLUS | MINUS) exprEnt ) SEMICOLON
    ;

constantExpr :
    constDecl SEMICOLON
    ;

variableExpr :
    ID SEMICOLON
    ;


exprD :
    exprEnt
    | exprBool
    | STRING
    | CHARACTER
    | exprG
    | NOT exprD
    | exprD SMALLER exprD
    | exprD GREATER exprD
    | ID LPAREN (exprD (COMMA exprD)*)? RPAREN
    | LPAREN exprD RPAREN
    | exprD AND exprD
    | exprD OR exprD
    | exprD EQUAL exprD
    | exprD EGREATER exprD
    | exprD ESMALLER exprD
    | exprD NOTEQUAL exprD
    | exprD MOD exprD
    | exprD(MUL | DIV) exprD
    //| MINUS exprD
    | exprD (PLUS | MINUS) exprD;

exprEnt : MINUS exprEnt
    | NATUREL
    ;

exprBool : TRUE | FALSE;


exprG : ID
        | ID LBRACKET exprD (COMMA exprD)? RBRACKET
        | exprG.ID;


conditionalStmt : IF LPAREN exprD RPAREN LBRACE statement+ RBRACE (ELSE LBRACE statement* RBRACE)? ;
repeatStmt : REPEAT LPAREN exprD RPAREN LBRACE statement+ RBRACE ;
whileStmt : WHILE LPAREN exprD RPAREN LBRACE statement+ RBRACE ;

digInstr :
    DIG LPAREN RPAREN
    ;

actionType :
    LEFT LPAREN (exprD)? RPAREN
    | RIGHT LPAREN (exprD)? RPAREN
    | UP LPAREN (exprD)? RPAREN
    | DOWN LPAREN (exprD)? RPAREN
    | FIGHT LPAREN RPAREN
    | JUMP LPAREN (exprEnt)? RPAREN
//    | DIG LPAREN RPAREN
    ;
// type pose probleme en python

mytype : scalar | structures;
scalar : BOOL | INT | CHAR;
structures : STRUCT (ID)? LBRACE (listStrucName)? RBRACE SEMICOLON;
arrays : LBRACKET (NATUREL)+ (COMMA (NATUREL)+)? RBRACKET;

structDecl : structures;

listStrucName : (mytype ID (arrays)? (COMMA  ID (arrays)? )* SEMICOLON)*;

listVarName : (mytype ID (arrays)? (COMMA  ID (arrays)? ))*;

varDecl : mytype ID (arrays)? (AFFECT initVariable)? (COMMA ID(arrays)?(AFFECT initVariable)?)* SEMICOLON ;

initVariable : TRUE | FALSE | ENTIER | STRING | CHARACTER | exprD | initArrays | initStruct | LPAREN initVariable RPAREN;

initArrays : LBRACE (initVariable)(COMMA initVariable)*? RBRACE ;

initStruct : structDecl ;//LBRACE (ID COLON initVariable (COMMA ID COLON initVariable)*)? RBRACE ;


constDecl : CONST mytype ID (arrays?) ((AFFECT initVariable))? (COMMA ID (arrays))? SEMICOLON ;

enumDecl: ENUM (ID)? LBRACE ID (COMMA ID)*? RBRACE SEMICOLON  ;

typedefDecl: TYPEDEF mytype ID SEMICOLON ;

