public class Multithreading_LambdaExpression {

	public static void main(String[] args) throws Exception {
		
		/*
		 Runnable obj1=new Runnable(){
		 	public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
					try{Thread.sleep(500);} catch(Exception e) {}
				}
			}
		 };
		 
		 This can be written as below also using lambda expression
		 
		Runnable obj1=() ->	//Lambda expression
			{
				for(int i=1;i<=5;i++) {
					System.out.println("Hi");
					try{Thread.sleep(500);} catch(Exception e) {}	//it will wait for 0.5 sec before printing each line
				}
			}
			;
		
		Runnable obj2=() ->	//Lambda expression
			{
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
					try{Thread.sleep(500);} catch(Exception e) {}
				}
			}
		;
		
		To avoid creating obj1 and obj2, we can also do the following as below using anonymous class and lambda expressions
		*/
		
		Thread t1=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try{Thread.sleep(500);} catch(Exception e) {}
			}
		},"Hi Thread");
		
		Thread t2=new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try{Thread.sleep(500);} catch(Exception e) {}
			}
		},"Hello Thread");	//we can set the thread name like this also
		
		System.out.println(t1.getName());	//it will print the name of the thread
		System.out.println(t2.getName());
		
		t1.setName("Hi Muskaan Thread");	//it will set the name to thread
		t2.setName("Hello Muskaan Thread");
		
		System.out.println(t1.getName());	//it will print the name of the thread
		System.out.println(t2.getName());
		
		t1.start();	//start always calls run
		try { Thread.sleep(10);} catch(Exception e) {}	//it will cause a delay of 10 sec between both the threads
		t2.start();
		
		System.out.println(t1.isAlive());	//it will print true since t1 thread is alive
		
		
		//Join will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.
		t1.join(); 	//join will make t1 to join 
		t2.join();	//join will make t2 to join and complete first
		
		System.out.println(t1.isAlive());	//it will print false since t1 thread is alive
		
		System.out.println("Bye");	//it will be printed at the end
	}

}
