package test04;

import java.util.ArrayList;
import java.util.List;

//4.5 p.73

/**
 *文件類型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 */
public class WordDocument implements Cloneable{
	//文字
	private String mText;
	//圖片名列表
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
	 * 列印文件內容
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






