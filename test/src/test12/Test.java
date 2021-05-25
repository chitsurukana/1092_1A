package test12;

public class Test {
	public static void main(String[] args) {
		DevTechFrontier DevTechFrontier = new DevTechFrontier();

		Coder mrsimple = new Coder("mr.simple");
		Coder coder1 = new Coder("coder-1");
		Coder coder2 = new Coder("coder-2");
		Coder coder3 = new Coder("coder-3");

		DevTechFrontier.addObserver(mrsimple);
		DevTechFrontier.addObserver(coder1);
		DevTechFrontier.addObserver(coder2);
		DevTechFrontier.addObserver(coder3);

		DevTechFrontier.postNewPublication("新的一期開發技術前線週報發布啦!");
	}
}
