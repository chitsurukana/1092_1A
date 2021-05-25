package test05;
//5.5 p.99

public class Client {

	public static void main(String[] args) {
		//�غc�@�ӻs�y�T�����u�t����
		AudiFactory factory = new AudiCarFactory();
		
		//�Ͳ� Q3 �ñҰ�
		AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
		audiQ3.drive();
		audiQ3.selNavigation();
		
		//�Ͳ� Q5 �ñҰ�
		AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
		audiQ5.drive();
		audiQ5.selNavigation();
		
		//�Ͳ� Q7 �ñҰ�
		AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
		audiQ7.drive();
		audiQ7.selNavigation();

	}

}
