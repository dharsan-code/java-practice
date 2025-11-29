interface A {
    void show();  // must implements method
}

interface B extends  A{
	void bmethod(); 
}
interface C extends A{
	void cmethod();
}

class D implements B, C {
	//must mention public 
	public void show(){
		System.out.println("this is show method");
	}
	
	public void bmethod(){
		System.out.println("this is bmethod method");
	}
	
	public void cmethod(){
		System.out.println("this is cmethod method");
	}
}



class hybridInheritance{
	public static void main(String[] args) {
        D obj = new D();
        
        obj.show();
        obj.bmethod();
        obj.cmethod();
        
	}
}