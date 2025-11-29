class encapsulation{
	
	private String name;
	private int age;
	
	
	
	void setName(String a) {
		name = a;
	}
	
	void setAge(int b){
		age = b;
	}
	
	String getName(){
		return name;
	}
	
	int getAge() {
		return age;
	}
	
}

class sample{
	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
		
		//setting value to the fields
		obj.setName("Dharsan");
		obj.setAge(22);
		
		//getting values
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}






