// Generated from C:/Users/ASUS/IdeaProjects/proyecto3/grammar\myGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Basic=1, COM=2, C=3, DP=4, EXC=5, EXCV=6, E=7, F=8, GATE=9, INC=10, LINE=11, 
		Manual=12, PLL=13, POOL=14, Send=15, Script=16, Service=17, START=18, 
		Recept=19, Refer=20, TASK=21, User=22, END=23, L=24, R=25, ID=26, WHITESPACE=27, 
		CADENA=28, ESP=29;
	public static final int
		RULE_inicio = 0, RULE_a = 1, RULE_v = 2, RULE_process = 3, RULE_d = 4, 
		RULE_typeg = 5, RULE_typet = 6, RULE_arrow = 7, RULE_otro = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "a", "v", "process", "d", "typeg", "typet", "arrow", "otro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'basic'", "'com'", "','", "':'", null, "'excv'", "'='", "'->'", 
			"'gate'", null, "'line'", "'manual'", "'pll'", "'pool'", "'send'", "'script'", 
			"'sevice'", "'start'", "'recept'", "'refer'", "'task'", "'user'", "'end'", 
			"'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Basic", "COM", "C", "DP", "EXC", "EXCV", "E", "F", "GATE", "INC", 
			"LINE", "Manual", "PLL", "POOL", "Send", "Script", "Service", "START", 
			"Recept", "Refer", "TASK", "User", "END", "L", "R", "ID", "WHITESPACE", 
			"CADENA", "ESP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode POOL() { return getToken(myGrammarParser.POOL, 0); }
		public TerminalNode L() { return getToken(myGrammarParser.L, 0); }
		public TerminalNode R() { return getToken(myGrammarParser.R, 0); }
		public TerminalNode DP() { return getToken(myGrammarParser.DP, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public List<TerminalNode> ID() { return getTokens(myGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myGrammarParser.ID, i);
		}
		public List<VContext> v() {
			return getRuleContexts(VContext.class);
		}
		public VContext v(int i) {
			return getRuleContext(VContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(18);
				v();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(POOL);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(25);
				match(ID);
				}
			}

			setState(28);
			match(L);
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			match(R);
			setState(31);
			match(DP);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(32);
				v();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			a();
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(myGrammarParser.START, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TerminalNode END() { return getToken(myGrammarParser.END, 0); }
		public TerminalNode F() { return getToken(myGrammarParser.F, 0); }
		public List<TerminalNode> ID() { return getTokens(myGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myGrammarParser.ID, i);
		}
		public TerminalNode LINE() { return getToken(myGrammarParser.LINE, 0); }
		public TerminalNode L() { return getToken(myGrammarParser.L, 0); }
		public TerminalNode R() { return getToken(myGrammarParser.R, 0); }
		public TerminalNode DP() { return getToken(myGrammarParser.DP, 0); }
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_a);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(START);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==F) {
					{
					setState(41);
					match(F);
					}
				}

				setState(44);
				process();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(45);
					match(ID);
					}
				}

				setState(48);
				match(END);
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(LINE);
				setState(51);
				match(ID);
				setState(52);
				match(L);
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(54);
				match(R);
				setState(55);
				match(DP);
				setState(56);
				process();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myGrammarParser.ID, 0); }
		public TerminalNode E() { return getToken(myGrammarParser.E, 0); }
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(E);
			setState(61);
			match(CADENA);
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(myGrammarParser.TASK, 0); }
		public TerminalNode L() { return getToken(myGrammarParser.L, 0); }
		public List<TerminalNode> C() { return getTokens(myGrammarParser.C); }
		public TerminalNode C(int i) {
			return getToken(myGrammarParser.C, i);
		}
		public TerminalNode R() { return getToken(myGrammarParser.R, 0); }
		public List<TerminalNode> ID() { return getTokens(myGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myGrammarParser.ID, i);
		}
		public TypetContext typet() {
			return getRuleContext(TypetContext.class,0);
		}
		public TerminalNode F() { return getToken(myGrammarParser.F, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public TerminalNode GATE() { return getToken(myGrammarParser.GATE, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TerminalNode DP() { return getToken(myGrammarParser.DP, 0); }
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_process);
		int _la;
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TASK:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(TASK);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(64);
					match(ID);
					}
				}

				setState(67);
				match(L);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==CADENA) {
					{
					setState(68);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==CADENA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(71);
				match(C);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Basic) | (1L << Manual) | (1L << Send) | (1L << Script) | (1L << Service) | (1L << Recept) | (1L << Refer) | (1L << User))) != 0)) {
					{
					setState(72);
					typet();
					}
				}

				setState(75);
				match(C);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(76);
					match(ID);
					}
				}

				setState(79);
				match(R);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(80);
					match(F);
					}
					break;
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						process();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case GATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(GATE);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(90);
					match(ID);
					}
				}

				setState(93);
				match(L);
				setState(94);
				d();
				setState(95);
				match(R);
				setState(96);
				match(DP);
				setState(97);
				arrow();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(myGrammarParser.C); }
		public TerminalNode C(int i) {
			return getToken(myGrammarParser.C, i);
		}
		public List<TypegContext> typeg() {
			return getRuleContexts(TypegContext.class);
		}
		public TypegContext typeg(int i) {
			return getRuleContext(TypegContext.class,i);
		}
		public TerminalNode ID() { return getToken(myGrammarParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==CADENA) {
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(104);
			match(C);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << EXC) | (1L << EXCV) | (1L << INC) | (1L << PLL))) != 0)) {
				{
				setState(105);
				typeg();
				}
			}

			setState(108);
			match(C);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << EXC) | (1L << EXCV) | (1L << INC) | (1L << PLL))) != 0)) {
				{
				setState(109);
				typeg();
				}
			}

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

	public static class TypegContext extends ParserRuleContext {
		public TerminalNode EXC() { return getToken(myGrammarParser.EXC, 0); }
		public TerminalNode EXCV() { return getToken(myGrammarParser.EXCV, 0); }
		public TerminalNode PLL() { return getToken(myGrammarParser.PLL, 0); }
		public TerminalNode INC() { return getToken(myGrammarParser.INC, 0); }
		public TerminalNode COM() { return getToken(myGrammarParser.COM, 0); }
		public TypegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterTypeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitTypeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitTypeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypegContext typeg() throws RecognitionException {
		TypegContext _localctx = new TypegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COM) | (1L << EXC) | (1L << EXCV) | (1L << INC) | (1L << PLL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypetContext extends ParserRuleContext {
		public TerminalNode Basic() { return getToken(myGrammarParser.Basic, 0); }
		public TerminalNode User() { return getToken(myGrammarParser.User, 0); }
		public TerminalNode Manual() { return getToken(myGrammarParser.Manual, 0); }
		public TerminalNode Service() { return getToken(myGrammarParser.Service, 0); }
		public TerminalNode Send() { return getToken(myGrammarParser.Send, 0); }
		public TerminalNode Recept() { return getToken(myGrammarParser.Recept, 0); }
		public TerminalNode Script() { return getToken(myGrammarParser.Script, 0); }
		public TerminalNode Refer() { return getToken(myGrammarParser.Refer, 0); }
		public TypetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterTypet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitTypet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitTypet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypetContext typet() throws RecognitionException {
		TypetContext _localctx = new TypetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Basic) | (1L << Manual) | (1L << Send) | (1L << Script) | (1L << Service) | (1L << Recept) | (1L << Refer) | (1L << User))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ArrowContext extends ParserRuleContext {
		public List<TerminalNode> F() { return getTokens(myGrammarParser.F); }
		public TerminalNode F(int i) {
			return getToken(myGrammarParser.F, i);
		}
		public TerminalNode L() { return getToken(myGrammarParser.L, 0); }
		public TerminalNode R() { return getToken(myGrammarParser.R, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TerminalNode ID() { return getToken(myGrammarParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(myGrammarParser.CADENA, 0); }
		public List<OtroContext> otro() {
			return getRuleContexts(OtroContext.class);
		}
		public OtroContext otro(int i) {
			return getRuleContext(OtroContext.class,i);
		}
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrow);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(F);
			setState(117);
			match(L);
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(R);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==F) {
				{
				setState(120);
				match(F);
				}
			}

			setState(123);
			process();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					otro();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
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

	public static class OtroContext extends ParserRuleContext {
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterOtro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitOtro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			arrow();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\5\3-\n\3\3\3\3\3\5\3\61\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5"+
		"D\n\5\3\5\3\5\5\5H\n\5\3\5\3\5\5\5L\n\5\3\5\3\5\5\5P\n\5\3\5\3\5\5\5T"+
		"\n\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\5\5^\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5f\n\5\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\6\3\6\5\6q\n\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083"+
		"\13\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\4\2\34\34\36\36\6\2"+
		"\4\4\7\b\f\f\17\17\7\2\3\3\16\16\21\23\25\26\30\30\2\u0090\2\27\3\2\2"+
		"\2\4;\3\2\2\2\6=\3\2\2\2\be\3\2\2\2\nh\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2"+
		"\20v\3\2\2\2\22\u0084\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2"+
		"\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\34\7\20"+
		"\2\2\33\35\7\34\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7"+
		"\32\2\2\37 \t\2\2\2 !\7\33\2\2!%\7\6\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\5\4\3\2)\3\3\2\2\2*,\7"+
		"\24\2\2+-\7\n\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\5\b\5\2/\61\7\34\2"+
		"\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\31\2\2\63<\3\2\2\2"+
		"\64\65\7\r\2\2\65\66\7\34\2\2\66\67\7\32\2\2\678\t\2\2\289\7\33\2\29:"+
		"\7\6\2\2:<\5\b\5\2;*\3\2\2\2;\64\3\2\2\2<\5\3\2\2\2=>\7\34\2\2>?\7\t\2"+
		"\2?@\7\36\2\2@\7\3\2\2\2AC\7\27\2\2BD\7\34\2\2CB\3\2\2\2CD\3\2\2\2DE\3"+
		"\2\2\2EG\7\32\2\2FH\t\2\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7\5\2\2JL"+
		"\5\16\b\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\5\2\2NP\7\34\2\2ON\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2QS\7\33\2\2RT\7\n\2\2SR\3\2\2\2ST\3\2\2\2TX\3\2\2"+
		"\2UW\5\b\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yf\3\2\2\2ZX\3\2\2"+
		"\2[]\7\13\2\2\\^\7\34\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\32\2\2`a"+
		"\5\n\6\2ab\7\33\2\2bc\7\6\2\2cd\5\20\t\2df\3\2\2\2eA\3\2\2\2e[\3\2\2\2"+
		"f\t\3\2\2\2gi\t\2\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\7\5\2\2km\5\f\7"+
		"\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\5\2\2oq\5\f\7\2po\3\2\2\2pq\3\2\2"+
		"\2q\13\3\2\2\2rs\t\3\2\2s\r\3\2\2\2tu\t\4\2\2u\17\3\2\2\2vw\7\n\2\2wx"+
		"\7\32\2\2xy\t\2\2\2y{\7\33\2\2z|\7\n\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2"+
		"}\u0081\5\b\5\2~\u0080\5\22\n\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\5\20\t\2\u0085\23\3\2\2\2\25\27\34%,\60;CGKOSX]ehlp{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}