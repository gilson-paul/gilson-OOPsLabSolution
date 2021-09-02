package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	private static final Scanner sc = new Scanner( System.in );

	public static void main( String[] args )	{
		System.out.println("First Name : ");
		String firstName = sc.next();
		
		System.out.println("Last Name : ");
		String lastName = sc.next();
	
		System.out.println("Please Choose your department : ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int choice = sc.nextInt();
		
		Employee emp;
		
		switch( choice )	{
		case 1:
			emp = new Employee( firstName, lastName, "tech");
			break;
		case 2:	
			emp = new Employee( firstName, lastName, "adm");
			break;
		case 3:	
			emp = new Employee( firstName, lastName, "hr");
			break;
		case 4:
			emp = new Employee( firstName, lastName, "lg");
			break;
		default:
			System.out.println("Incorrect choice" );
			return;
		}
	
		CredentialService cs = new CredentialService();
		
		String email = cs.generateEmailAddress( emp );
		
		String password = cs.generatePassword();
		
		cs.showCredentials(emp, email, password);
	}
	

}
