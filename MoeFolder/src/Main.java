public class Main {
    public static void main(String[] args) {
    	threeValExample();
    }
    public static void threeValExample() {
    	LogicalExpressionWith3Variables anExpression =
                new LogicalExpressionWith3Variables();
        Satisfiable pickUp =
                anExpression.constructALogicalExpressionWith3Variables();
        System.out.print("Evaluate boolean expression: ");
        System.out.println(pickUp);
        for (int i = 0; i <= Math.pow(2, 3) - 1; i++) {
            anExpression.symboles.setValueOfTruth(i, 3);
            System.out.println(pickUp.isSatisfiable());
        }
        anExpression.whenPickUpYourPhone(pickUp);
        anExpression.whenNotPickUpYourPhone(pickUp);
    }

    public static void fourValExample() {
    	int nvar = 4;
    	LogicalExpressionWith4Variables anExpression =
                new LogicalExpressionWith4Variables(nvar);
        Satisfiable pickUp =
                anExpression.constructALogicalExpressionWith4Variables();
        System.out.print("Evaluate boolean expression: ");
        System.out.println(pickUp);
        for (int i = 0; i <= Math.pow(2, nvar) - 1; i++) {
            anExpression.symboles.setValueOfTruth(i, nvar);
            System.out.println(pickUp.isSatisfiable());
        }
        anExpression.WhenGoOut(pickUp);
        anExpression.WhenNotGoOut(pickUp);
    }
   
}