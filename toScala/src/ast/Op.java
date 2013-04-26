package ast;

public class Op extends AST {

	public String valueOf(VOp vop) {
		switch (vop) {
		case PLUS:
			return "+";
		case MOINS:
			return "-";
		case FOIS:
			return "*";
		case DIVISE : return "/";
		case ET : return "&&";
		case EGAL : return "==";
		case DIFFERENT : return "!=";
		case SUP : return ">";
		case SUPEGAL : return ">=";
		case INF : return "<";
		case INFEGAL : return "<=";
		default:
			return "not an operator";
		}
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return null;
	}

}
