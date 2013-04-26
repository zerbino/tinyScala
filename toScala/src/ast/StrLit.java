package ast;

public class StrLit extends Expr {

	private StringLiteral value;
	
	
	
	public StrLit(StringLiteral value) {
		super();
		this.value = value;
	}



	@Override
	public String toString() {
		return value.toString();
	}

}
