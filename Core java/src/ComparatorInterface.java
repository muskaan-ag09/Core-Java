//Sort on basis of logic

import java.util.*;

public class ComparatorInterface {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<Integer>();	//used in jdk 1.7 and later
		values.add(406);
		values.add(908);
		values.add(639);
		values.add(265);
		
		/* Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				return (i%10>j%10)?1:-1;
			}
		}; */
		
		//We can write the above statements using lambda expressions as Comparator is a functional interface
		
		//In lambda expression, we dont require return type and we can also ignore the data type of function parameters
	/*	Comparator<Integer> c= (i,j) -> (i%10>j%10)?1:-1;
		
		Collections.sort(values,c);	//sort the array on basis of logic
	*/
		//We can also direclty write the lamba expression inside sort function to make code short
		
		Collections.sort(values,(i,j)-> i%10>j%10?1:-1);
		for(Integer o:values)
			System.out.println(o);
	}
}
