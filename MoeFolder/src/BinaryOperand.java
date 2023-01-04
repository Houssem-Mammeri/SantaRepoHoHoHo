public abstract class BinaryOperand implements Operand{
	protected Satisfiable left;
	protected Satisfiable right;
    
	public void setLeftOperand(Satisfiable notA) {
		// TODO Auto-generated method stub
		this.left = notA;
		
	}

	public void setRightOperand(Satisfiable c) {
		// TODO Auto-generated method stub
		this.right = c;
	}

	
}
