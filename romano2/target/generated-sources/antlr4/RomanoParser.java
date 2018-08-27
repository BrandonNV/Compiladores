// Generated from Romano.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RomanoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, DIGIT=2, WS=3;
	public static final int
		RULE_arabigo = 0, RULE_unidades = 1, RULE_decenas = 2, RULE_centenas = 3, 
		RULE_millares = 4;
	public static final String[] ruleNames = {
		"arabigo", "unidades", "decenas", "centenas", "millares"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "DIGIT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Romano.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RomanoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ArabigoContext extends ParserRuleContext {
		public MillaresContext millares() {
			return getRuleContext(MillaresContext.class,0);
		}
		public CentenasContext centenas() {
			return getRuleContext(CentenasContext.class,0);
		}
		public DecenasContext decenas() {
			return getRuleContext(DecenasContext.class,0);
		}
		public UnidadesContext unidades() {
			return getRuleContext(UnidadesContext.class,0);
		}
		public ArabigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arabigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).enterArabigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).exitArabigo(this);
		}
	}

	public final ArabigoContext arabigo() throws RecognitionException {
		ArabigoContext _localctx = new ArabigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arabigo);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(10);
				millares();
				}
				{
				setState(11);
				centenas();
				}
				{
				setState(12);
				decenas();
				}
				{
				setState(13);
				unidades();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				{
				setState(15);
				centenas();
				}
				{
				setState(16);
				decenas();
				}
				{
				setState(17);
				unidades();
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				{
				setState(19);
				decenas();
				}
				{
				setState(20);
				unidades();
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(22);
				unidades();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnidadesContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RomanoParser.DIGIT, 0); }
		public UnidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).enterUnidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).exitUnidades(this);
		}
	}

	public final UnidadesContext unidades() throws RecognitionException {
		UnidadesContext _localctx = new UnidadesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unidades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(DIGIT);

				int u = Integer.parseInt(_ctx.getText());
				if (u < 4)
					System.out.print(String.join("", java.util.Collections.nCopies(u,"I")));
				else if (u == 4)
					System.out.print("IV");
				else if (u == 5)
					System.out.print("V");
				else if (u < 9)
					System.out.print("V"+String.join("", java.util.Collections.nCopies(u-5,"I")));
				else if (u == 9)
					System.out.print("IX");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecenasContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RomanoParser.DIGIT, 0); }
		public DecenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decenas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).enterDecenas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).exitDecenas(this);
		}
	}

	public final DecenasContext decenas() throws RecognitionException {
		DecenasContext _localctx = new DecenasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decenas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(DIGIT);

				int u = Integer.parseInt(_ctx.getText());
				if (u < 4)
					System.out.print(String.join("", java.util.Collections.nCopies(u,"X")));
				else if (u == 4)
					System.out.print("XL");
				else if (u == 5)
					System.out.print("L");
				else if (u < 9)
					System.out.print("L"+String.join("", java.util.Collections.nCopies(u-5,"X")));
				else if (u == 9)
					System.out.print("XC");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CentenasContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RomanoParser.DIGIT, 0); }
		public CentenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centenas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).enterCentenas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).exitCentenas(this);
		}
	}

	public final CentenasContext centenas() throws RecognitionException {
		CentenasContext _localctx = new CentenasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_centenas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DIGIT);

				int u = Integer.parseInt(_ctx.getText());
				if (u < 4)
					System.out.print(String.join("", java.util.Collections.nCopies(u,"C")));
				else if (u == 4)
					System.out.print("CD");
				else if (u == 5)
					System.out.print("D");
				else if (u < 9)
					System.out.print("D"+String.join("", java.util.Collections.nCopies(u-5,"C")));
				else if (u == 9)
					System.out.print("CM");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MillaresContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RomanoParser.DIGIT, 0); }
		public MillaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_millares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).enterMillares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanoListener ) ((RomanoListener)listener).exitMillares(this);
		}
	}

	public final MillaresContext millares() throws RecognitionException {
		MillaresContext _localctx = new MillaresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_millares);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DIGIT);

				int u = Integer.parseInt(_ctx.getText());
				if (u < 4)
					System.out.print(String.join("", java.util.Collections.nCopies(u,"M")));
				

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\2\2\7\2\4\6\b\n\2\2\2%\2\31\3\2\2\2\4\33\3\2\2\2\6\36\3\2\2\2\b!\3"+
		"\2\2\2\n$\3\2\2\2\f\r\5\n\6\2\r\16\5\b\5\2\16\17\5\6\4\2\17\20\5\4\3\2"+
		"\20\32\3\2\2\2\21\22\5\b\5\2\22\23\5\6\4\2\23\24\5\4\3\2\24\32\3\2\2\2"+
		"\25\26\5\6\4\2\26\27\5\4\3\2\27\32\3\2\2\2\30\32\5\4\3\2\31\f\3\2\2\2"+
		"\31\21\3\2\2\2\31\25\3\2\2\2\31\30\3\2\2\2\32\3\3\2\2\2\33\34\7\4\2\2"+
		"\34\35\b\3\1\2\35\5\3\2\2\2\36\37\7\4\2\2\37 \b\4\1\2 \7\3\2\2\2!\"\7"+
		"\4\2\2\"#\b\5\1\2#\t\3\2\2\2$%\7\4\2\2%&\b\6\1\2&\13\3\2\2\2\3\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}