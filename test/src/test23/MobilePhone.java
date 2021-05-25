package test23;

public class MobilePhone {
	private Phone mPhone = new PhoneImpl();
	private Camera mCamera = new SamaungCamera();
	
	public void dial() {
		mPhone.dial();
	}
	
	public void videoChat() {
		System.out.println("--> ���T��ѱ��q��");
		mCamera.open();
		mPhone.dial();
	}
	
	public void hangup() {
		mPhone.hangup();
	}
	
	public void takePicture() {
		mCamera.open();
		mCamera.takePicture();
	}
	
	public void closeCamera() {
		mCamera.close();
	}
}
