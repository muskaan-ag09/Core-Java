class Calci{
	int num1;
	int num2;
	int result; //instance variable
	
	public Calci() {
		num1=5;
		num2=3;
		System.out.println("In constructor");
	}
	public Calci(int n1,int n2) { // x is a local variable
		num1=n1;
		num2=n2;
	}
	public Calci(double d,int x) {
		num1=(int)d;
		num2=x;
	}
}
public class constructorExample {

	public static void main(String[] args) {
		Calci obj=new Calci(4,5); // Constructor
		System.out.println(obj.num1+","+obj.num2);
	}

}
