import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream stream = new ANTLRFileStream("C:\\Users\\atola\\Downloads\\ANTLR\\antlr\\src\\Test.txt");
        Java9Lexer lexer = new Java9Lexer(stream);
        List<? extends Token> o_tokens = lexer.getAllTokens();
        TokenStream tokens = new CommonTokenStream(new ListTokenSource(o_tokens));
        System.out.println(o_tokens);

        Java9Parser parser = new Java9Parser(tokens);
        ParseTree tree = parser.classDeclaration();
        Trees.inspect(tree, parser);
        int x = 7, u=9;
        x = x+u;

    }
}