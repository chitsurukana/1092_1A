package test16;

public class Client {

	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("======== �� CEO �ݪ����� ======");
		
		report.showReport(new CEOVisitor());
		System.out.println("======== �� CTO �ݪ����� ======");
		
		report.showReport(new CTOVisitor());
	}

}
