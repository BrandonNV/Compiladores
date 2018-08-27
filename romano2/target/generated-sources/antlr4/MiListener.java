import java.util.*;

public class MiListener extends RomanoBaseListener{
	@Override public void enterUnidades(RomanoParser.UnidadesContext ctx) { 
		int u = Integer.parseInt(ctx.getText());
		if (u < 4)
			System.out.print(String.join("", Collections.nCopies(u,"I")));
		else if (u == 4)
			System.out.print("IV");
		else if (u == 5)
			System.out.print("V");
		else if (u < 9)
			System.out.print("V"+String.join("", Collections.nCopies(u-5,"I")));
		else if (u == 9)
			System.out.print("IX");
	}
	
	@Override public void enterDecenas(RomanoParser.DecenasContext ctx) { 
		int u = Integer.parseInt(ctx.getText());
		if (u < 4)
			System.out.print(String.join("", Collections.nCopies(u,"X")));
		else if (u == 4)
			System.out.print("XL");
		else if (u == 5)
			System.out.print("L");
		else if (u < 9)
			System.out.print("L"+String.join("", Collections.nCopies(u-5,"X")));
		else if (u == 9)
			System.out.print("XC");
	}
	@Override public void enterCentenas(RomanoParser.CentenasContext ctx) {
		int u = Integer.parseInt(ctx.getText());
		if (u < 4)
			System.out.print(String.join("", Collections.nCopies(u,"C")));
		else if (u == 4)
			System.out.print("CD");
		else if (u == 5)
			System.out.print("D");
		else if (u < 9)
			System.out.print("D"+String.join("", Collections.nCopies(u-5,"C")));
		else if (u == 9)
			System.out.print("CM");
	}
	
	@Override public void enterMillares(RomanoParser.MillaresContext ctx) {
		int u = Integer.parseInt(ctx.getText());
		if (u < 4)
			System.out.print(String.join("", Collections.nCopies(u,"M")));
		
	}
}
