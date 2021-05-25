package test16;

import java.util.Random;

public abstract class Staff {
	public String name;
	
	public int kpi;
	
	public Staff(String aName) {
		this.name = aName;
		kpi = new Random().nextInt(10);
	}
	
	public abstract void accept(Visitor visitor);
}