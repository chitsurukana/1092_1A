package test02;

import java.util.ArrayList;
import java.util.List;

//���q���O
public class Company{
	private List<Staff> allStaffs = new ArrayList<Staff>();
	public void addStaff(Staff per) {
		allStaffs.add(per);
	}
	
	public void showAllStaffs() {
		for (Staff per : allStaffs) {
			System.out.println("Obj�G" + per.toString());
		}
	}
}
