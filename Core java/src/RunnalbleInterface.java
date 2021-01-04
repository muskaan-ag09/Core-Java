//Instead of using thread class and extending it, we can use an interface called Runnable and implements it
//Runnable is a functional interface

class Hi1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e) {}	//it will wait for 0.5 sec before printing each line
		}
	}
}

class Hallo1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
public class RunnalbleInterface {

	public static void main(String[] args) {
		Runnable obj1=new Hi1();
		Runnable obj2=new Hallo1();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();	//start always calls run
		try { Thread.sleep(10);} catch(Exception e) {}	//it will cause a delay of 10 sec between both the threads
		t2.start();
	}

}
