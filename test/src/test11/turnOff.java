package test11;

public class turnOff implements Command{
	private Machine machine;	

	public turnOff(Machine machine) {
		this.machine = machine;
	}
	
	@Override
	public void execute() {
		machine.turnOff();
	}
	
}
