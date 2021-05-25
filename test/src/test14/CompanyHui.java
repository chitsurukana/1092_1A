package test14;

public class CompanyHui implements Company{
	private Employee[] array = new Employee[3];
	
	public CompanyHui() {
		array[0] = new Employee("輝哥", 108, "男", "程式猿");
		array[1] = new Employee("小紅", 98, "男", "程式猿");
		array[2] = new Employee("小輝", 88, "男", "程式猿");
	}
	
	public Employee[] getEmployees() {
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}
	
}
