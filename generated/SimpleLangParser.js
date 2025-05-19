// Generated from c:/Users/HP/OneDrive/Documentos/Mis Proyectos/ssl-antlr-49840/SimpleLang.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import SimpleLangListener from './SimpleLangListener.js';
import SimpleLangVisitor from './SimpleLangVisitor.js';

const serializedATN = [4,1,21,95,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,1,0,5,0,20,8,0,10,0,12,0,23,9,0,1,0,1,0,
1,1,1,1,1,1,3,1,30,8,1,1,2,1,2,1,2,1,2,1,2,1,2,5,2,38,8,2,10,2,12,2,41,9,
2,1,2,3,2,44,8,2,1,2,1,2,1,3,1,3,1,3,1,3,5,3,52,8,3,10,3,12,3,55,9,3,1,4,
1,4,1,4,5,4,60,8,4,10,4,12,4,63,9,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,
1,6,1,6,1,6,1,6,1,7,1,7,1,7,5,7,81,8,7,10,7,12,7,84,9,7,1,8,1,8,1,8,1,8,
1,8,1,8,1,8,3,8,93,8,8,1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,1,1,0,9,12,96,0,
21,1,0,0,0,2,29,1,0,0,0,4,31,1,0,0,0,6,47,1,0,0,0,8,56,1,0,0,0,10,64,1,0,
0,0,12,69,1,0,0,0,14,77,1,0,0,0,16,92,1,0,0,0,18,20,3,2,1,0,19,18,1,0,0,
0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,24,1,0,0,0,23,21,1,0,0,0,
24,25,5,0,0,1,25,1,1,0,0,0,26,30,3,4,2,0,27,30,3,10,5,0,28,30,3,12,6,0,29,
26,1,0,0,0,29,27,1,0,0,0,29,28,1,0,0,0,30,3,1,0,0,0,31,32,5,13,0,0,32,33,
5,1,0,0,33,34,3,14,7,0,34,35,5,2,0,0,35,39,5,3,0,0,36,38,3,6,3,0,37,36,1,
0,0,0,38,41,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,43,1,0,0,0,41,39,1,0,
0,0,42,44,3,8,4,0,43,42,1,0,0,0,43,44,1,0,0,0,44,45,1,0,0,0,45,46,5,4,0,
0,46,5,1,0,0,0,47,48,5,14,0,0,48,49,3,14,7,0,49,53,5,5,0,0,50,52,3,2,1,0,
51,50,1,0,0,0,52,55,1,0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,7,1,0,0,0,55,
53,1,0,0,0,56,57,5,15,0,0,57,61,5,5,0,0,58,60,3,2,1,0,59,58,1,0,0,0,60,63,
1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,9,1,0,0,0,63,61,1,0,0,0,64,65,5,19,
0,0,65,66,5,6,0,0,66,67,3,14,7,0,67,68,5,7,0,0,68,11,1,0,0,0,69,70,5,16,
0,0,70,71,5,8,0,0,71,72,5,17,0,0,72,73,5,1,0,0,73,74,3,14,7,0,74,75,5,2,
0,0,75,76,5,7,0,0,76,13,1,0,0,0,77,82,3,16,8,0,78,79,7,0,0,0,79,81,3,16,
8,0,80,78,1,0,0,0,81,84,1,0,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,15,1,0,0,
0,84,82,1,0,0,0,85,93,5,19,0,0,86,93,5,20,0,0,87,93,5,18,0,0,88,89,5,1,0,
0,89,90,3,14,7,0,90,91,5,2,0,0,91,93,1,0,0,0,92,85,1,0,0,0,92,86,1,0,0,0,
92,87,1,0,0,0,92,88,1,0,0,0,93,17,1,0,0,0,8,21,29,39,43,53,61,82,92];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class SimpleLangParser extends antlr4.Parser {

    static grammarFileName = "SimpleLang.g4";
    static literalNames = [ null, "'('", "')'", "'{'", "'}'", "':'", "'='", 
                            "';'", "'.'", "'+'", "'-'", "'*'", "'/'", "'switch'", 
                            "'case'", "'default'", "'console'", "'log'" ];
    static symbolicNames = [ null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
                             "COLON", "EQ", "SEMI", "DOT", "PLUS", "MINUS", 
                             "MULT", "DIV", "SWITCH", "CASE", "DEFAULT", 
                             "CONSOLE", "LOG", "StringLiteral", "Identifier", 
                             "Number", "WS" ];
    static ruleNames = [ "program", "statement", "switchStatement", "caseClause", 
                         "defaultClause", "assignmentStatement", "consoleStatement", 
                         "expression", "term" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = SimpleLangParser.ruleNames;
        this.literalNames = SimpleLangParser.literalNames;
        this.symbolicNames = SimpleLangParser.symbolicNames;
    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, SimpleLangParser.RULE_program);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 21;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 598016) !== 0)) {
	            this.state = 18;
	            this.statement();
	            this.state = 23;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 24;
	        this.match(SimpleLangParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, SimpleLangParser.RULE_statement);
	    try {
	        this.state = 29;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 26;
	            this.switchStatement();
	            break;
	        case 19:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 27;
	            this.assignmentStatement();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 28;
	            this.consoleStatement();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	switchStatement() {
	    let localctx = new SwitchStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, SimpleLangParser.RULE_switchStatement);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 31;
	        this.match(SimpleLangParser.SWITCH);
	        this.state = 32;
	        this.match(SimpleLangParser.LPAREN);
	        this.state = 33;
	        this.expression();
	        this.state = 34;
	        this.match(SimpleLangParser.RPAREN);
	        this.state = 35;
	        this.match(SimpleLangParser.LBRACE);
	        this.state = 39;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===14) {
	            this.state = 36;
	            this.caseClause();
	            this.state = 41;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 43;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===15) {
	            this.state = 42;
	            this.defaultClause();
	        }

	        this.state = 45;
	        this.match(SimpleLangParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	caseClause() {
	    let localctx = new CaseClauseContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, SimpleLangParser.RULE_caseClause);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this.match(SimpleLangParser.CASE);
	        this.state = 48;
	        this.expression();
	        this.state = 49;
	        this.match(SimpleLangParser.COLON);
	        this.state = 53;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 598016) !== 0)) {
	            this.state = 50;
	            this.statement();
	            this.state = 55;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	defaultClause() {
	    let localctx = new DefaultClauseContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, SimpleLangParser.RULE_defaultClause);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 56;
	        this.match(SimpleLangParser.DEFAULT);
	        this.state = 57;
	        this.match(SimpleLangParser.COLON);
	        this.state = 61;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 598016) !== 0)) {
	            this.state = 58;
	            this.statement();
	            this.state = 63;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	assignmentStatement() {
	    let localctx = new AssignmentStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, SimpleLangParser.RULE_assignmentStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 64;
	        this.match(SimpleLangParser.Identifier);
	        this.state = 65;
	        this.match(SimpleLangParser.EQ);
	        this.state = 66;
	        this.expression();
	        this.state = 67;
	        this.match(SimpleLangParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	consoleStatement() {
	    let localctx = new ConsoleStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, SimpleLangParser.RULE_consoleStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 69;
	        this.match(SimpleLangParser.CONSOLE);
	        this.state = 70;
	        this.match(SimpleLangParser.DOT);
	        this.state = 71;
	        this.match(SimpleLangParser.LOG);
	        this.state = 72;
	        this.match(SimpleLangParser.LPAREN);
	        this.state = 73;
	        this.expression();
	        this.state = 74;
	        this.match(SimpleLangParser.RPAREN);
	        this.state = 75;
	        this.match(SimpleLangParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expression() {
	    let localctx = new ExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, SimpleLangParser.RULE_expression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 77;
	        this.term();
	        this.state = 82;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 7680) !== 0)) {
	            this.state = 78;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 7680) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 79;
	            this.term();
	            this.state = 84;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	term() {
	    let localctx = new TermContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, SimpleLangParser.RULE_term);
	    try {
	        this.state = 92;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 19:
	            localctx = new IdentifierContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 85;
	            this.match(SimpleLangParser.Identifier);
	            break;
	        case 20:
	            localctx = new NumberContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 86;
	            this.match(SimpleLangParser.Number);
	            break;
	        case 18:
	            localctx = new StringLiteralContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 87;
	            this.match(SimpleLangParser.StringLiteral);
	            break;
	        case 1:
	            localctx = new ParensContext(this, localctx);
	            this.enterOuterAlt(localctx, 4);
	            this.state = 88;
	            this.match(SimpleLangParser.LPAREN);
	            this.state = 89;
	            this.expression();
	            this.state = 90;
	            this.match(SimpleLangParser.RPAREN);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

SimpleLangParser.EOF = antlr4.Token.EOF;
SimpleLangParser.LPAREN = 1;
SimpleLangParser.RPAREN = 2;
SimpleLangParser.LBRACE = 3;
SimpleLangParser.RBRACE = 4;
SimpleLangParser.COLON = 5;
SimpleLangParser.EQ = 6;
SimpleLangParser.SEMI = 7;
SimpleLangParser.DOT = 8;
SimpleLangParser.PLUS = 9;
SimpleLangParser.MINUS = 10;
SimpleLangParser.MULT = 11;
SimpleLangParser.DIV = 12;
SimpleLangParser.SWITCH = 13;
SimpleLangParser.CASE = 14;
SimpleLangParser.DEFAULT = 15;
SimpleLangParser.CONSOLE = 16;
SimpleLangParser.LOG = 17;
SimpleLangParser.StringLiteral = 18;
SimpleLangParser.Identifier = 19;
SimpleLangParser.Number = 20;
SimpleLangParser.WS = 21;

SimpleLangParser.RULE_program = 0;
SimpleLangParser.RULE_statement = 1;
SimpleLangParser.RULE_switchStatement = 2;
SimpleLangParser.RULE_caseClause = 3;
SimpleLangParser.RULE_defaultClause = 4;
SimpleLangParser.RULE_assignmentStatement = 5;
SimpleLangParser.RULE_consoleStatement = 6;
SimpleLangParser.RULE_expression = 7;
SimpleLangParser.RULE_term = 8;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_program;
    }

	EOF() {
	    return this.getToken(SimpleLangParser.EOF, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitProgram(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_statement;
    }

	switchStatement() {
	    return this.getTypedRuleContext(SwitchStatementContext,0);
	};

	assignmentStatement() {
	    return this.getTypedRuleContext(AssignmentStatementContext,0);
	};

	consoleStatement() {
	    return this.getTypedRuleContext(ConsoleStatementContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SwitchStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_switchStatement;
    }

	SWITCH() {
	    return this.getToken(SimpleLangParser.SWITCH, 0);
	};

	LPAREN() {
	    return this.getToken(SimpleLangParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(SimpleLangParser.RPAREN, 0);
	};

	LBRACE() {
	    return this.getToken(SimpleLangParser.LBRACE, 0);
	};

	RBRACE() {
	    return this.getToken(SimpleLangParser.RBRACE, 0);
	};

	caseClause = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CaseClauseContext);
	    } else {
	        return this.getTypedRuleContext(CaseClauseContext,i);
	    }
	};

	defaultClause() {
	    return this.getTypedRuleContext(DefaultClauseContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterSwitchStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitSwitchStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitSwitchStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CaseClauseContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_caseClause;
    }

	CASE() {
	    return this.getToken(SimpleLangParser.CASE, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	COLON() {
	    return this.getToken(SimpleLangParser.COLON, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterCaseClause(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitCaseClause(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitCaseClause(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DefaultClauseContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_defaultClause;
    }

	DEFAULT() {
	    return this.getToken(SimpleLangParser.DEFAULT, 0);
	};

	COLON() {
	    return this.getToken(SimpleLangParser.COLON, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterDefaultClause(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitDefaultClause(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitDefaultClause(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AssignmentStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_assignmentStatement;
    }

	Identifier() {
	    return this.getToken(SimpleLangParser.Identifier, 0);
	};

	EQ() {
	    return this.getToken(SimpleLangParser.EQ, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	SEMI() {
	    return this.getToken(SimpleLangParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterAssignmentStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitAssignmentStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitAssignmentStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConsoleStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_consoleStatement;
    }

	CONSOLE() {
	    return this.getToken(SimpleLangParser.CONSOLE, 0);
	};

	DOT() {
	    return this.getToken(SimpleLangParser.DOT, 0);
	};

	LOG() {
	    return this.getToken(SimpleLangParser.LOG, 0);
	};

	LPAREN() {
	    return this.getToken(SimpleLangParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(SimpleLangParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(SimpleLangParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterConsoleStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitConsoleStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitConsoleStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_expression;
    }

	term = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TermContext);
	    } else {
	        return this.getTypedRuleContext(TermContext,i);
	    }
	};

	PLUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SimpleLangParser.PLUS);
	    } else {
	        return this.getToken(SimpleLangParser.PLUS, i);
	    }
	};


	MINUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SimpleLangParser.MINUS);
	    } else {
	        return this.getToken(SimpleLangParser.MINUS, i);
	    }
	};


	MULT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SimpleLangParser.MULT);
	    } else {
	        return this.getToken(SimpleLangParser.MULT, i);
	    }
	};


	DIV = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SimpleLangParser.DIV);
	    } else {
	        return this.getToken(SimpleLangParser.DIV, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitExpression(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitExpression(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TermContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_term;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class IdentifierContext extends TermContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	Identifier() {
	    return this.getToken(SimpleLangParser.Identifier, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterIdentifier(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitIdentifier(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitIdentifier(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

SimpleLangParser.IdentifierContext = IdentifierContext;

class NumberContext extends TermContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	Number() {
	    return this.getToken(SimpleLangParser.Number, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterNumber(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitNumber(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitNumber(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

SimpleLangParser.NumberContext = NumberContext;

class StringLiteralContext extends TermContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	StringLiteral() {
	    return this.getToken(SimpleLangParser.StringLiteral, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterStringLiteral(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitStringLiteral(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitStringLiteral(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

SimpleLangParser.StringLiteralContext = StringLiteralContext;

class ParensContext extends TermContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	LPAREN() {
	    return this.getToken(SimpleLangParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(SimpleLangParser.RPAREN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterParens(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitParens(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitParens(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

SimpleLangParser.ParensContext = ParensContext;


SimpleLangParser.ProgramContext = ProgramContext; 
SimpleLangParser.StatementContext = StatementContext; 
SimpleLangParser.SwitchStatementContext = SwitchStatementContext; 
SimpleLangParser.CaseClauseContext = CaseClauseContext; 
SimpleLangParser.DefaultClauseContext = DefaultClauseContext; 
SimpleLangParser.AssignmentStatementContext = AssignmentStatementContext; 
SimpleLangParser.ConsoleStatementContext = ConsoleStatementContext; 
SimpleLangParser.ExpressionContext = ExpressionContext; 
SimpleLangParser.TermContext = TermContext; 
