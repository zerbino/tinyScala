package ast;


public enum VOp {
	PLUS("+"), MOINS("-"), FOIS("*"), DIVISE("/"), OU("||"), EGAL("=="),
	ET("&&"), DIFFERENT("!="), SUP(">"), SUPEGAL(">="), INF("<"), INFEGAL("<="), NOTHING("");
	
	private String val;
	
	private VOp(String val){
		this.val = val;
	}
	
	@Override
	public String toString(){
		return val;
	}
	
	public static VOp getEnum(String string){
		switch(string){
			case "+" : return PLUS;
			case "-" : return MOINS;
			case "*" : return FOIS;
			case "/" : return DIVISE;
			case "||" : return OU;
			case "==" : return EGAL;
			case "&&" : return ET;
			case "!=" : return DIFFERENT;
			case ">" : return SUP;
			case ">=" : return SUPEGAL;
			case "<" : return INF;
			case "<=" : return INFEGAL;
			
			default : return NOTHING;
		}
	}
	
	
	

}
