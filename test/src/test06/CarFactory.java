package test06;
//6.5 p.117

public abstract class CarFactory {
	/**
	 * 生產輪胎
	 * 
	 * @return 輪胎
	 */
	public abstract ITire createTire();
	
	/**
	 * 生產發動機
	 * 
	 * @return 發動機
	 */
	public abstract IEngine createEngine();
	
	/**
	 * 生產制動系統
	 * 
	 * @return 制動系統
	 */
	public abstract IBrake createBrake();
}
