package test05;
//5.5 p.99

public class Client {

	public static void main(String[] args) {
		//建構一個製造汽車的工廠物件
		AudiFactory factory = new AudiCarFactory();
		
		//生產 Q3 並啟動
		AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
		audiQ3.drive();
		audiQ3.selNavigation();
		
		//生產 Q5 並啟動
		AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
		audiQ5.drive();
		audiQ5.selNavigation();
		
		//生產 Q7 並啟動
		AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
		audiQ7.drive();
		audiQ7.selNavigation();

	}

}
