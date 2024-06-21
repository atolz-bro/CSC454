

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        CharStream stream = new ANTLRInputStream("549+(2+89)");
        IntegerExpressionLexer lexer = new IntegerExpressionLexer(stream);

        List<? extends Token> o_tokens = lexer.getAllTokens();
        TokenStream tokens = new CommonTokenStream(new ListTokenSource(o_tokens));
        System.out.println(o_tokens);
        //System.out.println(tokens.getTokenSource().nextToken());
        IntegerExpressionParser parser = new IntegerExpressionParser(tokens);
        ParseTree tree = parser.root();
        Trees.inspect(tree, parser);


        //new CommonTokenStream(new ListTokenSource(lexer.getAllTokens()));
    }
}

