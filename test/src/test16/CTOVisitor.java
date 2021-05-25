package test16;

public class CTOVisitor implements Visitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程師：" + engineer.name + "，程式碼數量：" + engineer.getCodeLines());
	}
	@Override
	public void visit(Manager leader) {
		System.out.println("經理：" + leader.name + "，產品數量；" + leader.getProducts());
	}
}
