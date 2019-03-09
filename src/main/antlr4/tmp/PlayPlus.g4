grammar PlayPlus;

import PlayPlusWords;

root: Instruction+ ;

//Instruction
Instruction: 'if' '('ExprD')' '{' Instruction + '}'
| 'if' '(' ExprD')''{' Instruction + '}' 'else' '{' Instruction + '}'
| 'while' '(' ExprD ') {' Instruction + '}'
| 'repeat' '(' ExprD ') {' Instruction + '}'
| ExprG '=' ExprD
| ActionType ;

ActionType: 'left'( (ExprD)?)
| 'right'( (ExprD)?)
| 'up'( (ExprD)? )
| 'down'( (ExprD)? )
| 'jump'( (ExprD)? )
| 'fight()'
| 'dig()';

//  Déclarations de fonctions/procedures
FctDecl: Type Id ( (ArgList)? )'{' (InstBlock)+ 'return' (ExprD | 'void') ';' '}';
ArgList: Type Id (Arrays)? (',' Type Id (Arrays)? )*? ;
InstBlock: ((VarDecl)*| (EnumDecl)*| (TypedefDecl)*| (ConstDecl)*| (StructDecl)*)? (Instruction)* ;

//Declaration de import
ImpDecl: '#''import' FileDecl;

FileDecl: FileName'.map';
FileName: Lettre (Chiffre | Lettre)*;

//Programme
Programme: ImpDecl
(VarDecl | FctDecl | ConstDecl | StructDecl | EnumDecl | TypedefDecl)*
'void' 'main()''{' ('dig()' | (Instruction)*)'return void; }';