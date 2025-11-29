public class applicationForm{
	//class is a blueprint 
	//variables or fields
	private String Name;
	int rollNo;
	
	//method 
	public void display(){
		System.out.println(Name);
		System.out.println(rollNo);
	}
	
	public void setName(String str,int rollnum){
		Name = str;
		rollNo = rollnum;
		display();
	}
	
}


class formMain{
	public static void main(String[] args) {
		//creating object to access fields and methods
		//by creating object(template) we accessing fields(variable) and methods(function)
		applicationForm dharsanDetail = new applicationForm();
		
		//using reference keyword to access a element and method
		dharsanDetail.setName("Dharsan", 21);
		
		applicationForm viewer = new  applicationForm();
		viewer.setName("Ram",01);
		
	}
}

