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

mapfile: MAPSTART mapsize world EOF;

mapsize: coordX coordY;

world: line+;

coordX : NATUREL;
coordY : NATUREL;

line :  element (element | NEWLINE)+;

element:
    ( ROBOT| TRESOR| PELOUSE| PALMIER | PONT | BUISSON | TONNEAU | PUIT | VIDE | SQUELLETTE )
      ;

//-----------

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

mainDecl :
    (varDecl | constDecl | structDecl | enumDecl | typedefDecl | funcDecl)
    ;
// Main Function/Program

mainProgram :
    mainStart
    mainDecl?
    statements
    mainEnd
    ;

// at least one dig() instruction and a return in main.
mainStart : VOID MAIN LPAREN RPAREN LBRACE;

mainEnd : mainRet statements? RBRACE;

mainRet : returnInstr SEMICOLON;


// At least one statement
statements :  statement+ ;

statement :
    returnInstr SEMICOLON
    | affectInstr
    | exprD SEMICOLON
    | constantExpr
    | (actionType) SEMICOLON
//    | dig SEMICOLON
    | conditionalStmt | repeatStmt | whileStmt |  mainDecl
    ;

// return in functions and main
returnInstr : RETURN (exprG|VOID|exprD);


affectInstr :
    exprG AFFECT exprD SEMICOLON
    ;

funcDecl :
    (mytype | VOID) ID LPAREN funcArgs? RPAREN LBRACE localDecl? statements? returnInstr SEMICOLON RBRACE
    ;

funcArgs :
    (funcArg (COMMA funcArg)*)
    ;

funcArg :
    mytype exprG
    ;

funcCall :
    ID LPAREN funcCallArgs? RPAREN
//    | ID LPAREN (exprD (COMMA exprD)*)? RPAREN RPAREN {notifyErrorListeners("Too many parentheses");}
//    | ID LPAREN (exprD (COMMA exprD)*)? {notifyErrorListeners("Missing closing ')'");}
    ;

funcCallArgs
    : funcCallArg (COMMA funcCallArg)*
    ;

funcCallArg
    : exprD
    ;

constantExpr :
    constDecl SEMICOLON
    ;


exprD
    : funcCall
    | exprG
//    : exprG
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

// exprBool: TRUE | FALSE
//    | funcCall
//    | funcCall  (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) funcCall
//    | funcCall  (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) exprEnt
//    | exprG
//    | exprG (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) exprG
//    | exprG (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) CHARACTER
//	| exprEnt SMALLER exprEnt
//    | exprEnt GREATER exprEnt
//	| exprEnt EGREATER exprEnt
//    | exprEnt ESMALLER exprEnt
//	| exprEnt EQUAL exprEnt
//	| exprEnt NOTEQUAL exprEnt
//	| STRING EQUAL STRING
//	| STRING NOTEQUAL STRING
//	| CHARACTER EQUAL CHARACTER
//	| CHARACTER NOTEQUAL CHARACTER
//	| exprBool AND exprBool
//	| exprBool EQUAL exprBool
//	| exprBool NOTEQUAL exprBool
//    | exprBool OR exprBool
//	| NOT exprBool
//	| LPAREN exprBool RPAREN
//	;

 exprBool:
    | boolVal
    | boolVal (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) boolVal
    | exprG (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) CHARACTER
	| exprEnt SMALLER exprEnt
    | exprEnt GREATER exprEnt
	| exprEnt EGREATER exprEnt
    | exprEnt ESMALLER exprEnt
	| exprEnt EQUAL exprEnt
	| exprEnt NOTEQUAL exprEnt
	| STRING EQUAL STRING
	| STRING NOTEQUAL STRING
	| CHARACTER EQUAL CHARACTER
	| CHARACTER NOTEQUAL CHARACTER
	| exprBool AND exprBool
	| exprBool EQUAL exprBool
	| exprBool NOTEQUAL exprBool
    | exprBool OR exprBool
	| NOT exprBool
	| LPAREN exprBool RPAREN
	;

boolVal
    : TRUE
    | FALSE
    | funcCall
    | exprG
    | exprEnt
    ;

exprG
//    : funcCall
//    | ID
    : ID
    | ID LBRACKET exprD (COMMA exprD)? RBRACKET
    | exprG.ID
    | structRef
    ;


conditionalStmt : IF LPAREN exprBool RPAREN LBRACE statement* RBRACE (ELSE LBRACE statement* RBRACE)? ;
repeatStmt : REPEAT LPAREN exprEnt RPAREN LBRACE statement* RBRACE ;
whileStmt : WHILE LPAREN exprBool RPAREN LBRACE statement* RBRACE ;

actionType :
    LEFT LPAREN (exprD)? RPAREN
    | RIGHT LPAREN (exprD)? RPAREN
    | UP LPAREN (exprD)? RPAREN
    | DOWN LPAREN (exprD)? RPAREN
    | FIGHT LPAREN RPAREN
    | JUMP LPAREN (exprEnt)? RPAREN
    | dig
    ;

dig :
    DIG LPAREN RPAREN
    ;

structRef
    : ID member+
    ;

member
    : . ID
    ;

mytype : scalar | structures;
scalar : BOOL | INT | CHAR;
structures : STRUCT (ID)? LBRACE listStructFields RBRACE SEMICOLON;
arrays : LBRACKET (NATUREL)+ (COMMA (NATUREL+))* RBRACKET;

structDecl : structures;

listStructFields: structField* ;

structField: mytype fieldDecl (COMMA fieldDecl)* SEMICOLON;

fieldDecl: ID (arrays)?;

varDecl : mytype subVarDecl (COMMA subVarDecl)* SEMICOLON;

subVarDecl : ID (arrays)? (AFFECT initVariable)?;

initVariable : TRUE | FALSE | STRING | CHARACTER | exprEnt | exprBool | initArrays | initStruct | LPAREN initVariable RPAREN;

initArrays : LBRACE (initVariable)(COMMA initVariable)*? RBRACE ;

initStruct : structDecl ;//LBRACE (ID COLON initVariable (COMMA ID COLON initVariable)*)? RBRACE ;


constDecl : CONST mytype ID (arrays?) ((AFFECT initVariable))? (COMMA ID (arrays))? SEMICOLON ;

enumDecl: ENUM (ID)? LBRACE ID (COMMA ID)*? RBRACE SEMICOLON  ;

typedefDecl: TYPEDEF mytype ID SEMICOLON ;