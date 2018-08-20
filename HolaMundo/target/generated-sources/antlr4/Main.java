import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

	public static void main(String[] args)  {
		try {
		CharStream input = CharStreams.fromStream(System.in); 
		HelloLexer lexer = new HelloLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); 
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