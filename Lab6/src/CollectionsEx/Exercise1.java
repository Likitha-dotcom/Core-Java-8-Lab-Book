package CollectionsEx;
import java.util.*;
import java.util.Map.Entry;

/*Create a method which accepts a hash map and return the values 
 * of the map in sorted order as a List.*/
public class Exercise1 {
	public static List getValues(HashMap map) {
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Ram", 2);
		map.put("Sita", 5);
		map.put("Lakshman", 3);
		map.put("Bharat", 1);
		map.put("Sam", 4);
		
		System.out.println(map);
		
		Exercise1 e = new Exercise1();
		List l = e.getValues(map);
		System.out.println(l);
		
		
	}

}
