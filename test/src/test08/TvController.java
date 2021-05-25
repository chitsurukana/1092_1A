package test08;

/**
 * 電視遙控器，含有開機、關機、下一頻道、上一頻道、調高音量、調低音量這幾個功能
 */
public class TvController{
	//開機狀態
	private final static int POWER_ON =1;
	//關機狀態
	private final static int POWER_OFF =2;
	private int mState = POWER_OFF;

	public void powerOn() {
		mState = POWER_ON;
		if(mState == POWER_OFF) {
			System.out.println("開機啦");
		}
	}

	public void powerOff() {
		mState = POWER_OFF;
		if(mState == POWER_ON) {
			System.out.println("關機啦");
		}
	}

	public void nextChannel() {
		if(mState == POWER_ON) {
			System.out.println("下一頻道");
		}else{
			System.out.println("兩個紅燈提示沒有開機");
		}
	}

	public void prevChannel() {
		if(mState == POWER_ON) {
			System.out.println("上一頻道");
		}else{
			System.out.println("兩個紅燈提示沒有開機");
		}
	}

	public void turnUp() {
		if(mState == POWER_ON) {
			System.out.println("調高音量");
		}else{
			System.out.println("兩個紅燈提示沒有開機");
		}
	}

	public void turnDown() {
		if(mState == POWER_ON) {
			System.out.println("調低音量");
		}else{
			System.out.println("兩個紅燈提示沒有開機");
		}
	}
}

///**
// * 電視遙控器，類似於經典狀態模式中的 Context
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
//		System.out.println("開機啦");
//	}
//	
//	@Override
//	public void powerOff() {
//		setTvState(new PowerOffState());
//		System.out.println("關機啦");
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
