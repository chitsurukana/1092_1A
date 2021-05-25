package test02;
// 2.6.1 �i���Ҧ�
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

//// 2.6.2 DCL ��@���
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

//// 2.6.3 �R�A�������O��ҼҦ�
//public class Singleton {
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return SingletonHolder.sInstance;
//	}
//	
//	/**
//	 * �R�A�������O
//	 */
//	private static class SingletonHolder{
//		private static final Singleton sInstance = new Singleton();
//	} 
//}

