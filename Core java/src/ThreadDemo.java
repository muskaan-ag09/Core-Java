// By default, we have one thread i.e main
/*
 * Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

 */
class Hi extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e) {}	//it will wait for 0.5 sec before printing each line
		}
	}
}

class Hallo extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {	//all execution is done by main thread
		Hi obj1=new Hi();
		Hallo obj2=new Hallo();
		
		obj1.start();	//start always calls run
		try { Thread.sleep(10);} catch(Exception e) {}	//it will cause a delay of 10 sec between both the threads
		obj2.start();
	}

}
