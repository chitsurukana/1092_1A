package test23;

public class SamaungCamera implements Camera {

	@Override
	public void open() {
		System.out.println("�}�Ҭ۾�");
	}

	@Override
	public void takePicture() {
		System.out.println("���");
	}

	@Override
	public void close() {
		System.out.println("�����۾�");
	}

}
