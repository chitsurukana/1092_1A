package test16;

public class CEOVisitor implements Visitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程師：" + engineer.name + "，KPI：" + engineer.kpi);
	}
	@Override
	public void visit(Manager mgr) {
		System.out.println("經理：" + mgr.name + "，KPI：" + mgr.kpi + "，新產品數量；" + mgr.getProducts());
	}
	@Override
	public String toString() {
		return "CEO";
	}
}
