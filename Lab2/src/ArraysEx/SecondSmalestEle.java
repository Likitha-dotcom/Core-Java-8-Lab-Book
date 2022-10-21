package ArraysEx;

import java.util.Scanner;

public class SecondSmalestEle {
	public static int getSecondSmallest(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the array elements:");
			arr[i]= sc.nextInt();
		}
		
		SecondSmalestEle S = new SecondSmalestEle();
		System.out.println("Second smallest element :"+ S.getSecondSmallest(arr));

	}

}
