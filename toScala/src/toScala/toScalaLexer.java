// Generated from E:\Marti\cours\Ann�e 2\info\structure et execution des langages de programmation\tp1000\tmp\toScala.g4 by ANTLR 4.0
package toScala;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class toScalaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ID=13, CLASSID=14, INTLIT=15, BOOLIT=16, STRLIT=17, 
		OP2=18, MINUS=19, NOT=20, COMMENT=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'this'", "'{'", "'null'", "')'", "'.'", "','", "'('", "':'", "'='", "'class'", 
		"'}'", "'?'", "ID", "CLASSID", "INTLIT", "BOOLIT", "STRLIT", "OP2", "'-'", 
		"'!'", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "CLASSID", "INTLIT", "BOOLIT", "STRLIT", 
		"ESC", "OP2", "MINUS", "NOT", "COMMENT", "WS"
	};


	public toScalaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "toScala.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\30\u00aa\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16V\n\16\f\16\16\16Y\13\16\3\17\3\17\7"+
		"\17]\n\17\f\17\16\17`\13\17\3\20\3\20\6\20d\n\20\r\20\16\20e\5\20h\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21s\n\21\3\22\3\22\3\22"+
		"\7\22x\n\22\f\22\16\22{\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0091"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u009b\n\27\f\27\16"+
		"\27\u009e\13\27\3\27\5\27\u00a1\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\4y\u009c\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'"+
		"\24\1)\25\1+\26\1-\27\2/\30\3\3\2\n\3c|\5\62;C\\c|\3C\\\5\62;C\\c|\3\62"+
		";\b$$^^ddppttvv\4,-\61\61\5\13\f\17\17\"\"\u00b9\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\78\3"+
		"\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3"+
		"\2\2\2\25I\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35Z\3\2\2\2\37"+
		"g\3\2\2\2!r\3\2\2\2#t\3\2\2\2%~\3\2\2\2\'\u0090\3\2\2\2)\u0092\3\2\2\2"+
		"+\u0094\3\2\2\2-\u0096\3\2\2\2/\u00a6\3\2\2\2\61\62\7v\2\2\62\63\7j\2"+
		"\2\63\64\7k\2\2\64\65\7u\2\2\65\4\3\2\2\2\66\67\7}\2\2\67\6\3\2\2\289"+
		"\7p\2\29:\7w\2\2:;\7n\2\2;<\7n\2\2<\b\3\2\2\2=>\7+\2\2>\n\3\2\2\2?@\7"+
		"\60\2\2@\f\3\2\2\2AB\7.\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7<\2\2"+
		"F\22\3\2\2\2GH\7?\2\2H\24\3\2\2\2IJ\7e\2\2JK\7n\2\2KL\7c\2\2LM\7u\2\2"+
		"MN\7u\2\2N\26\3\2\2\2OP\7\177\2\2P\30\3\2\2\2QR\7A\2\2R\32\3\2\2\2SW\t"+
		"\2\2\2TV\t\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34\3\2\2\2Y"+
		"W\3\2\2\2Z^\t\4\2\2[]\t\5\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_\36\3\2\2\2`^\3\2\2\2ah\7\62\2\2bd\t\6\2\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2gc\3\2\2\2h \3\2\2\2ij\7v\2\2jk\7"+
		"t\2\2kl\7w\2\2ls\7g\2\2mn\7h\2\2no\7c\2\2op\7n\2\2pq\7u\2\2qs\7g\2\2r"+
		"i\3\2\2\2rm\3\2\2\2s\"\3\2\2\2ty\7$\2\2ux\5%\23\2vx\13\2\2\2wu\3\2\2\2"+
		"wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2\2"+
		"}$\3\2\2\2~\177\7^\2\2\177\u0080\t\7\2\2\u0080&\3\2\2\2\u0081\u0091\t"+
		"\b\2\2\u0082\u0083\7(\2\2\u0083\u0091\7(\2\2\u0084\u0085\7~\2\2\u0085"+
		"\u0091\7~\2\2\u0086\u0087\7?\2\2\u0087\u0091\7?\2\2\u0088\u0089\7#\2\2"+
		"\u0089\u0091\7?\2\2\u008a\u0091\7@\2\2\u008b\u008c\7@\2\2\u008c\u0091"+
		"\7?\2\2\u008d\u0091\7>\2\2\u008e\u008f\7>\2\2\u008f\u0091\7?\2\2\u0090"+
		"\u0081\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0086\3\2"+
		"\2\2\u0090\u0088\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0091(\3\2\2\2\u0092\u0093\7/\2\2\u0093"+
		"*\3\2\2\2\u0094\u0095\7#\2\2\u0095,\3\2\2\2\u0096\u0097\7\61\2\2\u0097"+
		"\u0098\7\61\2\2\u0098\u009c\3\2\2\2\u0099\u009b\13\2\2\2\u009a\u0099\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\27\2\2\u00a5.\3\2\2\2\u00a6\u00a7\t\t\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\30\3\2\u00a9\60\3\2\2\2\r\2W^egrwy"+
		"\u0090\u009c\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}