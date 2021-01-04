interface ABC{
	void show();
}
class Implementor implements ABC{
	public void show() {
		System.out.println("anything");
	}
}
public class interfaceDemo2 {

	public static void main(String[] args) {
		ABC obj=new Implementor();	//only way to create an object of an interface is by implementing a class and creating the object of that class
		obj.show();
	}

}
