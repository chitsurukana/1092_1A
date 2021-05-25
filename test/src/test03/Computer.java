package test03;
//3-5 p.48

//計算抽象類別，即Product角色
public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;
	
	protected Computer() {
	}
	//設定CPU核心數
	public void setBoard(String board) {
		mBoard = core;
	}
	//設定記憶體
	public void setDisplay(String display) {
		mDisplay = gb;
	}
	//設定作業系統
	public abstract void setOS();
	
	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS +  "]";
	}
	
}
