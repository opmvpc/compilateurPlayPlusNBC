lexer grammar PlayPlusWords;

/**********
LEXER RULES
***********/

/** RESERVED WORDS **/
VOID : 'void';
IF : 'if';
ELSE : 'else';
THEN : 'then';
REPEAT : 'repeat';
WHILE : 'while';
TRUE : 'true';
FALSE : 'false';
IMPORT : 'import';

/** ACTION TYPES **/
LEFT : 'left';
RIGHT : 'right';
UP : 'up';
DOWN : 'down';
JUMP : 'jump';
FIGHT : 'fight';
DIG : 'dig';

/** TYPES **/
BOOL : 'bool';
INT : 'int';
CHAR : 'char';
STRUCT : 'struct';
CONST : 'const';
ENUM : 'enum';
TYPEDEF : 'typedef';
NATUREL : (CHIFFRE)+ ;
ENTIER : (MINUS)? (CHIFFRE)+ ;
FILE : DOUBLEQUOTE ID '.map' DOUBLEQUOTE ;
STRING : DOUBLEQUOTE (~["\\,\r\n])+ DOUBLEQUOTE ;
CHARACTER : SINGLEQUOTE ( CHIFFRE | LETTRE | COLON | DOT | AMPERSAND  | DIV | BACKSLASH | SEMICOLON )* SINGLEQUOTE  ;

/** OPERATORS **/
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
POW : '^';
EQUAL: '==';
AFFECT: '=';
NOT : '!';
NOTEQUAL: '!=';
SMALLER : '<';
GREATER : '>';
EGREATER : '>=';
ESMALLER : '<=';

/** BLOCKS AND ENCLOSURES **/
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACKET : '[';
RBRACKET : ']';

/** KEY SYMBOLS **/

SINGLEQUOTE : '\'';
BACKSLASH : '\\';
SEMICOLON: ';';
COLON : ':';
COMMA : ',';
DOT : '.';
AND : '&&';
OR : '||';
AMPERSAND : '&';

/** COMMENTS **/
COMMENTAIRES : (BLOCK_COMMENT | LINE_COMMENT) -> channel(HIDDEN);
BLOCK_COMMENT : DIV MUL .*? MUL DIV -> channel(HIDDEN) ;
LINE_COMMENT : DIV DIV ~[\r\n]* -> channel(HIDDEN) ;

/** NEWLINES AND WHITESPACE **/
NEWLINE : '\r'? '\n' -> skip;
WS : (' '| '\t')+ -> skip;

/** UTILS **/
HASHTAG: '#';
MAIN: 'void' WS+ 'main(' WS* ')';
RETURN: 'return';
MAP : DOT 'map';

/********
FRAGMENTS
********/
ID : LETTRE (CHIFFRE| LETTRE)*;
fragment DOUBLEQUOTE : '"';
fragment LETTRE: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment CHIFFRE: '0'..'9';