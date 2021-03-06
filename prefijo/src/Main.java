import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

	public static void main(String[] args)  {
		try {
		CharStream input = CharStreams.fromStream(System.in); 
		prefijoLexer lexer = new prefijoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		prefijoParser parser = new prefijoParser(tokens);
		ParseTree tree = parser.prog(); 
		System.out.println(tree.toStringTree(parser)); 
		ParseTreeWalker walker = new ParseTreeWalker();
		MiListener listener = new MiListener();
		walker.walk(listener, tree); 
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}