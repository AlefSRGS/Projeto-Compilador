// Generated from gramatica.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(gramaticaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(gramaticaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operatorAritmetic}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAritmetic(gramaticaParser.OperatorAritmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operatorAritmetic}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAritmetic(gramaticaParser.OperatorAritmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operatorLogic}.
	 * @param ctx the parse tree
	 */
	void enterOperatorLogic(gramaticaParser.OperatorLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operatorLogic}.
	 * @param ctx the parse tree
	 */
	void exitOperatorLogic(gramaticaParser.OperatorLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramaticaParser.TypeContext ctx);
}