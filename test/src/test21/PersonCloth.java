package test21;

public abstract class PersonCloth extends Person{
	protected Person mPerson;

	public PersonCloth(Person mPerson) {
		this.mPerson = mPerson;
	}

	@Override
	public void dressed() {
		mPerson.dressed();
	}
	
}
