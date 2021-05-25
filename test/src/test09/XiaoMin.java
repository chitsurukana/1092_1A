package test09;
//責任練Iterator 
public class XiaoMin{
	public static void main(String[] args){
		//建構各個領導物件
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		
		//設定上一級領導處理者物件
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;
		
//		boss.nextHandler = manager;
//		manager.nextHandler = director;
//		director.nextHandler = groupLeader;
		

		//發起報帳申請
		groupLeader.handleRequst(50000);
		
//		boss.handleRequst(50000);
	}
}
