package test23;

public class SamaungCamera implements Camera {

	@Override
	public void open() {
		System.out.println("開啟相機");
	}

	@Override
	public void takePicture() {
		System.out.println("拍照");
	}

	@Override
	public void close() {
		System.out.println("關閉相機");
	}

}
