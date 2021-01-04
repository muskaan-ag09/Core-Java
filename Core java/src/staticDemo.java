class Emp{
	int eid;
	int salary;
	static String ceo; //using static, variable is not object specific
	
	static { //executed when you load a class
		ceo="Larry";
		System.out.println("In static");
	}
	
	public Emp() { //it is called when you create an object
		eid=1;
		salary=3000;
		System.out.println("In constructor");
	}
	
	public void show() {
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}
public class staticDemo {
	static int i=0;
	public static void main(String[] args) {
		i=9;	//only static variables can be accessed inside static block
		
		Emp navin=new Emp();
		navin.eid=8;
		navin.salary=4000;
		Emp.ceo="Mahesh"; //since ceo is static, we can use class name as this is not object specific
		
		Emp rahul=new Emp();
		rahul.eid=9;
		rahul.salary=5000;
		Emp.ceo="Ramesh"; //in static variable, we do not need object
		
		navin.show();
		rahul.show();
	}

}
