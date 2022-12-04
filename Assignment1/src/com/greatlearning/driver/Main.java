package com.greatlearning.driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admindept = new AdminDepartment();
		System.out.println(admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday());
		
		System.out.println();
		
		HRDepartment hrdept = new HRDepartment();
		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());
		
		System.out.println();
		
		TechDepartment techdept = new TechDepartment();
		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}
}
