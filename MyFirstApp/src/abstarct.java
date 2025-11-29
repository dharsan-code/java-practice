abstract class predators {
	abstract void sound(); // no body, must be override
     
     void leg() {  // normal method
    	 System.out.println("Animals have 4 legs");
     }
}

class pets extends predators {
	
	// override
	void sound() {  
		System.out.println("Bark");
	}
	
}

class func{
	public static void main(String args[]) {
		predators obj1 = new pets();
		
		obj1.sound();
		obj1.leg();
			
	}
}