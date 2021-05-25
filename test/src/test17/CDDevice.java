package test17;

public class CDDevice extends Colleague{
	private String data;
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}
	
	public String read() {
		return data;
	}

	public void load() {
		data = "�v����ơA�n�����";
		
		mediator.changed(this);
	}
}
