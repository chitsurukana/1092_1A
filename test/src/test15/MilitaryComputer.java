package test15;

public class MilitaryComputer extends AbstractComputer {
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("�ˬd�w�騾����");
	}
	@Override
	protected void login() {
		System.out.println("�i��������ѧO���������ϥΪ�����");
	}
}
