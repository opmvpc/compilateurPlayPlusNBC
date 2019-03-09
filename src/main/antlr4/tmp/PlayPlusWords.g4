lexer grammar PlayPlusWords;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;
//-----------------------------------------------------

// Commentaire
Commentaires: '/*' (.*?) '*/' | '//' .*? '\r'? '\n';

// Type de données
Entier: ('-')? (Chiffre)+;
Chiffre: [0-9] ;
String: '"'( [\\,\r\n])+'"' ;
Character: '\'' (Chiffre | Lettre | ':' | '.' | '&' | '/' | '\\' | ';')* '\'' ;

//Identificateurs
Id: Lettre (Chiffre | Lettre)+ ;
Lettre: [A-Za-z];

// Type de donées
Type: Scalar | Structures;
Scalar: 'bool' | 'int' | 'char';
Structures: 'struct' (Id)? '{' (ListVarName)? '}';
Arrays: '['(Chiffre)+ (',' (Chiffre)+)? ']';
StructDecl: Structures;

ListVarName: (Type Id (Arrays)? (',' Id (Arrays)? ';'))* ;

// Expression droite
ExprD: ExprEnt
| String
| Character
| ExprBool
| ExprG
| Id( (ExprD (','ExprD)*)? )
| '('ExprD')';

//Expression Entières
ExprEnt: Entier
| ExprD '+' ExprD
| ExprD '-' ExprD
| ExprD '*' ExprD
| ExprD '/' ExprD
| ExprD '%' ExprD
| '-' ExprD ;

// Expressions booléenes
ExprBool: 'true' | 'false'
| ExprD '&&' ExprD
| ExprD '||' ExprD
| '!' ExprD
| ExprD '<' ExprD
| ExprD '>' ExprD
| ExprD '==' ExprD
| ExprD '<=' ExprD
| ExprD '>=' ExprD
| ExprD '!=' ExprD ;

// Expression gauche
ExprG: Id
      | Id '['ExprD (',' ExprD)? ']'
      | ExprG.Id;

// Variables
VarDecl: Type Id (Arrays)? (('=' InitVariable))? (',' Id (Arrays)? ('=' InitVariable))? ;
InitVariable: 'true' | 'false' | Entier | String | Character | ExprEnt | ExprBool | InitArrays | InitStruct | '(' InitVariable')';
InitArrays: '{' (InitVariable (',' InitVariable)*)? '}' ;
InitStruct: '{' (Id ':' InitVariable (',' Id ':' InitVariable)*)? '}';

// Constants
ConstDecl: 'const' Type Id (Arrays)? (('=' InitVariable))? (',' Id (Arrays)? ('=' InitVariable))? ;

//Enumerations
EnumDecl: 'enum' (Id)? '{' Id (',' Id)*? '}' ;

// Typedef
TypedefDecl: 'typedef' Type Id;