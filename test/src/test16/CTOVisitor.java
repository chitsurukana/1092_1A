package test16;

public class CTOVisitor implements Visitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("�u�{�v�G" + engineer.name + "�A�{���X�ƶq�G" + engineer.getCodeLines());
	}
	@Override
	public void visit(Manager leader) {
		System.out.println("�g�z�G" + leader.name + "�A���~�ƶq�F" + leader.getProducts());
	}
}
