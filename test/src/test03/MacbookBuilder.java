package test03;
//3-5 p.48

//���骺Builder���O�AMacbookBuilder
public class MacbookBuilder extends Builder{
	private Computer mComputer = new Macbook();
	@Override
	public void buildBoard(String board) {
		mComputer.setBoard(core);
	}
	@Override
	public void buildDisplay(String display) {
		mComputer.setDisplay(display);
	}
	@Override
	public void buildOS() {
		mComputer.setOS();
	}
	@Override
	public Computer create() {
		return mComputer;
	}
}
