public class exceptionHandling {

	static void check(int age) {
		
		// throw exception manually
		if(age<18) {
			throw new ArithmeticException("Age invalid");
		}
	}
	
	
	// might throws an err, whoever calls must handle it 
	static void test() throws Exception {
		throw new Exception("probelm occured");
	}
	
	
    public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		
		try {       // catch a exception
			System.out.println(a/b);
		}
		catch(Exception E){      // handle the exception
			System.out.println("Error: " + E.getMessage());	
		}		
		finally {       // it always runs
			System.out.println("This will happen");
		}		
		
		
		try {
			check(11);
		}
		catch(Exception E){
			System.out.println("check error: " + E.getMessage());
		}
		
		
		try {
			test();
		}
		catch(Exception E){
			System.out.println(E.getMessage());
		}
		
    }

}
