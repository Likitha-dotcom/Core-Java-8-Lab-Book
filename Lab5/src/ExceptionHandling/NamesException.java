package ExceptionHandling;

import java.util.Scanner;

/*Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.*/

public class NamesException extends Exception{
	public NamesException(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String fname = sc.nextLine();
		System.out.println("Enter last name:");
		String lname = sc.nextLine();
		try {
			if(fname.isEmpty() && lname.isEmpty()) {
				throw new NamesException("First & last name can't be blank");
			}
			else
				System.out.println("Name is valid");
			
		}
		catch(NamesException e) {
			System.out.println(e);
		}
	}

}
