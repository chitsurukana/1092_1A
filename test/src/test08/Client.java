package test08;

public class Client {

	public static void main(String[] args) {
		TvController tvController = new TvController();
		//�]�w�}�����A
		tvController.powerOn();
		//�U�@�W�D
		tvController.nextChannel();
		//�հ����q
		tvController.turnUp();
		//�]�w�������A
		tvController.powerOff();
		//�հ����q�A���ɤ��|�ͮ�
		tvController.turnUp();
	}

}
