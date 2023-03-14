package com.gleraning.itapp.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String emailAddress;
	private String company;
	
	public Employee( String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

public Employee( String firstName, String lastName, String emailAddress) {
		
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailAddress = emailAddress;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", department="
			+ department + ", emailAddress=" + emailAddress + ", company=" + company + "]";
}
	

}
