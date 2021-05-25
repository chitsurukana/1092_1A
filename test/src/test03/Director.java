package test03;
//3-5 p.49

//Director類別，負責建構Computer
public class Director {
	Builder mBuilder = null;
	/**
	 * @param builder
	 */
	public Director(Builder builder) {
		mBuilder = builder;
	}
	/**
	 * 建置物件
	 */
	public void construct(String board, String display) {
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
}
