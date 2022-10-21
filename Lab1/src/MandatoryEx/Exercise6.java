package MandatoryEx;

import java.util.Scanner;

/*difference between the sum of the squares and the square of the sum of the 
first n natural numbers.*/

public class Exercise6 {
	public static int calculateDifference(int n) {
		int S1= (n*(n+1))/2;
		int S2= (n*(n+1)*(2*n+1))/6;
		int diff = S1-S2;
		return diff;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of terms:");
		int n= sc.nextInt();
		
		System.out.println(calculateDifference(n));
	}

}
