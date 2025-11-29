public class predefinedClass {

	public static void main(String[] args) {


		// toString() - converts integer value to string
 		String a = Integer.toString(100);
		System.out.println(a);
		
		// toBinaryString() - convert to binary
		String b = Integer.toBinaryString(15);
		System.out.println(b);
		
		// convert string to integer valueof() and parseInt()
		int c = Integer.valueOf(b);
		System.out.println(c);
		
		// print boolean value if it match else it will return
		String s = "Hello World!";
		System.out.println(s.equals("Hello"));
	}

}
