class adds {
	int addition(int a, int b){
		return a+b;
	}
	
	// methods overloading
	int addition(int a, int b, int c){
		return a+b+c;
	}
        
}

class dog {
	
	void sound() {
		System.out.println("dog bark");
	}
}

class animal extends dog{
	// method overriding
	void sound() {
		System.out.println("lion roars");
	}
	
}


class polymorphism{
	public static void main(String[] args){
		adds obj1 = new adds();
		animal obj2 = new animal();
		
		System.out.println(obj1.addition(10,10));
		
		System.out.println(obj1.addition(10,10, 10));
		
		
		obj2.sound();	
	}
}