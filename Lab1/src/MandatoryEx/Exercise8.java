package MandatoryEx;

import java.util.Scanner;

public class Exercise8 {
//check if a number is a power of two or not
	
	public static boolean checkNumber(int n) {
		if(n==0 || n==1) {
			return false;
		}
		else {
//			for(int i=2;i<=n;i++) {
//				if(n%2 == 0)
//					return true;
//			}
			if(n%2 == 0)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n= sc.nextInt();
		
		if(checkNumber(n)) 
			System.out.println(n + " "+"is a power of two");
		else
			System.out.println(n +  " "+"is not a power of two");
	}

}
