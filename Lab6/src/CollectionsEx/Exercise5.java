package CollectionsEx;

import java.util.*;

public class Exercise5 {
	public static int getSecondSmallest(int arr[]) {
		List<Integer> list = new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the array elements :");
			arr[i]= sc.nextInt();
		}
		
		System.out.print(arr);
		
		int small=getSecondSmallest(arr);
		
		System.out.print("Second smallest ele is:"+ small);

	}

}
