package test15;

public abstract class AbstractComputer {

	protected void powerOn() {
		System.out.println("�}�ҹq��");
	}
	protected void checkHardware() {
		System.out.println("�w���ˬd");
	}
	protected void loadOS() {
		System.out.println("���J�@�~�t��");
	}
	protected void login() {
		System.out.println("�p�ժ��p����L���ҡA�����i�J�t��");
	}
	public final void startUp() {
		System.out.println("------ ���� START ------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("------ ���� END ------");
	}
}