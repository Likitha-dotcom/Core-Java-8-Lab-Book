package CollectionsEx;
import java.util.*;

/*Write a function which accepts the marks of students as a Hashmap and return the 
 * details of the students eligible for the medals along with type of medal.*/

public class Exercise4 {
	public static HashMap<Integer,String> getStudents(HashMap map){
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
		
		HashMap<Integer,String> newmap = new HashMap<>();
		
		for(Map.Entry<Integer, Integer> marks: list) {
			if(marks.getValue()>=90) {
				newmap.put(marks.getKey(), "GOLD");
			}
			else if(marks.getValue()>=80 && marks.getValue()<90) {
				newmap.put(marks.getKey(), "SILVER");
			}
			else if(marks.getValue()>=70 && marks.getValue()<80) {
				newmap.put(marks.getKey(), "BRONZE");
			}
			else
				newmap.put(marks.getKey(), "Not elegibal");
		}
		return newmap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1002, 95);
		map.put(1005, 86);
		map.put(1003, 72);
		map.put(1004, 50);
		map.put(1001, 67);
		
		Exercise4 e = new Exercise4();
		HashMap hm = e.getStudents(map);
		System.out.println(hm);
		
	}

}
