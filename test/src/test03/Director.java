package test03;
//3-5 p.49

//Director���O�A�t�d�غcComputer
public class Director {
	Builder mBuilder = null;
	/**
	 * @param builder
	 */
	public Director(Builder builder) {
		mBuilder = builder;
	}
	/**
	 * �ظm����
	 */
	public void construct(String board, String display) {
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
}
