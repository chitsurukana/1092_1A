package test05;
//5.5 p.97

public abstract class AudiFactory {
	/**
	 * �Y�������u�t��k
	 * 
	 * @param clz ���骺SUV��������
	 * 
	 * @return ���髬����SUV����
	 */
	public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
