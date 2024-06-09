grammar gramatica;

program : statement+ EOF;

statement : variableDeclaration
          // | functionDeclaration
          | expressionStatement
          ;

variableDeclaration : 'var' type ID '=' expression ';' ;

expressionStatement : expression ';' ;

expression : term
           | term (operatorLogic term)*
           | term (operatorAritmetic term)*
           ;

// functionDeclaration : 'func' typeReturn ID '('(type ID)*')'; 
// typeReturn: type;

operatorAritmetic: '*'|'/'|'+'|'-'| '%';
operatorLogic: '=='|'!='|'<'|'>'|'<='|'>=';

term: INT
     | BOOL
     | FLOAT
     | DOUBLE
     | ID
     | '(' expression ')'
     ;

type : 'int'
     | 'bool'
     | 'float'
     | 'double'
     ;

ID : [a-zA-Z0-9]+ ;
INT : [0-9]+ ;
BOOL : 'true' | 'false' ;
FLOAT : [0-9]+ '.' [0-9]+ ;
DOUBLE : [0-9]+ ('.' [0-9]+)?;
WS : [ \t\r\n]+ -> skip ;
