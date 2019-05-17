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
    | exprEnt
    | exprBool
    | STRING
    | charVal
	;

operateurEntier
    : (PLUS | MINUS)
    | (MUL | DIV)
    | MOD
    | POW
    ;

exprEnt
    : MINUS exprEnt
    | exprG
    | funcCall
    | naturel
	| exprEnt operateurEntier exprEnt
	| LPAREN exprEnt RPAREN
    ;

naturel
    : NATUREL;

 exprBool:
    | NOT exprBool
 	| LPAREN exprBool RPAREN
    | boolVal
    | boolVal (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) boolVal
//    comparaison avec des entiers
    | boolVal (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) exprEnt
    | exprEnt (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) boolVal
//    comparaison avec des chars
    | boolVal (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) charVal
    | charVal (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) boolVal
//    | exprG
//    | exprG (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) exprG
    | exprG (EQUAL |  NOTEQUAL  | SMALLER | GREATER | EGREATER | ESMALLER ) charVal
	| exprEnt SMALLER exprEnt
    | exprEnt GREATER exprEnt
	| exprEnt EGREATER exprEnt
    | exprEnt ESMALLER exprEnt
	| exprEnt EQUAL exprEnt
	| exprEnt NOTEQUAL exprEnt
	| STRING EQUAL STRING
	| STRING NOTEQUAL STRING
	| charVal EQUAL charVal
	| charVal NOTEQUAL charVal
	| exprBool AND exprBool
	| exprBool EQUAL exprBool
	| exprBool NOTEQUAL exprBool
    | exprBool OR exprBool
	;

boolVal
    : boolLiteral
    | funcCall
    | exprG
//    | exprEnt
    ;

boolLiteral
    : TRUE
    | FALSE
    ;

charVal : CHARACTER;

exprG
    : ID
    | arrayRef
    | structRef
    ;

structRef
    : ID members
    ;

members
    : '.'member ('.'member)*
    ;

member
    : ID (arrays)?
    ;

arrayRef
    : ID LBRACKET firstDimension (COMMA secondDimension)? RBRACKET
    ;

conditionalStmt : IF LPAREN boolCondition RPAREN LBRACE ifStmt RBRACE (ELSE LBRACE elseStmt RBRACE)? ;
repeatStmt : REPEAT LPAREN repeatCondition RPAREN LBRACE loops RBRACE ;
whileStmt : WHILE LPAREN boolCondition RPAREN LBRACE labelloop=statement* RBRACE ;

ifStmt : statement*;
elseStmt : statement*;
loops : statement*;

boolCondition : exprBool;
repeatCondition : exprEnt;

actionType :
    LEFT LPAREN (exprEnt)? RPAREN
    | RIGHT LPAREN (exprEnt)? RPAREN
    | UP LPAREN (exprEnt)? RPAREN
    | DOWN LPAREN (exprEnt)? RPAREN
    | FIGHT LPAREN RPAREN
    | JUMP LPAREN (exprEnt)? RPAREN
    | dig
    ;

dig :
    DIG LPAREN RPAREN
    ;

mytype : scalar | structures;
scalar : BOOL | INT | CHAR;
arrays : LBRACKET arrayIndex RBRACKET;
arrayIndex : firstDimension (COMMA secondDimension)?;
firstDimension:exprEnt;
secondDimension:exprEnt;
structDecl : structures;
structures : STRUCT (ID)? LBRACE listStructFields RBRACE SEMICOLON;

listStructFields: structField+ ;

structField: (field | structDecl);

field: mytype ID (arrays)? SEMICOLON;

varDecl : mytype subVarDecl (COMMA subVarDecl)* SEMICOLON;

subVarDecl : ID (arrays)? (AFFECT initVariable)?;

initVariable : boolLiteral | STRING | charVal | exprEnt | exprBool | initArrays | initStruct | LPAREN initVariable RPAREN;

initArrays : LBRACE (initVariable)(COMMA initVariable)* RBRACE ;

initStruct : structDecl ;//LBRACE (ID COLON initVariable (COMMA ID COLON initVariable)*)? RBRACE ;


constDecl : CONST mytype ID (arrays?) ((AFFECT initVariable))? (COMMA ID (arrays))? SEMICOLON ;

enumDecl: ENUM (ID)? LBRACE ID (COMMA ID)*? RBRACE SEMICOLON  ;

typedefDecl: TYPEDEF mytype ID SEMICOLON ;