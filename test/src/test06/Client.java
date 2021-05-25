package test06;

public class Client {
	public static void main(String[] args) {
		//建構一個生產Q3的工廠
		CarFactory factoryQ3 = new Q3Factory();
		factoryQ3.createTire().tire();
		factoryQ3.createEngine().engine();
		factoryQ3.createBrake().brake();
		
		System.out.println("------------------------------");
		
		//建構一個生產Q7的工廠
		CarFactory factoryQ7 = new Q7Factory();
		factoryQ7.createTire().tire();
		factoryQ7.createEngine().engine();
		factoryQ7.createBrake().brake();
	}

}
