// Generated from Postfijo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostfijoParser}.
 */
public interface PostfijoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostfijoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PostfijoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfijoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PostfijoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfijoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PostfijoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfijoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PostfijoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostfijoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PostfijoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostfijoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PostfijoParser.TermContext ctx);
}