// Generated from c:/Users/HP/OneDrive/Documentos/Mis Proyectos/ssl-antlr-calculator/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, COLON=5, EQ=6, SEMI=7, DOT=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, SWITCH=13, CASE=14, DEFAULT=15, CONSOLE=16, 
		LOG=17, StringLiteral=18, Identifier=19, Number=20, WS=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_switchStatement = 2, RULE_caseClause = 3, 
		RULE_defaultClause = 4, RULE_assignmentStatement = 5, RULE_consoleStatement = 6, 
		RULE_expression = 7, RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "switchStatement", "caseClause", "defaultClause", 
			"assignmentStatement", "consoleStatement", "expression", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "'='", "';'", "'.'", "'+'", 
			"'-'", "'*'", "'/'", "'switch'", "'case'", "'default'", "'console'", 
			"'log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COLON", "EQ", "SEMI", 
			"DOT", "PLUS", "MINUS", "MULT", "DIV", "SWITCH", "CASE", "DEFAULT", "CONSOLE", 
			"LOG", "StringLiteral", "Identifier", "Number", "WS"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 598016L) != 0)) {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ConsoleStatementContext consoleStatement() {
			return getRuleContext(ConsoleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				switchStatement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				assignmentStatement();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				consoleStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SimpleLangParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLangParser.RBRACE, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(SWITCH);
			setState(32);
			match(LPAREN);
			setState(33);
			expression();
			setState(34);
			match(RPAREN);
			setState(35);
			match(LBRACE);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(36);
				caseClause();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(42);
				defaultClause();
				}
			}

			setState(45);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SimpleLangParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimpleLangParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CASE);
			setState(48);
			expression();
			setState(49);
			match(COLON);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 598016L) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SimpleLangParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SimpleLangParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DEFAULT);
			setState(57);
			match(COLON);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 598016L) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(SimpleLangParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Identifier);
			setState(65);
			match(EQ);
			setState(66);
			expression();
			setState(67);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(SimpleLangParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(SimpleLangParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(SimpleLangParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SimpleLangParser.SEMI, 0); }
		public ConsoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleStatement; }
	}

	public final ConsoleStatementContext consoleStatement() throws RecognitionException {
		ConsoleStatementContext _localctx = new ConsoleStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_consoleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CONSOLE);
			setState(70);
			match(DOT);
			setState(71);
			match(LOG);
			setState(72);
			match(LPAREN);
			setState(73);
			expression();
			setState(74);
			match(RPAREN);
			setState(75);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLangParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleLangParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleLangParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SimpleLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleLangParser.DIV, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			term();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) {
				{
				{
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				term();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends TermContext {
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public IdentifierContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends TermContext {
		public TerminalNode Number() { return getToken(SimpleLangParser.Number, 0); }
		public NumberContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends TermContext {
		public TerminalNode StringLiteral() { return getToken(SimpleLangParser.StringLiteral, 0); }
		public StringLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends TermContext {
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public ParensContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(Identifier);
				}
				break;
			case Number:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(Number);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(StringLiteral);
				}
				break;
			case LPAREN:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(LPAREN);
				setState(89);
				expression();
				setState(90);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001"+
		"\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004"+
		"\f\u0004?\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\b\u0000\u0000\t\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\t\f`\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f"+
		"\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b8\u0001\u0000"+
		"\u0000\u0000\n@\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000e"+
		"M\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u001e\u0003\u0004\u0002\u0000\u001b\u001e"+
		"\u0003\n\u0005\u0000\u001c\u001e\u0003\f\u0006\u0000\u001d\u001a\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\r"+
		"\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0003\u000e\u0007\u0000\"#\u0005"+
		"\u0002\u0000\u0000#\'\u0005\u0003\u0000\u0000$&\u0003\u0006\u0003\u0000"+
		"%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*,\u0003\b\u0004\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000.\u0005"+
		"\u0001\u0000\u0000\u0000/0\u0005\u000e\u0000\u000001\u0003\u000e\u0007"+
		"\u000015\u0005\u0005\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000089\u0005\u000f\u0000\u00009=\u0005\u0005\u0000\u0000:<\u0003\u0002"+
		"\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0005\u0013\u0000\u0000AB\u0005\u0006\u0000"+
		"\u0000BC\u0003\u000e\u0007\u0000CD\u0005\u0007\u0000\u0000D\u000b\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0010\u0000\u0000FG\u0005\b\u0000\u0000GH\u0005"+
		"\u0011\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0003\u000e\u0007\u0000"+
		"JK\u0005\u0002\u0000\u0000KL\u0005\u0007\u0000\u0000L\r\u0001\u0000\u0000"+
		"\u0000MR\u0003\u0010\b\u0000NO\u0007\u0000\u0000\u0000OQ\u0003\u0010\b"+
		"\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000f\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000U]\u0005\u0013\u0000\u0000V]\u0005\u0014\u0000"+
		"\u0000W]\u0005\u0012\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0003\u000e"+
		"\u0007\u0000Z[\u0005\u0002\u0000\u0000[]\u0001\u0000\u0000\u0000\\U\u0001"+
		"\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000"+
		"\\X\u0001\u0000\u0000\u0000]\u0011\u0001\u0000\u0000\u0000\b\u0015\u001d"+
		"\'+5=R\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}