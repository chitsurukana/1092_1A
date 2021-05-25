package test10;

public class NumExpression extends ArithmeticExpression {
	private int num;

	public NumExpression(int num) {
		this.num = num;
	}

	@Override
	public int interpreter() {
		return num;
	}
}

