public class LogicalExpressionWith4Variables {
    TableOfSymbols symboles;
    int nvar = 4;
    public LogicalExpressionWith4Variables(int nvar ) {
    	this.nvar = nvar;
    }
    public Satisfiable constructALogicalExpressionWith4Variables() {
        this.symboles = new TableOfSymbols();
        BooleanVariable a = new BooleanVariable("a", "enough money");
        this.symboles.addVariable(a);
        BooleanVariable b = new BooleanVariable("b", "finished my homework");
        this.symboles.addVariable(b);
        BooleanVariable c = new BooleanVariable("c", " Public transport is on strike");
        this.symboles.addVariable(c);
        BooleanVariable d = new BooleanVariable("d", "Auto Family is available");
        this.symboles.addVariable(d);
        BinaryOperand leftConjunction = new And();
        UnaryOperand notC = new Not();
        notC.setOperande(c);
        leftConjunction.setLeftOperand(a);
        leftConjunction.setRightOperand(b);
        BinaryOperand rightConjunction = new Or();
        rightConjunction.setLeftOperand(notC);
        rightConjunction.setRightOperand(d);
        BinaryOperand pickUp = new And();
        pickUp.setLeftOperand(leftConjunction);
        pickUp.setRightOperand(rightConjunction);
        return pickUp;
    }
    public void WhenGoOut(Satisfiable pickUp) {
        for (int i = 0; i <= Math.pow(2,nvar) -1; i++) {
            this.symboles.setValueOfTruth(i,nvar);
            if (pickUp.isSatisfiable()) {
                System.out.print("You can go out if: ");
                for (int j = 0; j < nvar; j++) {
                    System.out.print(this.symboles.interpretation(j));
                    if (j < nvar-1)
                        System.out.print(" and ");
                }
                System.out.println();
            }
        }
    }
    public void WhenNotGoOut(Satisfiable pickUp) {
        for (int i = 0; i <= Math.pow(2,nvar) -1; i++) {
            this.symboles.setValueOfTruth(i,nvar);
            if (!pickUp.isSatisfiable()) {
            	System.out.print("You can't go out if: ");
                for (int j = 0; j < nvar; j++) {
                    System.out.print(this.symboles.interpretation(j));
                    if (j < nvar-1)
                        System.out.print(" and ");
                }
                System.out.println();
            }
        }
    }

}
