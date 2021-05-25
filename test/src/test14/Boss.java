package test14;

import java.util.List;

public class Boss {

	public static void main(String[] args) {
		CompanyMin min = new CompanyMin();
//		List minList = min.getEmployees();
//		for(int i=0;i<minList.size();i++) {
//			System.out.println(minList.get(i).toString());
//		}
		
		check(min.iterator());
		
		CompanyHui hui = new CompanyHui();
//		Employee[] huiArray = hui.getEmployees();
//		for(int i=0;i<huiArray.length;i++) {
//			System.out.println(huiArray[i]);
//		}
		
		check(hui.iterator());
	}
	private static void check(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
