package test24;

public class SmallCoffee extends Coffee {
	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("�p�M��" + impl + "�@��");
	}

}
