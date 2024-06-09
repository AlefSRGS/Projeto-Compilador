// Generated from gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(gramaticaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operatorAritmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAritmetic(gramaticaParser.OperatorAritmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operatorLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLogic(gramaticaParser.OperatorLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramaticaParser.TypeContext ctx);
}