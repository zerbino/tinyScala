package ast;

public class CondExpr extends Expr {

	private Expr expr1, expr2, expr3;

	public CondExpr(Expr expr1, Expr expr2, Expr expr3) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr3 = expr3;
	}

	@Override
	public String toString() {
		return expr1.toString() + "? " + expr2.toString() + " : "
				+ expr3.toString();
	}

}
