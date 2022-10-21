package OptionalEx;

import java.util.Scanner;

/*Write a java program that simulates a traffic light.*/
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice [red , yellow, green]-->");
		String ch = sc.next();
		switch(ch) {
		case "red":
			System.out.println("STOP");
			break;
		case "yellow":
			System.out.println("READY");
			break;
		case "green":
			System.out.println("GO");
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}
