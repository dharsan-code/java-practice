interface vechile{
	// must have interface
	
	void speed();
	void engine();  // abstract by default
	
}

class bike implements vechile{
	// must implements interface 
	//child class must implements all methods
	
	public void speed(){
		System.out.println("upto 100 Km/hr");
	}
	
	 public void engine() {
		System.out.println("V12 engine");
	}
}

public class fullAbstaraction {
   public static void main(String args[]){
	   vechile a = new bike();
	   
	   a.speed();
	   a.engine(); 
   }
	
}


