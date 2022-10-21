package StringEx;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Write a Java program that reads a line of integers and then displays each 
integer and the sum of all integers. (Use String Tokenizer class)*/

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integers on the same line with gap:");
		String numbers = sc.nextLine();
		StringTokenizer st = new StringTokenizer(numbers);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int n = Integer.parseInt(token);
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum of all integers:" + sum);

	}

}
