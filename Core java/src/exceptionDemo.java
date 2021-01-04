
public class exceptionDemo {

	public static void main(String[] args) {
		try {
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println(k);
		}
		catch(ArithmeticException e){	//Instead of Exception, we can use ArithmeticException to be more specific
			System.err.println("Error");	//err will print output in red color
		}
		finally {	//finally block will get executed whether or not we get the exception
			System.out.println("Bye!");
		}
	}
}
