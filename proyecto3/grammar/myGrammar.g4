grammar myGrammar;

inicio  : v* POOL ID? L (CADENA | ID) R DP v* a  ;

a : START F? process* | //El id corresponde al evento end
    line
    ;

line: LINE ID L (ID | CADENA) R DP process* (elemnt P ID)* a+;

v : ID EQ CADENA  ;

elemnt: T| E |  GT ;

process : TASK ID? L(ID | CADENA)? C typet? C ID? R  | event |
    GATE ID? L d R DP arrow+ process*;

d : (ID | CADENA)? C  typeg? C typeg?;//La ultima es al tipo de compuerta que cierra

typeg : EXC | EXCV | PLL | INC | COM ;
typet : Basic | US | Manual | Service | Send | Recept | Script | Refer;

arrow : F L(ID | CADENA)? C? event? R  process? ;// -> (descripcion) -> processo
otro : process*;
event: ID | ID? END | Timer L ID R ;

C: ',';
DP: ':';
EQ: '=';
F: '->';
P: '.';
L : '(';
R : ')';

Basic: 'basic';
COM: 'com';
E: 'ev';
EXC: 'exc' | 'exclusive';
EXCV: 'excv';
GATE: 'gate';
GT: 'gt';
INC: 'inc' | 'inclusive';
LINE: 'line';
Manual: 'manual';
PLL: 'pll' | 'parallel';
POOL: 'pool';
Send: 'send';
Script: 'script';
Service: 'sevice';
START: 'start';
Recept: 'recept';
Refer: 'refer';
T: 'tk';
Timer: 'timer';
TASK: 'task';
US: 'user';
END: 'end';


//COMMENT: '#' ~[\r\n]* -> skip;
//INT :   [0-9]+ ;             // Define token INT as one or more digits
ID : [a-zA-Z]+[_]*[a-zA-Z0-9]*;
//WS  :   [\t\r\n]+ -> skip ; // Define whitespace rule, toss it out
WHITESPACE : ' ' -> skip;
CADENA :([']( ~[\r\n\f] )*?[']) | (["]( ~[\r\n\f] )*?["]);
//ID :  [a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;