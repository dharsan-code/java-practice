class makingCar implements Runnable{
	// must implements Runnable 
	public void run() {
		System.out.println("Car parts is painting..." + Thread.currentThread().threadId());
		System.out.println("Car parts is assembling..." + Thread.currentThread().threadId());
		System.out.println("Car tyres is fixing..." + Thread.currentThread().threadId());
	}
}


public class MultiThreadUsingRunnable {
	public static void main(String args[]) {
		
		int count = 3;
		
		
		for(int i=0; i<count;i++) {
			makingCar car = new makingCar();
			
			// must create Thread instance
			Thread thread = new Thread(car);
			thread.start();
		}
		
	}
}
