
public class ArrayDemo {

	public static void main(String[] args) {
		//One Dimensional array
		int nums[] = new int[4];
		nums[0]=8;
		nums[1]=23;
		nums[2]=90;
		nums[3]=45;
		System.out.println("One Dimension Array");
		for(int i=0;i<4;i++)
			System.out.println(nums[i]);
		
		System.out.println();
		
		int nums1[]= {1,2,3,4};
		
		for(int i=0;i<4;i++)
			System.out.println(nums1[i]);
		
		//Two dimensional array
		int a[][]=new int[4][4];
		int b[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{4,3,2,1}
		}; //columns are fixed
		
		System.out.println("\nTwo Dimension Array when columns are fixed");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		//Jagged Array
		int c[][]= {
				{1,2,3},
				{5,6,7,8},
				{4,3,2,1,8}
		}; //columns are not fixed
		
		System.out.println("\nJagged Array when columns are not fixed");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}
