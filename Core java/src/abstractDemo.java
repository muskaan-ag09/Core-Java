/*
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */

//Human class is abstract class
abstract class Human{
	//abstract method can only be defined within abstract class
	public abstract void eat();	//declaration of a abstract method
	public void walk() {	//method definition
		
	}
}

//Man class is concrete class
class Man extends Human{	//whenever a class extends an abstract class, we need to implement the declared method
	public void eat() {
		
	}
}

class Printer{
	public void show(Number i) {	//The abstract class Number is the superclass of classes BigDecimal , BigInteger , Byte , Double , Float , Integer , Long , and Short . Subclasses of Number must provide methods to convert the represented numeric value to byte , double , float , int , long , and short .
		System.out.println(i);
	}
}
public class abstractDemo {

	public static void main(String[] args) {
		Human obj=new Man();	//object cannot be created of a abstract class or abstract class cannot be instantiate
	
		Printer obj1=new Printer();
		obj1.show(5.5);
	}
}
