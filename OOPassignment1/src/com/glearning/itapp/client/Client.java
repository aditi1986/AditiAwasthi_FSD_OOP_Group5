package com.glearning.itapp.client;

import java.util.Scanner;

import com.glearning.itapp.service.CredentialServiceImpl;
import com.gleraning.itapp.model.Employee;

public class Client {

	public static void main(String[] args) {

		System.out.println("Enter First Name");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName, lastName);
		employee.setCompany("TCS");
		CredentialServiceImpl credentialservice = new CredentialServiceImpl();
		System.out.println("Enter department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();
		String generatedemail;
		String generatedpassword;
		switch (option) {
		case 1:
			generatedemail = credentialservice.generateEmailaddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech", employee.getCompany());

			generatedpassword = credentialservice.generateCredentials(8);
			employee.setEmailAddress(generatedemail);
			employee.setPassword(generatedpassword);
			credentialservice.displaycredentials(employee);
			break;

		case 2:
			generatedemail = credentialservice.generateEmailaddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin", employee.getCompany());
			generatedpassword = credentialservice.generateCredentials(10);
			employee.setEmailAddress(generatedemail);
			employee.setPassword(generatedpassword);
			credentialservice.displaycredentials(employee);
			break;
		case 3:
			generatedemail = credentialservice.generateEmailaddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr", employee.getCompany());
			generatedpassword = credentialservice.generateCredentials(12);
			employee.setEmailAddress(generatedemail);
			employee.setPassword(generatedpassword);
			credentialservice.displaycredentials(employee);
			break;
		case 4:
			generatedemail = credentialservice.generateEmailaddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal", employee.getCompany());
			generatedpassword = credentialservice.generateCredentials(10);
			employee.setEmailAddress(generatedemail);
			employee.setPassword(generatedpassword);
			credentialservice.displaycredentials(employee);
			break;

		default:
			System.out.println("Enter a valid option");
		}
	}

}
