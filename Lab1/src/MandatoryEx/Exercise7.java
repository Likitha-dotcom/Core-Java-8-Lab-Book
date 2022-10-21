package MandatoryEx;

import java.util.Scanner;

public class Exercise7 {
//check if a number is an increasing number 
//For Example : 134468 is an increasing number 
	
	public static boolean checkNumber(int number) {
		int lastDigit= number%10; //give last digit
		number = number/10;		  //give new numb omitting the last digit
		
		while(number>0) {
			int secondLastDigit = number%10;
			if(lastDigit<secondLastDigit) {
				return false;
			}
			number = number/10;
			lastDigit = secondLastDigit;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		if(checkNumber(num)) 
			System.out.println("Is a increasing no.");
		else
			System.out.println("Is not a increasing no.");
	}

}
