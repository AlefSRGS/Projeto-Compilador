%token ID STRING INT_CONST FLOAT_CONST VALOR
%token IF ELSE WHILE FOR RETURN SCANF PRINTF
%start programa
%%
programa : lista_declaracoes lista_instrucoes
         ;

lista_declaracoes : lista_declaracoes declaracao
                  | declaracao
                  ;

declaracao : declaracao_variavel
           | declaracao_funcao
           ;

declaracao_variavel : tipo lista_variaveis ';'
                    ;

tipo : "int"
     | "float"
     | "char"
     | "void"
     ;

lista_variaveis : lista_variaveis ',' variavel
                | variavel
                ;

variavel : ID
         ;

declaracao_funcao : tipo ID '(' lista_parametros ')' bloco
                  ;

lista_parametros : lista_parametros ',' parametro
                 | parametro
                 | /* vazio */
                 ;

parametro : tipo ID
          ;

bloco : '{' lista_declaracoes lista_instrucoes '}'
      ;

lista_instrucoes : lista_instrucoes instrucao
                 | instrucao
                 | /* vazio */
                 ;

instrucao : expressao ';'
          | declaracao_variavel
          | declaracao_funcao
          | instrucao_condicional
          | instrucao_repeticao
          | retorno
          | leitura
          | escrita
          ;

expressao : ID '=' expressao
          | expressao_binaria
          | expressao_unaria
          | chamada_funcao
          | VALOR
          ;

expressao_binaria : expressao '+' expressao
                  | expressao '-' expressao
                  | expressao '*' expressao
                  | expressao '/' expressao
                  | '(' expressao ')'
                  ;

expressao_unaria : '-' expressao
                 | '+' expressao
                 ;

chamada_funcao : ID '(' lista_argumentos ')'
               ;

lista_argumentos : lista_argumentos ',' expressao
                 | expressao
                 | /* vazio */
                 ;

instrucao_condicional : IF '(' expressao ')' bloco ELSE bloco
                      ;

instrucao_repeticao : WHILE '(' expressao ')' bloco
                    | FOR '(' expressao ';' expressao ';' expressao ')' bloco
                    ;

retorno : RETURN expressao ';'
        ;

leitura : SCANF '(' STRING ',' ID ')' ';'
        ;

escrita : PRINTF '(' STRING ',' expressao ')' ';'
        ;

%%
//main
