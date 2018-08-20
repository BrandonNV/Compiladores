
public class MiListener extends HelloBaseListener {
	@Override public void enterR(HelloParser.RContext ctx) { 
		System.out.println(ctx.getChild(1).getText());
		
		
	}
	
}
