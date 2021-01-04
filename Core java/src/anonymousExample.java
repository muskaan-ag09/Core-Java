/*
It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class.

Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.
 */

class A5{
	public void show() {
		System.out.println("In A show");
	}
}

public class anonymousExample {

	public static void main(String[] args) {
		A5 obj=new A5() {
			public void show() {
				System.out.println("I am the best");
			}
		};	//this is an anonymous class
		obj.show();
	}

}
