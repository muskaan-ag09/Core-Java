class Calcu{
	int num1;
	int num2;
	int result; //instance variable
	
	public Calcu(int num1,int num2) { // x is a local variable
		this.num1=num1; //this keyword states that the variable is an instance variable and not the lcoal variable
		this.num2=num2;	//or this keyword points to the current object to help ease of use of same variable name of the local variable
	}
}
public class thisKeyword {

	public static void main(String[] args) {
		Calcu obj=new Calcu(4,5); // Constructor
		System.out.println(obj.num1+","+obj.num2);
	}

}
