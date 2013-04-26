package ast;

import java.util.List;

public class Exprs extends AST {

	private List<Expr> exprs;

	public Exprs(List<Expr> exprs) {
		super();
		if (exprs.size() >= 1) {
			this.exprs = exprs;
		} else {
			throw new RuntimeException(
					"There should be at least one expression in a list of expression");

		}
	}

	@Override
	public String toString() {
		
		String toRet ="";
		for(Expr expr:exprs){
			toRet+=expr.toString()+", ";
		}
		toRet = toRet.substring(0, toRet.length()-2);
		
		return toRet;
	}

}
