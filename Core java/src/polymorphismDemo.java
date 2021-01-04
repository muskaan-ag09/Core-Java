class A2{
	public void show() {
		System.out.println("In A");
	}
}

class B2 extends A2{
	public void show() {
		System.out.println("In B");
	}
}

class C2 extends A2{
	public void show() {
		System.out.println("In C");
	}
}
public class polymorphismDemo {

	public static void main(String[] args) {
		A2 obj; //reference
		obj= new B2(); // runtime polymorphism
		obj.show();
		
		obj=new C2();
		obj.show();	//Dynamic Method dispatch
	}

}
