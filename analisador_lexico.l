%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
%}

%option noyywrap

%%

[0-9]+                  { printf("NUM_INT: %s\n", yytext); }
[0-9]+\.[0-9]+          { printf("NUM_DEC: %s\n", yytext); }
"int"|"float"|"char"|"boolean"|"void"|"if"|"else"|"for"|"while"|"scanf"|"println"|"main"|"return" { printf("PALAVRA_RESERVADA: %s\n", yytext); }
[a-zA-Z_][a-zA-Z0-9_]*  { printf("ID: %s\n", yytext); }
\"[^\"]*\"              { printf("TEXTO: %s\n", yytext); }
\/\/.*                  { /* Ignorar comentários */ }
[\+\-\*\/\%\&\|\!\>\<\=\!][\=]? { printf("OPERADOR: %s\n", yytext); }
[\(\)\[\]\{\}\,\;]      { printf("SIMBOLO_ESPECIAL: %s\n", yytext); }
\n                      { /* Ignorar quebras de linha */ }
[ \t\n]                 { /* Ignorar espaços em branco */ }
.                       { printf("ERRO: Token inválido '%s'\n", yytext); exit(EXIT_FAILURE); }

%%

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Uso: %s arquivo_de_entrada\n", argv[0]);
        return EXIT_FAILURE;
    }
    
    FILE *input_file = fopen(argv[1], "r");
    if (!input_file) {
        printf("Erro ao abrir o arquivo %s\n", argv[1]);
        return EXIT_FAILURE;
    }
    
    yyin = input_file;
    
    yylex();
    fclose(input_file);
    
    return EXIT_SUCCESS;
}
