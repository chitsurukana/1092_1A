package test02;
//2.8 p.36-37
public final class PolicyManager {
	//Policy��@���O
	private static final String POLICY_IMPL_CLASS_NAME = 
			"com.android.internal.policy.impl.Policy";
	
	private static final IPolicy sPolicy;
	
	static {
		//�z�L�Ϯg�غcPolicy����
		try {
			Class policyClass = Class.forName(POLICY_IMPL_CLASS_NAME);
			sPolicy = (IPolicy)policyClass.newInstance();
		}
		// catch�{���X�q��
	}
	private PolicyManager() {}
	//�o�̴N�O�إ�PhoneWindow���󪺦a��
	public static Window makeNewWindow(Context context) {
		return sPolicy.makeNewWindow(context);
	}
	
	// �z�LsPolicy�إ�LayoutInflater
	public static LayoutInflater makeNewLayoutInflater(Context context) {
		return sPolicy.makeNewLayoutInflater(context);
	}
}
