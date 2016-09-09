// $ANTLR 3.5.2 C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g 2015-06-22 12:51:20

  package ca.csf.dfc.projsynth.scmnv.tree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class EquationLexer extends Lexer {
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


	   public static int nbSkippedTokens = 0;
	   
	   @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        throw new RuntimeException(hdr + ":" + msg);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public EquationLexer() {} 
	public EquationLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public EquationLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g"; }

	@Override
	public Token nextToken() {
		while (true) {
			if ( input.LA(1)==CharStream.EOF ) {
				Token eof = new CommonToken(input,Token.EOF,
											Token.DEFAULT_CHANNEL,
											input.index(),input.index());
				eof.setLine(getLine());
				eof.setCharPositionInLine(getCharPositionInLine());
				return eof;
			}
			state.token = null;
		state.channel = Token.DEFAULT_CHANNEL;
			state.tokenStartCharIndex = input.index();
			state.tokenStartCharPositionInLine = input.getCharPositionInLine();
			state.tokenStartLine = input.getLine();
		state.text = null;
			try {
				int m = input.mark();
				state.backtracking=1; 
				state.failed=false;
				mTokens();
				state.backtracking=0;
				if ( state.failed ) {
					input.rewind(m);
					input.consume(); 
				}
				else {
					emit();
					return state.token;
				}
			}
			catch (RecognitionException re) {
				// shouldn't happen in backtracking mode, but...
				reportError(re);
				recover(re);
			}
		}
	}

	@Override
	public void memoize(IntStream input,
			int ruleIndex,
			int ruleStartIndex)
	{
	if ( state.backtracking>1 ) super.memoize(input, ruleIndex, ruleStartIndex);
	}

	@Override
	public boolean alreadyParsedRule(IntStream input, int ruleIndex) {
	if ( state.backtracking>1 ) return super.alreadyParsedRule(input, ruleIndex);
	return false;
	}
	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:27:8: ( INTEGER | DOUBLE )
			int alt1=2;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:27:10: INTEGER
					{
					mINTEGER(); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:27:20: DOUBLE
					{
					mDOUBLE(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:28:18: ( ( '0' .. '9' )+ )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:28:20: ( '0' .. '9' )+
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:28:20: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:29:17: ( INTEGER ( '.' | ',' ) INTEGER )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:29:19: INTEGER ( '.' | ',' ) INTEGER
			{
			mINTEGER(); if (state.failed) return;

			if ( input.LA(1)==','||input.LA(1)=='.' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mINTEGER(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "LOGICOPERATOR"
	public final void mLOGICOPERATOR() throws RecognitionException {
		try {
			int _type = LOGICOPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:15: ( ( '\\\\land' | '\\\\lor' | '||' | '&' | '&&' | '\\\\subset' | '\\\\supset' | '\\\\subseteq' | '\\\\supseteq' | '\\\\sqsubset' | '\\\\sqsupset' | '\\\\sqsubseteq' | '\\\\sqsupseteq' | '\\\\bigcap' | '\\\\bigcup' | '\\\\bigsqcup' | '\\\\bigsqcap' | '\\\\bigvee' | '\\\\bigwedge' | '\\\\vee' | '\\\\wedge' | '\\\\cap' | '\\\\cup' | '\\\\sqcap' | '\\\\sqcup' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:17: ( '\\\\land' | '\\\\lor' | '||' | '&' | '&&' | '\\\\subset' | '\\\\supset' | '\\\\subseteq' | '\\\\supseteq' | '\\\\sqsubset' | '\\\\sqsupset' | '\\\\sqsubseteq' | '\\\\sqsupseteq' | '\\\\bigcap' | '\\\\bigcup' | '\\\\bigsqcup' | '\\\\bigsqcap' | '\\\\bigvee' | '\\\\bigwedge' | '\\\\vee' | '\\\\wedge' | '\\\\cap' | '\\\\cup' | '\\\\sqcap' | '\\\\sqcup' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:17: ( '\\\\land' | '\\\\lor' | '||' | '&' | '&&' | '\\\\subset' | '\\\\supset' | '\\\\subseteq' | '\\\\supseteq' | '\\\\sqsubset' | '\\\\sqsupset' | '\\\\sqsubseteq' | '\\\\sqsupseteq' | '\\\\bigcap' | '\\\\bigcup' | '\\\\bigsqcup' | '\\\\bigsqcap' | '\\\\bigvee' | '\\\\bigwedge' | '\\\\vee' | '\\\\wedge' | '\\\\cap' | '\\\\cup' | '\\\\sqcap' | '\\\\sqcup' )
			int alt3=25;
			switch ( input.LA(1) ) {
			case '\\':
				{
				switch ( input.LA(2) ) {
				case 'l':
					{
					int LA3_4 = input.LA(3);
					if ( (LA3_4=='a') ) {
						alt3=1;
					}
					else if ( (LA3_4=='o') ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 's':
					{
					int LA3_5 = input.LA(3);
					if ( (LA3_5=='u') ) {
						int LA3_14 = input.LA(4);
						if ( (LA3_14=='b') ) {
							int LA3_19 = input.LA(5);
							if ( (LA3_19=='s') ) {
								int LA3_24 = input.LA(6);
								if ( (LA3_24=='e') ) {
									int LA3_33 = input.LA(7);
									if ( (LA3_33=='t') ) {
										int LA3_40 = input.LA(8);
										if ( (LA3_40=='e') ) {
											alt3=8;
										}

										else {
											alt3=6;
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 33, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 19, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA3_14=='p') ) {
							int LA3_20 = input.LA(5);
							if ( (LA3_20=='s') ) {
								int LA3_25 = input.LA(6);
								if ( (LA3_25=='e') ) {
									int LA3_34 = input.LA(7);
									if ( (LA3_34=='t') ) {
										int LA3_41 = input.LA(8);
										if ( (LA3_41=='e') ) {
											alt3=9;
										}

										else {
											alt3=7;
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 34, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 25, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA3_5=='q') ) {
						int LA3_15 = input.LA(4);
						if ( (LA3_15=='s') ) {
							int LA3_21 = input.LA(5);
							if ( (LA3_21=='u') ) {
								int LA3_26 = input.LA(6);
								if ( (LA3_26=='b') ) {
									int LA3_35 = input.LA(7);
									if ( (LA3_35=='s') ) {
										int LA3_42 = input.LA(8);
										if ( (LA3_42=='e') ) {
											int LA3_49 = input.LA(9);
											if ( (LA3_49=='t') ) {
												int LA3_53 = input.LA(10);
												if ( (LA3_53=='e') ) {
													alt3=12;
												}

												else {
													alt3=10;
												}

											}

											else {
												if (state.backtracking>0) {state.failed=true; return;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 3, 49, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 42, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 35, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA3_26=='p') ) {
									int LA3_36 = input.LA(7);
									if ( (LA3_36=='s') ) {
										int LA3_43 = input.LA(8);
										if ( (LA3_43=='e') ) {
											int LA3_50 = input.LA(9);
											if ( (LA3_50=='t') ) {
												int LA3_54 = input.LA(10);
												if ( (LA3_54=='e') ) {
													alt3=13;
												}

												else {
													alt3=11;
												}

											}

											else {
												if (state.backtracking>0) {state.failed=true; return;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 3, 50, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 43, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 36, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 26, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 21, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA3_15=='c') ) {
							int LA3_22 = input.LA(5);
							if ( (LA3_22=='a') ) {
								alt3=24;
							}
							else if ( (LA3_22=='u') ) {
								alt3=25;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 22, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'b':
					{
					int LA3_6 = input.LA(3);
					if ( (LA3_6=='i') ) {
						int LA3_16 = input.LA(4);
						if ( (LA3_16=='g') ) {
							switch ( input.LA(5) ) {
							case 'c':
								{
								int LA3_29 = input.LA(6);
								if ( (LA3_29=='a') ) {
									alt3=14;
								}
								else if ( (LA3_29=='u') ) {
									alt3=15;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 29, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 's':
								{
								int LA3_30 = input.LA(6);
								if ( (LA3_30=='q') ) {
									int LA3_39 = input.LA(7);
									if ( (LA3_39=='c') ) {
										int LA3_44 = input.LA(8);
										if ( (LA3_44=='u') ) {
											alt3=16;
										}
										else if ( (LA3_44=='a') ) {
											alt3=17;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 44, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 39, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 30, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 'v':
								{
								alt3=18;
								}
								break;
							case 'w':
								{
								alt3=19;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 23, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'v':
					{
					alt3=20;
					}
					break;
				case 'w':
					{
					alt3=21;
					}
					break;
				case 'c':
					{
					int LA3_9 = input.LA(3);
					if ( (LA3_9=='a') ) {
						alt3=22;
					}
					else if ( (LA3_9=='u') ) {
						alt3=23;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '|':
				{
				alt3=3;
				}
				break;
			case '&':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='&') ) {
					alt3=5;
				}

				else {
					alt3=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:18: '\\\\land'
					{
					match("\\land"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:29: '\\\\lor'
					{
					match("\\lor"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:39: '||'
					{
					match("||"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:46: '&'
					{
					match('&'); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:52: '&&'
					{
					match("&&"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:59: '\\\\subset'
					{
					match("\\subset"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:72: '\\\\supset'
					{
					match("\\supset"); if (state.failed) return;

					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:31:85: '\\\\subseteq'
					{
					match("\\subseteq"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:1: '\\\\supseteq'
					{
					match("\\supseteq"); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:16: '\\\\sqsubset'
					{
					match("\\sqsubset"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:31: '\\\\sqsupset'
					{
					match("\\sqsupset"); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:46: '\\\\sqsubseteq'
					{
					match("\\sqsubseteq"); if (state.failed) return;

					}
					break;
				case 13 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:63: '\\\\sqsupseteq'
					{
					match("\\sqsupseteq"); if (state.failed) return;

					}
					break;
				case 14 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:80: '\\\\bigcap'
					{
					match("\\bigcap"); if (state.failed) return;

					}
					break;
				case 15 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:32:93: '\\\\bigcup'
					{
					match("\\bigcup"); if (state.failed) return;

					}
					break;
				case 16 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:1: '\\\\bigsqcup'
					{
					match("\\bigsqcup"); if (state.failed) return;

					}
					break;
				case 17 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:16: '\\\\bigsqcap'
					{
					match("\\bigsqcap"); if (state.failed) return;

					}
					break;
				case 18 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:31: '\\\\bigvee'
					{
					match("\\bigvee"); if (state.failed) return;

					}
					break;
				case 19 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:44: '\\\\bigwedge'
					{
					match("\\bigwedge"); if (state.failed) return;

					}
					break;
				case 20 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:59: '\\\\vee'
					{
					match("\\vee"); if (state.failed) return;

					}
					break;
				case 21 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:69: '\\\\wedge'
					{
					match("\\wedge"); if (state.failed) return;

					}
					break;
				case 22 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:81: '\\\\cap'
					{
					match("\\cap"); if (state.failed) return;

					}
					break;
				case 23 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:33:91: '\\\\cup'
					{
					match("\\cup"); if (state.failed) return;

					}
					break;
				case 24 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:34:1: '\\\\sqcap'
					{
					match("\\sqcap"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:34:13: '\\\\sqcup'
					{
					match("\\sqcup"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICOPERATOR"

	// $ANTLR start "SPECIDENT"
	public final void mSPECIDENT() throws RecognitionException {
		try {
			int _type = SPECIDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:11: ( ( '\\\\lambda' | '\\\\Lambda' | '\\\\infty' | '\\\\alpha' | '\\\\Alpha' | '\\\\beta' | '\\\\Beta' | '\\\\gamma' | '\\\\Gamma' | '\\\\Delta' | '\\\\delta' | '\\\\epsilon' | '\\\\varepsilon' | '\\\\pi' | '\\\\Pi' | '\\\\varpi' | '\\\\phi' | '\\\\varphi' | '\\\\Phi' | '\\\\zeta' | '\\\\eta' | '\\\\Theta' | '\\\\theta' | '\\\\vartheta' | '\\\\iota' | '\\\\kappa' | '\\\\varkappa' | '\\\\mu' | '\\\\nu' | '\\\\Xi' | '\\\\xi' | '\\\\omicron' | '\\rho' | '\\\\varrho' | '\\\\Sigma' | '\\\\sigma' | '\\\\varsigma' | '\\\\tau' | '\\\\Upsilon' | '\\\\upsilon' | '\\\\chi' | '\\\\Psi' | '\\\\psi' | '\\\\Omega' | '\\\\omega' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:13: ( '\\\\lambda' | '\\\\Lambda' | '\\\\infty' | '\\\\alpha' | '\\\\Alpha' | '\\\\beta' | '\\\\Beta' | '\\\\gamma' | '\\\\Gamma' | '\\\\Delta' | '\\\\delta' | '\\\\epsilon' | '\\\\varepsilon' | '\\\\pi' | '\\\\Pi' | '\\\\varpi' | '\\\\phi' | '\\\\varphi' | '\\\\Phi' | '\\\\zeta' | '\\\\eta' | '\\\\Theta' | '\\\\theta' | '\\\\vartheta' | '\\\\iota' | '\\\\kappa' | '\\\\varkappa' | '\\\\mu' | '\\\\nu' | '\\\\Xi' | '\\\\xi' | '\\\\omicron' | '\\rho' | '\\\\varrho' | '\\\\Sigma' | '\\\\sigma' | '\\\\varsigma' | '\\\\tau' | '\\\\Upsilon' | '\\\\upsilon' | '\\\\chi' | '\\\\Psi' | '\\\\psi' | '\\\\Omega' | '\\\\omega' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:13: ( '\\\\lambda' | '\\\\Lambda' | '\\\\infty' | '\\\\alpha' | '\\\\Alpha' | '\\\\beta' | '\\\\Beta' | '\\\\gamma' | '\\\\Gamma' | '\\\\Delta' | '\\\\delta' | '\\\\epsilon' | '\\\\varepsilon' | '\\\\pi' | '\\\\Pi' | '\\\\varpi' | '\\\\phi' | '\\\\varphi' | '\\\\Phi' | '\\\\zeta' | '\\\\eta' | '\\\\Theta' | '\\\\theta' | '\\\\vartheta' | '\\\\iota' | '\\\\kappa' | '\\\\varkappa' | '\\\\mu' | '\\\\nu' | '\\\\Xi' | '\\\\xi' | '\\\\omicron' | '\\rho' | '\\\\varrho' | '\\\\Sigma' | '\\\\sigma' | '\\\\varsigma' | '\\\\tau' | '\\\\Upsilon' | '\\\\upsilon' | '\\\\chi' | '\\\\Psi' | '\\\\psi' | '\\\\Omega' | '\\\\omega' )
			int alt4=45;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'l':
					{
					alt4=1;
					}
					break;
				case 'L':
					{
					alt4=2;
					}
					break;
				case 'i':
					{
					int LA4_5 = input.LA(3);
					if ( (LA4_5=='n') ) {
						alt4=3;
					}
					else if ( (LA4_5=='o') ) {
						alt4=25;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'a':
					{
					alt4=4;
					}
					break;
				case 'A':
					{
					alt4=5;
					}
					break;
				case 'b':
					{
					alt4=6;
					}
					break;
				case 'B':
					{
					alt4=7;
					}
					break;
				case 'g':
					{
					alt4=8;
					}
					break;
				case 'G':
					{
					alt4=9;
					}
					break;
				case 'D':
					{
					alt4=10;
					}
					break;
				case 'd':
					{
					alt4=11;
					}
					break;
				case 'e':
					{
					int LA4_14 = input.LA(3);
					if ( (LA4_14=='p') ) {
						alt4=12;
					}
					else if ( (LA4_14=='t') ) {
						alt4=21;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'v':
					{
					int LA4_15 = input.LA(3);
					if ( (LA4_15=='a') ) {
						int LA4_37 = input.LA(4);
						if ( (LA4_37=='r') ) {
							switch ( input.LA(5) ) {
							case 'e':
								{
								alt4=13;
								}
								break;
							case 'p':
								{
								int LA4_51 = input.LA(6);
								if ( (LA4_51=='i') ) {
									alt4=16;
								}
								else if ( (LA4_51=='h') ) {
									alt4=18;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 4, 51, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 't':
								{
								alt4=24;
								}
								break;
							case 'k':
								{
								alt4=27;
								}
								break;
							case 'r':
								{
								alt4=34;
								}
								break;
							case 's':
								{
								alt4=37;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 47, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 37, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'p':
					{
					switch ( input.LA(3) ) {
					case 'i':
						{
						alt4=14;
						}
						break;
					case 'h':
						{
						alt4=17;
						}
						break;
					case 's':
						{
						alt4=43;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'P':
					{
					switch ( input.LA(3) ) {
					case 'i':
						{
						alt4=15;
						}
						break;
					case 'h':
						{
						alt4=19;
						}
						break;
					case 's':
						{
						alt4=42;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'z':
					{
					alt4=20;
					}
					break;
				case 'T':
					{
					alt4=22;
					}
					break;
				case 't':
					{
					int LA4_20 = input.LA(3);
					if ( (LA4_20=='h') ) {
						alt4=23;
					}
					else if ( (LA4_20=='a') ) {
						alt4=38;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'k':
					{
					alt4=26;
					}
					break;
				case 'm':
					{
					alt4=28;
					}
					break;
				case 'n':
					{
					alt4=29;
					}
					break;
				case 'X':
					{
					alt4=30;
					}
					break;
				case 'x':
					{
					alt4=31;
					}
					break;
				case 'o':
					{
					int LA4_26 = input.LA(3);
					if ( (LA4_26=='m') ) {
						int LA4_46 = input.LA(4);
						if ( (LA4_46=='i') ) {
							alt4=32;
						}
						else if ( (LA4_46=='e') ) {
							alt4=45;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 46, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 26, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'S':
					{
					alt4=35;
					}
					break;
				case 's':
					{
					alt4=36;
					}
					break;
				case 'U':
					{
					alt4=39;
					}
					break;
				case 'u':
					{
					alt4=40;
					}
					break;
				case 'c':
					{
					alt4=41;
					}
					break;
				case 'O':
					{
					alt4=44;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA4_0=='\r') ) {
				alt4=33;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:14: '\\\\lambda'
					{
					match("\\lambda"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:27: '\\\\Lambda'
					{
					match("\\Lambda"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:40: '\\\\infty'
					{
					match("\\infty"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:52: '\\\\alpha'
					{
					match("\\alpha"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:64: '\\\\Alpha'
					{
					match("\\Alpha"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:76: '\\\\beta'
					{
					match("\\beta"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:87: '\\\\Beta'
					{
					match("\\Beta"); if (state.failed) return;

					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:36:98: '\\\\gamma'
					{
					match("\\gamma"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:1: '\\\\Gamma'
					{
					match("\\Gamma"); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:13: '\\\\Delta'
					{
					match("\\Delta"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:25: '\\\\delta'
					{
					match("\\delta"); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:37: '\\\\epsilon'
					{
					match("\\epsilon"); if (state.failed) return;

					}
					break;
				case 13 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:51: '\\\\varepsilon'
					{
					match("\\varepsilon"); if (state.failed) return;

					}
					break;
				case 14 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:68: '\\\\pi'
					{
					match("\\pi"); if (state.failed) return;

					}
					break;
				case 15 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:77: '\\\\Pi'
					{
					match("\\Pi"); if (state.failed) return;

					}
					break;
				case 16 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:86: '\\\\varpi'
					{
					match("\\varpi"); if (state.failed) return;

					}
					break;
				case 17 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:37:98: '\\\\phi'
					{
					match("\\phi"); if (state.failed) return;

					}
					break;
				case 18 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:1: '\\\\varphi'
					{
					match("\\varphi"); if (state.failed) return;

					}
					break;
				case 19 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:14: '\\\\Phi'
					{
					match("\\Phi"); if (state.failed) return;

					}
					break;
				case 20 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:24: '\\\\zeta'
					{
					match("\\zeta"); if (state.failed) return;

					}
					break;
				case 21 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:35: '\\\\eta'
					{
					match("\\eta"); if (state.failed) return;

					}
					break;
				case 22 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:45: '\\\\Theta'
					{
					match("\\Theta"); if (state.failed) return;

					}
					break;
				case 23 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:57: '\\\\theta'
					{
					match("\\theta"); if (state.failed) return;

					}
					break;
				case 24 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:69: '\\\\vartheta'
					{
					match("\\vartheta"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:38:84: '\\\\iota'
					{
					match("\\iota"); if (state.failed) return;

					}
					break;
				case 26 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:1: '\\\\kappa'
					{
					match("\\kappa"); if (state.failed) return;

					}
					break;
				case 27 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:13: '\\\\varkappa'
					{
					match("\\varkappa"); if (state.failed) return;

					}
					break;
				case 28 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:28: '\\\\mu'
					{
					match("\\mu"); if (state.failed) return;

					}
					break;
				case 29 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:37: '\\\\nu'
					{
					match("\\nu"); if (state.failed) return;

					}
					break;
				case 30 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:46: '\\\\Xi'
					{
					match("\\Xi"); if (state.failed) return;

					}
					break;
				case 31 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:55: '\\\\xi'
					{
					match("\\xi"); if (state.failed) return;

					}
					break;
				case 32 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:64: '\\\\omicron'
					{
					match("\\omicron"); if (state.failed) return;

					}
					break;
				case 33 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:78: '\\rho'
					{
					match("\rho"); if (state.failed) return;

					}
					break;
				case 34 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:39:87: '\\\\varrho'
					{
					match("\\varrho"); if (state.failed) return;

					}
					break;
				case 35 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:1: '\\\\Sigma'
					{
					match("\\Sigma"); if (state.failed) return;

					}
					break;
				case 36 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:13: '\\\\sigma'
					{
					match("\\sigma"); if (state.failed) return;

					}
					break;
				case 37 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:25: '\\\\varsigma'
					{
					match("\\varsigma"); if (state.failed) return;

					}
					break;
				case 38 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:40: '\\\\tau'
					{
					match("\\tau"); if (state.failed) return;

					}
					break;
				case 39 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:50: '\\\\Upsilon'
					{
					match("\\Upsilon"); if (state.failed) return;

					}
					break;
				case 40 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:64: '\\\\upsilon'
					{
					match("\\upsilon"); if (state.failed) return;

					}
					break;
				case 41 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:78: '\\\\chi'
					{
					match("\\chi"); if (state.failed) return;

					}
					break;
				case 42 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:88: '\\\\Psi'
					{
					match("\\Psi"); if (state.failed) return;

					}
					break;
				case 43 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:40:98: '\\\\psi'
					{
					match("\\psi"); if (state.failed) return;

					}
					break;
				case 44 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:41:1: '\\\\Omega'
					{
					match("\\Omega"); if (state.failed) return;

					}
					break;
				case 45 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:41:13: '\\\\omega'
					{
					match("\\omega"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIDENT"

	// $ANTLR start "TRASH"
	public final void mTRASH() throws RecognitionException {
		try {
			int _type = TRASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:7: ( ( '\\\\limits' | '\\\\left' | '\\\\right' | '^\\\\circ' | '\\\\degree' | '\\\\textdegree' | '\\\\dag' | '\\\\ddag' | '\\\\dagger' | '\\\\ddagger' | '\\\\S' | '\\\\copyright' | '\\\\P' | '\\\\pounds' | '\\\\\"{o}' | '\\\\prime' | '\\\\Diamond' | '\\\\sharp' | '\\\\clubsuit' | '\\\\diamondsuit' | '\\\\heartsuit' | '\\\\spadesuit' | '\\\\flat' | '\\\\natural' | '\\\\mho' | '\\\\angstrom' | '\\\\micro' | '\\\\ohm' | '\\\\degC' | '\\\\degF' | '\\\\arcdeg' | '\\\\arcmin' | '\\\\arcsec' | '\\\\big' | '\\\\Big' | '\\\\bigg' | '\\\\Bigg' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:9: ( '\\\\limits' | '\\\\left' | '\\\\right' | '^\\\\circ' | '\\\\degree' | '\\\\textdegree' | '\\\\dag' | '\\\\ddag' | '\\\\dagger' | '\\\\ddagger' | '\\\\S' | '\\\\copyright' | '\\\\P' | '\\\\pounds' | '\\\\\"{o}' | '\\\\prime' | '\\\\Diamond' | '\\\\sharp' | '\\\\clubsuit' | '\\\\diamondsuit' | '\\\\heartsuit' | '\\\\spadesuit' | '\\\\flat' | '\\\\natural' | '\\\\mho' | '\\\\angstrom' | '\\\\micro' | '\\\\ohm' | '\\\\degC' | '\\\\degF' | '\\\\arcdeg' | '\\\\arcmin' | '\\\\arcsec' | '\\\\big' | '\\\\Big' | '\\\\bigg' | '\\\\Bigg' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:9: ( '\\\\limits' | '\\\\left' | '\\\\right' | '^\\\\circ' | '\\\\degree' | '\\\\textdegree' | '\\\\dag' | '\\\\ddag' | '\\\\dagger' | '\\\\ddagger' | '\\\\S' | '\\\\copyright' | '\\\\P' | '\\\\pounds' | '\\\\\"{o}' | '\\\\prime' | '\\\\Diamond' | '\\\\sharp' | '\\\\clubsuit' | '\\\\diamondsuit' | '\\\\heartsuit' | '\\\\spadesuit' | '\\\\flat' | '\\\\natural' | '\\\\mho' | '\\\\angstrom' | '\\\\micro' | '\\\\ohm' | '\\\\degC' | '\\\\degF' | '\\\\arcdeg' | '\\\\arcmin' | '\\\\arcsec' | '\\\\big' | '\\\\Big' | '\\\\bigg' | '\\\\Bigg' )
			int alt5=37;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:10: '\\\\limits'
					{
					match("\\limits"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:23: '\\\\left'
					{
					match("\\left"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:34: '\\\\right'
					{
					match("\\right"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:46: '^\\\\circ'
					{
					match("^\\circ"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:58: '\\\\degree'
					{
					match("\\degree"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:43:71: '\\\\textdegree'
					{
					match("\\textdegree"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:1: '\\\\dag'
					{
					match("\\dag"); if (state.failed) return;

					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:11: '\\\\ddag'
					{
					match("\\ddag"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:22: '\\\\dagger'
					{
					match("\\dagger"); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:35: '\\\\ddagger'
					{
					match("\\ddagger"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:49: '\\\\S'
					{
					match("\\S"); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:57: '\\\\copyright'
					{
					match("\\copyright"); if (state.failed) return;

					}
					break;
				case 13 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:73: '\\\\P'
					{
					match("\\P"); if (state.failed) return;

					}
					break;
				case 14 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:81: '\\\\pounds'
					{
					match("\\pounds"); if (state.failed) return;

					}
					break;
				case 15 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:44:94: '\\\\\"{o}'
					{
					match("\\\"{o}"); if (state.failed) return;

					}
					break;
				case 16 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:1: '\\\\prime'
					{
					match("\\prime"); if (state.failed) return;

					}
					break;
				case 17 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:13: '\\\\Diamond'
					{
					match("\\Diamond"); if (state.failed) return;

					}
					break;
				case 18 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:27: '\\\\sharp'
					{
					match("\\sharp"); if (state.failed) return;

					}
					break;
				case 19 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:39: '\\\\clubsuit'
					{
					match("\\clubsuit"); if (state.failed) return;

					}
					break;
				case 20 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:54: '\\\\diamondsuit'
					{
					match("\\diamondsuit"); if (state.failed) return;

					}
					break;
				case 21 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:72: '\\\\heartsuit'
					{
					match("\\heartsuit"); if (state.failed) return;

					}
					break;
				case 22 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:45:88: '\\\\spadesuit'
					{
					match("\\spadesuit"); if (state.failed) return;

					}
					break;
				case 23 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:1: '\\\\flat'
					{
					match("\\flat"); if (state.failed) return;

					}
					break;
				case 24 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:12: '\\\\natural'
					{
					match("\\natural"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:26: '\\\\mho'
					{
					match("\\mho"); if (state.failed) return;

					}
					break;
				case 26 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:36: '\\\\angstrom'
					{
					match("\\angstrom"); if (state.failed) return;

					}
					break;
				case 27 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:51: '\\\\micro'
					{
					match("\\micro"); if (state.failed) return;

					}
					break;
				case 28 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:63: '\\\\ohm'
					{
					match("\\ohm"); if (state.failed) return;

					}
					break;
				case 29 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:73: '\\\\degC'
					{
					match("\\degC"); if (state.failed) return;

					}
					break;
				case 30 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:84: '\\\\degF'
					{
					match("\\degF"); if (state.failed) return;

					}
					break;
				case 31 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:46:95: '\\\\arcdeg'
					{
					match("\\arcdeg"); if (state.failed) return;

					}
					break;
				case 32 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:1: '\\\\arcmin'
					{
					match("\\arcmin"); if (state.failed) return;

					}
					break;
				case 33 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:14: '\\\\arcsec'
					{
					match("\\arcsec"); if (state.failed) return;

					}
					break;
				case 34 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:27: '\\\\big'
					{
					match("\\big"); if (state.failed) return;

					}
					break;
				case 35 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:37: '\\\\Big'
					{
					match("\\Big"); if (state.failed) return;

					}
					break;
				case 36 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:47: '\\\\bigg'
					{
					match("\\bigg"); if (state.failed) return;

					}
					break;
				case 37 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:47:58: '\\\\Bigg'
					{
					match("\\Bigg"); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==1 ) {_channel = HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRASH"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:49:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '@' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:
			{
			if ( (input.LA(1) >= '@' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:5: ( ( '\\\\sum' | '\\\\prod' | '\\\\coprod' | '\\\\' ( 'i' )+ 'nt' | '\\\\oint' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:7: ( '\\\\sum' | '\\\\prod' | '\\\\coprod' | '\\\\' ( 'i' )+ 'nt' | '\\\\oint' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:7: ( '\\\\sum' | '\\\\prod' | '\\\\coprod' | '\\\\' ( 'i' )+ 'nt' | '\\\\oint' )
			int alt7=5;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 's':
					{
					alt7=1;
					}
					break;
				case 'p':
					{
					alt7=2;
					}
					break;
				case 'c':
					{
					alt7=3;
					}
					break;
				case 'o':
					{
					alt7=5;
					}
					break;
				case 'i':
					{
					alt7=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:8: '\\\\sum'
					{
					match("\\sum"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:18: '\\\\prod'
					{
					match("\\prod"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:29: '\\\\coprod'
					{
					match("\\coprod"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:42: '\\\\' ( 'i' )+ 'nt'
					{
					match('\\'); if (state.failed) return;
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:47: ( 'i' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='i') ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:47: 'i'
							{
							match('i'); if (state.failed) return;
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match("nt"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:51:59: '\\\\oint'
					{
					match("\\oint"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "NEGATION"
	public final void mNEGATION() throws RecognitionException {
		try {
			int _type = NEGATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:52:10: ( '\\\\neg' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:52:12: '\\\\neg'
			{
			match("\\neg"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATION"

	// $ANTLR start "SQRT"
	public final void mSQRT() throws RecognitionException {
		try {
			int _type = SQRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:53:6: ( '\\\\sqrt' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:53:8: '\\\\sqrt'
			{
			match("\\sqrt"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQRT"

	// $ANTLR start "FRAC"
	public final void mFRAC() throws RecognitionException {
		try {
			int _type = FRAC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:6: ( ( '\\\\frac' | '\\\\dfrac' | '\\\\cfrac' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:8: ( '\\\\frac' | '\\\\dfrac' | '\\\\cfrac' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:8: ( '\\\\frac' | '\\\\dfrac' | '\\\\cfrac' )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'f':
					{
					alt8=1;
					}
					break;
				case 'd':
					{
					alt8=2;
					}
					break;
				case 'c':
					{
					alt8=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:9: '\\\\frac'
					{
					match("\\frac"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:20: '\\\\dfrac'
					{
					match("\\dfrac"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:54:32: '\\\\cfrac'
					{
					match("\\cfrac"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRAC"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:6: ( ( '*' | '\\\\times' | '\\\\otimes' | '/' | '\\\\div' | '\\\\oslash' | '\\\\mod' | '\\\\bmod' | '\\\\pmod' | '\\\\pod' | '\\\\bigotimes' | '\\\\divide' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:8: ( '*' | '\\\\times' | '\\\\otimes' | '/' | '\\\\div' | '\\\\oslash' | '\\\\mod' | '\\\\bmod' | '\\\\pmod' | '\\\\pod' | '\\\\bigotimes' | '\\\\divide' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:8: ( '*' | '\\\\times' | '\\\\otimes' | '/' | '\\\\div' | '\\\\oslash' | '\\\\mod' | '\\\\bmod' | '\\\\pmod' | '\\\\pod' | '\\\\bigotimes' | '\\\\divide' )
			int alt9=12;
			switch ( input.LA(1) ) {
			case '*':
				{
				alt9=1;
				}
				break;
			case '\\':
				{
				switch ( input.LA(2) ) {
				case 't':
					{
					alt9=2;
					}
					break;
				case 'o':
					{
					int LA9_5 = input.LA(3);
					if ( (LA9_5=='t') ) {
						alt9=3;
					}
					else if ( (LA9_5=='s') ) {
						alt9=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'd':
					{
					int LA9_6 = input.LA(3);
					if ( (LA9_6=='i') ) {
						int LA9_12 = input.LA(4);
						if ( (LA9_12=='v') ) {
							int LA9_17 = input.LA(5);
							if ( (LA9_17=='i') ) {
								alt9=12;
							}

							else {
								alt9=5;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'm':
					{
					alt9=7;
					}
					break;
				case 'b':
					{
					int LA9_8 = input.LA(3);
					if ( (LA9_8=='m') ) {
						alt9=8;
					}
					else if ( (LA9_8=='i') ) {
						alt9=11;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'p':
					{
					int LA9_9 = input.LA(3);
					if ( (LA9_9=='m') ) {
						alt9=9;
					}
					else if ( (LA9_9=='o') ) {
						alt9=10;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '/':
				{
				alt9=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:9: '*'
					{
					match('*'); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:15: '\\\\times'
					{
					match("\\times"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:27: '\\\\otimes'
					{
					match("\\otimes"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:40: '/'
					{
					match('/'); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:46: '\\\\div'
					{
					match("\\div"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:56: '\\\\oslash'
					{
					match("\\oslash"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:69: '\\\\mod'
					{
					match("\\mod"); if (state.failed) return;

					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:79: '\\\\bmod'
					{
					match("\\bmod"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:90: '\\\\pmod'
					{
					match("\\pmod"); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:55:101: '\\\\pod'
					{
					match("\\pod"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:56:1: '\\\\bigotimes'
					{
					match("\\bigotimes"); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:56:17: '\\\\divide'
					{
					match("\\divide"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "FACTO"
	public final void mFACTO() throws RecognitionException {
		try {
			int _type = FACTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:57:7: ( '!' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:57:9: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FACTO"

	// $ANTLR start "RELATIONOPERATOR"
	public final void mRELATIONOPERATOR() throws RecognitionException {
		try {
			int _type = RELATIONOPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:18: ( ( '=' | '/=' | '\\\\ne' | '\\\\neq' | '\\\\not\\\\equiv' | '\\\\equiv' | '<' | '\\\\le' | '<=' | '\\\\leq' | '>=' | '\\\\geq' | '>' | '\\\\ge' | '\\\\lessgtr' | '\\\\lesseqgtr' | '\\\\lesseqqgtr' | '\\\\sim' | '\\\\approx' | '\\\\simeq' | '\\\\cong' | '\\\\dot=' | '\\\\ll' | '\\\\gg' | '\\\\propto' | '\\\\mapsto' | '\\\\longmapsto' | '\\\\prec' | '\\\\succ' | '\\\\preceq' | '\\\\succeq' | '\\\\in' | '\\\\ni' | '\\\\vdash' | '\\\\dashv' | '\\\\smile' | '\\\\frown' | '\\\\parallel' | '\\\\perp' | '\\\\bowtie' | '\\\\asymp' | '\\\\models' | '\\\\doteq' | '\\\\Join' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:20: ( '=' | '/=' | '\\\\ne' | '\\\\neq' | '\\\\not\\\\equiv' | '\\\\equiv' | '<' | '\\\\le' | '<=' | '\\\\leq' | '>=' | '\\\\geq' | '>' | '\\\\ge' | '\\\\lessgtr' | '\\\\lesseqgtr' | '\\\\lesseqqgtr' | '\\\\sim' | '\\\\approx' | '\\\\simeq' | '\\\\cong' | '\\\\dot=' | '\\\\ll' | '\\\\gg' | '\\\\propto' | '\\\\mapsto' | '\\\\longmapsto' | '\\\\prec' | '\\\\succ' | '\\\\preceq' | '\\\\succeq' | '\\\\in' | '\\\\ni' | '\\\\vdash' | '\\\\dashv' | '\\\\smile' | '\\\\frown' | '\\\\parallel' | '\\\\perp' | '\\\\bowtie' | '\\\\asymp' | '\\\\models' | '\\\\doteq' | '\\\\Join' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:20: ( '=' | '/=' | '\\\\ne' | '\\\\neq' | '\\\\not\\\\equiv' | '\\\\equiv' | '<' | '\\\\le' | '<=' | '\\\\leq' | '>=' | '\\\\geq' | '>' | '\\\\ge' | '\\\\lessgtr' | '\\\\lesseqgtr' | '\\\\lesseqqgtr' | '\\\\sim' | '\\\\approx' | '\\\\simeq' | '\\\\cong' | '\\\\dot=' | '\\\\ll' | '\\\\gg' | '\\\\propto' | '\\\\mapsto' | '\\\\longmapsto' | '\\\\prec' | '\\\\succ' | '\\\\preceq' | '\\\\succeq' | '\\\\in' | '\\\\ni' | '\\\\vdash' | '\\\\dashv' | '\\\\smile' | '\\\\frown' | '\\\\parallel' | '\\\\perp' | '\\\\bowtie' | '\\\\asymp' | '\\\\models' | '\\\\doteq' | '\\\\Join' )
			int alt10=44;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:21: '='
					{
					match('='); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:27: '/='
					{
					match("/="); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:34: '\\\\ne'
					{
					match("\\ne"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:43: '\\\\neq'
					{
					match("\\neq"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:53: '\\\\not\\\\equiv'
					{
					match("\\not\\equiv"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:70: '\\\\equiv'
					{
					match("\\equiv"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:82: '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:59:88: '\\\\le'
					{
					match("\\le"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:1: '<='
					{
					match("<="); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:8: '\\\\leq'
					{
					match("\\leq"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:18: '>='
					{
					match(">="); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:25: '\\\\geq'
					{
					match("\\geq"); if (state.failed) return;

					}
					break;
				case 13 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:35: '>'
					{
					match('>'); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:41: '\\\\ge'
					{
					match("\\ge"); if (state.failed) return;

					}
					break;
				case 15 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:50: '\\\\lessgtr'
					{
					match("\\lessgtr"); if (state.failed) return;

					}
					break;
				case 16 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:64: '\\\\lesseqgtr'
					{
					match("\\lesseqgtr"); if (state.failed) return;

					}
					break;
				case 17 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:60:80: '\\\\lesseqqgtr'
					{
					match("\\lesseqqgtr"); if (state.failed) return;

					}
					break;
				case 18 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:1: '\\\\sim'
					{
					match("\\sim"); if (state.failed) return;

					}
					break;
				case 19 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:11: '\\\\approx'
					{
					match("\\approx"); if (state.failed) return;

					}
					break;
				case 20 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:24: '\\\\simeq'
					{
					match("\\simeq"); if (state.failed) return;

					}
					break;
				case 21 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:36: '\\\\cong'
					{
					match("\\cong"); if (state.failed) return;

					}
					break;
				case 22 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:47: '\\\\dot='
					{
					match("\\dot="); if (state.failed) return;

					}
					break;
				case 23 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:58: '\\\\ll'
					{
					match("\\ll"); if (state.failed) return;

					}
					break;
				case 24 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:67: '\\\\gg'
					{
					match("\\gg"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:61:76: '\\\\propto'
					{
					match("\\propto"); if (state.failed) return;

					}
					break;
				case 26 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:1: '\\\\mapsto'
					{
					match("\\mapsto"); if (state.failed) return;

					}
					break;
				case 27 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:14: '\\\\longmapsto'
					{
					match("\\longmapsto"); if (state.failed) return;

					}
					break;
				case 28 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:31: '\\\\prec'
					{
					match("\\prec"); if (state.failed) return;

					}
					break;
				case 29 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:42: '\\\\succ'
					{
					match("\\succ"); if (state.failed) return;

					}
					break;
				case 30 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:53: '\\\\preceq'
					{
					match("\\preceq"); if (state.failed) return;

					}
					break;
				case 31 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:66: '\\\\succeq'
					{
					match("\\succeq"); if (state.failed) return;

					}
					break;
				case 32 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:79: '\\\\in'
					{
					match("\\in"); if (state.failed) return;

					}
					break;
				case 33 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:62:88: '\\\\ni'
					{
					match("\\ni"); if (state.failed) return;

					}
					break;
				case 34 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:1: '\\\\vdash'
					{
					match("\\vdash"); if (state.failed) return;

					}
					break;
				case 35 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:13: '\\\\dashv'
					{
					match("\\dashv"); if (state.failed) return;

					}
					break;
				case 36 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:25: '\\\\smile'
					{
					match("\\smile"); if (state.failed) return;

					}
					break;
				case 37 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:37: '\\\\frown'
					{
					match("\\frown"); if (state.failed) return;

					}
					break;
				case 38 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:49: '\\\\parallel'
					{
					match("\\parallel"); if (state.failed) return;

					}
					break;
				case 39 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:64: '\\\\perp'
					{
					match("\\perp"); if (state.failed) return;

					}
					break;
				case 40 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:75: '\\\\bowtie'
					{
					match("\\bowtie"); if (state.failed) return;

					}
					break;
				case 41 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:63:88: '\\\\asymp'
					{
					match("\\asymp"); if (state.failed) return;

					}
					break;
				case 42 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:64:1: '\\\\models'
					{
					match("\\models"); if (state.failed) return;

					}
					break;
				case 43 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:64:14: '\\\\doteq'
					{
					match("\\doteq"); if (state.failed) return;

					}
					break;
				case 44 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:64:26: '\\\\Join'
					{
					match("\\Join"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELATIONOPERATOR"

	// $ANTLR start "ABSOLUTE"
	public final void mABSOLUTE() throws RecognitionException {
		try {
			int _type = ABSOLUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:66:10: ( ( '\\\\mid' | '|' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:66:12: ( '\\\\mid' | '|' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:66:12: ( '\\\\mid' | '|' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\\') ) {
				alt11=1;
			}
			else if ( (LA11_0=='|') ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:66:13: '\\\\mid'
					{
					match("\\mid"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:66:23: '|'
					{
					match('|'); if (state.failed) return;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSOLUTE"

	// $ANTLR start "SBRACKET"
	public final void mSBRACKET() throws RecognitionException {
		try {
			int _type = SBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:68:10: ( '[' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:68:12: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SBRACKET"

	// $ANTLR start "EBRACKET"
	public final void mEBRACKET() throws RecognitionException {
		try {
			int _type = EBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:69:10: ( ']' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:69:12: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EBRACKET"

	// $ANTLR start "SFENCE"
	public final void mSFENCE() throws RecognitionException {
		try {
			int _type = SFENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:8: ( ( '(' | '\\\\{' | '{' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:10: ( '(' | '\\\\{' | '{' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:10: ( '(' | '\\\\{' | '{' )
			int alt12=3;
			switch ( input.LA(1) ) {
			case '(':
				{
				alt12=1;
				}
				break;
			case '\\':
				{
				alt12=2;
				}
				break;
			case '{':
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:11: '('
					{
					match('('); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:17: '\\\\{'
					{
					match("\\{"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:71:25: '{'
					{
					match('{'); if (state.failed) return;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SFENCE"

	// $ANTLR start "EFENCE"
	public final void mEFENCE() throws RecognitionException {
		try {
			int _type = EFENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:8: ( ( ')' | '\\\\}' | '}' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:10: ( ')' | '\\\\}' | '}' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:10: ( ')' | '\\\\}' | '}' )
			int alt13=3;
			switch ( input.LA(1) ) {
			case ')':
				{
				alt13=1;
				}
				break;
			case '\\':
				{
				alt13=2;
				}
				break;
			case '}':
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:11: ')'
					{
					match(')'); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:17: '\\\\}'
					{
					match("\\}"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:72:25: '}'
					{
					match('}'); if (state.failed) return;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EFENCE"

	// $ANTLR start "UNARYPLUS"
	public final void mUNARYPLUS() throws RecognitionException {
		try {
			int _type = UNARYPLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:11: ( ( '+' | '\\\\plus' | '\\\\oplus' | '\\\\uplus' | '\\\\bigoplus' | '\\\\biguplus' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:13: ( '+' | '\\\\plus' | '\\\\oplus' | '\\\\uplus' | '\\\\bigoplus' | '\\\\biguplus' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:13: ( '+' | '\\\\plus' | '\\\\oplus' | '\\\\uplus' | '\\\\bigoplus' | '\\\\biguplus' )
			int alt14=6;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+') ) {
				alt14=1;
			}
			else if ( (LA14_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'p':
					{
					alt14=2;
					}
					break;
				case 'o':
					{
					alt14=3;
					}
					break;
				case 'u':
					{
					alt14=4;
					}
					break;
				case 'b':
					{
					int LA14_6 = input.LA(3);
					if ( (LA14_6=='i') ) {
						int LA14_7 = input.LA(4);
						if ( (LA14_7=='g') ) {
							int LA14_8 = input.LA(5);
							if ( (LA14_8=='o') ) {
								alt14=5;
							}
							else if ( (LA14_8=='u') ) {
								alt14=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 14, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 14, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:14: '+'
					{
					match('+'); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:20: '\\\\plus'
					{
					match("\\plus"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:31: '\\\\oplus'
					{
					match("\\oplus"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:43: '\\\\uplus'
					{
					match("\\uplus"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:55: '\\\\bigoplus'
					{
					match("\\bigoplus"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:74:70: '\\\\biguplus'
					{
					match("\\biguplus"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARYPLUS"

	// $ANTLR start "UNARYMINUS"
	public final void mUNARYMINUS() throws RecognitionException {
		try {
			int _type = UNARYMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:12: ( ( '-' | '\\\\minus' | '\\\\ominus' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:14: ( '-' | '\\\\minus' | '\\\\ominus' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:14: ( '-' | '\\\\minus' | '\\\\ominus' )
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='-') ) {
				alt15=1;
			}
			else if ( (LA15_0=='\\') ) {
				int LA15_2 = input.LA(2);
				if ( (LA15_2=='m') ) {
					alt15=2;
				}
				else if ( (LA15_2=='o') ) {
					alt15=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:15: '-'
					{
					match('-'); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:21: '\\\\minus'
					{
					match("\\minus"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:75:33: '\\\\ominus'
					{
					match("\\ominus"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARYMINUS"

	// $ANTLR start "PLUSMINUS"
	public final void mPLUSMINUS() throws RecognitionException {
		try {
			int _type = PLUSMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:76:11: ( ( '\\\\pm' | '\\\\mp' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:76:13: ( '\\\\pm' | '\\\\mp' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:76:13: ( '\\\\pm' | '\\\\mp' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\\') ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='p') ) {
					alt16=1;
				}
				else if ( (LA16_1=='m') ) {
					alt16=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:76:14: '\\\\pm'
					{
					match("\\pm"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:76:23: '\\\\mp'
					{
					match("\\mp"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSMINUS"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:10: ( ( '\\\\cos' | '\\\\sin' | '\\\\tan' | '\\\\sec' | '\\\\csc' | '\\\\cot' | '\\\\arccos' | '\\\\arcsin' | '\\\\arctan' | '\\\\cosh' | '\\\\sinh' | '\\\\tanh' | '\\\\coth' | '\\\\log' | '\\\\arg' | '\\\\deg' | '\\\\det' | '\\\\dim' | '\\\\exp' | '\\\\gcd' | '\\\\hom' | '\\\\inf' | '\\\\ker' | '\\\\lg' | '\\\\lim' | '\\\\liminf' | '\\\\limsup' | '\\\\ln' | '\\\\max' | '\\\\min' | '\\\\Pr' | '\\\\sup' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:12: ( '\\\\cos' | '\\\\sin' | '\\\\tan' | '\\\\sec' | '\\\\csc' | '\\\\cot' | '\\\\arccos' | '\\\\arcsin' | '\\\\arctan' | '\\\\cosh' | '\\\\sinh' | '\\\\tanh' | '\\\\coth' | '\\\\log' | '\\\\arg' | '\\\\deg' | '\\\\det' | '\\\\dim' | '\\\\exp' | '\\\\gcd' | '\\\\hom' | '\\\\inf' | '\\\\ker' | '\\\\lg' | '\\\\lim' | '\\\\liminf' | '\\\\limsup' | '\\\\ln' | '\\\\max' | '\\\\min' | '\\\\Pr' | '\\\\sup' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:12: ( '\\\\cos' | '\\\\sin' | '\\\\tan' | '\\\\sec' | '\\\\csc' | '\\\\cot' | '\\\\arccos' | '\\\\arcsin' | '\\\\arctan' | '\\\\cosh' | '\\\\sinh' | '\\\\tanh' | '\\\\coth' | '\\\\log' | '\\\\arg' | '\\\\deg' | '\\\\det' | '\\\\dim' | '\\\\exp' | '\\\\gcd' | '\\\\hom' | '\\\\inf' | '\\\\ker' | '\\\\lg' | '\\\\lim' | '\\\\liminf' | '\\\\limsup' | '\\\\ln' | '\\\\max' | '\\\\min' | '\\\\Pr' | '\\\\sup' )
			int alt17=32;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'c':
					{
					int LA17_2 = input.LA(3);
					if ( (LA17_2=='o') ) {
						int LA17_15 = input.LA(4);
						if ( (LA17_15=='s') ) {
							int LA17_30 = input.LA(5);
							if ( (LA17_30=='h') ) {
								alt17=10;
							}

							else {
								alt17=1;
							}

						}
						else if ( (LA17_15=='t') ) {
							int LA17_31 = input.LA(5);
							if ( (LA17_31=='h') ) {
								alt17=13;
							}

							else {
								alt17=6;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA17_2=='s') ) {
						alt17=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 's':
					{
					switch ( input.LA(3) ) {
					case 'i':
						{
						int LA17_17 = input.LA(4);
						if ( (LA17_17=='n') ) {
							int LA17_32 = input.LA(5);
							if ( (LA17_32=='h') ) {
								alt17=11;
							}

							else {
								alt17=2;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'e':
						{
						alt17=4;
						}
						break;
					case 'u':
						{
						alt17=32;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 't':
					{
					int LA17_4 = input.LA(3);
					if ( (LA17_4=='a') ) {
						int LA17_20 = input.LA(4);
						if ( (LA17_20=='n') ) {
							int LA17_33 = input.LA(5);
							if ( (LA17_33=='h') ) {
								alt17=12;
							}

							else {
								alt17=3;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 20, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'a':
					{
					int LA17_5 = input.LA(3);
					if ( (LA17_5=='r') ) {
						int LA17_21 = input.LA(4);
						if ( (LA17_21=='c') ) {
							switch ( input.LA(5) ) {
							case 'c':
								{
								alt17=7;
								}
								break;
							case 's':
								{
								alt17=8;
								}
								break;
							case 't':
								{
								alt17=9;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 34, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA17_21=='g') ) {
							alt17=15;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'l':
					{
					switch ( input.LA(3) ) {
					case 'o':
						{
						alt17=14;
						}
						break;
					case 'g':
						{
						alt17=24;
						}
						break;
					case 'i':
						{
						int LA17_24 = input.LA(4);
						if ( (LA17_24=='m') ) {
							switch ( input.LA(5) ) {
							case 'i':
								{
								alt17=26;
								}
								break;
							case 's':
								{
								alt17=27;
								}
								break;
							default:
								alt17=25;
							}
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'n':
						{
						alt17=28;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 'd':
					{
					int LA17_7 = input.LA(3);
					if ( (LA17_7=='e') ) {
						int LA17_26 = input.LA(4);
						if ( (LA17_26=='g') ) {
							alt17=16;
						}
						else if ( (LA17_26=='t') ) {
							alt17=17;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 26, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA17_7=='i') ) {
						alt17=18;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'e':
					{
					alt17=19;
					}
					break;
				case 'g':
					{
					alt17=20;
					}
					break;
				case 'h':
					{
					alt17=21;
					}
					break;
				case 'i':
					{
					alt17=22;
					}
					break;
				case 'k':
					{
					alt17=23;
					}
					break;
				case 'm':
					{
					int LA17_13 = input.LA(3);
					if ( (LA17_13=='a') ) {
						alt17=29;
					}
					else if ( (LA17_13=='i') ) {
						alt17=30;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'P':
					{
					alt17=31;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:13: '\\\\cos'
					{
					match("\\cos"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:23: '\\\\sin'
					{
					match("\\sin"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:33: '\\\\tan'
					{
					match("\\tan"); if (state.failed) return;

					}
					break;
				case 4 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:43: '\\\\sec'
					{
					match("\\sec"); if (state.failed) return;

					}
					break;
				case 5 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:53: '\\\\csc'
					{
					match("\\csc"); if (state.failed) return;

					}
					break;
				case 6 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:63: '\\\\cot'
					{
					match("\\cot"); if (state.failed) return;

					}
					break;
				case 7 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:73: '\\\\arccos'
					{
					match("\\arccos"); if (state.failed) return;

					}
					break;
				case 8 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:86: '\\\\arcsin'
					{
					match("\\arcsin"); if (state.failed) return;

					}
					break;
				case 9 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:78:99: '\\\\arctan'
					{
					match("\\arctan"); if (state.failed) return;

					}
					break;
				case 10 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:1: '\\\\cosh'
					{
					match("\\cosh"); if (state.failed) return;

					}
					break;
				case 11 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:12: '\\\\sinh'
					{
					match("\\sinh"); if (state.failed) return;

					}
					break;
				case 12 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:23: '\\\\tanh'
					{
					match("\\tanh"); if (state.failed) return;

					}
					break;
				case 13 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:34: '\\\\coth'
					{
					match("\\coth"); if (state.failed) return;

					}
					break;
				case 14 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:45: '\\\\log'
					{
					match("\\log"); if (state.failed) return;

					}
					break;
				case 15 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:55: '\\\\arg'
					{
					match("\\arg"); if (state.failed) return;

					}
					break;
				case 16 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:65: '\\\\deg'
					{
					match("\\deg"); if (state.failed) return;

					}
					break;
				case 17 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:75: '\\\\det'
					{
					match("\\det"); if (state.failed) return;

					}
					break;
				case 18 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:85: '\\\\dim'
					{
					match("\\dim"); if (state.failed) return;

					}
					break;
				case 19 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:95: '\\\\exp'
					{
					match("\\exp"); if (state.failed) return;

					}
					break;
				case 20 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:79:105: '\\\\gcd'
					{
					match("\\gcd"); if (state.failed) return;

					}
					break;
				case 21 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:2: '\\\\hom'
					{
					match("\\hom"); if (state.failed) return;

					}
					break;
				case 22 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:12: '\\\\inf'
					{
					match("\\inf"); if (state.failed) return;

					}
					break;
				case 23 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:22: '\\\\ker'
					{
					match("\\ker"); if (state.failed) return;

					}
					break;
				case 24 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:32: '\\\\lg'
					{
					match("\\lg"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:41: '\\\\lim'
					{
					match("\\lim"); if (state.failed) return;

					}
					break;
				case 26 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:51: '\\\\liminf'
					{
					match("\\liminf"); if (state.failed) return;

					}
					break;
				case 27 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:64: '\\\\limsup'
					{
					match("\\limsup"); if (state.failed) return;

					}
					break;
				case 28 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:77: '\\\\ln'
					{
					match("\\ln"); if (state.failed) return;

					}
					break;
				case 29 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:86: '\\\\max'
					{
					match("\\max"); if (state.failed) return;

					}
					break;
				case 30 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:96: '\\\\min'
					{
					match("\\min"); if (state.failed) return;

					}
					break;
				case 31 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:106: '\\\\Pr'
					{
					match("\\Pr"); if (state.failed) return;

					}
					break;
				case 32 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:80:115: '\\\\sup'
					{
					match("\\sup"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:82:12: ( '_' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:82:14: '_'
			{
			match('_'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "HAT"
	public final void mHAT() throws RecognitionException {
		try {
			int _type = HAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:83:5: ( '^' )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:83:7: '^'
			{
			match('^'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HAT"

	// $ANTLR start "COMBINATIONS"
	public final void mCOMBINATIONS() throws RecognitionException {
		try {
			int _type = COMBINATIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:85:14: ( ( '\\\\binom' | '\\\\dbinom' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:85:16: ( '\\\\binom' | '\\\\dbinom' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:85:16: ( '\\\\binom' | '\\\\dbinom' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='b') ) {
					alt18=1;
				}
				else if ( (LA18_1=='d') ) {
					alt18=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:85:17: '\\\\binom'
					{
					match("\\binom"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:85:29: '\\\\dbinom'
					{
					match("\\dbinom"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMBINATIONS"

	// $ANTLR start "OULINE"
	public final void mOULINE() throws RecognitionException {
		try {
			int _type = OULINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:8: ( ( '\\\\overline' | '\\\\underline' | '\\\\underset' ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:10: ( '\\\\overline' | '\\\\underline' | '\\\\underset' )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:10: ( '\\\\overline' | '\\\\underline' | '\\\\underset' )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='o') ) {
					alt19=1;
				}
				else if ( (LA19_1=='u') ) {
					int LA19_3 = input.LA(3);
					if ( (LA19_3=='n') ) {
						int LA19_4 = input.LA(4);
						if ( (LA19_4=='d') ) {
							int LA19_5 = input.LA(5);
							if ( (LA19_5=='e') ) {
								int LA19_6 = input.LA(6);
								if ( (LA19_6=='r') ) {
									int LA19_7 = input.LA(7);
									if ( (LA19_7=='l') ) {
										alt19=2;
									}
									else if ( (LA19_7=='s') ) {
										alt19=3;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 19, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 19, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 19, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:11: '\\\\overline'
					{
					match("\\overline"); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:26: '\\\\underline'
					{
					match("\\underline"); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:87:42: '\\\\underset'
					{
					match("\\underset"); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OULINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:89:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:89:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:89:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||(LA20_0 >= '\f' && LA20_0 <= '\r')||LA20_0==' ') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			if ( state.backtracking==1 ) {_channel = HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "UNKNOWNTOKENS"
	public final void mUNKNOWNTOKENS() throws RecognitionException {
		try {
			int _type = UNKNOWNTOKENS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:91:15: ( ( '\\\\' ( IDENT )+ ) )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:91:17: ( '\\\\' ( IDENT )+ )
			{
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:91:17: ( '\\\\' ( IDENT )+ )
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:91:18: '\\\\' ( IDENT )+
			{
			match('\\'); if (state.failed) return;
			// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:91:22: ( IDENT )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '@' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:
					{
					if ( (input.LA(1) >= '@' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

			if ( state.backtracking==1 ) {nbSkippedTokens++;_channel = HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNKNOWNTOKENS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:39: ( NUMBER | LOGICOPERATOR | SPECIDENT | TRASH | IDENT | SUM | NEGATION | SQRT | FRAC | MULT | FACTO | RELATIONOPERATOR | ABSOLUTE | SBRACKET | EBRACKET | SFENCE | EFENCE | UNARYPLUS | UNARYMINUS | PLUSMINUS | FUNCTION | UNDERSCORE | HAT | COMBINATIONS | OULINE | WS | UNKNOWNTOKENS )
		int alt22=27;
		switch ( input.LA(1) ) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt22=1;
			}
			break;
		case '\\':
			{
			int LA22_2 = input.LA(2);
			if ( (synpred2_EquationLexer()) ) {
				alt22=2;
			}
			else if ( (synpred3_EquationLexer()) ) {
				alt22=3;
			}
			else if ( (synpred4_EquationLexer()) ) {
				alt22=4;
			}
			else if ( (synpred6_EquationLexer()) ) {
				alt22=6;
			}
			else if ( (synpred7_EquationLexer()) ) {
				alt22=7;
			}
			else if ( (synpred8_EquationLexer()) ) {
				alt22=8;
			}
			else if ( (synpred9_EquationLexer()) ) {
				alt22=9;
			}
			else if ( (synpred10_EquationLexer()) ) {
				alt22=10;
			}
			else if ( (synpred12_EquationLexer()) ) {
				alt22=12;
			}
			else if ( (synpred13_EquationLexer()) ) {
				alt22=13;
			}
			else if ( (synpred16_EquationLexer()) ) {
				alt22=16;
			}
			else if ( (synpred17_EquationLexer()) ) {
				alt22=17;
			}
			else if ( (synpred18_EquationLexer()) ) {
				alt22=18;
			}
			else if ( (synpred19_EquationLexer()) ) {
				alt22=19;
			}
			else if ( (synpred20_EquationLexer()) ) {
				alt22=20;
			}
			else if ( (synpred21_EquationLexer()) ) {
				alt22=21;
			}
			else if ( (synpred24_EquationLexer()) ) {
				alt22=24;
			}
			else if ( (synpred25_EquationLexer()) ) {
				alt22=25;
			}
			else if ( (true) ) {
				alt22=27;
			}

			}
			break;
		case '|':
			{
			int LA22_22 = input.LA(2);
			if ( (synpred2_EquationLexer()) ) {
				alt22=2;
			}
			else if ( (synpred13_EquationLexer()) ) {
				alt22=13;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 22, 22, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\r':
			{
			int LA22_23 = input.LA(2);
			if ( (synpred3_EquationLexer()) ) {
				alt22=3;
			}
			else if ( (synpred26_EquationLexer()) ) {
				alt22=26;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 22, 23, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '^':
			{
			int LA22_25 = input.LA(2);
			if ( (synpred4_EquationLexer()) ) {
				alt22=4;
			}
			else if ( (synpred23_EquationLexer()) ) {
				alt22=23;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 22, 25, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '@':
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt22=5;
			}
			break;
		case '/':
			{
			int LA22_28 = input.LA(2);
			if ( (synpred10_EquationLexer()) ) {
				alt22=10;
			}
			else if ( (synpred12_EquationLexer()) ) {
				alt22=12;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 22, 28, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '!':
			{
			alt22=11;
			}
			break;
		case '*':
			{
			alt22=10;
			}
			break;
		case '<':
		case '=':
		case '>':
			{
			alt22=12;
			}
			break;
		case '&':
			{
			alt22=2;
			}
			break;
		case '[':
			{
			alt22=14;
			}
			break;
		case ']':
			{
			alt22=15;
			}
			break;
		case '(':
		case '{':
			{
			alt22=16;
			}
			break;
		case ')':
		case '}':
			{
			alt22=17;
			}
			break;
		case '+':
			{
			alt22=18;
			}
			break;
		case '-':
			{
			alt22=19;
			}
			break;
		case '_':
			{
			alt22=22;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case ' ':
			{
			alt22=26;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 22, 0, input);
			throw nvae;
		}
		switch (alt22) {
			case 1 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:41: NUMBER
				{
				mNUMBER(); if (state.failed) return;

				}
				break;
			case 2 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:48: LOGICOPERATOR
				{
				mLOGICOPERATOR(); if (state.failed) return;

				}
				break;
			case 3 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:62: SPECIDENT
				{
				mSPECIDENT(); if (state.failed) return;

				}
				break;
			case 4 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:72: TRASH
				{
				mTRASH(); if (state.failed) return;

				}
				break;
			case 5 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:78: IDENT
				{
				mIDENT(); if (state.failed) return;

				}
				break;
			case 6 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:84: SUM
				{
				mSUM(); if (state.failed) return;

				}
				break;
			case 7 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:88: NEGATION
				{
				mNEGATION(); if (state.failed) return;

				}
				break;
			case 8 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:97: SQRT
				{
				mSQRT(); if (state.failed) return;

				}
				break;
			case 9 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:102: FRAC
				{
				mFRAC(); if (state.failed) return;

				}
				break;
			case 10 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:107: MULT
				{
				mMULT(); if (state.failed) return;

				}
				break;
			case 11 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:112: FACTO
				{
				mFACTO(); if (state.failed) return;

				}
				break;
			case 12 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:118: RELATIONOPERATOR
				{
				mRELATIONOPERATOR(); if (state.failed) return;

				}
				break;
			case 13 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:135: ABSOLUTE
				{
				mABSOLUTE(); if (state.failed) return;

				}
				break;
			case 14 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:144: SBRACKET
				{
				mSBRACKET(); if (state.failed) return;

				}
				break;
			case 15 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:153: EBRACKET
				{
				mEBRACKET(); if (state.failed) return;

				}
				break;
			case 16 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:162: SFENCE
				{
				mSFENCE(); if (state.failed) return;

				}
				break;
			case 17 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:169: EFENCE
				{
				mEFENCE(); if (state.failed) return;

				}
				break;
			case 18 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:176: UNARYPLUS
				{
				mUNARYPLUS(); if (state.failed) return;

				}
				break;
			case 19 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:186: UNARYMINUS
				{
				mUNARYMINUS(); if (state.failed) return;

				}
				break;
			case 20 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:197: PLUSMINUS
				{
				mPLUSMINUS(); if (state.failed) return;

				}
				break;
			case 21 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:207: FUNCTION
				{
				mFUNCTION(); if (state.failed) return;

				}
				break;
			case 22 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:216: UNDERSCORE
				{
				mUNDERSCORE(); if (state.failed) return;

				}
				break;
			case 23 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:227: HAT
				{
				mHAT(); if (state.failed) return;

				}
				break;
			case 24 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:231: COMBINATIONS
				{
				mCOMBINATIONS(); if (state.failed) return;

				}
				break;
			case 25 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:244: OULINE
				{
				mOULINE(); if (state.failed) return;

				}
				break;
			case 26 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:251: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 27 :
				// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:254: UNKNOWNTOKENS
				{
				mUNKNOWNTOKENS(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred2_EquationLexer
	public final void synpred2_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:48: ( LOGICOPERATOR )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:48: LOGICOPERATOR
		{
		mLOGICOPERATOR(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_EquationLexer

	// $ANTLR start synpred3_EquationLexer
	public final void synpred3_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:62: ( SPECIDENT )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:62: SPECIDENT
		{
		mSPECIDENT(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_EquationLexer

	// $ANTLR start synpred4_EquationLexer
	public final void synpred4_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:72: ( TRASH )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:72: TRASH
		{
		mTRASH(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_EquationLexer

	// $ANTLR start synpred6_EquationLexer
	public final void synpred6_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:84: ( SUM )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:84: SUM
		{
		mSUM(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_EquationLexer

	// $ANTLR start synpred7_EquationLexer
	public final void synpred7_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:88: ( NEGATION )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:88: NEGATION
		{
		mNEGATION(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_EquationLexer

	// $ANTLR start synpred8_EquationLexer
	public final void synpred8_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:97: ( SQRT )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:97: SQRT
		{
		mSQRT(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_EquationLexer

	// $ANTLR start synpred9_EquationLexer
	public final void synpred9_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:102: ( FRAC )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:102: FRAC
		{
		mFRAC(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_EquationLexer

	// $ANTLR start synpred10_EquationLexer
	public final void synpred10_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:107: ( MULT )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:107: MULT
		{
		mMULT(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_EquationLexer

	// $ANTLR start synpred12_EquationLexer
	public final void synpred12_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:118: ( RELATIONOPERATOR )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:118: RELATIONOPERATOR
		{
		mRELATIONOPERATOR(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_EquationLexer

	// $ANTLR start synpred13_EquationLexer
	public final void synpred13_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:135: ( ABSOLUTE )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:135: ABSOLUTE
		{
		mABSOLUTE(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_EquationLexer

	// $ANTLR start synpred16_EquationLexer
	public final void synpred16_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:162: ( SFENCE )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:162: SFENCE
		{
		mSFENCE(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_EquationLexer

	// $ANTLR start synpred17_EquationLexer
	public final void synpred17_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:169: ( EFENCE )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:169: EFENCE
		{
		mEFENCE(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_EquationLexer

	// $ANTLR start synpred18_EquationLexer
	public final void synpred18_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:176: ( UNARYPLUS )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:176: UNARYPLUS
		{
		mUNARYPLUS(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_EquationLexer

	// $ANTLR start synpred19_EquationLexer
	public final void synpred19_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:186: ( UNARYMINUS )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:186: UNARYMINUS
		{
		mUNARYMINUS(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_EquationLexer

	// $ANTLR start synpred20_EquationLexer
	public final void synpred20_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:197: ( PLUSMINUS )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:197: PLUSMINUS
		{
		mPLUSMINUS(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_EquationLexer

	// $ANTLR start synpred21_EquationLexer
	public final void synpred21_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:207: ( FUNCTION )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:207: FUNCTION
		{
		mFUNCTION(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_EquationLexer

	// $ANTLR start synpred23_EquationLexer
	public final void synpred23_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:227: ( HAT )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:
		{
		if ( input.LA(1)=='^' ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred23_EquationLexer

	// $ANTLR start synpred24_EquationLexer
	public final void synpred24_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:231: ( COMBINATIONS )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:231: COMBINATIONS
		{
		mCOMBINATIONS(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred24_EquationLexer

	// $ANTLR start synpred25_EquationLexer
	public final void synpred25_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:244: ( OULINE )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:244: OULINE
		{
		mOULINE(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_EquationLexer

	// $ANTLR start synpred26_EquationLexer
	public final void synpred26_EquationLexer_fragment() throws RecognitionException {
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:251: ( WS )
		// C:\\Users\\cegepnt\\Desktop\\420-569-SF-EQ02-E15\\SCMNV\\Antlr-SCMNV\\src\\tree\\EquationLexer.g:1:251: WS
		{
		mWS(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_EquationLexer

	public final boolean synpred12_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_EquationLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_EquationLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA1_eotS =
		"\1\uffff\1\2\2\uffff";
	static final String DFA1_eofS =
		"\4\uffff";
	static final String DFA1_minS =
		"\1\60\1\54\2\uffff";
	static final String DFA1_maxS =
		"\2\71\2\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA1_specialS =
		"\4\uffff}>";
	static final String[] DFA1_transitionS = {
			"\12\1",
			"\1\3\1\uffff\1\3\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: NUMBER : ( INTEGER | DOUBLE );";
		}
	}

	static final String DFA5_eotS =
		"\51\uffff\1\62\2\uffff\1\70\1\72\5\uffff\1\74\11\uffff";
	static final String DFA5_eofS =
		"\75\uffff";
	static final String DFA5_minS =
		"\1\134\1\42\1\uffff\1\145\1\uffff\1\141\2\uffff\1\154\1\uffff\1\157\2"+
		"\uffff\1\150\3\uffff\1\150\1\156\1\uffff\2\151\2\uffff\2\147\1\141\12"+
		"\uffff\1\143\2\147\1\103\2\147\1\144\2\147\5\uffff\1\147\11\uffff";
	static final String DFA5_maxS =
		"\1\136\1\164\1\uffff\1\151\1\uffff\1\151\2\uffff\1\157\1\uffff\1\162\2"+
		"\uffff\1\160\3\uffff\1\151\1\162\1\uffff\2\151\2\uffff\2\147\1\141\12"+
		"\uffff\1\143\2\147\1\162\2\147\1\163\2\147\5\uffff\1\147\11\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\4\1\uffff\1\3\1\uffff\1\6\1\13\1\uffff\1\15\1\uffff\1\17\1"+
		"\21\1\uffff\1\25\1\27\1\30\2\uffff\1\34\2\uffff\1\1\1\2\3\uffff\1\24\1"+
		"\14\1\23\1\16\1\20\1\22\1\26\1\31\1\33\1\32\11\uffff\1\5\1\35\1\36\1\11"+
		"\1\7\1\uffff\1\37\1\40\1\41\1\44\1\42\1\45\1\43\1\12\1\10";
	static final String DFA5_specialS =
		"\75\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\1\uffff\1\2",
			"\1\13\37\uffff\1\25\1\uffff\1\14\13\uffff\1\11\2\uffff\1\7\15\uffff"+
			"\1\22\1\24\1\10\1\5\1\uffff\1\17\1\uffff\1\16\3\uffff\1\3\1\21\1\20\1"+
			"\23\1\12\1\uffff\1\4\1\15\1\6",
			"",
			"\1\27\3\uffff\1\26",
			"",
			"\1\31\2\uffff\1\32\1\30\3\uffff\1\33",
			"",
			"",
			"\1\35\2\uffff\1\34",
			"",
			"\1\36\2\uffff\1\37",
			"",
			"",
			"\1\40\7\uffff\1\41",
			"",
			"",
			"",
			"\1\42\1\43",
			"\1\44\3\uffff\1\45",
			"",
			"\1\46",
			"\1\47",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\57\2\uffff\1\60\53\uffff\1\56",
			"\1\61",
			"\1\63",
			"\1\64\10\uffff\1\65\5\uffff\1\66",
			"\1\67",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "43:9: ( '\\\\limits' | '\\\\left' | '\\\\right' | '^\\\\circ' | '\\\\degree' | '\\\\textdegree' | '\\\\dag' | '\\\\ddag' | '\\\\dagger' | '\\\\ddagger' | '\\\\S' | '\\\\copyright' | '\\\\P' | '\\\\pounds' | '\\\\\"{o}' | '\\\\prime' | '\\\\Diamond' | '\\\\sharp' | '\\\\clubsuit' | '\\\\diamondsuit' | '\\\\heartsuit' | '\\\\spadesuit' | '\\\\flat' | '\\\\natural' | '\\\\mho' | '\\\\angstrom' | '\\\\micro' | '\\\\ohm' | '\\\\degC' | '\\\\degF' | '\\\\arcdeg' | '\\\\arcmin' | '\\\\arcsec' | '\\\\big' | '\\\\Big' | '\\\\bigg' | '\\\\Bigg' )";
		}
	}

	static final String DFA10_eotS =
		"\4\uffff\1\26\1\30\23\uffff\1\56\2\uffff\1\61\2\uffff\1\63\24\uffff\1"+
		"\73\7\uffff\1\103\2\uffff\1\105\11\uffff";
	static final String DFA10_eofS =
		"\111\uffff";
	static final String DFA10_minS =
		"\1\57\2\uffff\1\112\2\75\1\145\1\uffff\2\145\1\151\1\160\1\uffff\3\141"+
		"\11\uffff\1\161\2\uffff\1\161\2\uffff\1\161\1\uffff\1\155\1\143\3\uffff"+
		"\1\164\1\uffff\1\145\7\uffff\1\163\3\uffff\1\145\1\143\1\75\1\uffff\1"+
		"\143\1\145\2\uffff\1\145\2\uffff\1\145\1\uffff\1\161\4\uffff\1\147\2\uffff";
	static final String DFA10_maxS =
		"\1\134\2\uffff\1\166\2\75\1\157\1\uffff\1\157\1\147\1\165\1\163\1\uffff"+
		"\1\157\1\162\1\157\11\uffff\1\161\2\uffff\1\163\2\uffff\1\161\1\uffff"+
		"\1\155\1\143\3\uffff\1\164\1\uffff\1\157\7\uffff\1\163\3\uffff\1\145\1"+
		"\143\1\145\1\uffff\1\143\1\147\2\uffff\1\145\2\uffff\1\145\1\uffff\1\161"+
		"\4\uffff\1\161\2\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\4\uffff\1\6\4\uffff\1\25\3\uffff\1\40\1\42\1\45\1\50"+
		"\1\54\1\11\1\7\1\13\1\15\1\uffff\1\5\1\41\1\uffff\1\27\1\33\1\uffff\1"+
		"\30\2\uffff\1\44\1\23\1\51\1\uffff\1\43\1\uffff\1\46\1\47\1\32\1\52\1"+
		"\4\1\3\1\12\1\uffff\1\10\1\14\1\16\3\uffff\1\31\2\uffff\1\24\1\22\1\uffff"+
		"\1\26\1\53\1\uffff\1\17\1\uffff\1\37\1\35\1\36\1\34\1\uffff\1\20\1\21";
	static final String DFA10_specialS =
		"\111\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\2\14\uffff\1\4\1\1\1\5\35\uffff\1\3",
			"",
			"",
			"\1\24\26\uffff\1\13\1\23\1\14\1\15\1\7\1\22\1\11\1\uffff\1\20\2\uffff"+
			"\1\10\1\17\1\6\1\uffff\1\16\2\uffff\1\12\2\uffff\1\21",
			"\1\25",
			"\1\27",
			"\1\31\3\uffff\1\33\5\uffff\1\32",
			"",
			"\1\34\6\uffff\1\35\2\uffff\1\36",
			"\1\37\1\uffff\1\40",
			"\1\41\3\uffff\1\43\7\uffff\1\42",
			"\1\44\2\uffff\1\45",
			"",
			"\1\47\15\uffff\1\46",
			"\1\51\3\uffff\1\52\14\uffff\1\50",
			"\1\53\15\uffff\1\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"",
			"",
			"\1\57\1\uffff\1\60",
			"",
			"",
			"\1\62",
			"",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"\1\66",
			"",
			"\1\70\11\uffff\1\67",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"",
			"",
			"",
			"\1\72",
			"\1\74",
			"\1\75\47\uffff\1\76",
			"",
			"\1\77",
			"\1\101\1\uffff\1\100",
			"",
			"",
			"\1\102",
			"",
			"",
			"\1\104",
			"",
			"\1\106",
			"",
			"",
			"",
			"",
			"\1\107\11\uffff\1\110",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "59:20: ( '=' | '/=' | '\\\\ne' | '\\\\neq' | '\\\\not\\\\equiv' | '\\\\equiv' | '<' | '\\\\le' | '<=' | '\\\\leq' | '>=' | '\\\\geq' | '>' | '\\\\ge' | '\\\\lessgtr' | '\\\\lesseqgtr' | '\\\\lesseqqgtr' | '\\\\sim' | '\\\\approx' | '\\\\simeq' | '\\\\cong' | '\\\\dot=' | '\\\\ll' | '\\\\gg' | '\\\\propto' | '\\\\mapsto' | '\\\\longmapsto' | '\\\\prec' | '\\\\succ' | '\\\\preceq' | '\\\\succeq' | '\\\\in' | '\\\\ni' | '\\\\vdash' | '\\\\dashv' | '\\\\smile' | '\\\\frown' | '\\\\parallel' | '\\\\perp' | '\\\\bowtie' | '\\\\asymp' | '\\\\models' | '\\\\doteq' | '\\\\Join' )";
		}

	}

}
