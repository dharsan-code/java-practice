class parentClass{
	
	// constructor must have class name 
	
	parentClass(){   //constructor
		
		// no return type, not even void	
		// used to initialize values
		System.out.println("Parent Class constructor called");
	}
	
	
	parentClass(int x){  // parameterized constructor
		
		this();   // calls default constructor first
		System.out.println("Value: " + x);   
	}
	
}



public class constructor {
	public static void main(String[] args) {

		parentClass obj =  new parentClass();  // constructor runs here
	
		parentClass obj1 =  new parentClass(10); 
		// calls parameterized constructor
		
		// constructor cannot be called manually
		
		// It runs automatically during object creation
	}

}
