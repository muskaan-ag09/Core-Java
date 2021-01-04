/*
 * Inner class: 1. Member Class 2. Static class 3.Anonymous class
 */

class Outer{
	int a;
	public void show() {
		System.out.println("In outer class show");
	}
	class Inner{ //Outer$Inner.class
		public void display() {
			System.out.println("In inner class display");
		}
	}
	
	static class Inner2{ //static inner class
		public void display() {
			System.out.println("In static inner class display");
		}
	}
}
public class innerDemo {

	public static void main(String[] args) {
		//calling outer class
		Outer obj=new Outer();
		obj.show();
		
		//Calling inner class
		Outer.Inner obj1=obj.new Inner();
		obj1.display();
		
		//Calling static inner class
		Outer.Inner2 obj2=new Outer.Inner2();
		obj2.display();
	}

}
