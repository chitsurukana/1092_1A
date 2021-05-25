package test16;

public class Client {

	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("======== 給 CEO 看的報表 ======");
		
		report.showReport(new CEOVisitor());
		System.out.println("======== 給 CTO 看的報表 ======");
		
		report.showReport(new CTOVisitor());
	}

}
