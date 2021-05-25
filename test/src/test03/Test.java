package test03;
//3-5 p.49

//測試程式碼
public class Test {
	public static void main(String[] args) {
		//建置器
		Builder builder = new MacbookBuilder();
		//Director
		Director pcDirector = new Director(builder);
		//封裝建置過程，4核、記憶體2GB、Mac 系統
		pcDirector.construct("英特爾主機板", "Ratina顯示器");
		//建置計算機，輸出相關資訊
		System.out.println("Computer Info : " + builder.create().toString());
	}
}
