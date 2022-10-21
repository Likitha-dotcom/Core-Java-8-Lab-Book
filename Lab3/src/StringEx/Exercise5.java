package StringEx;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		int ch_count=str.length();
		System.out.println("No. of characters:"+ ch_count);
		
		int wcount=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				wcount++;
			}
		}
		System.out.println("No. of words:"+ wcount);
		
		String[] lines = str.split("\r\n|\r|\n");
		int lcount = lines.length;
		System.out.println("No. of lines:"+ lcount);
	}

}
