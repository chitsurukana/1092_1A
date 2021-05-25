package test17;

public class GraphicsCard extends Colleague{
	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data) {
		System.out.println("¼v¹³¡G" + data);
	}
}
