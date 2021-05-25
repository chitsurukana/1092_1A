package test02;

import java.awt.Window;

// 2.8 p.37
public class Policy implements IPolicy{
	//�{���X�ٲ�
	//�إ�PhoneWindow�A�o�N�OActivity��Window�������@���O
	public Window makeNewWindow(Context context) {
		return new PhoneWindow(context);
	}
	
	//�إ�LayoutInflater�A�������O��PhoneLayoutInflater�A�o�~�O�ڭ̭n���`���a��
	public LayoutInflater makeNewLayoutInflater(Context context) {
		return new PhoneLayoutInflater(context);
	}
}
