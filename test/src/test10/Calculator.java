package test10;

import java.util.Stack;

public class Calculator {
	//�ŧi�@��Stack ���|�s��þާ@�Ҧ���������Ķ��
	private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

	public Calculator(String expression) {
		//�ŧi���ArithmeticExpression �������Ȯ��ܼơA�s��B��l���k���䪺�Ʀr��Ķ��
		ArithmeticExpression exp1, exp2;

		//�ھڪŮ���Ϊ�F���r��
		String[] elements = expression.split(" ");

		/**
		 * �j��M����F�������}�C
		 */
		for (int i = 0; i < elements.length; i++) {
			/**
			 * �P�_�B��Ÿ�
			 */
			switch (elements[i].charAt(0)) {
			case '+'://�p�G�O�[��
				//�h�N���|������Ķ���u�X�@���B��Ÿ����䪺��Ķ��
				exp1 = mExpStack.pop();

				//�P�ɱN�B��Ÿ��}�C�U�ФU�@�Ӥ����غc���@�ӼƦr��Ķ��
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));

				//�z�L�W����ӼƦr��Ķ���غc�[�k�B�⪽Ķ��
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-'://�p�G�O�
				exp1 = mExpStack.pop();
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;
			default://�p�G���Ʀr
				/**
				 * �p�G���O�B��l�h���Ʀr
				 * �Y�O�Ʀr�A�����غc�Ʀr��Ķ���ñ��J���|
				 */
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			} 
		}
	}
	
	/**
	 * �p�⵲�G
	 * 
	 * @return �̲ת��p�⵲�G
	 */
	public int calculate() {
		return mExpStack.pop().interpreter();
	}
}
