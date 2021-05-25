package test10;

import java.util.Stack;

public class Calculator {
	//宣告一個Stack 堆疊存放並操作所有相關的直譯器
	private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

	public Calculator(String expression) {
		//宣告兩個ArithmeticExpression 類型的暫時變數，存放運算子左右兩邊的數字直譯器
		ArithmeticExpression exp1, exp2;

		//根據空格分割表達式字串
		String[] elements = expression.split(" ");

		/**
		 * 迴圈遍歷表達式元素陣列
		 */
		for (int i = 0; i < elements.length; i++) {
			/**
			 * 判斷運算符號
			 */
			switch (elements[i].charAt(0)) {
			case '+'://如果是加號
				//則將堆疊中的直譯器彈出作為運算符號左邊的直譯器
				exp1 = mExpStack.pop();

				//同時將運算符號陣列下標下一個元素建構為一個數字直譯器
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));

				//透過上面兩個數字直譯器建構加法運算直譯器
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-'://如果是減號
				exp1 = mExpStack.pop();
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;
			default://如果為數字
				/**
				 * 如果不是運算子則為數字
				 * 若是數字，直接建構數字直譯器並推入堆疊
				 */
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			} 
		}
	}
	
	/**
	 * 計算結果
	 * 
	 * @return 最終的計算結果
	 */
	public int calculate() {
		return mExpStack.pop().interpreter();
	}
}
