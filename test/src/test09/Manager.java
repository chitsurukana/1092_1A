package test09;

public class  Manager extends Leader {
	@Override
	public int limit(){
		return 10000;
	}

	@Override
	public void handle(int money){
		System.out .println("�g�z���г��P" + money + "��");	
	}
}
