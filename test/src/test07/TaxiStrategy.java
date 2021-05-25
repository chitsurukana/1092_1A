package test07;

	// 計程車計算策略
public class TaxiStrategy implements CalculateStrategy{
	//價格為我們簡單計算為公里數 * 2
	@Override
	public int calculatePrice(int km) {
		return km * 2;
	}
}
