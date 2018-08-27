// Generated from Romano.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RomanoParser}.
 */
public interface RomanoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RomanoParser#arabigo}.
	 * @param ctx the parse tree
	 */
	void enterArabigo(RomanoParser.ArabigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanoParser#arabigo}.
	 * @param ctx the parse tree
	 */
	void exitArabigo(RomanoParser.ArabigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanoParser#unidades}.
	 * @param ctx the parse tree
	 */
	void enterUnidades(RomanoParser.UnidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanoParser#unidades}.
	 * @param ctx the parse tree
	 */
	void exitUnidades(RomanoParser.UnidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanoParser#decenas}.
	 * @param ctx the parse tree
	 */
	void enterDecenas(RomanoParser.DecenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanoParser#decenas}.
	 * @param ctx the parse tree
	 */
	void exitDecenas(RomanoParser.DecenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanoParser#centenas}.
	 * @param ctx the parse tree
	 */
	void enterCentenas(RomanoParser.CentenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanoParser#centenas}.
	 * @param ctx the parse tree
	 */
	void exitCentenas(RomanoParser.CentenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanoParser#millares}.
	 * @param ctx the parse tree
	 */
	void enterMillares(RomanoParser.MillaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanoParser#millares}.
	 * @param ctx the parse tree
	 */
	void exitMillares(RomanoParser.MillaresContext ctx);
}