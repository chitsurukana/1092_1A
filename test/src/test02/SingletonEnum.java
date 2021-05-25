package test02;

//2.6.4 ¦CÁ|³æ¨Ò
public enum SingletonEnum{
	INSTANCE;
	public void doSomething() {
		System.out.println("do sth.");
	}
	
//	private Object readResolve() throws ObjectStreamException {
//		return sInstance;
//	}
}
