package CollectionsEx;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/*Create a method which accepts the id and the age of people as a Map and decide if they are 
 * eligible for vote. A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list.*/

public class Exercise6 {
	public static List votersList(HashMap<Integer,String> map) {
		List<Integer> list = new ArrayList<>();
		
		for(Integer i:map.keySet()) {
			String dob = map.get(i);
			LocalDate dob_date = LocalDate.parse(dob);
			LocalDate curDate = LocalDate.now();
			int age=Period.between(dob_date, curDate).getYears();
			if(age>=18) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int size= sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the ID:");
			int id=sc.nextInt();
			System.out.println("Enter the DOB (YYYY-MM-DD):");
			String dob = sc.next();
			
			map.put(id, dob);
			
			Exercise6 e = new Exercise6();
			List l=e.votersList(map);
			System.out.print(l);
		}
	}

}
