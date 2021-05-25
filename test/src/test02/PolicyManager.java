package test02;
//2.8 p.36-37
public final class PolicyManager {
	//Policy實作類別
	private static final String POLICY_IMPL_CLASS_NAME = 
			"com.android.internal.policy.impl.Policy";
	
	private static final IPolicy sPolicy;
	
	static {
		//透過反射建構Policy物件
		try {
			Class policyClass = Class.forName(POLICY_IMPL_CLASS_NAME);
			sPolicy = (IPolicy)policyClass.newInstance();
		}
		// catch程式碼段落
	}
	private PolicyManager() {}
	//這裡就是建立PhoneWindow物件的地方
	public static Window makeNewWindow(Context context) {
		return sPolicy.makeNewWindow(context);
	}
	
	// 透過sPolicy建立LayoutInflater
	public static LayoutInflater makeNewLayoutInflater(Context context) {
		return sPolicy.makeNewLayoutInflater(context);
	}
}
