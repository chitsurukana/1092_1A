package test21;

public class CheapCloth extends PersonCloth {
	public CheapCloth(Person mPerson) {
		super(mPerson);
	}

	public void dressShorts() {
		System.out.println("����u��");
	}

	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}

}
