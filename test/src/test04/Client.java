package test04;

//import org.graalvm.compiler.word.Word;

//4.5 p.74
public class Client {

	public static void main(String[] args) {
		//1.�ظm��󪫥�
		WordDocument originDoc = new WordDocument();
		//2.�s����A�K�[�Ϥ���
		originDoc.setText("�o�O�@�g���");
		originDoc.addImage("�Ϥ�1");
		originDoc.addImage("�Ϥ�2");
		originDoc.addImage("�Ϥ�3");
		originDoc.showDocument();
		
		//�H��l��󬰭쫬�A�����@���ƥ�
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		//�ק���ƥ��A���|�v�T��l���
		doc2.setText("�o�O�ק�L��Doc2��r");
		doc2.showDocument();
		
		originDoc.showDocument();

	}

}
