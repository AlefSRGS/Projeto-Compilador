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
	 * Enter a parse tree produced by {@link gramaticaParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(gramaticaParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(gramaticaParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(gramaticaParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(gramaticaParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(gramaticaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(gramaticaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(gramaticaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(gramaticaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(gramaticaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(gramaticaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(gramaticaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(gramaticaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(gramaticaParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(gramaticaParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(gramaticaParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(gramaticaParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gramaticaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gramaticaParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(gramaticaParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(gramaticaParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(gramaticaParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(gramaticaParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(gramaticaParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(gramaticaParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(gramaticaParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(gramaticaParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(gramaticaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(gramaticaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(gramaticaParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(gramaticaParser.Argument_listContext ctx);
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