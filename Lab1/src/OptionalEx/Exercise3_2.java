package OptionalEx;

import java.util.Scanner;

public class Exercise3_2 {
	public static int fibo(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		//Fibo using recurssion
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		System.out.println("Fibo series is:");
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i)+" ");
		}
	}

}
