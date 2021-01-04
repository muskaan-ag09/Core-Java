/*
 * In a Multi threading environment, thread scheduler assigns processor to a thread based on priority of thread. Whenever we create a thread in Java, it always has some priority assigned to it. Priority can either be given by JVM while creating the thread or it can be given by programmer explicitly. 
 */
public class Threadpriority {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi "+ Thread.currentThread().getPriority());
				try{Thread.sleep(500);} catch(Exception e) {}
			}
		});
		
		Thread t2=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello "+Thread.currentThread().getPriority());
				try{Thread.sleep(500);} catch(Exception e) {}
			}
		});	
		
		t1.setPriority(1);	//least priority
		t2.setPriority(10);	//highest priority
		
		t1.setPriority(Thread.MIN_PRIORITY);	//this is 1 by default
		t2.setPriority(Thread.MAX_PRIORITY);	//this is 10 by default
		
		//if we do not set the priority, it is by default set to normal priority which is 5
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();	//start always calls run
		try { Thread.sleep(10);} catch(Exception e) {}	//it will cause a delay of 10 sec between both the threads
		t2.start();
		
		System.out.println(t1.isAlive());	//it will print true since t1 thread is alive
		
		
		//Join will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.
		t1.join(); 	//join will make t1 to join 
		t2.join();	//join will make t2 to join and complete first
		
		System.out.println(t1.isAlive());	//it will print false since t1 thread is alive
		
		System.out.println("Bye");
	}

}
