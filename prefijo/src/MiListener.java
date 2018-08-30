
public class MiListener extends prefijoBaseListener {
	@Override public void enterTerm(prefijoParser.TermContext ctx) { 
		System.out.print(ctx.getText());
	}
	
	@Override public void enterExpr(prefijoParser.ExprContext ctx) { 
		if (ctx.getChildCount() == 3) {
			System.out.print(ctx.getChild(1));
		}
	}
	@Override public void exitProg(prefijoParser.ProgContext ctx) { 
		System.out.println();
	}
}
