
/*
* generated by Xtext
*/
lexer grammar InternalREALLexer;


@header {
package org.osate.ocarina.real.xtext.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_54 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('A'|'a')('R'|'r')('E'|'e')'_'('P'|'p')('R'|'r')('O'|'o')('P'|'p')('E'|'e')('R'|'r')('T'|'t')('Y'|'y')'_'('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e');

KEYWORD_51 : ('G'|'g')('E'|'e')('T'|'t')'_'('P'|'p')('R'|'r')('O'|'o')('P'|'p')('E'|'e')('R'|'r')('T'|'t')('Y'|'y')'_'('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e');

KEYWORD_52 : ('I'|'i')('S'|'s')'_'('P'|'p')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('N'|'n')('G'|'g')'_'('T'|'t')('H'|'h')('R'|'r')('O'|'o')('U'|'u')('G'|'g')('H'|'h');

KEYWORD_53 : ('I'|'i')('S'|'s')'_'('S'|'s')('U'|'u')('B'|'b')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('N'|'n')('E'|'e')('N'|'n')('T'|'t')'_'('O'|'o')('F'|'f');

KEYWORD_50 : ('I'|'i')('S'|'s')'_'('P'|'p')('R'|'r')('O'|'o')('V'|'v')('I'|'i')('D'|'d')('E'|'e')('D'|'d')'_'('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s');

KEYWORD_49 : ('I'|'i')('S'|'s')'_'('C'|'c')('O'|'o')('N'|'n')('N'|'n')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('N'|'n')('G'|'g')'_'('T'|'t')('O'|'o');

KEYWORD_46 : ('I'|'i')('S'|'s')'_'('A'|'a')('C'|'c')('C'|'c')('E'|'e')('S'|'s')('S'|'s')('I'|'i')('N'|'n')('G'|'g')'_'('T'|'t')('O'|'o');

KEYWORD_47 : ('I'|'i')('S'|'s')'_'('C'|'c')('O'|'o')('N'|'n')('N'|'n')('E'|'e')('C'|'c')('T'|'t')('E'|'e')('D'|'d')'_'('T'|'t')('O'|'o');

KEYWORD_48 : ('P'|'p')('R'|'r')('O'|'o')('P'|'p')('E'|'e')('R'|'r')('T'|'t')('Y'|'y')'_'('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s');

KEYWORD_45 : ('I'|'i')('S'|'s')'_'('A'|'a')('C'|'c')('C'|'c')('E'|'e')('S'|'s')('S'|'s')('E'|'e')('D'|'d')'_'('B'|'b')('Y'|'y');

KEYWORD_44 : ('I'|'i')('S'|'s')'_'('C'|'c')('A'|'a')('L'|'l')('L'|'l')('E'|'e')('D'|'d')'_'('B'|'b')('Y'|'y');

KEYWORD_43 : ('I'|'i')('S'|'s')'_'('B'|'b')('O'|'o')('U'|'u')('N'|'n')('D'|'d')'_'('T'|'t')('O'|'o');

KEYWORD_41 : ('A'|'a')('L'|'l')('L'|'l')'_'('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l')('S'|'s');

KEYWORD_42 : ('I'|'i')('S'|'s')'_'('C'|'c')('A'|'a')('L'|'l')('L'|'l')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_38 : ('C'|'c')('A'|'a')('R'|'r')('D'|'d')('I'|'i')('N'|'n')('A'|'a')('L'|'l');

KEYWORD_39 : ('P'|'p')('R'|'r')('O'|'o')('P'|'p')('E'|'e')('R'|'r')('T'|'t')('Y'|'y');

KEYWORD_40 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('S'|'s');

KEYWORD_34 : ('P'|'p')('R'|'r')('O'|'o')('D'|'d')('U'|'u')('C'|'c')('T'|'t');

KEYWORD_35 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

KEYWORD_36 : ('F'|'f')('O'|'o')('R'|'r')('E'|'e')('A'|'a')('C'|'c')('H'|'h');

KEYWORD_37 : ('T'|'t')('H'|'h')('E'|'e')('O'|'o')('R'|'r')('E'|'e')('M'|'m');

KEYWORD_31 : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s');

KEYWORD_32 : ('S'|'s')('Y'|'y')('S'|'s')('T'|'t')('E'|'e')('M'|'m');

KEYWORD_33 : ('R'|'r')('E'|'e')('T'|'t')('U'|'u')('R'|'r')('N'|'n');

KEYWORD_25 : ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t');

KEYWORD_26 : ('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t');

KEYWORD_27 : ('I'|'i')('S'|'s')'_'('I'|'i')('N'|'n');

KEYWORD_28 : ('Q'|'q')('U'|'u')('E'|'e')('U'|'u')('E'|'e');

KEYWORD_29 : ('C'|'c')('H'|'h')('E'|'e')('C'|'c')('K'|'k');

KEYWORD_30 : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

KEYWORD_16 : ('H'|'h')('E'|'e')('A'|'a')('D'|'d');

KEYWORD_17 : ('L'|'l')('A'|'a')('S'|'s')('T'|'t');

KEYWORD_18 : ('L'|'l')('I'|'i')('S'|'s')('T'|'t');

KEYWORD_19 : ('M'|'m')('M'|'m')('A'|'a')('X'|'x');

KEYWORD_20 : ('M'|'m')('S'|'s')('U'|'u')('M'|'m');

KEYWORD_21 : ('S'|'s')('I'|'i')('Z'|'z')('E'|'e');

KEYWORD_22 : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

KEYWORD_23 : ('T'|'t')('H'|'h')('E'|'e')('N'|'n');

KEYWORD_24 : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

KEYWORD_6 : ('G'|'g')('C'|'c')('D'|'d');

KEYWORD_7 : ('L'|'l')('C'|'c')('M'|'m');

KEYWORD_8 : ('M'|'m')('A'|'a')('X'|'x');

KEYWORD_9 : ('M'|'m')('I'|'i')('N'|'n');

KEYWORD_10 : ('S'|'s')('U'|'u')('M'|'m');

KEYWORD_11 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_12 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_13 : ('M'|'m')('O'|'o')('D'|'d');

KEYWORD_14 : ('N'|'n')('O'|'o')('T'|'t');

KEYWORD_15 : ('V'|'v')('A'|'a')('R'|'r');

KEYWORD_2 : ('D'|'d')('O'|'o');

KEYWORD_3 : ('I'|'i')('F'|'f');

KEYWORD_4 : ('I'|'i')('N'|'n');

KEYWORD_5 : ('O'|'o')('R'|'r');

KEYWORD_1 : '|';



RULE_PLUS : '+';

RULE_POWER : '**';

RULE_STAR : '*';

RULE_SLASH : '/';

RULE_MINUS : '-';

RULE_NOT_EQUAL : '<>';

RULE_LESS_EQUAL : '<=';

RULE_GREATER_EQUAL : '>=';

RULE_GREATER : '>';

RULE_LESS : '<';

RULE_EQUAL : '=';

RULE_AFFECTATION_OPERATOR : ':=';

RULE_PUNC_OPEN_BRACE : '{';

RULE_PUNC_CLOSE_BRACE : '}';

RULE_PUNC_SEMI_COLON : ';';

RULE_PUNC_OPEN_PARENTHESIS : '(';

RULE_PUNC_CLOSE_PARENTHESIS : ')';

RULE_PUNC_COMMA : ',';

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_NUMERIC : ('0'..'9'|'.'|'+'|'-'|'a'..'z'|'A'..'Z')+;



