package test21;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Boy();
		
		PersonCloth clothCheap = new CheapCloth(person);
		clothCheap.dressed();
		
		PersonCloth clothExpensive = new ExpensiveCloth(person);
		clothExpensive.dressed();
	}

}
