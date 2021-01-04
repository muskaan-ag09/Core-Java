class Casioo{
	int num1;
	int num2;
	String operation;
	public Casioo() {
		num1=0;
		num2=0;
		operation="Nothing";
	}
	public Casioo(int i) {
		num1=i;
		num2=0;
		operation="Nothing";
	}
	public Casioo(int i,int j) {
		num1=i;
		num2=j;
		operation="Nothing";
	}
	public Casioo(int i,int j,String op) {
		num1=i;
		num2=j;
		operation=op;
	}
}
public class constructorOverloadingDemo {

	public static void main(String[] args) {
		Casioo obj=new Casioo(3);
		System.out.println(obj.num1+","+obj.num2+","+obj.operation);
	}

}
