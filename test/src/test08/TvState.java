package test08;

//電視狀態介面，定義了電視操作的函數
public interface TvState {
	public void nextChannel();
	public void prevChannel();
	public void turnUp();
	public void turnDown();
}
