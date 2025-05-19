grammar SimpleLang;

//Gramatica
program: statement* EOF;

statement
    : switchStatement
    | assignmentStatement
    | consoleStatement
    ;

switchStatement                                 
    : SWITCH '(' expression ')' '{' caseClause* defaultClause? '}'   
    ;

caseClause
    : CASE expression ':' statement*                                 
    ;

defaultClause                                   
    : DEFAULT ':' statement*                                        
    ;

assignmentStatement                           
    : Identifier '=' expression ';'                                  
    ;

consoleStatement
    : CONSOLE '.' LOG '(' expression ')' ';'                         
    ;

expression
    : term (('+' | '-' | '*' | '/') term)*                           
    ;

term
    : Identifier                   #Identifier
    | Number                       #Number
    | StringLiteral                #StringLiteral
    | '(' expression ')'           #Parens
    ;
//Tokens
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COLON: ':';
EQ: '=';
SEMI: ';';
DOT: '.';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
CONSOLE: 'console';
LOG: 'log';
StringLiteral: '"' (~["\\] | '\\' .)* '"';
Identifier: [a-zA-Z] [a-zA-Z0-9_]*;
Number: [0-9]+;
WS: [ \t\r\n]+ -> skip;
