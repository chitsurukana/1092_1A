package test24;

public class LargeCoffee extends Coffee {
	public LargeCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("�j�M��" + impl + "�@��");
	}

}
