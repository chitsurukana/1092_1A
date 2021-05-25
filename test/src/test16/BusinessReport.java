package test16;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
	List<Staff> mStaffs = new LinkedList<Staff>();
	
	public BusinessReport() {
		mStaffs.add(new Manager("王經理"));
		mStaffs.add(new Engineer("工程師-Shawn.Xiong"));
		mStaffs.add(new Engineer("工程師-Kael"));
		mStaffs.add(new Engineer("工程師-Chaossss"));
		mStaffs.add(new Engineer("工程師-Tiiime"));
	}
	
	public void showReport(Visitor visitor) {
		for(Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}