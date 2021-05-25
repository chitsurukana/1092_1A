package test15;

public class MilitaryComputer extends AbstractComputer {
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("檢查硬體防火牆");
	}
	@Override
	protected void login() {
		System.out.println("進行指紋辨識別等複雜的使用者驗證");
	}
}
