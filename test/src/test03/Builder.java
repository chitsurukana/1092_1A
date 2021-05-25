package test03;
//3-5 p.48

//抽象Builder類別
public abstract class Builder {
	//設定主機
	public abstract void buildBoard(String board);
	//設定顯示器
	public abstract void buildDisplay(String display);
	//設定作業系統
	public abstract void buildOS();
	//建立Computer
	public abstract Computer create();
	
}
