package StringEx;

import java.util.Scanner;

/*Accept a number and modify it such that the each of the digit in the newly formed number is equal
 *  to the difference between two consecutive digits in the original number. 
For example. 
Input: 45862 
Output:13242 
*/

public class Exercise4 {
	public static int modifyNumber(int number1) {
		int ch1,ch2, diff=0;
		String str=Integer.toString(number1);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length()-1;i++) {
			ch1 = str.charAt(i);
			ch2 = str.charAt(i+1);
			int num1 = (int)ch1;
			int num2 = (int)ch2;
			diff = Math.abs(num1-num2);
			sb.append(diff);
		}
		sb.append(str.charAt(str.length()-1));
		int num = Integer.parseInt(sb.toString());
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		
		int num = modifyNumber(number);
		System.out.print(num);
	}

}
