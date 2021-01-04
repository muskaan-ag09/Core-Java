/*
 * Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce erroneous and unforeseen results
 * So it needs to be made sure by some synchronization method that only one thread can access the resource at a given point of time.
 */

class Counter{
	int count;
	
	public synchronized void increment() {	//synchronized method will enable only one thread to run at a time
		count++;
	}
}
public class multithreading_synchronization {

	public static void main(String[] args) throws Exception{
		Counter c= new Counter();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join(); //wait for t1 to complete its job
		t2.join();	//wait for t2 to complete its job
		
		//If synchronized keyword was not used with the run method, it would  have not print 2000 since at some points, t1 and t2 are running parallely and incrementing the c only once
		System.out.println("Count "+c.count);
	}

}
