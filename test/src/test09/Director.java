package test09;

public class Director extends Leader {
	@Override
	public int limit(){
		return 5000;
	}

	@Override
	public void handle(int money){
		System.out .println("�D�ާ��г��P" + money + "��");	
	}
}
