package com.greatlearning.service;

public class Department {

	public String departmentName(int inp){	
		String dept = null;
		switch(inp) 
		{
		case 1:
			dept = "tech";
			break;
		

		case 2:
			dept = "admin";
			break;
			
		case 3:
			dept = "hr";
			break;
			
		case 4:
			dept = "legal";
			break;
			
		default:
			dept = "Invalid input";
			break;
	}
	return dept;
}
}
