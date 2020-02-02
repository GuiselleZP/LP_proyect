grammar myGrammar;

inicio  : v* POOL ID? L (CADENA | ID) R DP v* a  ;

a : START F? process* | //El id corresponde al evento end
    line
    ;

line: LINE ID L (ID | CADENA) R DP process* a+;

v : ID E CADENA  ;

process : TASK ID? L(ID | CADENA)? C typet? C ID? R  | event |
    GATE ID? L d R DP arrow+;

d : (ID | CADENA)? C  typeg? C typeg?;//La ultima es al tipo de compuerta que cierra

typeg : EXC | EXCV | PLL | INC | COM ;
typet : Basic | US | Manual | Service | Send | Recept | Script | Refer;

arrow : F L(ID | CADENA) C? ID? R (process | otro*)  ;// -> (descripcion) -> processo
otro : arrow | event;
event: ID? END;

Basic: 'basic';
COM: 'com';
C: ',';
DP: ':';
EXC: 'exc' | 'exclusive';
EXCV: 'excv';
E: '=';
F: '->';
GATE: 'gate';
INC: 'inc' | 'inclusive';
LINE: 'line';
Manual: 'manual';
PLL: 'pll';
POOL: 'pool';
Send: 'send';
Script: 'script';
Service: 'sevice';
START: 'start';
Recept: 'recept';
Refer: 'refer';
TASK: 'task';
US: 'user';
END: 'end';
L : '(';
R : ')';

//COMMENT: '#' ~[\r\n]* -> skip;
//INT :   [0-9]+ ;             // Define token INT as one or more digits
ID : [a-zA-Z]+[_]*[a-zA-Z0-9]*;
//WS  :   [\t\r\n]+ -> skip ; // Define whitespace rule, toss it out
WHITESPACE : ' ' -> skip;
CADENA :([']( ~[\r\n\f] )*?[']) | (["]( ~[\r\n\f] )*?["]);
//ID :  [a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;