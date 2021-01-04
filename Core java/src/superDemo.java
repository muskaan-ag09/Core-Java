class A{
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In A int");
	}
}

class B extends A{
	public B() {
		super(); 	//it is there by default which calls the default constructor of the super class first
		System.out.println("In B");
	}
	public B(int i) {
		super(i);	//it will class the parameterized constructir of the super class
		System.out.println("In B int");
	}
}
public class superDemo {

	public static void main(String[] args) {
		A obj=new A();
		System.out.println();
		B obj1=new B();
		System.out.println();
		B obj2=new B(5);	//it will call default constructor of super class first and then parameterized constructor of sub class
	}
}
