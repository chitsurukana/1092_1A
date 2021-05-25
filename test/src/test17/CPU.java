package test17;

public class CPU extends Colleague{
	private String dataVideo, dataSound;
	
	public CPU(Mediator meditor) {
		super(meditor);
	}

	public String getDataVideo() {
		return dataVideo;
	}
	
	public String getDataSound() {
		return dataSound;
	}
	
	public void decodeData(String data) {
		String[] tmp = data.split(",");
		
		dataVideo = tmp[0];
		dataSound = tmp[1];
		
		mediator.changed(this);
	}
}
