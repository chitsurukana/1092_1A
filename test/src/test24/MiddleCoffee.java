package test24;

public class MiddleCoffee extends Coffee {
	public MiddleCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("¤¤ªMªº" + impl + "©@°Ø");
	}

}
