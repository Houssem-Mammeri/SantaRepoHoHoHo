public class LogicalExpressionWith3Variables {
    TableOfSymbols symboles;

    public Satisfiable constructALogicalExpressionWith3Variables() {
        this.symboles = new TableOfSymbols();
        BooleanVariable a = new BooleanVariable("a", "Phone ring");
        this.symboles.addVariable(a);
        BooleanVariable b = new BooleanVariable("b", "Decision to answer");
        this.symboles.addVariable(b);
        BooleanVariable c = new BooleanVariable("c", "Decision to call");
        this.symboles.addVariable(c);
        BinaryOperand leftConjunction = new And();
        UnaryOperand notA = new Not();
        notA.setOperande(a);
        leftConjunction.setLeftOperand(notA);
        leftConjunction.setRightOperand(c);
        BinaryOperand rightConjunction = new And();
        rightConjunction.setLeftOperand(a);
        rightConjunction.setRightOperand(b);
        BinaryOperand pickUp = new Or();
        pickUp.setLeftOperand(leftConjunction);
        pickUp.setRightOperand(rightConjunction);
        return pickUp;
    }
    public void whenPickUpYourPhone(Satisfiable pickUp) {
        for (int i = 0; i <= Math.pow(2,3) -1; i++) {
            this.symboles.setValueOfTruth(i,3);
            if (pickUp.isSatisfiable()) {
                System.out.print("I pick up my phone when: ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(this.symboles.interpretation(j));
                    if (j < 2)
                        System.out.print(" and ");
                }
                System.out.println();
            }
        }
    }
    public void whenNotPickUpYourPhone(Satisfiable pickUp) {
        for (int i = 0; i <= Math.pow(2,3) -1; i++) {
            this.symboles.setValueOfTruth(i,3);
            if (!pickUp.isSatisfiable()) {
                System.out.print("I don't pick up my phone when: ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(this.symboles.interpretation(j));
                    if (j < 2)
                        System.out.print(" and ");
                }
                System.out.println();
            }
        }
    }

}