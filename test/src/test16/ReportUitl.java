package test16;

public class ReportUitl {
	public void visit(Staff staff) {
		if(staff instanceof Manager) {
			Manager mgr = (Manager) staff;
				System.out.println("�g�z�G" + mgr.name + "�AKPI�G" + mgr.kpi + "�A�s���~�ƶq�F" + mgr.getProducts());
		}else {
			Engineer engineer = (Engineer) staff;
			System.out.println("�u�{�v�G" + engineer.name + "�AKPI�G" + engineer.kpi);
		}
	}
}
