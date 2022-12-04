package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.Department;
import com.greatlearning.service.Email;
import com.greatlearning.service.RandomPassword;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.print("1. Technical\n"+"2. Admin\n"+"3. Human Resource\n"+"4. Legal\n");
		
		Department dept = new Department();
		int deptinput = sc.nextInt();
		System.out.println(dept.departmentName(deptinput));
		
		
		System.out.println("");
		
		System.out.println("Please enter fname");
		String fname = sc.next();
		System.out.println("Please enter lname");
		String lname = sc.next();
		
		Employee emp = new Employee(fname, lname);
		
		emp.setFirstName(fname);
		emp.setLastName(lname);
		
		Email e = new Email();
		String gm = e.generateEmail(emp.getFirstName(), emp.getLastName(), (dept.departmentName(deptinput)));
		System.out.println("Email -> "+gm);
		
		RandomPassword rd = new RandomPassword();
		System.out.println("Password -> "+rd.generatePasswd());
		
				
	}
}
