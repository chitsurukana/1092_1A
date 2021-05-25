package test02;
// 2.6.1 懶散模式
public class Singleton {
	private static  Singleton instance;
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

//// 2.6.2 DCL 實作單例
//public class Singleton {
//	private static  Singleton sInstance;
//	private Singleton() {}
//	
//	public void doSomething() {
//		System.out.println("do sth.");
//	}
//	
//	public static Singleton getInstance() {
//		if(mInstance == null) {
//			synchronized (Singleton.class) {
//				if(mInstance == null) {
//				sInstance = new Singleton();
//				}
//			}
//		}
//		return sInstance;
//	}
//}

//// 2.6.3 靜態內部類別單例模式
//public class Singleton {
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return SingletonHolder.sInstance;
//	}
//	
//	/**
//	 * 靜態內部類別
//	 */
//	private static class SingletonHolder{
//		private static final Singleton sInstance = new Singleton();
//	} 
//}

