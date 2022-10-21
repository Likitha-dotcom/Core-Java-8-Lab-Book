package CollectionsEx;
import java.util.*;
import java.util.Scanner;

/*Create a method which accepts an array of numbers and returns the 
 * numbers and their squares in Hashmap*/

public class Exercise3 {
	public static Map<Integer,Integer> getSquares(int arr[]){
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i:arr) {
			map.put(i, i*i);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the array elements :");
			arr[i]=sc.nextInt();
		}
		Exercise3 e = new Exercise3();
		Map map = e.getSquares(arr);
		System.out.println(map);
	}

}
