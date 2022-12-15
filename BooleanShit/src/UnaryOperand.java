public class UnaryOperand extends Operand implements  Satisfiable {
    public void setOperande(Operand a) { }
    @Override
    public boolean isSatisfiable() {return false;}
    @Override
    public void setLeftOperand(Operand notA) {}
    @Override
    public void setRightOperand(Operand c) {}

}
