package StringEx;

import java.util.Scanner;

/*Create a method which accepts a String and replaces all the consonants in the String 
 * with the next alphabet. */

public class Exercise3 {
	public static String alterString(String str) {
		String s = " ";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				s+=ch;
			}
				
			else {
				char c = (char)(ch+1);
				s += c;
			}
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		
		String newStr = alterString(str);
		System.out.println(newStr);
	}

}
