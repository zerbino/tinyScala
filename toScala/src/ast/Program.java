package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends AST {

	private Expr expr;
	
	private List<ast.Classe> classes;
	
	
	public Program(Expr expr, List<Classe> classes) {
		super();
		this.expr = expr;
		this.classes = classes;
	}



	@Override
	public String toString() {
		String classes = "";
		for(ast.Classe classe:this.classes){
			classes += classe.toString()+" ";
		}
		if(this.classes.size()>0)classes = classes.substring(0, classes.length()-1);
		
		return expr.toString()+" "+classes;
	}

}
