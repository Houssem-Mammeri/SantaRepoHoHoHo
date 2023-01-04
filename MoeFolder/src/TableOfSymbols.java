import java.util.AbstractList;
import java.util.ArrayList;
public class TableOfSymbols {
private AbstractList<BooleanVariable> variables;
public TableOfSymbols() {
this.variables = new ArrayList<BooleanVariable>();
}
public void addVariable (BooleanVariable variable) {
this.variables.add(variable);
}
public void setValueOfTruth(boolean... values) {
for (int i = 0; i < Math.min(values.length,variables.size()); i++)
this.variables.get(i).setValueOfTruth(values[i]);
}
public void setValueOfTruth(int value, int nbVariables) {
boolean[] listOfParameters = new boolean[nbVariables];
int shift = 0;
do {
int remainder = value % 2;
listOfParameters[nbVariables-1-shift++] = remainder == 1;
value /= 2;
} while (value != 0);
this.setValueOfTruth(listOfParameters);
}
public String interpretation(int numberOfVariable) {
	return this.variables.get(numberOfVariable).interpretation();
}
}