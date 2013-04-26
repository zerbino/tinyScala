package ast;

public class Param extends AST {

	private Id id;
	private ClassId classId;

	public Param(Id id, ClassId classId) {
		super();
		this.id = id;
		this.classId = classId;
	}

	@Override
	public String toString() {
		return id.toString()+" "+classId.toString();
	}

}
