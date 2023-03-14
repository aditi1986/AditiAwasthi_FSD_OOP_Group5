/**
 * 
 */
package com.glearning.itapp.service;

import java.util.Random;

import com.gleraning.itapp.model.Employee;

/**
 * @author Aditi
 *
 */
public class CredentialServiceImpl implements GenerateCredentials {
	private static final String uppercase = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
	private static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
	private static final String number = "1234567890";
	private static final String special_chars = "!@#$%^&*()_";
	private static final String password_allow_base = uppercase + lowercase + number + special_chars;
	private static Random random = new Random();

	@Override
	public String generateEmailaddress(String firstName, String lastName, String department, String company) {
		String generatedEmail = firstName + lastName + "@" + department + company + ".com";
		return generatedEmail;
	}

	@Override
	public String generateCredentials(int maxlength) {
		char[] passwordChars = new char[maxlength];

		StringBuilder passwordbuilder = new StringBuilder(maxlength);
		// one lower case
		passwordbuilder.append(lowercase.charAt(random.nextInt(lowercase.length())));
		// one upper case
		passwordbuilder.append(uppercase.charAt(random.nextInt(uppercase.length())));
		// one number
		passwordbuilder.append(number.charAt(random.nextInt(number.length())));

		// one special char
		passwordbuilder.append(special_chars.charAt(random.nextInt(special_chars.length())));

		// fill rest of password
		for (int i = 4; i < maxlength; i++) {
			passwordbuilder.append(password_allow_base.charAt(random.nextInt(password_allow_base.length())));
		}

		// shufflechars
		passwordChars = passwordbuilder.toString().toCharArray();
		for (int i = 0; i < passwordChars.length; i++) {
			// get a random char from array
			// store char in random char var
			// assign char from random number to i var of array
			// assign temp char to j variable
			// a[i] i should be random but between 0 and 5 will be stored in a temp

			char temp;
			Random random = new Random();
			temp = passwordChars[random.nextInt(passwordbuilder.toString().length())];
			passwordChars[i] = temp;

		}

		return new String(passwordChars);
	}

	@Override
	public void displaycredentials(Employee employee) {
		System.out.println("Employee First Name : " + employee.getFirstName() + "\n" + "Employee Last Name : "
				+ employee.getLastName() + "\n" + "Employee Mail ID : " + employee.getEmailAddress() + "\n"
				+ "Employee Password : " + employee.getPassword());

	}

}
