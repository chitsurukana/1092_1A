package test10;

public abstract class OperatorExpression extends ArithmeticExpression {
	//�ŧi��Ӧ����ܼƦs��B��Ÿ����䪺�Ʀr��Ķ��
	protected ArithmeticExpression exp1, exp2;

	public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
}
