//Functional interface only works in Java 8.
/*
 * A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

 */
interface Abc2{	//it is a functional interface since it has only one abstract method
	void show();
}
public class lambdaExpressionDemo {

	public static void main(String[] args) {
		Abc2 obj = ()-> System.out.println("I am the best");	//lambda expression for functional interface; it is only possible for functional interfaces
		
		obj.show();
	}
}
