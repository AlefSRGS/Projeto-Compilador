grammar gramatica;

// Regras da gramática
program : statement+ EOF;

statement : expression_statement
          | declaration_statement
          | if_statement
          | while_statement
          | for_statement
          | return_statement
          | break_statement
          | continue_statement
          | block
          ;

expression_statement : expression? ';' ;

declaration_statement : type IDENTIFIER ('=' expression)? ';' ;

if_statement : 'if' '(' expression ')' statement ('else' statement)?;

while_statement : 'while' '(' expression ')' statement ;

for_statement : 'for' '(' expression_statement expression_statement expression? ')' statement ;

return_statement : 'return' expression? ';' ;

break_statement : 'break' ';' ;

continue_statement : 'continue' ';' ;

block : '{' statement* '}' ;

expression : additive_expression ;

additive_expression : multiplicative_expression (('+' | '-') multiplicative_expression)* ;

multiplicative_expression : unary_expression (('*' | '/' | '%') unary_expression)* ;

unary_expression : ('+' | '-' | '!')* primary_expression ;

primary_expression : '(' expression ')' | NUMBER | IDENTIFIER | function_call ;

function_call : IDENTIFIER '(' argument_list? ')' ;

argument_list : expression (',' expression)* ;

type : 'int' | 'float' | 'char' | 'void' ; // Adição da regra type

// Tokens
NUMBER : [0-9]+ ;
IDENTIFIER : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
