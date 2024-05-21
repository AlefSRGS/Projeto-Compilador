grammar gramatica;

// Regras da gramática
program : declaracao* EOF ;

declaracao : declaracaoVariavel
           | declaracaoFuncao
           | declaracaoEstrutura
           | estruturaControle
           ;

declaracaoVariavel : tipo ID ';'
                   | tipo ID '=' expressao ';'
                   ;

declaracaoFuncao : tipo ID '(' parametros ')' bloco ;

parametros : parametro (',' parametro)* ;
parametro : tipo ID
          | tipo ID '[' ']'
          | tipo '...' ID
          ;

bloco : '{' declaracao* '}' ;

expressao : atribuicao
          | expressaoLogica
          ;

atribuicao : ID '=' expressao
           | ID '+=' expressao
           | ID '-=' expressao
           | ID '*=' expressao
           | ID '/=' expressao
           | ID '%=' expressao
           | ID '&&=' expressao
           | ID '||=' expressao
           ;

tipo : 'int' | 'float' | 'double' | 'char' | 'boolean' ;

estruturaControle : 'if' '(' expressao ')' bloco ('else' bloco)?
                  | 'while' '(' expressao ')' bloco
                  | 'for' '(' expressao? ';' expressao? ';' expressao? ')' bloco
                  | 'switch' '(' expressao ')' caseLista
                  | 'break' ';'
                  | 'continue' ';'
                  | 'return' expressao? ';'
                  ;

caseLista : caseDecl* ;
caseDecl : 'case' expressao ':' bloco
         | 'default' ':' bloco
         ;

declaracaoEstrutura : 'struct' ID '{' declaracaoVariavel* '}' ';' ;

array : ID '[' expressao ']' 
      | ID '[' ']'
      | arrayInicializacao
      ;

arrayInicializacao : '{' expressaoLista '}' ;

expressaoLista : expressao (',' expressao)* ;

expressaoLogica : expressaoRelacional
                | expressaoLogica '&&' expressaoRelacional
                | expressaoLogica '||' expressaoRelacional
                | '!' expressaoRelacional
                ;

expressaoRelacional : expressaoAritmetica
                    | expressaoAritmetica '>' expressaoAritmetica
                    | expressaoAritmetica '>=' expressaoAritmetica
                    | expressaoAritmetica '<' expressaoAritmetica
                    | expressaoAritmetica '<=' expressaoAritmetica
                    | expressaoAritmetica '!=' expressaoAritmetica
                    | expressaoAritmetica '==' expressaoAritmetica
                    ;

expressaoAritmetica : expressaoMultiplicativa
                    | expressaoAritmetica '+' expressaoMultiplicativa
                    | expressaoAritmetica '-' expressaoMultiplicativa
                    ;

expressaoMultiplicativa : expressaoUnaria
                        | expressaoMultiplicativa '*' expressaoUnaria
                        | expressaoMultiplicativa '/' expressaoUnaria
                        | expressaoMultiplicativa '%' expressaoUnaria
                        ;

expressaoUnaria : expressaoPostfix
                | '-' expressaoUnaria
                | '++' expressaoPostfix
                | '--' expressaoPostfix
                ;

expressaoPostfix : primaria
                 | primaria '[' expressao ']'
                 | primaria '(' argumentos ')'
                 | primaria '.' ID
                 | primaria '->' ID
                 ;

argumentos : expressaoLista | ;

primaria : ID
         | NUM_INT
         | NUM_DEC
         | TEXTO
         | '(' expressao ')'
         ;

// Tokens
NUM_INT : [0-9]+ ;
NUM_DEC : [0-9]+ '.' [0-9]+ ;
TEXTO : '"' .*? '"' ;
ID : [a-zA-Z_][a-zA-Z_0-9]* ;
WS : [ \t\r\n]+ -> skip ;

// Comentários
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
