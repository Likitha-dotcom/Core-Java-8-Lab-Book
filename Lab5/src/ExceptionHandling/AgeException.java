package ExceptionHandling;

import java.util.Scanner;
/*Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.*/


public class AgeException extends Exception {
	public AgeException(String s) {
		System.out.println("Invalid Age");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			if(age<15) {
				throw new AgeException("Invalid Age");
			}
			else
				System.out.println("Valid Age");
		}
		catch(AgeException e) {
			System.out.println(e);
		}

	}

}
