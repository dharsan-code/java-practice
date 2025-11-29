class grandFather{
	String hair = "Grey";
    char gender = 'M';
	
	void body() {
		System.out.println("Mucular");
	}
}

class father extends grandFather{
	//single inheritance
}

class daughter extends father{
	
	// multi-level inheritance
	char gender = 'F';
}




public class inheritanceTypes {
   public static void main(String[] args){
	   daughter obj = new daughter();
	   
	   System.out.println(obj.gender);
	   
   }
}




