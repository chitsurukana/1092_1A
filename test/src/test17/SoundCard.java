package test17;

public class SoundCard extends Colleague{
	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	
	public void soundPlay(String data) {
		System.out.println("Án­µ¡G" + data);
	}
}
