package test24;

public class Main {

	public static void main(String[] args) {
		Ordinary implOrdinary = new Ordinary();

		Sugar implSugar = new Sugar();

		LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
		largeCoffeeOrdinary.makeCoffee();

		SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
		smallCoffeeOrdinary.makeCoffee();

		LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
		largeCoffeeSugar.makeCoffee();

		SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
		smallCoffeeSugar.makeCoffee();

		MiddleCoffee middleCoffeeOrdinary = new MiddleCoffee(implOrdinary);
		middleCoffeeOrdinary.makeCoffee();

		MiddleCoffee middleCoffeeSugar = new MiddleCoffee(implSugar);
		middleCoffeeSugar.makeCoffee();
	}

}
