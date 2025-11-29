class laptop extends Thread{
	// 1. extends thread
	
	// Thread has multiple inbuilt function
	// 1. start() - Starts a new thread
	// 2. isAlive() - checks if thread is still running
    // 3. sleep() - pause the current thread
	// 4. setPriority() - change the thread priority
    // 5. getPriority() - print the thread (default value 5)
    // 6. setName() - let you change the thread name
	// 7. run() - contains a work
	// 8. join() -  forces the thread to wait until task finishes
	// 9. interrupt() - interrupt the thread
	// 10. currentThread() - print the current thread
	// 11. getId() - print the thread id 
	
	// method must be in public 
	public void run() {
		System.out.println("laptop is running " + Thread.currentThread().threadId());
		System.out.println("vscode is running " + Thread.currentThread().threadId());
		System.out.println("code is compiling " + Thread.currentThread().threadId());
	}
	

}
public class multiThreading {
	public static void main(String[] args) {
		// tasks run at the same time simultaneously
		int count = 2;
		for(int i=0;i<count;i++) {
			laptop lap = new laptop();
			lap.start();
		}
		
	}
}
