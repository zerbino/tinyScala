package ast;

public class BooLit extends Expr {

	private BooleanLiteral bool;
	
	
	
	public BooLit(BooleanLiteral bool) {
		super();
		this.bool = bool;
	}

	@Override
	public String toString() {
		return ""+this.bool;
	}

}
