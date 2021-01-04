import java.util.*;

class stud implements Comparable<stud>{
	int rollno,marks;
	String name;
	
	public stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}	
	
	/* Sort based on marks
	 
	public int compareTo(stud s) {
		return marks>s.marks?1:-1;
	}
	
	*/
	
	//sort based on names length
	public int compareTo(stud s) {
		return name.length()>s.name.length()?1:-1;
	}
}
public class comparableInterface {

	public static void main(String[] args) {
		List<stud> studs=new ArrayList<>();
		
		studs.add(new stud(23,55,"Mahesh"));
		studs.add(new stud(24,23,"Rahesh"));
		studs.add(new stud(25,14,"Kihesh"));
		studs.add(new stud(26,89,"Lohesh"));
		
		//even if you define a comparator based on names, it will sort based on marks if comparator is defined here itself
		Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1);
		
		for(stud s:studs)
			System.out.println(s);
	}

}
