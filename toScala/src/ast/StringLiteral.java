package ast;

public class StringLiteral extends AST {
	
	private String string;

	
	
	public StringLiteral(String string) {
		super();
		this.string = string;
	}



	@Override
	public String toString() {
		return string;
	}

	

}
