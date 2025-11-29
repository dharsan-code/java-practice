class lion {
    void animal() {
    	System.out.println("lion is an animal");
    }
}

class sparrow extends  lion{
	void fly(){
		System.out.println("Sparrow is flying");
 }
}

public class inheritance{
	public static void main(String[] args){
		
		sparrow obj = new sparrow();
		obj.fly();
		obj.animal();	

	}
}