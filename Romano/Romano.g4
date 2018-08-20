/**
 * Define a grammar called Hello
 */
grammar Romano;
romano  : (decenas)(unidades) ;  

unidades : digito; 
decenas: digito;    
digito : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' |'8' | '9';

        

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

 