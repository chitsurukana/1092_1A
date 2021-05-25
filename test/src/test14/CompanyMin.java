package test14;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company{
	private List<Employee> list = new ArrayList<>();
	
	public CompanyMin() {
		list.add(new Employee("�p��", 96, "�k", "�{����"));
		list.add(new Employee("�p��", 22, "�k", "����"));
		list.add(new Employee("�p��", 18, "�k", "����"));
		list.add(new Employee("�i��", 21, "�k", "�]�p"));
		list.add(new Employee("�Ա�", 19, "�k", "�]�p"));
	}
	
	public List<Employee> getEmployees(){
		return list;
	}

	@Override
	public Iterator iterator() {
		return new MinIterator(list);
	}
	
}
