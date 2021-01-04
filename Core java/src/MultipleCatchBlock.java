
public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[]=new int[6];
			int b[]=null;
			b[8]=90;	//it will go to Exception block, print the error and exit
			a[6]=7;	//it will directly go to ArrayIndexOutOfBoundsException
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println(k);
		}
		//Below way of writing multiple catch is available in java 1.7 or more
/*		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){	//Instead of Exception, we can use ArithmeticException, ArrayIndexOutOfBoundsException to be more specific
			System.err.println("Error");	//err will print output in red color
		}
*/
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in your limit");
		}
		catch(Exception e) {	//This is used to catch any other exception which we have not defined in other catch block
			System.out.println("Something wrong");
		}
		
		finally {	//finally block will get executed whether or not we get the exception
			System.out.println("Bye!");
		}
	}

}
