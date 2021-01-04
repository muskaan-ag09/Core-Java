import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		
		//Collection ina an interface. 
		//Here we cannot get the index no
		//It will support any type of value
		Collection values=new ArrayList();
		values.add(4);
		values.add(9);
		values.add(3);
		values.add("hi");
		values.add(9.8);
		
		Iterator it=values.iterator();
		
		//Prints the elements
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		//List implements the features of Collection. 
		//Here we can get the index no. 
		//It will support any type of value
		List values1=new ArrayList();	//List is mutable
		values1.add(4);	//In backend, Integer v=new Integer(4);
		values1.add(9);
		values1.add(3);
		values1.add("hi");
		values1.add(2, 9.8);	//it will add 9.8 after 2nd position
		
		//print elements
		for(int i=0;i<values1.size();i++)
				System.out.println(values1.get(i));	//get function is available only in List interface
		
		System.out.println();
		
		//enhanced for loop for printing elements
		for(Object o:values)	//since everything is an object
			System.out.println(o);
		
		System.out.println();
		List<Integer> values3=new ArrayList<Integer>();	//used in jdk 1.7 and later
		values3.add(406);
		values3.add(908);
		values3.add(639);
		values3.add(265);
		
		Collections.sort(values3);	//sort the array
		
		for(Integer o:values3)
			System.out.println(o);
		
		System.out.println();
		Collections.reverse(values3);	//reverse the array
		
		for(Integer o:values3)
			System.out.println(o);
		
		System.out.println();
		Collections.shuffle(values3);
		
		for(Integer o:values3)
			System.out.println(o);
	}
}
