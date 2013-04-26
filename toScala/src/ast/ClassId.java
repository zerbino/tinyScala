package ast;

public class ClassId extends AST {

	private String value;

	public ClassId(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

}
