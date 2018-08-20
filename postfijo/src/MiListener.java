import java.util.Stack;

public class MiListener extends PostfijoBaseListener {
	Stack<Integer> pila = new Stack<>();
	
	@Override public void enterTerm(PostfijoParser.TermContext ctx) { 
		System.out.print(ctx.getText());
		pila.push(Integer.parseInt(ctx.getText()));
	}
	
	@Override public void exitExpr(PostfijoParser.ExprContext ctx) { 
		if (ctx.getChildCount() == 3) {
			System.out.print(ctx.getChild(1));
			int b = pila.pop();
			int a = pila.pop();
			if (ctx.getChild(1).getText().equals("+")) 
				pila.push(a+b);
			else
				pila.push(a-b);
		}
	}
	@Override public void exitProg(PostfijoParser.ProgContext ctx) { 
		System.out.println();
		System.out.println(pila.pop());
	}
}
