package test04;

//import org.graalvm.compiler.word.Word;

//4.5 p.74
public class Client {

	public static void main(String[] args) {
		//1.建置文件物件
		WordDocument originDoc = new WordDocument();
		//2.編輯文件，添加圖片等
		originDoc.setText("這是一篇文件");
		originDoc.addImage("圖片1");
		originDoc.addImage("圖片2");
		originDoc.addImage("圖片3");
		originDoc.showDocument();
		
		//以原始文件為原型，拷貝一份副本
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		//修改文件副本，不會影響原始文件
		doc2.setText("這是修改過的Doc2文字");
		doc2.showDocument();
		
		originDoc.showDocument();

	}

}
