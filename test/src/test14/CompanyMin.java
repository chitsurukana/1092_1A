package test14;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company{
	private List<Employee> list = new ArrayList<>();
	
	public CompanyMin() {
		list.add(new Employee("小民", 96, "男", "程式猿"));
		list.add(new Employee("小芸", 22, "女", "測試"));
		list.add(new Employee("小方", 18, "女", "測試"));
		list.add(new Employee("可兒", 21, "女", "設計"));
		list.add(new Employee("朗情", 19, "女", "設計"));
	}
	
	public List<Employee> getEmployees(){
		return list;
	}

	@Override
	public Iterator iterator() {
		return new MinIterator(list);
	}
	
}
