public class MiListener extends CerosUnosBaseListener {
	int numeroS = 0;
	
	@Override public void enterS(CerosUnosParser.SContext ctx) { 
		numeroS++;
	}
	
	@Override public void exitProg(CerosUnosParser.ProgContext ctx) { 
		System.out.println(numeroS);
	}
}
