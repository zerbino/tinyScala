package ast;

public class FieldAccess extends Expr {
	
	private Expr expr;
	
	private Id id;
	
	

	public FieldAccess(Expr expr, Id id) {
		super();
		this.expr = expr;
		this.id = id;
	}



	@Override
	public String toString() {
		return expr.toString()+"."+id;
	}

}
