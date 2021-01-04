/*
 * Encapsulation-> Binding of data with methods
 * Need for encapsulation: 
 * 1. Datas are safe since they are private
 * 2. Although methods are public and still datas can be modified, but we can always maintain a log file by printing the value which is changed in the method.
 * 3. Use of getters and setters help us to maintain log file and datas are encapsulated
 */

class Student{
	private int roll;
	private String name;
	
	
	//Getters and Setters
	public int getRoll() {
		System.out.println("User is accessing the value");
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("Roll no changed");	//Log file to ensure datas are not modified by suspicious user
	}
	public String getName() {
		System.out.println("User is accessing the value");
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name changed");
	}
}
public class encapsulationDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRoll(2);
		s1.setName("Muskaan");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
	}
}
