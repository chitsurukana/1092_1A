package test02;

//CEO�A�n����ҼҦ�
public class CEO extends Staff{
	private static final CEO mCeo = new CEO();//�N��OSingleton
	//�غc��ƨp��
	CEO() {
	}
	
	//�������R�A��ơA��~���S�����Ҫ��󪺤���
	public static CEO getCeo() {
		return mCeo;
	}

	@Override
	public void work() {
		//�޲zVP
	}
}
