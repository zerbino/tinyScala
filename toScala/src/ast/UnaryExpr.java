package ast;

public class UnaryExpr extends Expr {

	private VOp vop;

	private Expr expr;

	public UnaryExpr(VOp vop, Expr expr) {
		super();
		this.vop = vop;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return vop + " " + expr.toString();
	}

}
