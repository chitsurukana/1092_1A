package test16;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
	List<Staff> mStaffs = new LinkedList<Staff>();
	
	public BusinessReport() {
		mStaffs.add(new Manager("���g�z"));
		mStaffs.add(new Engineer("�u�{�v-Shawn.Xiong"));
		mStaffs.add(new Engineer("�u�{�v-Kael"));
		mStaffs.add(new Engineer("�u�{�v-Chaossss"));
		mStaffs.add(new Engineer("�u�{�v-Tiiime"));
	}
	
	public void showReport(Visitor visitor) {
		for(Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}