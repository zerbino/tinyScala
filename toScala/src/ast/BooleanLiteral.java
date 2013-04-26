package ast;

public class BooleanLiteral extends AST{
	
	private boolean bool;

	public BooleanLiteral(boolean bool) {
		super();
		this.bool = bool;
	}
	
	public String toString(){
		return ""+this.bool;
	}

}
