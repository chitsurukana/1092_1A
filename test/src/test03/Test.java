package test03;
//3-5 p.49

//���յ{���X
public class Test {
	public static void main(String[] args) {
		//�ظm��
		Builder builder = new MacbookBuilder();
		//Director
		Director pcDirector = new Director(builder);
		//�ʸ˫ظm�L�{�A4�֡B�O����2GB�BMac �t��
		pcDirector.construct("�^�S���D���O", "Ratina��ܾ�");
		//�ظm�p����A��X������T
		System.out.println("Computer Info : " + builder.create().toString());
	}
}
