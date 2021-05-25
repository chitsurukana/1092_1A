package test21;

public class ExpensiveCloth extends PersonCloth {
	public ExpensiveCloth(Person person) {
		super(person);
	}

	private void dressShirt() {
		System.out.println("¬ï¥óµu³S");
	}

	private void dressLeather() {
		System.out.println("¬ï¥ó¥Ö¦ç");
	}

	private void dressJean() {
		System.out.println("¬ï±ø¤û¥J¿Ç");
	}

	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}

}
