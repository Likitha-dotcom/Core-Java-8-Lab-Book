package ArraysEx;

import java.util.Scanner;

public class Exercise2 {
	public static String[] sortStrings(String[] arr) {
		String temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].charAt(0)>arr[j+1].charAt(0)) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int len;
		if(arr.length%2==0)
			len = arr.length/2;
		else
			len = (arr.length/2)+1;
		
		for(int i=0;i<len;i++)
			arr[i].toUpperCase();
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size=sc.nextInt();
		
		String a[] = new String[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter char of string:");
			a[i]=sc.next();
		}
			
			
		String sortedArr[]=sortStrings(a);
		for(int i=0;i<sortedArr.length;i++)
			System.out.print(sortedArr[i]+" ");
	}

}
