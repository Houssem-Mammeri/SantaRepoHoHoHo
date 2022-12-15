public class BinaryOperand extends Operand implements Satisfiable{
    @Override
    public boolean isSatisfiable() {return false;}

    @Override
    public void setLeftOperand(Operand notA) {}

    @Override
    public void setRightOperand(Operand c) {}
}
