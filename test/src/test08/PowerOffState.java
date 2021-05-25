package test08;

/**
 * 關機狀態，此時只有開機功能是有效的
 */
public class PowerOffState implements TvState{
	
	@Override
	public void nextChannel(){
	}
	
	@Override
	public void prevChannel(){
	}

	@Override
	public void turnUp(){
	}

	@Override
	public void turnDown(){
	}
}
