package ExceptionHandling;

import java.util.Scanner;

/*throw an exception if salary of an employee is below than 3000. 
 * Use Exception Handling mechanism to handle exception properly.*/

public class EmployeeException extends Exception {
	public EmployeeException(String s) {
		System.out.println("Emp salary below 3000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary :");
		int sal = sc.nextInt();
		try {
			if(sal<3000) {
				throw new EmployeeException("Emp salary below 3000");
			}
			else
				System.out.println("Valid Salary");
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}

	}

}
