package test16;

public class ReportUitl {
	public void visit(Staff staff) {
		if(staff instanceof Manager) {
			Manager mgr = (Manager) staff;
				System.out.println("經理：" + mgr.name + "，KPI：" + mgr.kpi + "，新產品數量；" + mgr.getProducts());
		}else {
			Engineer engineer = (Engineer) staff;
			System.out.println("工程師：" + engineer.name + "，KPI：" + engineer.kpi);
		}
	}
}
