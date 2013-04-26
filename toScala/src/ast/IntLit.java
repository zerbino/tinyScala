package ast;

public class IntLit extends Expr {
	
	private int value;
	
	

	public IntLit(int value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return ""+value;
	}

}
