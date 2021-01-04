/*
 * Since Class B1 overrides the method of class A1, 
 * this process is known as method overriding
 */

class A1{
	int i;
	public void show() {
		System.out.println("In A");
	}
}

class B1 extends A1{
	int i;
	@Override	//we will get a compile time error. The @Override annotation indicates that the child class method is over-writing its base class method. It extracts a warning from the compiler if the annotated method doesn't actually override anything. It can improve the readability of the source code.
	public void show() {
		super.i=8;
		super.show();
		System.out.println("In B");
	}
}
public class overridingDemo {

	public static void main(String[] args) {
		B1 obj1=new B1();
		obj1.show();
	}
}
