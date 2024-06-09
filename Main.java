import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Ler a entrada do usuário ou de um arquivo
        CharStream input = CharStreams.fromFileName("input.txt");

        // Criar o lexer
        gramaticaLexer lexer = new gramaticaLexer(input);

        // Criar o buffer de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criar o parser
        gramaticaParser parser = new gramaticaParser(tokens);

        // Iniciar o parsing pela regra inicial
        ParseTree tree = parser.program();

        Calculator calculator = new Calculator();
        Double result = calculator.visit(tree);

        // Imprimir a árvore sintática
        System.out.println("Arvore sintatica:\n" + tree.toStringTree(parser));
        System.out.println();
        System.out.println("Lista de Tokens: \n" + calculator.getSymbolTable());
        System.out.println();
        System.out.println("Resultado da execução: " + result);
    }
}
