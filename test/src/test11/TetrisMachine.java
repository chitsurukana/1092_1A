package test11;

public class TetrisMachine extends Machine{

	public void toUp() {
		System.out.println("向左");
	}

	public void toRight() {
		System.out.println("向右");
	}
	
	public void fastToBottom() {
		System.out.println("快速落下");
	}

	public void transform() {
		System.out.println("改變形狀");
	}
	public void turnOff() {
		System.out.println("關機");
	}
}
