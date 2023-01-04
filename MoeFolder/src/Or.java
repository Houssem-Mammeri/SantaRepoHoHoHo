public class Or extends BinaryOperand{

	@Override
	public boolean isSatisfiable() {
		// TODO Auto-generated method stub
		boolean b = super.left.isSatisfiable() || super.right.isSatisfiable();
		return b;
	}
	public String toString() {
		  return "(" + super.left.toString() + "+" + super.right.toString() + ")";
				  }
}
