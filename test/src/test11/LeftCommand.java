package test11;

public class LeftCommand implements Command {
	private Machine machine;	

	public LeftCommand(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void execute() {
		machine.toUp();
	}
}
