package test09;
//�d���mIterator 
public class XiaoMin{
	public static void main(String[] args){
		//�غc�U�ӻ�ɪ���
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		
		//�]�w�W�@�Ż�ɳB�z�̪���
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;
		
//		boss.nextHandler = manager;
//		manager.nextHandler = director;
//		director.nextHandler = groupLeader;
		

		//�o�_���b�ӽ�
		groupLeader.handleRequst(50000);
		
//		boss.handleRequst(50000);
	}
}
