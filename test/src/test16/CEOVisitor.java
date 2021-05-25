package test16;

public class CEOVisitor implements Visitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("�u�{�v�G" + engineer.name + "�AKPI�G" + engineer.kpi);
	}
	@Override
	public void visit(Manager mgr) {
		System.out.println("�g�z�G" + mgr.name + "�AKPI�G" + mgr.kpi + "�A�s���~�ƶq�F" + mgr.getProducts());
	}
	@Override
	public String toString() {
		return "CEO";
	}
}
