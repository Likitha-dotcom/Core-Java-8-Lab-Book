package MandatoryEx;

import java.util.Scanner;

public class Exercise5 {
//calculate the sum of first n natural numbers which are divisible by 3 or 5
	
	public static int calculateSum(int N) {
		 int s3 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
		 int s5 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;
		 int s15 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2;
		 int sum=s3+s5-s15;
		 return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of terms:");
		int n= sc.nextInt();

		System.out.println(calculateSum(n));

	}

}
