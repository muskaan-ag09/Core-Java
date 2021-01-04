import java.util.*;
public class setInterface {

	public static void main(String[] args) {
		
		//HasSet will not print values in sequence since the values are stored in heap with certain algorithm
		Set<Integer> values=new HashSet<Integer>();
		
		System.out.println(values.add(5));	//true
		System.out.println(values.add(6));	//true
		System.out.println(values.add(6));	//false since 6 is repeated
		values.add(9);
		values.add(5);	//set only store unique elements
		values.add(97);
		values.add(34);
		values.add(87);
		values.add(92);
		
		for(int i:values)
			System.out.println(i);	//it will not print 6
		
		//To store elements in ascending order, we can use TreeSet istead of HashSet
		System.out.println();
		Set<Integer> val=new TreeSet<>();
		
		val.add(89);
		val.add(90);
		val.add(76);
		val.add(56);
		val.add(34);
		for(int i:val)
			System.out.println(i);
	}

}
