package ast;

import java.util.ArrayList;
import java.util.List;

public class Classe extends AST {

	private ClassId classId;
	private Params params;
	private List<Method> methods;
	
	
	
	public Classe(ClassId classId, Params params, List<Method> methods) {
		super();
		this.classId = classId;
		this.params = params;
		this.methods = new ArrayList<Method>(methods);
	}
	
	public Classe(ClassId classId, ArrayList<Method> methods){
		this(classId, null, methods);
	}



	@Override
	public String toString() {
		return "class "+((this.params !=null)?classId.toString():"")+"("+params.toString()+")";
	}

}
