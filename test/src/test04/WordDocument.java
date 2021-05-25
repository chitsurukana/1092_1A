package test04;

import java.util.ArrayList;
import java.util.List;

//4.5 p.73

/**
 *��������A��t���OConcretePrototype����A��cloneable�O�N��prototype����
 */
public class WordDocument implements Cloneable{
	//��r
	private String mText;
	//�Ϥ��W�C��
	private ArrayList<String> mImages = new ArrayList<String>();
	
	public WordDocument clone() {
		try {
			WordDocument doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.mImages = this.mImages;
			return doc;
		} catch (Exception e) {
		}
		return null;
	}
	public String getText() {
		return mText;
	}
	public void setText(String mText) {
		this.mText = mText;
	}
	public List<String> getImages(){
		return mImages;
	}
	public void addImage(String img) {
		this.mImages.add(img);
	}
	/**
	 * �C�L��󤺮e
	 */
	public void showDocument() {
		System.out.println("-----------Word Content Start-----------");
		System.out.println("Text : " + mText);
		System.out.println("Images List: ");
		
//		for(int i = 0 ; i < mImages.size() ; i++) {
//			String imgName = mImages.get(i);
//			System.out.println("image name" + imgName);
//		}
		
		for(String imgName : mImages) {
			System.out.println("image name" + imgName);
		}
		System.out.println("-----------Word Content End-----------");
	}
}






