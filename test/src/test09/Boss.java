package test09;

public class Boss extends Leader {
	@Override
	public int limit(){
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money){
		System.out .println("������г��P" + money + "��");	
	}
}
