package lexer;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Lexer {
	public int line = 1;
	private char peek = ' ';
	private char peek2 = ' ';

	private Hashtable words = new Hashtable();

	void reserve(Word t) {
		words.put(t.lexeme, t);
	}

	public Lexer() {
		reserve(new Word(Tag.TRUE, "true"));
		reserve(new Word(Tag.FALSE, "false"));
	}

	/* salta espacios en blanco */
	public Token scan() throws IOException {
		while (true) {
			peek = peek2;
			for (;peek == ' '; peek = (char) System.in.read()) {
				if (peek == ' ' || peek == '\t')
					continue;
				else if (peek == '\n')
					line = line + 1;
				else
					break;
			}
			// para comentarios de una línea
			if (peek == '/') {
				peek2 = (char) System.in.read();
				if (peek2 == '/') {
					while ((peek = (char) System.in.read()) != '\n');
					peek2 = ' ';
					continue;
				}
			}
			/* Para generar un entero */
			if (Character.isDigit(peek)) {
				int v = 0;
				do {
					v = 10 * v + Character.digit(peek, 10);
					peek = (char) System.in.read();
				} while (Character.isDigit(peek));
				return new Num(v);
			}

			/* Para generar un identificador */
			if (Character.isLetter(peek)) {
				StringBuffer b = new StringBuffer();
				do {
					b.append(peek);
					peek = (char) System.in.read();
				} while (Character.isLetterOrDigit(peek));
				String s = b.toString();
				Word w = (Word) words.get(s);
				if (w != null)
					return w;
				w = new Word(Tag.ID, s);
				words.put(s, w);
				return w;
			}
			Token t = new Token(peek);
			peek = ' ';
			return t;
		}
	}
}
