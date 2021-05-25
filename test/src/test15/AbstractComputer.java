package test15;

public abstract class AbstractComputer {

	protected void powerOn() {
		System.out.println("開啟電源");
	}
	protected void checkHardware() {
		System.out.println("硬體檢查");
	}
	protected void loadOS() {
		System.out.println("載入作業系統");
	}
	protected void login() {
		System.out.println("小白的計算機無驗證，直接進入系統");
	}
	public final void startUp() {
		System.out.println("------ 關機 START ------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("------ 關機 END ------");
	}
}