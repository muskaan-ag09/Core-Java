/*
 * Due to multiple inheritance, there can be same method anme in so many classes. 
 * So to avoid ambiguity or cause of any error, 
 * in java multi inheritance is not used directly. 
 * Indirectly, it is used
 */


class Calculator{	//Super class
	public int add(int i,int j) {
		return i+j;
	}
}

class CalcAdv extends Calculator{	//Sub class
	public int sub(int i,int j) {	//Single Level Inheritance
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv{	//Multi Level Inheritance
	public int multi(int i,int j) {
		return i*j;
	}
}

public class inheritanceDemo {

	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		CalcAdv c1=new CalcAdv();
		int res=c1.add(5, 4);
		int res2=c1.sub(6, 3);
		System.out.println(res);
		System.out.println(res2);
		
		System.out.println("Multi Level Inheritance");
		CalcVeryAdv c2=new CalcVeryAdv();
		int result=c2.add(5, 4);
		int result2=c2.sub(6, 3);
		int result3=c2.multi(4,3);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
}
  