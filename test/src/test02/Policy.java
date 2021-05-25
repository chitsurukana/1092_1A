package test02;

import java.awt.Window;

// 2.8 p.37
public class Policy implements IPolicy{
	//程式碼省略
	//建立PhoneWindow，這就是Activity中Window的具體實作類別
	public Window makeNewWindow(Context context) {
		return new PhoneWindow(context);
	}
	
	//建立LayoutInflater，具體類別為PhoneLayoutInflater，這才是我們要關注的地方
	public LayoutInflater makeNewLayoutInflater(Context context) {
		return new PhoneLayoutInflater(context);
	}
}
