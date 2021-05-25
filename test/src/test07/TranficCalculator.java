package test07;

	//公車行價格計算器
public class TranficCalculator {
	public static void main(String[] args) {
		TranficCalculator calculator = new TranficCalculator();
		//設定計算策略
		calculator.setStrategy(new BusStrategy());
		//計算價格
		System.out.println("公車乘16公里的價格：" + calculator.calculatePrice(16));
		//設定計算策略
		calculator.setStrategy(new TaxiStrategy());
		//計算價格
		System.out.println("計程車乘16公里的價格：" + calculator.calculatePrice(16));
	}
	CalculateStrategy mStrategy;
	public void setStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	public int calculatePrice(int km) {
		return mStrategy.calculatePrice(km);
	}
}
