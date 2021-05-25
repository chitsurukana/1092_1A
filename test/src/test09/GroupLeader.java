package test09;

public class GroupLeader extends Leader {
	@Override
	public int limit(){
		return 1000;
	}

	@Override
	public void handle(int money){
		System.out .println("組長批覆報銷" + money + "元");	
	}
}
