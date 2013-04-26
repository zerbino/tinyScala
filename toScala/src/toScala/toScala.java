package toScala;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class toScala {
	public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is); 
        toScalaLexer lexer = new toScalaLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        toScalaParser parser = new toScalaParser(tokens); 
        ParseTree tree = parser.program(); 
        System.out.println(tree.toStringTree(parser));
       //  building the AST with a visitor
         ASTVisitor visitor = new ASTVisitor();
         ast.AST ast = visitor.visit(tree);
         System.out.println(ast);
    }
}
