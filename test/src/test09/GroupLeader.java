package test09;

public class GroupLeader extends Leader {
	@Override
	public int limit(){
		return 1000;
	}

	@Override
	public void handle(int money){
		System.out .println("�ժ����г��P" + money + "��");	
	}
}
