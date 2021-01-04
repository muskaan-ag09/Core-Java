// Abstract class -> Define and declare
// Interface -> declare -> 1.7
// 1.8 can define methods in interface

/*
 * Before Java 8, interfaces could have only abstract methods. 
 * The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, 
 * then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, 
 * Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.
 */


//@FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message. However, it is not mandatory to use this annotation.
@FunctionalInterface
interface Demo{
	void abc();
	
	//Below lines will throw an error "Abstract methods do not specify a body"
/*	public void show() {
		System.out.println("In show");
	}
*/
	
	default public void show() {
		System.out.println("In Demo show");
	}
}

interface MyDemo{
	default void show() {
		System.out.println("In MyDemo show");
	}
}

class DemoImp implements Demo, MyDemo{
	public void abc() {
		System.out.println("in abc");
	}
	
	@Override
	public void show() {	//To implement multiple inheritance and to avoid ambiguity
		Demo.super.show();
		MyDemo.super.show();
	}
}
public class defaultMethodInInterfaceDemo {

	public static void main(String[] args) {
		Demo obj=new DemoImp();
		obj.abc();
		obj.show();
	}

}
