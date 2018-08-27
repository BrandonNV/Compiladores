/**
 * Define a grammar called Hello
 */
grammar Romano;
arabigo  : ((millares)(centenas)(decenas)(unidades)) |
           ((centenas)(decenas)(unidades)) | 
           ((decenas)(unidades)) |
           (unidades)
           ;

unidades: DIGIT {
	int u = Integer.parseInt(_ctx.getText());
	if (u < 4)
		System.out.print(String.join("", java.util.Collections.nCopies(u,"I")));
	else if (u == 4)
		System.out.print("IV");
	else if (u == 5)
		System.out.print("V");
	else if (u < 9)
		System.out.print("V"+String.join("", java.util.Collections.nCopies(u-5,"I")));
	else if (u == 9)
		System.out.print("IX");
};
decenas: DIGIT {
	int u = Integer.parseInt(_ctx.getText());
	if (u < 4)
		System.out.print(String.join("", java.util.Collections.nCopies(u,"X")));
	else if (u == 4)
		System.out.print("XL");
	else if (u == 5)
		System.out.print("L");
	else if (u < 9)
		System.out.print("L"+String.join("", java.util.Collections.nCopies(u-5,"X")));
	else if (u == 9)
		System.out.print("XC");
};
centenas: DIGIT{
	int u = Integer.parseInt(_ctx.getText());
	if (u < 4)
		System.out.print(String.join("", java.util.Collections.nCopies(u,"C")));
	else if (u == 4)
		System.out.print("CD");
	else if (u == 5)
		System.out.print("D");
	else if (u < 9)
		System.out.print("D"+String.join("", java.util.Collections.nCopies(u-5,"C")));
	else if (u == 9)
		System.out.print("CM");
};
millares: DIGIT{
	int u = Integer.parseInt(_ctx.getText());
	if (u < 4)
		System.out.print(String.join("", java.util.Collections.nCopies(u,"M")));
	
};

ID : [a-z]+ ;             // match lower-case identifiers
DIGIT:[0-9];
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

