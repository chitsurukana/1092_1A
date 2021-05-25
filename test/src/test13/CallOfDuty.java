package test13;

public class CallOfDuty{
	private int mCheakpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "沙漠之鷹";

	public void play(){
		System.out.println("打遊戲：" + String.format("第%d關", mCheakpoint) + "奮戰殺敵中");
		mLifeValue -= 10;
		System.out.println("進度升級啦");
		mCheakpoint++;
		System.out.println("到達 " + String.format("第%d關", mCheakpoint));
	}

	public void quit()
	{
		System.out.println("----------");
		System.out.println("結束前的遊戲屬性：" + this.toString());
		System.out.println("結束遊戲");
		System.out.println("----------");
	}

	public Memoto createMemoto(){
		Memoto memoto = new Memoto();
		memoto.mCheakpoint = mCheakpoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}

	public void restore(Memoto memoto){
		this.mCheakpoint = memoto.mCheakpoint;
		this.mLifeValue = memoto.mLifeValue;
		this.mWeapon = memoto.mWeapon;
		System.out.println("恢復後的遊戲屬性：" + this.toString());
	}
	
	@Override
	public String toString(){
		return "CallOfDuty [mCheakpoint=" + mCheakpoint + ",mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon +"]";
	}
}
