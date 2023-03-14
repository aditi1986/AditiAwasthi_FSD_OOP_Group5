package com.glearning.itapp.service;

import com.gleraning.itapp.model.Employee;

public interface GenerateCredentials {
	
	public String generateEmailaddress(String firstName, String lastName, String department, String company);
	
	public String generateCredentials(int maxlength);
	
	public void displaycredentials(Employee employee);
	
	

}
