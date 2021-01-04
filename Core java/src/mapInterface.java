//For thread safety, use HashTable since it is synchronized.
//Otherwise use HashMap
//Generally, HashMap is used/
import java.util.*;
public class mapInterface {

	public static void main(String[] args) {
		
		//Here keys are unique since keys are set and set contains only unique value
		Map<String,String> map=new HashMap<>();
		map.put("myName","Muskaan");
		map.put("actor", "John");
		map.put("ceo", "Marsina");
		map.put("actor", "Akshay");
		
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
