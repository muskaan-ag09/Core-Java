
public class jumpDemo {

	public static void main(String[] args) {
		//break, continue
		
		for(int i=0;i<10;i++) {
			if(i==3)
				continue; //skip the remaining statement in the block
			if(i>5)
				break; //will come out of the loop
			System.out.println("Value is "+i);
		}
	}
}
