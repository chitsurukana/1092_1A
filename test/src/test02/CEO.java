package test02;

//CEO，積極單例模式
public class CEO extends Staff{
	private static final CEO mCeo = new CEO();//代表是Singleton
	//建構函數私有
	CEO() {
	}
	
	//公有的靜態函數，對外暴露獲取單例物件的介面
	public static CEO getCeo() {
		return mCeo;
	}

	@Override
	public void work() {
		//管理VP
	}
}
