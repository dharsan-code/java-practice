interface univercity{
	void study();
}

interface collage{
	void syllabus();
}

class school implements univercity, collage{
	// must implements parent method
	
	public void study() {
		System.out.println("Daily study duration: 4 hours");
	}
	public void syllabus() {
		System.out.println("This is the syllabus of the course");
	}
	
	// school implements multiple interfaces
}



public class multipleInheritance {

	public static void main(String[] args) {
		school object = new school();
		
		object.study();
		object.syllabus();

	}

}
