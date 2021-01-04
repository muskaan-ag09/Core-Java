class Calcul{
	public int add(int ... n) { //{4,5,6,7,8,4}	//Variable arguments
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		Calcul obj=new Calcul();
		System.out.println(obj.add(4,5,9,8,5));
	}

}
