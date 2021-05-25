package test08;

public class Client {

	public static void main(String[] args) {
		TvController tvController = new TvController();
		//設定開機狀態
		tvController.powerOn();
		//下一頻道
		tvController.nextChannel();
		//調高音量
		tvController.turnUp();
		//設定關機狀態
		tvController.powerOff();
		//調高音量，此時不會生效
		tvController.turnUp();
	}

}
