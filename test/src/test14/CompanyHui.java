package test14;

public class CompanyHui implements Company{
	private Employee[] array = new Employee[3];
	
	public CompanyHui() {
		array[0] = new Employee("����", 108, "�k", "�{����");
		array[1] = new Employee("�p��", 98, "�k", "�{����");
		array[2] = new Employee("�p��", 88, "�k", "�{����");
	}
	
	public Employee[] getEmployees() {
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}
	
}
