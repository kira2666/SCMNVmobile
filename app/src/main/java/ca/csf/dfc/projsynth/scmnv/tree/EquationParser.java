// $ANTLR 3.5.2 C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g 2015-06-22 12:51:20

  package ca.csf.dfc.projsynth.scmnv.tree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class EquationParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSOLUTE", "COMBINATIONS", "DOUBLE", 
		"EBRACKET", "EFENCE", "FACTO", "FRAC", "FUNCTION", "HAT", "IDENT", "INTEGER", 
		"LOGICOPERATOR", "MULT", "NEGATION", "NUMBER", "OULINE", "PLUSMINUS", 
		"RELATIONOPERATOR", "SBRACKET", "SFENCE", "SPECIDENT", "SQRT", "SUM", 
		"TRASH", "UNARYMINUS", "UNARYPLUS", "UNDERSCORE", "UNKNOWNTOKENS", "WS", 
		"ABSOP", "UNARYSUB"
	};
	public static final int EOF=-1;
	public static final int ABSOLUTE=4;
	public static final int COMBINATIONS=5;
	public static final int DOUBLE=6;
	public static final int EBRACKET=7;
	public static final int EFENCE=8;
	public static final int FACTO=9;
	public static final int FRAC=10;
	public static final int FUNCTION=11;
	public static final int HAT=12;
	public static final int IDENT=13;
	public static final int INTEGER=14;
	public static final int LOGICOPERATOR=15;
	public static final int MULT=16;
	public static final int NEGATION=17;
	public static final int NUMBER=18;
	public static final int OULINE=19;
	public static final int PLUSMINUS=20;
	public static final int RELATIONOPERATOR=21;
	public static final int SBRACKET=22;
	public static final int SFENCE=23;
	public static final int SPECIDENT=24;
	public static final int SQRT=25;
	public static final int SUM=26;
	public static final int TRASH=27;
	public static final int UNARYMINUS=28;
	public static final int UNARYPLUS=29;
	public static final int UNDERSCORE=30;
	public static final int UNKNOWNTOKENS=31;
	public static final int WS=32;
	public static final int ABSOP=33;
	public static final int UNARYSUB=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public EquationParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public EquationParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return EquationParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g"; }


	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) 
	    {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        throw new RuntimeException(hdr + ":" + msg);
	    }


	public static class doIt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doIt"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:32:1: doIt : expression ;
	public final doIt_return doIt() throws RecognitionException {
		doIt_return retval = new doIt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression1 =null;


		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:33:5: ( expression )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:33:7: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_doIt77);
			expression1=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doIt"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:36:1: term : ( NUMBER | IDENT | SPECIDENT | ABSOLUTE ^ term ABSOLUTE !| OULINE SFENCE expression EFENCE -> expression | SFENCE ! expression EFENCE !| COMBINATIONS ^ SFENCE ! expression EFENCE ! SFENCE ! expression EFENCE !);
	public final term_return term() throws RecognitionException {
		term_return retval = new term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER2=null;
		Token IDENT3=null;
		Token SPECIDENT4=null;
		Token ABSOLUTE5=null;
		Token ABSOLUTE7=null;
		Token OULINE8=null;
		Token SFENCE9=null;
		Token EFENCE11=null;
		Token SFENCE12=null;
		Token EFENCE14=null;
		Token COMBINATIONS15=null;
		Token SFENCE16=null;
		Token EFENCE18=null;
		Token SFENCE19=null;
		Token EFENCE21=null;
		ParserRuleReturnScope term6 =null;
		ParserRuleReturnScope expression10 =null;
		ParserRuleReturnScope expression13 =null;
		ParserRuleReturnScope expression17 =null;
		ParserRuleReturnScope expression20 =null;

		Object NUMBER2_tree=null;
		Object IDENT3_tree=null;
		Object SPECIDENT4_tree=null;
		Object ABSOLUTE5_tree=null;
		Object ABSOLUTE7_tree=null;
		Object OULINE8_tree=null;
		Object SFENCE9_tree=null;
		Object EFENCE11_tree=null;
		Object SFENCE12_tree=null;
		Object EFENCE14_tree=null;
		Object COMBINATIONS15_tree=null;
		Object SFENCE16_tree=null;
		Object EFENCE18_tree=null;
		Object SFENCE19_tree=null;
		Object EFENCE21_tree=null;
		RewriteRuleTokenStream stream_EFENCE=new RewriteRuleTokenStream(adaptor,"token EFENCE");
		RewriteRuleTokenStream stream_SFENCE=new RewriteRuleTokenStream(adaptor,"token SFENCE");
		RewriteRuleTokenStream stream_OULINE=new RewriteRuleTokenStream(adaptor,"token OULINE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:37:5: ( NUMBER | IDENT | SPECIDENT | ABSOLUTE ^ term ABSOLUTE !| OULINE SFENCE expression EFENCE -> expression | SFENCE ! expression EFENCE !| COMBINATIONS ^ SFENCE ! expression EFENCE ! SFENCE ! expression EFENCE !)
			int alt1=7;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt1=1;
				}
				break;
			case IDENT:
				{
				alt1=2;
				}
				break;
			case SPECIDENT:
				{
				alt1=3;
				}
				break;
			case ABSOLUTE:
				{
				alt1=4;
				}
				break;
			case OULINE:
				{
				alt1=5;
				}
				break;
			case SFENCE:
				{
				alt1=6;
				}
				break;
			case COMBINATIONS:
				{
				alt1=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:37:7: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term94); 
					NUMBER2_tree = (Object)adaptor.create(NUMBER2);
					adaptor.addChild(root_0, NUMBER2_tree);

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:38:7: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_term102); 
					IDENT3_tree = (Object)adaptor.create(IDENT3);
					adaptor.addChild(root_0, IDENT3_tree);

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:39:7: SPECIDENT
					{
					root_0 = (Object)adaptor.nil();


					SPECIDENT4=(Token)match(input,SPECIDENT,FOLLOW_SPECIDENT_in_term110); 
					SPECIDENT4_tree = (Object)adaptor.create(SPECIDENT4);
					adaptor.addChild(root_0, SPECIDENT4_tree);

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:40:7: ABSOLUTE ^ term ABSOLUTE !
					{
					root_0 = (Object)adaptor.nil();


					ABSOLUTE5=(Token)match(input,ABSOLUTE,FOLLOW_ABSOLUTE_in_term118); 
					ABSOLUTE5_tree = (Object)adaptor.create(ABSOLUTE5);
					root_0 = (Object)adaptor.becomeRoot(ABSOLUTE5_tree, root_0);

					pushFollow(FOLLOW_term_in_term121);
					term6=term();
					state._fsp--;

					adaptor.addChild(root_0, term6.getTree());

					ABSOLUTE7=(Token)match(input,ABSOLUTE,FOLLOW_ABSOLUTE_in_term123); 
					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:41:7: OULINE SFENCE expression EFENCE
					{
					OULINE8=(Token)match(input,OULINE,FOLLOW_OULINE_in_term132);  
					stream_OULINE.add(OULINE8);

					SFENCE9=(Token)match(input,SFENCE,FOLLOW_SFENCE_in_term134);  
					stream_SFENCE.add(SFENCE9);

					pushFollow(FOLLOW_expression_in_term136);
					expression10=expression();
					state._fsp--;

					stream_expression.add(expression10.getTree());
					EFENCE11=(Token)match(input,EFENCE,FOLLOW_EFENCE_in_term138);  
					stream_EFENCE.add(EFENCE11);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 41:39: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:42:7: SFENCE ! expression EFENCE !
					{
					root_0 = (Object)adaptor.nil();


					SFENCE12=(Token)match(input,SFENCE,FOLLOW_SFENCE_in_term150); 
					pushFollow(FOLLOW_expression_in_term153);
					expression13=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression13.getTree());

					EFENCE14=(Token)match(input,EFENCE,FOLLOW_EFENCE_in_term155); 
					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:43:7: COMBINATIONS ^ SFENCE ! expression EFENCE ! SFENCE ! expression EFENCE !
					{
					root_0 = (Object)adaptor.nil();


					COMBINATIONS15=(Token)match(input,COMBINATIONS,FOLLOW_COMBINATIONS_in_term164); 
					COMBINATIONS15_tree = (Object)adaptor.create(COMBINATIONS15);
					root_0 = (Object)adaptor.becomeRoot(COMBINATIONS15_tree, root_0);

					SFENCE16=(Token)match(input,SFENCE,FOLLOW_SFENCE_in_term167); 
					pushFollow(FOLLOW_expression_in_term170);
					expression17=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression17.getTree());

					EFENCE18=(Token)match(input,EFENCE,FOLLOW_EFENCE_in_term172); 
					SFENCE19=(Token)match(input,SFENCE,FOLLOW_SFENCE_in_term175); 
					pushFollow(FOLLOW_expression_in_term178);
					expression20=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression20.getTree());

					EFENCE21=(Token)match(input,EFENCE,FOLLOW_EFENCE_in_term180); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class indice_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indice"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:46:1: indice : var= term ( UNDERSCORE term )? -> $var;
	public final indice_return indice() throws RecognitionException {
		indice_return retval = new indice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UNDERSCORE22=null;
		ParserRuleReturnScope var =null;
		ParserRuleReturnScope term23 =null;

		Object UNDERSCORE22_tree=null;
		RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:47:5: (var= term ( UNDERSCORE term )? -> $var)
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:47:7: var= term ( UNDERSCORE term )?
			{
			pushFollow(FOLLOW_term_in_indice201);
			var=term();
			state._fsp--;

			stream_term.add(var.getTree());
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:47:16: ( UNDERSCORE term )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==UNDERSCORE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:47:17: UNDERSCORE term
					{
					UNDERSCORE22=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_indice204);  
					stream_UNDERSCORE.add(UNDERSCORE22);

					pushFollow(FOLLOW_term_in_indice206);
					term23=term();
					state._fsp--;

					stream_term.add(term23.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: var
			// token labels: 
			// rule labels: retval, var
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var",var!=null?var.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:35: -> $var
			{
				adaptor.addChild(root_0, stream_var.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indice"


	public static class funcexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funcexp"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:50:1: funcexp : HAT ^ term ;
	public final funcexp_return funcexp() throws RecognitionException {
		funcexp_return retval = new funcexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token HAT24=null;
		ParserRuleReturnScope term25 =null;

		Object HAT24_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:51:5: ( HAT ^ term )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:51:7: HAT ^ term
			{
			root_0 = (Object)adaptor.nil();


			HAT24=(Token)match(input,HAT,FOLLOW_HAT_in_funcexp233); 
			HAT24_tree = (Object)adaptor.create(HAT24);
			root_0 = (Object)adaptor.becomeRoot(HAT24_tree, root_0);

			pushFollow(FOLLOW_term_in_funcexp236);
			term25=term();
			state._fsp--;

			adaptor.addChild(root_0, term25.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcexp"


	public static class funcind_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funcind"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:54:1: funcind : UNDERSCORE ^ term ;
	public final funcind_return funcind() throws RecognitionException {
		funcind_return retval = new funcind_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UNDERSCORE26=null;
		ParserRuleReturnScope term27 =null;

		Object UNDERSCORE26_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:55:5: ( UNDERSCORE ^ term )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:55:7: UNDERSCORE ^ term
			{
			root_0 = (Object)adaptor.nil();


			UNDERSCORE26=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_funcind253); 
			UNDERSCORE26_tree = (Object)adaptor.create(UNDERSCORE26);
			root_0 = (Object)adaptor.becomeRoot(UNDERSCORE26_tree, root_0);

			pushFollow(FOLLOW_term_in_funcind256);
			term27=term();
			state._fsp--;

			adaptor.addChild(root_0, term27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcind"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:58:1: function : ( FUNCTION ^ ( funcexp | funcind )* )? indice ;
	public final function_return function() throws RecognitionException {
		function_return retval = new function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION28=null;
		ParserRuleReturnScope funcexp29 =null;
		ParserRuleReturnScope funcind30 =null;
		ParserRuleReturnScope indice31 =null;

		Object FUNCTION28_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:5: ( ( FUNCTION ^ ( funcexp | funcind )* )? indice )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:7: ( FUNCTION ^ ( funcexp | funcind )* )? indice
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:7: ( FUNCTION ^ ( funcexp | funcind )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FUNCTION) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:8: FUNCTION ^ ( funcexp | funcind )*
					{
					FUNCTION28=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function274); 
					FUNCTION28_tree = (Object)adaptor.create(FUNCTION28);
					root_0 = (Object)adaptor.becomeRoot(FUNCTION28_tree, root_0);

					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:18: ( funcexp | funcind )*
					loop3:
					while (true) {
						int alt3=3;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==HAT) ) {
							alt3=1;
						}
						else if ( (LA3_0==UNDERSCORE) ) {
							alt3=2;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:19: funcexp
							{
							pushFollow(FOLLOW_funcexp_in_function278);
							funcexp29=funcexp();
							state._fsp--;

							adaptor.addChild(root_0, funcexp29.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:59:29: funcind
							{
							pushFollow(FOLLOW_funcind_in_function282);
							funcind30=funcind();
							state._fsp--;

							adaptor.addChild(root_0, funcind30.getTree());

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			pushFollow(FOLLOW_indice_in_function289);
			indice31=indice();
			state._fsp--;

			adaptor.addChild(root_0, indice31.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class exponent_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exponent"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:62:1: exponent : function ( HAT ^ function )* ;
	public final exponent_return exponent() throws RecognitionException {
		exponent_return retval = new exponent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token HAT33=null;
		ParserRuleReturnScope function32 =null;
		ParserRuleReturnScope function34 =null;

		Object HAT33_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:63:5: ( function ( HAT ^ function )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:63:7: function ( HAT ^ function )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_exponent310);
			function32=function();
			state._fsp--;

			adaptor.addChild(root_0, function32.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:63:16: ( HAT ^ function )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==HAT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:63:17: HAT ^ function
					{
					HAT33=(Token)match(input,HAT,FOLLOW_HAT_in_exponent313); 
					HAT33_tree = (Object)adaptor.create(HAT33);
					root_0 = (Object)adaptor.becomeRoot(HAT33_tree, root_0);

					pushFollow(FOLLOW_function_in_exponent316);
					function34=function();
					state._fsp--;

					adaptor.addChild(root_0, function34.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exponent"


	public static class factorielle_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factorielle"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:66:1: factorielle : exponent ( FACTO ^)? ;
	public final factorielle_return factorielle() throws RecognitionException {
		factorielle_return retval = new factorielle_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FACTO36=null;
		ParserRuleReturnScope exponent35 =null;

		Object FACTO36_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:67:5: ( exponent ( FACTO ^)? )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:67:7: exponent ( FACTO ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exponent_in_factorielle335);
			exponent35=exponent();
			state._fsp--;

			adaptor.addChild(root_0, exponent35.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:67:21: ( FACTO ^)?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==FACTO) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:67:21: FACTO ^
					{
					FACTO36=(Token)match(input,FACTO,FOLLOW_FACTO_in_factorielle337); 
					FACTO36_tree = (Object)adaptor.create(FACTO36);
					root_0 = (Object)adaptor.becomeRoot(FACTO36_tree, root_0);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factorielle"


	public static class invisibleTimes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "invisibleTimes"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:70:1: invisibleTimes : ( factorielle -> factorielle ) (variable= factorielle -> ^( MULT[\"*\"] $invisibleTimes $variable) )* ;
	public final invisibleTimes_return invisibleTimes() throws RecognitionException {
		invisibleTimes_return retval = new invisibleTimes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope variable =null;
		ParserRuleReturnScope factorielle37 =null;

		RewriteRuleSubtreeStream stream_factorielle=new RewriteRuleSubtreeStream(adaptor,"rule factorielle");

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:5: ( ( factorielle -> factorielle ) (variable= factorielle -> ^( MULT[\"*\"] $invisibleTimes $variable) )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:7: ( factorielle -> factorielle ) (variable= factorielle -> ^( MULT[\"*\"] $invisibleTimes $variable) )*
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:7: ( factorielle -> factorielle )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:8: factorielle
			{
			pushFollow(FOLLOW_factorielle_in_invisibleTimes361);
			factorielle37=factorielle();
			state._fsp--;

			stream_factorielle.add(factorielle37.getTree());
			// AST REWRITE
			// elements: factorielle
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:20: -> factorielle
			{
				adaptor.addChild(root_0, stream_factorielle.nextTree());
			}


			retval.tree = root_0;

			}

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:36: (variable= factorielle -> ^( MULT[\"*\"] $invisibleTimes $variable) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ABSOLUTE && LA7_0 <= COMBINATIONS)||LA7_0==FUNCTION||LA7_0==IDENT||(LA7_0 >= NUMBER && LA7_0 <= OULINE)||(LA7_0 >= SFENCE && LA7_0 <= SPECIDENT)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:38: variable= factorielle
					{
					pushFollow(FOLLOW_factorielle_in_invisibleTimes372);
					variable=factorielle();
					state._fsp--;

					stream_factorielle.add(variable.getTree());
					// AST REWRITE
					// elements: variable, invisibleTimes
					// token labels: 
					// rule labels: retval, variable
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable",variable!=null?variable.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 71:59: -> ^( MULT[\"*\"] $invisibleTimes $variable)
					{
						// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:71:62: ^( MULT[\"*\"] $invisibleTimes $variable)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULT, "*"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_variable.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invisibleTimes"


	public static class negation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:74:1: negation : ( NEGATION ^)* invisibleTimes ;
	public final negation_return negation() throws RecognitionException {
		negation_return retval = new negation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEGATION38=null;
		ParserRuleReturnScope invisibleTimes39 =null;

		Object NEGATION38_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:75:5: ( ( NEGATION ^)* invisibleTimes )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:75:7: ( NEGATION ^)* invisibleTimes
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:75:15: ( NEGATION ^)*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==NEGATION) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:75:15: NEGATION ^
					{
					NEGATION38=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_negation404); 
					NEGATION38_tree = (Object)adaptor.create(NEGATION38);
					root_0 = (Object)adaptor.becomeRoot(NEGATION38_tree, root_0);

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_invisibleTimes_in_negation408);
			invisibleTimes39=invisibleTimes();
			state._fsp--;

			adaptor.addChild(root_0, invisibleTimes39.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negation"


	public static class sqrt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sqrt"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:78:1: sqrt : ( SQRT ^ term | SQRT ^ SBRACKET ! expression EBRACKET ! term | negation );
	public final sqrt_return sqrt() throws RecognitionException {
		sqrt_return retval = new sqrt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SQRT40=null;
		Token SQRT42=null;
		Token SBRACKET43=null;
		Token EBRACKET45=null;
		ParserRuleReturnScope term41 =null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope term46 =null;
		ParserRuleReturnScope negation47 =null;

		Object SQRT40_tree=null;
		Object SQRT42_tree=null;
		Object SBRACKET43_tree=null;
		Object EBRACKET45_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:79:5: ( SQRT ^ term | SQRT ^ SBRACKET ! expression EBRACKET ! term | negation )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==SQRT) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==SBRACKET) ) {
					alt9=2;
				}
				else if ( ((LA9_1 >= ABSOLUTE && LA9_1 <= COMBINATIONS)||LA9_1==IDENT||(LA9_1 >= NUMBER && LA9_1 <= OULINE)||(LA9_1 >= SFENCE && LA9_1 <= SPECIDENT)) ) {
					alt9=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA9_0 >= ABSOLUTE && LA9_0 <= COMBINATIONS)||LA9_0==FUNCTION||LA9_0==IDENT||(LA9_0 >= NEGATION && LA9_0 <= OULINE)||(LA9_0 >= SFENCE && LA9_0 <= SPECIDENT)) ) {
				alt9=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:79:7: SQRT ^ term
					{
					root_0 = (Object)adaptor.nil();


					SQRT40=(Token)match(input,SQRT,FOLLOW_SQRT_in_sqrt425); 
					SQRT40_tree = (Object)adaptor.create(SQRT40);
					root_0 = (Object)adaptor.becomeRoot(SQRT40_tree, root_0);

					pushFollow(FOLLOW_term_in_sqrt428);
					term41=term();
					state._fsp--;

					adaptor.addChild(root_0, term41.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:80:7: SQRT ^ SBRACKET ! expression EBRACKET ! term
					{
					root_0 = (Object)adaptor.nil();


					SQRT42=(Token)match(input,SQRT,FOLLOW_SQRT_in_sqrt436); 
					SQRT42_tree = (Object)adaptor.create(SQRT42);
					root_0 = (Object)adaptor.becomeRoot(SQRT42_tree, root_0);

					SBRACKET43=(Token)match(input,SBRACKET,FOLLOW_SBRACKET_in_sqrt439); 
					pushFollow(FOLLOW_expression_in_sqrt442);
					expression44=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression44.getTree());

					EBRACKET45=(Token)match(input,EBRACKET,FOLLOW_EBRACKET_in_sqrt445); 
					pushFollow(FOLLOW_term_in_sqrt448);
					term46=term();
					state._fsp--;

					adaptor.addChild(root_0, term46.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:81:7: negation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_negation_in_sqrt456);
					negation47=negation();
					state._fsp--;

					adaptor.addChild(root_0, negation47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sqrt"


	public static class frac_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "frac"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:84:1: frac : ( FRAC ^ term term | sqrt );
	public final frac_return frac() throws RecognitionException {
		frac_return retval = new frac_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FRAC48=null;
		ParserRuleReturnScope term49 =null;
		ParserRuleReturnScope term50 =null;
		ParserRuleReturnScope sqrt51 =null;

		Object FRAC48_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:85:5: ( FRAC ^ term term | sqrt )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FRAC) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= ABSOLUTE && LA10_0 <= COMBINATIONS)||LA10_0==FUNCTION||LA10_0==IDENT||(LA10_0 >= NEGATION && LA10_0 <= OULINE)||(LA10_0 >= SFENCE && LA10_0 <= SQRT)) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:85:7: FRAC ^ term term
					{
					root_0 = (Object)adaptor.nil();


					FRAC48=(Token)match(input,FRAC,FOLLOW_FRAC_in_frac477); 
					FRAC48_tree = (Object)adaptor.create(FRAC48);
					root_0 = (Object)adaptor.becomeRoot(FRAC48_tree, root_0);

					pushFollow(FOLLOW_term_in_frac480);
					term49=term();
					state._fsp--;

					adaptor.addChild(root_0, term49.getTree());

					pushFollow(FOLLOW_term_in_frac482);
					term50=term();
					state._fsp--;

					adaptor.addChild(root_0, term50.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:86:7: sqrt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sqrt_in_frac490);
					sqrt51=sqrt();
					state._fsp--;

					adaptor.addChild(root_0, sqrt51.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "frac"


	public static class unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:89:1: unary : ( UNARYMINUS frac -> ^( UNARYSUB frac ) | frac );
	public final unary_return unary() throws RecognitionException {
		unary_return retval = new unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UNARYMINUS52=null;
		ParserRuleReturnScope frac53 =null;
		ParserRuleReturnScope frac54 =null;

		Object UNARYMINUS52_tree=null;
		RewriteRuleTokenStream stream_UNARYMINUS=new RewriteRuleTokenStream(adaptor,"token UNARYMINUS");
		RewriteRuleSubtreeStream stream_frac=new RewriteRuleSubtreeStream(adaptor,"rule frac");

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:90:5: ( UNARYMINUS frac -> ^( UNARYSUB frac ) | frac )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==UNARYMINUS) ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= ABSOLUTE && LA11_0 <= COMBINATIONS)||(LA11_0 >= FRAC && LA11_0 <= FUNCTION)||LA11_0==IDENT||(LA11_0 >= NEGATION && LA11_0 <= OULINE)||(LA11_0 >= SFENCE && LA11_0 <= SQRT)) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:90:7: UNARYMINUS frac
					{
					UNARYMINUS52=(Token)match(input,UNARYMINUS,FOLLOW_UNARYMINUS_in_unary511);  
					stream_UNARYMINUS.add(UNARYMINUS52);

					pushFollow(FOLLOW_frac_in_unary513);
					frac53=frac();
					state._fsp--;

					stream_frac.add(frac53.getTree());
					// AST REWRITE
					// elements: frac
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:23: -> ^( UNARYSUB frac )
					{
						// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:90:26: ^( UNARYSUB frac )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYSUB, "UNARYSUB"), root_1);
						adaptor.addChild(root_1, stream_frac.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:91:7: frac
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_frac_in_unary529);
					frac54=frac();
					state._fsp--;

					adaptor.addChild(root_0, frac54.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:94:1: mult : unary ( MULT ^ unary )* ;
	public final mult_return mult() throws RecognitionException {
		mult_return retval = new mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT56=null;
		ParserRuleReturnScope unary55 =null;
		ParserRuleReturnScope unary57 =null;

		Object MULT56_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:95:5: ( unary ( MULT ^ unary )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:95:6: unary ( MULT ^ unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult549);
			unary55=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary55.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:95:12: ( MULT ^ unary )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MULT) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:95:13: MULT ^ unary
					{
					MULT56=(Token)match(input,MULT,FOLLOW_MULT_in_mult552); 
					MULT56_tree = (Object)adaptor.create(MULT56);
					root_0 = (Object)adaptor.becomeRoot(MULT56_tree, root_0);

					pushFollow(FOLLOW_unary_in_mult555);
					unary57=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary57.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class summation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "summation"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:98:1: summation : ( SUM ^ ( ( UNDERSCORE ! term ) | ( HAT ! term ) )* )? mult ;
	public final summation_return summation() throws RecognitionException {
		summation_return retval = new summation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SUM58=null;
		Token UNDERSCORE59=null;
		Token HAT61=null;
		ParserRuleReturnScope term60 =null;
		ParserRuleReturnScope term62 =null;
		ParserRuleReturnScope mult63 =null;

		Object SUM58_tree=null;
		Object UNDERSCORE59_tree=null;
		Object HAT61_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:5: ( ( SUM ^ ( ( UNDERSCORE ! term ) | ( HAT ! term ) )* )? mult )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:7: ( SUM ^ ( ( UNDERSCORE ! term ) | ( HAT ! term ) )* )? mult
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:7: ( SUM ^ ( ( UNDERSCORE ! term ) | ( HAT ! term ) )* )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==SUM) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:8: SUM ^ ( ( UNDERSCORE ! term ) | ( HAT ! term ) )*
					{
					SUM58=(Token)match(input,SUM,FOLLOW_SUM_in_summation575); 
					SUM58_tree = (Object)adaptor.create(SUM58);
					root_0 = (Object)adaptor.becomeRoot(SUM58_tree, root_0);

					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:13: ( ( UNDERSCORE ! term ) | ( HAT ! term ) )*
					loop13:
					while (true) {
						int alt13=3;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==UNDERSCORE) ) {
							alt13=1;
						}
						else if ( (LA13_0==HAT) ) {
							alt13=2;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:14: ( UNDERSCORE ! term )
							{
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:14: ( UNDERSCORE ! term )
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:15: UNDERSCORE ! term
							{
							UNDERSCORE59=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_summation580); 
							pushFollow(FOLLOW_term_in_summation583);
							term60=term();
							state._fsp--;

							adaptor.addChild(root_0, term60.getTree());

							}

							}
							break;
						case 2 :
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:35: ( HAT ! term )
							{
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:35: ( HAT ! term )
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:99:36: HAT ! term
							{
							HAT61=(Token)match(input,HAT,FOLLOW_HAT_in_summation589); 
							pushFollow(FOLLOW_term_in_summation592);
							term62=term();
							state._fsp--;

							adaptor.addChild(root_0, term62.getTree());

							}

							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;

			}

			pushFollow(FOLLOW_mult_in_summation599);
			mult63=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult63.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "summation"


	public static class add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:102:1: add : summation ( ( UNARYPLUS | UNARYMINUS | PLUSMINUS ) ^ summation )* ;
	public final add_return add() throws RecognitionException {
		add_return retval = new add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set65=null;
		ParserRuleReturnScope summation64 =null;
		ParserRuleReturnScope summation66 =null;

		Object set65_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:103:5: ( summation ( ( UNARYPLUS | UNARYMINUS | PLUSMINUS ) ^ summation )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:103:7: summation ( ( UNARYPLUS | UNARYMINUS | PLUSMINUS ) ^ summation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_summation_in_add620);
			summation64=summation();
			state._fsp--;

			adaptor.addChild(root_0, summation64.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:103:17: ( ( UNARYPLUS | UNARYMINUS | PLUSMINUS ) ^ summation )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==PLUSMINUS||(LA15_0 >= UNARYMINUS && LA15_0 <= UNARYPLUS)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:103:18: ( UNARYPLUS | UNARYMINUS | PLUSMINUS ) ^ summation
					{
					set65=input.LT(1);
					set65=input.LT(1);
					if ( input.LA(1)==PLUSMINUS||(input.LA(1) >= UNARYMINUS && input.LA(1) <= UNARYPLUS) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set65), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_summation_in_add636);
					summation66=summation();
					state._fsp--;

					adaptor.addChild(root_0, summation66.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add"


	public static class logic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:106:1: logic : add ( LOGICOPERATOR ^ add )* ;
	public final logic_return logic() throws RecognitionException {
		logic_return retval = new logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGICOPERATOR68=null;
		ParserRuleReturnScope add67 =null;
		ParserRuleReturnScope add69 =null;

		Object LOGICOPERATOR68_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:107:5: ( add ( LOGICOPERATOR ^ add )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:107:7: add ( LOGICOPERATOR ^ add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_logic656);
			add67=add();
			state._fsp--;

			adaptor.addChild(root_0, add67.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:107:11: ( LOGICOPERATOR ^ add )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==LOGICOPERATOR) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:107:12: LOGICOPERATOR ^ add
					{
					LOGICOPERATOR68=(Token)match(input,LOGICOPERATOR,FOLLOW_LOGICOPERATOR_in_logic659); 
					LOGICOPERATOR68_tree = (Object)adaptor.create(LOGICOPERATOR68);
					root_0 = (Object)adaptor.becomeRoot(LOGICOPERATOR68_tree, root_0);

					pushFollow(FOLLOW_add_in_logic662);
					add69=add();
					state._fsp--;

					adaptor.addChild(root_0, add69.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:110:1: expression : logic ( RELATIONOPERATOR ^ logic )* ;
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RELATIONOPERATOR71=null;
		ParserRuleReturnScope logic70 =null;
		ParserRuleReturnScope logic72 =null;

		Object RELATIONOPERATOR71_tree=null;

		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:111:5: ( logic ( RELATIONOPERATOR ^ logic )* )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:111:7: logic ( RELATIONOPERATOR ^ logic )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logic_in_expression685);
			logic70=logic();
			state._fsp--;

			adaptor.addChild(root_0, logic70.getTree());

			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:111:13: ( RELATIONOPERATOR ^ logic )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==RELATIONOPERATOR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationParser.g:111:14: RELATIONOPERATOR ^ logic
					{
					RELATIONOPERATOR71=(Token)match(input,RELATIONOPERATOR,FOLLOW_RELATIONOPERATOR_in_expression688); 
					RELATIONOPERATOR71_tree = (Object)adaptor.create(RELATIONOPERATOR71);
					root_0 = (Object)adaptor.becomeRoot(RELATIONOPERATOR71_tree, root_0);

					pushFollow(FOLLOW_logic_in_expression691);
					logic72=logic();
					state._fsp--;

					adaptor.addChild(root_0, logic72.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_expression_in_doIt77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_term94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIDENT_in_term110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSOLUTE_in_term118 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_term121 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ABSOLUTE_in_term123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OULINE_in_term132 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SFENCE_in_term134 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_expression_in_term136 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EFENCE_in_term138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SFENCE_in_term150 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_expression_in_term153 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EFENCE_in_term155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBINATIONS_in_term164 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SFENCE_in_term167 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_expression_in_term170 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EFENCE_in_term172 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SFENCE_in_term175 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_expression_in_term178 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EFENCE_in_term180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_indice201 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_UNDERSCORE_in_indice204 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_indice206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAT_in_funcexp233 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_funcexp236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDERSCORE_in_funcind253 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_funcind256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function274 = new BitSet(new long[]{0x00000000418C3030L});
	public static final BitSet FOLLOW_funcexp_in_function278 = new BitSet(new long[]{0x00000000418C3030L});
	public static final BitSet FOLLOW_funcind_in_function282 = new BitSet(new long[]{0x00000000418C3030L});
	public static final BitSet FOLLOW_indice_in_function289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_exponent310 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_HAT_in_exponent313 = new BitSet(new long[]{0x00000000018C2830L});
	public static final BitSet FOLLOW_function_in_exponent316 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_exponent_in_factorielle335 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_FACTO_in_factorielle337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factorielle_in_invisibleTimes361 = new BitSet(new long[]{0x00000000018C2832L});
	public static final BitSet FOLLOW_factorielle_in_invisibleTimes372 = new BitSet(new long[]{0x00000000018C2832L});
	public static final BitSet FOLLOW_NEGATION_in_negation404 = new BitSet(new long[]{0x00000000018E2830L});
	public static final BitSet FOLLOW_invisibleTimes_in_negation408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQRT_in_sqrt425 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_sqrt428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQRT_in_sqrt436 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_SBRACKET_in_sqrt439 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_expression_in_sqrt442 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_EBRACKET_in_sqrt445 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_sqrt448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_in_sqrt456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FRAC_in_frac477 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_frac480 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_frac482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqrt_in_frac490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARYMINUS_in_unary511 = new BitSet(new long[]{0x00000000038E2C30L});
	public static final BitSet FOLLOW_frac_in_unary513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_frac_in_unary529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult549 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_MULT_in_mult552 = new BitSet(new long[]{0x00000000138E2C30L});
	public static final BitSet FOLLOW_unary_in_mult555 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_SUM_in_summation575 = new BitSet(new long[]{0x00000000538E3C30L});
	public static final BitSet FOLLOW_UNDERSCORE_in_summation580 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_summation583 = new BitSet(new long[]{0x00000000538E3C30L});
	public static final BitSet FOLLOW_HAT_in_summation589 = new BitSet(new long[]{0x00000000018C2030L});
	public static final BitSet FOLLOW_term_in_summation592 = new BitSet(new long[]{0x00000000538E3C30L});
	public static final BitSet FOLLOW_mult_in_summation599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_summation_in_add620 = new BitSet(new long[]{0x0000000030100002L});
	public static final BitSet FOLLOW_set_in_add623 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_summation_in_add636 = new BitSet(new long[]{0x0000000030100002L});
	public static final BitSet FOLLOW_add_in_logic656 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_LOGICOPERATOR_in_logic659 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_add_in_logic662 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_logic_in_expression685 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_RELATIONOPERATOR_in_expression688 = new BitSet(new long[]{0x00000000178E2C30L});
	public static final BitSet FOLLOW_logic_in_expression691 = new BitSet(new long[]{0x0000000000200002L});
}
