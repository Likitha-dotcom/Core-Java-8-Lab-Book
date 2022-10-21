package StringEx;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercise7 {
	public static void getDate(String date) {
		
		LocalDate currentDate= LocalDate.parse(date);
		int day = currentDate.getDayOfMonth();
		Month month = currentDate.getMonth();
		int year = currentDate.getYear();
		
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in yyyy-mm-dd :");
		String date = sc.nextLine();
		
		getDate(date);
	}

}
