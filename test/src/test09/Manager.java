package test09;

public class  Manager extends Leader {
	@Override
	public int limit(){
		return 10000;
	}

	@Override
	public void handle(int money){
		System.out .println("經理批覆報銷" + money + "元");	
	}
}
