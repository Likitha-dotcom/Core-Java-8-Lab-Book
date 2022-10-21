package StringEx;

import java.util.Arrays;
import java.util.Scanner;

//Create a method that accepts a String and checks if it is a positive string.
public class Exercise6 {
	public static boolean positiveString(String str) {
		
		char c[]= new char[str.length()];
		for(int i=0;i<str.length();i++) {
			c[i]= str.charAt(i);
		}
		Arrays.sort(c);
		
		for(int i=0;i<str.length();i++) {
			if(c[i]!=str.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(positiveString(str))
			System.out.print("The string is +ve string" );
		else
			System.out.print("The string is not a +ve string" );
	}

}
