package OptionalEx;

import java.util.Scanner;

public class Exercise3_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//non-recursive fibo
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int a=0,b=1,c;
		
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
