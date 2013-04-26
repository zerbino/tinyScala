package ast;

import java.util.List;

public class Params extends AST {

	private List<Param> params;

	public Params(List<Param> params) {
		super();
		if (params != null && params.size() >= 1) {
			this.params = params;
		} else {
			throw new RuntimeException();
		}
	}
	
	

	@Override
	public String toString() {
		
		String toRet ="";
		for(Param param : params){
			toRet += param.toString()+", ";
		}
		toRet = toRet.substring(0, toRet.length()-1);
		return toRet;
	}

}
