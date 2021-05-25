package test10;

public class SubtractionExpression extends OperatorExpression {
	public SubtractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		super(exp1, exp2);
	}

	@Override
	public int interpreter() {
		return exp1.interpreter() - exp2.interpreter();
	}
}
