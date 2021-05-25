package test08;

/**
 * �q���������A�t���}���B�����B�U�@�W�D�B�W�@�W�D�B�հ����q�B�էC���q�o�X�ӥ\��
 */
public class TvController{
	//�}�����A
	private final static int POWER_ON =1;
	//�������A
	private final static int POWER_OFF =2;
	private int mState = POWER_OFF;

	public void powerOn() {
		mState = POWER_ON;
		if(mState == POWER_OFF) {
			System.out.println("�}����");
		}
	}

	public void powerOff() {
		mState = POWER_OFF;
		if(mState == POWER_ON) {
			System.out.println("������");
		}
	}

	public void nextChannel() {
		if(mState == POWER_ON) {
			System.out.println("�U�@�W�D");
		}else{
			System.out.println("��Ӭ��O���ܨS���}��");
		}
	}

	public void prevChannel() {
		if(mState == POWER_ON) {
			System.out.println("�W�@�W�D");
		}else{
			System.out.println("��Ӭ��O���ܨS���}��");
		}
	}

	public void turnUp() {
		if(mState == POWER_ON) {
			System.out.println("�հ����q");
		}else{
			System.out.println("��Ӭ��O���ܨS���}��");
		}
	}

	public void turnDown() {
		if(mState == POWER_ON) {
			System.out.println("�էC���q");
		}else{
			System.out.println("��Ӭ��O���ܨS���}��");
		}
	}
}

///**
// * �q���������A������g�媬�A�Ҧ����� Context
// */
//public class TvController implements PowerController{
//	TvState mTvState;
//
//	public void setTvState(TvState mTvState){
//		this.mTvState = mTvState;
//	}
//}
//
//@Override ide
//	public void powerOn() {
//		setTvState(new PowerOnState());
//		System.out.println("�}����");
//	}
//	
//	@Override
//	public void powerOff() {
//		setTvState(new PowerOffState());
//		System.out.println("������");
//	}
//
//	public void nextChannel() {
//		mTvState.nextChannel();
//	}
//
//	public void prevChannel() {
//		mTvState.prevChannel();
//	}
//
//	public void turnUp() {
//		mTvState.turnUp();
//	}
//
//	public void turnDown() {
//		mTvState.turnDown();
//	}
//}
