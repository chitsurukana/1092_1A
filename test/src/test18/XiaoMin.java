package test18;

public class XiaoMin implements ILawsuit{

	@Override
	public void submit() {
		System.out.println("老闆拖欠工資！特此申請仲裁！");
	}

	@Override
	public void burden() {
		System.out.println("這是合同書和過去一年的銀行工資流水帳！");
	}

	@Override
	public void defend() {
		System.out.println("證據確鑿！不需要再說什麼了！");
	}

	@Override
	public void finish() {
		System.out.println("訴訟成功！判決老闆即日起七天內結算工資！");
	}
	
}
