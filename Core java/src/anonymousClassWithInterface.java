/*
 * We can create object of an interface using an anonymous class
 */

interface ABC1{
	void show();
}

public class anonymousClassWithInterface {

	public static void main(String[] args) {
		ABC1 obj=new ABC1() {
			public void show() {
				System.out.println("anything");
			}
		};
		obj.show();
	}

}
