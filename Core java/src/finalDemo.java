/*
 * final class cannot be inherited
 * final method cannot be overrided
 * final variable can/t be modified
 */

final class A4{
	final int DAY=0;	//constant; final variable's value cannot be changed
	public final void show() {	//it cannot be overrided
		System.out.println("In A show");
	}
}

class B4 extends A4{
	public void show() {
		System.out.println("In B show");
	}
}
public class finalDemo {

	public static void main(String[] args) {
		B4 obj=new B4();
		obj.show();	//prints "In B show"
		System.out.println(obj.DAY);
	}

}
