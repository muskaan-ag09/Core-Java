
public class selectionDemo {

	public static void main(String[] args) {
		int n=7;
		if(n==0) {
			System.out.println("Nothing");
			System.out.println("Bye");
		}
		else if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//Ternary Operator
		int i=8;
		int j=0;
		
		j=(i>6)?1:2;
		System.out.println("j="+j);
		
		
		//switch case
		//switch does not support double
		//we can use string in switch but in jdk 1.7 and later
		int k=4;
		switch(k) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}
}
