package test07;

	//���������p�⾹
public class TranficCalculator {
	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
		//�]�w�p�ⵦ��
		calculator.setStrategy(new BusStrategy());
		//�p�����
		System.out.println("������16����������G" + calculator.calculatePrice(16));
		//�]�w�p�ⵦ��
		calculator.setStrategy(new TaxiStrategy());
		//�p�����
		System.out.println("�p�{����16����������G" + calculator.calculatePrice(16));
	}
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	public int calculatePrice(int km) {
		return mStrategy.calculatePrice(km);
	}
}
