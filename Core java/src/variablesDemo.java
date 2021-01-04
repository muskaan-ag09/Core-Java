
public class variablesDemo {
	public static void main(String args[]) {
		byte b=5; //1 byte --> 8 bits --> -128 to 127
		short s=5; //2 byte --> 16 bits --> -32768 to 32767
		int i=5; //4 bytes --> 32 bits
		long l=50000000000l; //8 byte --> 64 bits
		float f=5.5f; 
		double d=5.5;
		
		char c='A';
		c=66; // ASCII (Americal Standard Code for Information Interchange)
		
		double d1=5; // implicit conversion
		int k=(int)5.6; // explicit conversion
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("c="+c);
		System.out.println("k="+k);
	}
}
