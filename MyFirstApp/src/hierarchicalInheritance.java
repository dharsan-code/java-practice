class grandMother{
	char gender = 'F';
	
	void print() {
		System.out.println("This is super class");
	}
}

class mother extends grandMother{
	// mother extends grandMother
	
	//method override
	void print() {
		System.out.println("This is child class");
	}
}

class son extends grandMother{
	// both mother and son extends from same class(grandMother)
	
	char gender  = 'M';
	
	//method override
	void print() {
		System.out.println("This is child class");
	}
}


public class hierarchicalInheritance {
    public static void main(String[] args) {
    	son obj = new  son(); //object creating through instance
    	
    	//obj - reference keyword
    	System.out.println(obj.gender);
    	obj.print();
    }
}
