
public class enhancedForLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		for(int k:a) {
			System.out.println(k);
		}
		
		System.out.println("Enhanced for loop for 2d array");
		int b[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{4,3,2,1}
		}; 
		
		for(int k[]:b) { //since k is an array
			for(int l:k) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
