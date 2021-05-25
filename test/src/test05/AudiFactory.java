package test05;
//5.5 p.97

public abstract class AudiFactory {
	/**
	 * 某車型的工廠方法
	 * 
	 * @param clz 具體的SUV型號類型
	 * 
	 * @return 具體型號的SUV物件
	 */
	public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
