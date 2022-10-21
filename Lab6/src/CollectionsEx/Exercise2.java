package CollectionsEx;

import java.util.*;
import java.util.Scanner;
/*Create a method that accepts a character array and count the number of times each character 
 * is present in the array.*/

public class Exercise2 {
	public static Map<Character, Integer> countChars(char arr[]) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char i:arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		
		Exercise2 e = new Exercise2();
		Map map = e.countChars(arr);
		System.out.println(map);
	}

}
