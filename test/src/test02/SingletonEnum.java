package test02;

//2.6.4 �C�|���
public enum SingletonEnum{
	INSTANCE;
	public void doSomething() {
		System.out.println("do sth.");
	}
	
//	private Object readResolve() throws ObjectStreamException {
//		return sInstance;
//	}
}
