/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar uScala0;

// règles syntaxiques
program : 
        ;

// règles lexicales
ID      : [a-z][a-zA-Z0-9]*
        ;
CLASSID : [A-Z][a-zA-Z0-9]*
        ;
INTLIT  : '0' | [0-9]+
        ;
BOOLIT  : 'true' | 'false'
        ;
STRLIT  : '"' (ESC | .)*? '"'
        ;
fragment ESC : '\\' [btnr"\\]
        ;
OP1     : '-' | '!'
        ;
OP2     : '+' | '-' | '*' | '/' | '&&' | '||' | '==' | '!=' | '>' | '>=' | '<' | '<='
        ;
COMMENT : '//' .*? '\r'? '\n' -> skip // line comment
        ;
WS      : [\n\t\r ] -> skip
        ;
