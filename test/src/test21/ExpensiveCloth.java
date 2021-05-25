package test21;

public class ExpensiveCloth extends PersonCloth {
	public ExpensiveCloth(Person person) {
		super(person);
	}

	private void dressShirt() {
		System.out.println("���u�S");
	}

	private void dressLeather() {
		System.out.println("���֦�");
	}

	private void dressJean() {
		System.out.println("������J��");
	}

	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}

}
