package test08;

/**
 * �}�����A�A���ɦAĲ�o�}���\�ण������ާ@
 */
public class PowerOnState implements TvState{
	
	@Override
	public void nextChannel(){
		System.out.println("�U�@�W�D");
	}
	
	@Override
	public void prevChannel(){
		System.out.println("�W�@�W�D");
	}

	@Override
	public void turnUp(){
		System.out.println("�հ����q");
	}

	@Override
	public void turnDown(){
		System.out.println("�էC���q");
	}
}
