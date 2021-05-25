package test10;

//p.198
public abstract class ArithmeticExpression {
	/**
	 * 抽象的解析方法
	 * 具體的解析邏輯由具體的子類別實作
	 * 
	 * @return 解析得到具體的值
	 */
	public abstract int interpreter();
}
