package ast;

public class BinaryExpr extends Expr {

	private Expr expr1, expr2;
	
	private VOp vop;
	
	
	
	public BinaryExpr(Expr expr1, Expr expr2, VOp vop) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.vop = vop;
	}



	@Override
	public String toString() {
		return expr1.toString()+" "+vop.toString()+" "+expr2.toString();
	}

}
