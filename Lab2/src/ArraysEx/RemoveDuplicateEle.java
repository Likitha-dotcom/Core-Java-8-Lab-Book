package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateEle {
	public static int modifyArray(int arr[]) {
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++){
			arr[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter the elements of array:");
			a[i]=sc.nextInt();
		}
		
		int removeDup=modifyArray(a);
		for(int i=0;i<=removeDup;i++)
			System.out.print(a[i]+ " ");
		
	}

}
