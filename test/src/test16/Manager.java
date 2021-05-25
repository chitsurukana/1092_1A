package test16;

import java.util.Random;

public class Manager extends Staff {
	private int products;
	public Manager(String aName) {
		super(aName);
		products = new Random().nextInt(10);
	}
	
	@Override
	public void accept(Visitor visitor) {
		if(visitor.toString() == "CEO")
			visitor.visit(this);
	}
	
	public int getProducts() {
		return products;
	}
}