package test13;

public class CallOfDuty{
	private int mCheakpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "�F�z���N";

	public void play(){
		System.out.println("���C���G" + String.format("��%d��", mCheakpoint) + "�ľԱ��Ĥ�");
		mLifeValue -= 10;
		System.out.println("�i�פɯŰ�");
		mCheakpoint++;
		System.out.println("��F " + String.format("��%d��", mCheakpoint));
	}

	public void quit()
	{
		System.out.println("----------");
		System.out.println("�����e���C���ݩʡG" + this.toString());
		System.out.println("�����C��");
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
		System.out.println("��_�᪺�C���ݩʡG" + this.toString());
	}
	
	@Override
	public String toString(){
		return "CallOfDuty [mCheakpoint=" + mCheakpoint + ",mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon +"]";
	}
}
