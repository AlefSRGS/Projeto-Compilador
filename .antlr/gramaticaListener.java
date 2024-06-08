// Generated from c:/Users/Alef_PC/Documents/repositorio_github/Projeto-Compilador/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(gramaticaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(gramaticaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(gramaticaParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(gramaticaParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(gramaticaParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(gramaticaParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(gramaticaParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(gramaticaParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(gramaticaParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(gramaticaParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEstrutura(gramaticaParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEstrutura(gramaticaParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(gramaticaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(gramaticaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayInicializacao(gramaticaParser.ArrayInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayInicializacao(gramaticaParser.ArrayInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLista(gramaticaParser.ExpressaoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLista(gramaticaParser.ExpressaoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(gramaticaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(gramaticaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(gramaticaParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(gramaticaParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoUnaria(gramaticaParser.ExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoUnaria(gramaticaParser.ExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoPostfix(gramaticaParser.ExpressaoPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoPostfix(gramaticaParser.ExpressaoPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gramaticaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(gramaticaParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(gramaticaParser.PrimariaContext ctx);
}