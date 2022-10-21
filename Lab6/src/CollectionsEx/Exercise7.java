package CollectionsEx;

import java.util.*;
import java.util.Scanner;
/*Create a method which accepts an integer array, reverse the numbers in the array and returns 
 * the resulting array in sorted order*/

public class Exercise7 {
	public static void getSorted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int rev=0;
			int num=arr[i];
			while(num>0) {
				int remainder = num%10;
				rev = (rev*10)+remainder;
				num=num/10;
			}
			arr[i]=rev;
		}
		Arrays.sort(arr);
		for (int num : arr) {
            System.out.print(num+" ");
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the array elements:");
			arr[i] = sc.nextInt();
		}

		getSorted(arr);
		
	}

}
