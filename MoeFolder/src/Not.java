public class Not extends UnaryOperand{

	@Override
	public boolean isSatisfiable() {
		// TODO Auto-generated method stub
		return ! super.val.isSatisfiable();
	}
	public String toString() {
		  return "!" + super.val.toString() ;
				  }

	
	
}
