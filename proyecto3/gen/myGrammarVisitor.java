// Generated from C:/Users/ASUS/IdeaProjects/proyecto3/grammar\myGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(myGrammarParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(myGrammarParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV(myGrammarParser.VContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(myGrammarParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(myGrammarParser.DContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#typeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeg(myGrammarParser.TypegContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#typet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypet(myGrammarParser.TypetContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(myGrammarParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#otro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro(myGrammarParser.OtroContext ctx);
}