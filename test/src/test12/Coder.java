package test12;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
	public String name ;
	
	public Coder(String aName) {
		name = aName;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Hi, " + name + ", DevTevhFrontier更新啦, 內容：" + arg);
	}

	@Override
	public String toString() {
		return "碼農：" + name;
	}
}
