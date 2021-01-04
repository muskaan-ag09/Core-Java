//User-defined exception
public class exceptionHandling2 {

	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		try {
			int k=i/j;
			if(k==0)
				throw new MuskaanException("This is not possible");
			
			System.out.println("k");
		}
		catch(MuskaanException e) {
			System.out.println("Error! "+e.getMessage());
		}
	}

}
