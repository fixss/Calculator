public class IntsCalculator implements Ints {
    Calculator calc = new Calculator();

    public int sum(int arg0, int arg1) {
        double formula = calc.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
        return (int) formula;
    }

    public int mult(int arg0, int arg1) {
        double formula = calc.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();
        return (int) formula;
    }

    public int pow(int a, int b) {
        double formula = calc.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.MULT).result();
        return (int) formula;
    }
}