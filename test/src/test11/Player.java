package test11;

public class Player {

	public static void main(String[] args) {
		TetrisMachine machine = new TetrisMachine();
		AbcMachine abcMachine = new AbcMachine();
		LeftCommand leftCommand = new LeftCommand(machine);
		LeftCommand leftCommand2 = new LeftCommand(abcMachine);
		turnOff turnOff = new turnOff(machine);
		
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);

		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFallCommand(fallCommand);
		buttons.setTransformCommand(transformCommand);

		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();

	}

}
