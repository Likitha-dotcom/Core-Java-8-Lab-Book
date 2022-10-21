package OptionalEx;

import java.util.Scanner;

//Create a method to find the sum of the cubes of the digits of an n digit number
public class Exercise1 {
	
	public static int sumOfCubeDigits(int n) {
		int s = n*(n+1)/2;
		int sum = (int)Math.pow(s, 2);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit :");
		int n= sc.nextInt();
		
		int sum = sumOfCubeDigits(n);
		System.out.println("The sum of cube of digits is:"+ sum);

	}

}
