package ArraysEx;

import java.util.Scanner;

public class ReverseNumbers {
	public static int[] getSorted(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter the elements :");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++) {
			int rev =0;
			int num=a[i];
			while(num>0) {
				int remainder = num%10;
				rev = (rev * 10)+remainder;
				num = num/10;
			}
			a[i]=rev;
		}
		int sort[]=getSorted(a);
		for(int i=0;i<sort.length;i++)
			System.out.print(sort[i]+ " ");
	}

}
