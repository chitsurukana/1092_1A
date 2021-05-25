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
		data = "影像資料，聲音資料";
		
		mediator.changed(this);
	}
}
