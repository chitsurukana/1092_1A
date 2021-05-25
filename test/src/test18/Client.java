package test18;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		
		ILawsuit xiaomin = new XiaoMin();
		
		ILawsuit laywer = new Lawyer(xiaomin);
		
		laywer.submit();
		
		laywer.burden();
		
		laywer.defend();
		
		laywer.finish();
	}
	
//	public static void main(String[] args) {
//			
//			ILawsuit xiaomin = new XiaoMin();
//			
//			DynamicProxy proxy = new DynamicProxy(xiaomin);
//			
//			ClassLoader loader= xiaomin.getClass().getClassLoader();
//			
//			ILawsuit laywer = (ILawsuit)Proxy.newProxyInstance(loader, new Class[] {ILawsuit.class}, proxy);
//			
//			laywer.submit();
//			
//			laywer.burden();
//			
//			laywer.defend();
//			
//			laywer.finish();
//		}

}
