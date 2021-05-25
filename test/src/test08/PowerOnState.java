package test08;

/**
 * 開機狀態，此時再觸發開機功能不做任何操作
 */
public class PowerOnState implements TvState{
	
	@Override
	public void nextChannel(){
		System.out.println("下一頻道");
	}
	
	@Override
	public void prevChannel(){
		System.out.println("上一頻道");
	}

	@Override
	public void turnUp(){
		System.out.println("調高音量");
	}

	@Override
	public void turnDown(){
		System.out.println("調低音量");
	}
}
