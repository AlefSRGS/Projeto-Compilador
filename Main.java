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
        ParseTree tree = parser.statement();

        // Imprimir a árvore sintática
        System.out.println(tree.toStringTree(parser));
    }
}
