package test03;
//3-5 p.48

//�p���H���O�A�YProduct����
public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;
	
	protected Computer() {
	}
	//�]�wCPU�֤߼�
	public void setBoard(String board) {
		mBoard = core;
	}
	//�]�w�O����
	public void setDisplay(String display) {
		mDisplay = gb;
	}
	//�]�w�@�~�t��
	public abstract void setOS();
	
	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS +  "]";
	}
	
}
