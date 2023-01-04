public class BooleanVariable implements Satisfiable {
    private boolean val;
    private String valName;
    private String decisionToAnswer;
	public BooleanVariable(String b, String decisionToAnswer) {
    	this.valName = b;
    	this.decisionToAnswer = decisionToAnswer;
    }
	public String toString() {
		  return this.valName;
				  }
	public void setValueOfTruth(boolean b) {
		// TODO Auto-generated method stub
		this.val = b;
		
	}

	@Override
	public boolean isSatisfiable() {
		// TODO Auto-generated method stub
		return this.val;
	}

	public String interpretation() {
		// TODO Auto-generated method stub
		String s = this.decisionToAnswer;
		if (this.val == false) {
			s = "not " + s;
		}
		return s;
	}
}
