package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	//private String department;
	
	public Employee(String firstName, String lastName) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		//this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
