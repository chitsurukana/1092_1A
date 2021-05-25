package test06;

public class Client {
	public static void main(String[] args) {
		//�غc�@�ӥͲ�Q3���u�t
		CarFactory factoryQ3 = new Q3Factory();
		factoryQ3.createTire().tire();
		factoryQ3.createEngine().engine();
		factoryQ3.createBrake().brake();
		
		System.out.println("------------------------------");
		
		//�غc�@�ӥͲ�Q7���u�t
		CarFactory factoryQ7 = new Q7Factory();
		factoryQ7.createTire().tire();
		factoryQ7.createEngine().engine();
		factoryQ7.createBrake().brake();
	}

}
