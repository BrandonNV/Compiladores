import java.util.Collections;

public class MiListener extends RomanoBaseListener {
	@Override public void enterUnidades(RomanoParser.UnidadesContext ctx) {
		int i = Integer.parseInt(ctx.getText());
		if(i <= 3) 
			for(int j = 1; j <= i; j++) 
				System.out.print('I');
		else if (i == 4)
			System.out.print("IV");
		else if (i == 5)
			System.out.print("V");
		else if (i >= 6 && i <= 8) {
			System.out.print("V");
			for(int j = 6; j <= i; j++) 
				System.out.print('I');
		}
		else 
			System.out.print("IX");
	}
	
	@Override public void exitRomano(RomanoParser.RomanoContext ctx) { 
		System.out.println();
	}
	
	@Override public void enterDecenas(RomanoParser.DecenasContext ctx) { 
		int i = Integer.parseInt(ctx.getText());
		if(i <= 3) 
			System.out.print(String.join("", java.util.Collections.nCopies(i,"I")));
			/*for(int j = 1; j <= i; j++) 
				System.out.print('X'); */
		else if (i == 4)
			System.out.print("XL");
		else if (i == 5)
			System.out.print("L");
		else if (i >= 6 && i <= 8) {
			System.out.print("L");
			for(int j = 6; j <= i; j++) 
				System.out.print('X');
		}
		else 
			System.out.print("XC");
	}	
		
	

}
