class counters {
	int count;
	
	// must be synchronized method
	synchronized void increment() {
		count++;
	}
}


public class multiThreadingUsingSynchronized {
	public static void main(String[] args) throws Exception{
		counters c = new counters();
		
		// Lambda function it will implements the body for run() method.
		// it will create a instance for runnable and implements the body for run() method.
		// then it pass the runnable reference to thread constructor. 
		Thread t1 = new Thread(()  -> {
			for(int i =1; i<=1000; i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(()  -> {
			for(int i =1; i<=1000; i++) {
				c.increment();
			}
		});
		
		
		t1.start();
		t2.start();
		
		
		// join make the main_thread(main() method) wait.
		t1.join();
		t2.join();
		
		System.out.println("Count : " + c.count);
		
	}

}
