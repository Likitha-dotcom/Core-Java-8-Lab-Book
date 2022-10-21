package StringEx;

import java.util.Scanner;

/* Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol . */

public class Exercise2 {
	public static String getImage(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();
		return reversedStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.next();
		
		
		String revStr=getImage(str);
		System.out.print(str + "|" + revStr);

	}

}
