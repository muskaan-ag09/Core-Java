/*
 * Static Methods in Interface are those methods, which are defined in the interface with the keyword static. 
 * Unlike other methods in Interface, these static methods contain the complete definition of the function and since the definition is complete and the method is static, 
 * therefore these methods cannot be overridden or changed in the implementation class.
 */

@FunctionalInterface
interface Demo4{
	int num=8;	//by default, a variable in interface is a constant i.e it is declared final
	void abc();
	static void show() {
			System.out.println("Hi");
	}
}

class DemoImp1 implements Demo4{
	public void abc() {
		// num=9; // we cannot modify num since it is by default declared final
	}
}
public class staticMethodInInterface {

	public static void main(String[] args) {
		
	}

}
