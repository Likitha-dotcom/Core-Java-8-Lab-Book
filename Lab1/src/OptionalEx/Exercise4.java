package OptionalEx;

import java.util.Scanner;

public class Exercise4 {
//prints out all the prime numbers up to Integer n
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i ==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of terms :");
		int terms= sc.nextInt();
		for(int i=1;i<=terms;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
