package test10;

public abstract class OperatorExpression extends ArithmeticExpression {
	//宣告兩個成員變數存放運算符號兩邊的數字直譯器
	protected ArithmeticExpression exp1, exp2;

	public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
}
