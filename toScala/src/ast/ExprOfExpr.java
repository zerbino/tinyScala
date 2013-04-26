package ast;

public class ExprOfExpr extends Expr {

	private Expr expr;

	public ExprOfExpr(Expr expr) {
		super();
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "(" + expr.toString() + ")";
	}

}
