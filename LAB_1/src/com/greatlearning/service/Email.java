package com.greatlearning.service;

public class Email {

	public String generateEmail(String fname, String lname, String dept) {
		
		String email = "";
		email = fname+lname+"@"+dept+".abc.com";
		
		return email;
	}
}
