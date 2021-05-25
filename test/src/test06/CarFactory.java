package test06;
//6.5 p.117

public abstract class CarFactory {
	/**
	 * �Ͳ����L
	 * 
	 * @return ���L
	 */
	public abstract ITire createTire();
	
	/**
	 * �Ͳ��o�ʾ�
	 * 
	 * @return �o�ʾ�
	 */
	public abstract IEngine createEngine();
	
	/**
	 * �Ͳ���ʨt��
	 * 
	 * @return ��ʨt��
	 */
	public abstract IBrake createBrake();
}
