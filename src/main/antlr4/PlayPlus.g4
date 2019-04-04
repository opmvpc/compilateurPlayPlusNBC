grammar PlayPlus;
import PlayPlusWords;

@header {
    package be.unamur.info.b314.compiler;
}

/************
PARSER RULES
************/

root : program | mapfile ;


// Parsing Map

mapfile: MAPSTART NATUREL NATUREL monde EOF;

    monde:
        ( ROBOT| TRESOR| PELOUSE| PALMIER | PONT | BUISSON | TONNEAU | PUIT | VIDE | SQUELLETTE )+
          ;


// Parsing PlayPlus Code

program:
    implDecl
    globalDecl?
    mainProgram
    EOF
    ;

    // Import *.map file

    implDecl : impKeyWord (DOUBLEQUOTE fileDecl DOUBLEQUOTE | FILE);
    impKeyWord : HASHTAG IMPORT;
    fileDecl : fileName MAP;
    fileName: ID;


    // Declarations of variables,functions,... ( 2 rules for convinience )

    globalDecl :
        (varDecl | constDecl | structDecl | enumDecl | typedefDecl | funcDecl)*
        ;

    localDecl :
        (varDecl | constDecl | structDecl | enumDecl | typedefDecl | funcDecl)*
        ;

    // Main Function/Program

    mainProgram :
        mainStart
        statements
        mainEnd


        ;

        // at least one dig() instruction and a return in main.
        mainStart : VOID MAIN LPAREN RPAREN LBRACE;

        mainEnd : (mainDig+)? mainRet statements? RBRACE;

        mainDig : digInstr SEMICOLON ;

        mainRet : returnInstr SEMICOLON;


// At least one statement
statements : statement+;

    statement :
        returnInstr SEMICOLON
        | affectInstr
        | exprD SEMICOLON
        | constantExpr
        | (actionType) SEMICOLON
        | digInstr SEMICOLON
        | conditionalStmt | repeatStmt | whileStmt
        ;


// return in functions and main
returnInstr : RETURN (ID|VOID);


affectInstr :
     exprG AFFECT exprD SEMICOLON
   ;

funcDecl :
     (mytype | VOID) ID LPAREN (mytype exprG (COMMA mytype exprG)*)? RPAREN LBRACE localDecl? statements? returnInstr SEMICOLON RBRACE
     ;

funcCall :
    ID LPAREN (exprD (COMMA exprD)*)? RPAREN
    ;
constantExpr :
    constDecl SEMICOLON
    ;


exprD :
    funcCall
    | exprG
    | exprEnt
    | exprBool
    | STRING
    | CHARACTER


	;

exprEnt : MINUS exprEnt
    | exprG
    | NATUREL
	| exprEnt MOD exprEnt
    | exprEnt (MUL | DIV) exprEnt
    | exprEnt (PLUS | MINUS) exprEnt
	| LPAREN exprEnt RPAREN
    ;

exprBool : TRUE | FALSE
    | exprG
	| exprEnt SMALLER exprEnt
    | exprEnt GREATER exprEnt
	| exprEnt EGREATER exprEnt
    | exprEnt ESMALLER exprEnt
	| exprEnt EQUAL exprEnt
	| STRING EQUAL STRING
	| CHARACTER EQUAL CHARACTER
	| exprBool AND exprBool
    | exprBool OR exprBool
	| NOT exprBool
	| LPAREN exprBool RPAREN
	;


exprG : funcCall
        |ID
        | ID LBRACKET exprD (COMMA exprD)? RBRACKET
        | exprG.ID;


conditionalStmt : IF LPAREN exprBool RPAREN LBRACE statement* RBRACE (ELSE LBRACE statement* RBRACE)? ;
repeatStmt : REPEAT LPAREN exprEnt RPAREN LBRACE statement* RBRACE ;
whileStmt : WHILE LPAREN exprBool RPAREN LBRACE statement* RBRACE ;

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
arrays : LBRACKET (NATUREL)+ (COMMA (NATUREL+))* RBRACKET;

structDecl : structures;

listStrucName : (mytype ID (arrays)? (COMMA  ID (arrays)? )* SEMICOLON)*;

listVarName : (mytype ID (arrays)? (COMMA  ID (arrays)? ))*;

varDecl : mytype ID (arrays)? (AFFECT initVariable)? (COMMA ID(arrays)?(AFFECT initVariable)?)* SEMICOLON ;

initVariable : TRUE | FALSE | STRING | CHARACTER | exprEnt | exprBool | initArrays | initStruct | LPAREN initVariable RPAREN;

initArrays : LBRACE (initVariable)(COMMA initVariable)*? RBRACE ;

initStruct : structDecl ;//LBRACE (ID COLON initVariable (COMMA ID COLON initVariable)*)? RBRACE ;


constDecl : CONST mytype ID (arrays?) ((AFFECT initVariable))? (COMMA ID (arrays))? SEMICOLON ;

enumDecl: ENUM (ID)? LBRACE ID (COMMA ID)*? RBRACE SEMICOLON  ;

typedefDecl: TYPEDEF mytype ID SEMICOLON ;

