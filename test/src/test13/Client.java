package test13;

public class Client{
	public static void main(String[] args){
		CallOfDuty game = new CallOfDuty();

		game.play();

		Caretaker caretaker = new Caretaker();

		caretaker.commit(game.createMemoto());

		game.quit();

		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.getMemoto());
	}
}
