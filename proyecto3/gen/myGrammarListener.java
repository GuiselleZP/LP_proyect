// Generated from C:/Users/ASUS/IdeaProjects/proyecto3/grammar\myGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myGrammarParser}.
 */
public interface myGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(myGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(myGrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(myGrammarParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(myGrammarParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(myGrammarParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(myGrammarParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(myGrammarParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(myGrammarParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(myGrammarParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(myGrammarParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#typeg}.
	 * @param ctx the parse tree
	 */
	void enterTypeg(myGrammarParser.TypegContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#typeg}.
	 * @param ctx the parse tree
	 */
	void exitTypeg(myGrammarParser.TypegContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#typet}.
	 * @param ctx the parse tree
	 */
	void enterTypet(myGrammarParser.TypetContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#typet}.
	 * @param ctx the parse tree
	 */
	void exitTypet(myGrammarParser.TypetContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(myGrammarParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(myGrammarParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#otro}.
	 * @param ctx the parse tree
	 */
	void enterOtro(myGrammarParser.OtroContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#otro}.
	 * @param ctx the parse tree
	 */
	void exitOtro(myGrammarParser.OtroContext ctx);
}