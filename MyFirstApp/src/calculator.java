import java.util.Scanner;

public class calculator {
	
	
	static void add(float a, float b) {
		float res = a+ b;
		System.out.println(a + b);
	}
	
	static void sub(float a, float b) {
		float res = a - b;
		System.out.println(a + b);
	}
	
	static void mul(float a, float b) {
		float res = a * b;
		System.out.println(a + b);
	}
	
	static void div(float a, float b) {
		float res = a / b;
		System.out.println(a + b);
	}

	public static void main(String[] args){
		System.out.println("Choose your  operatior");
		System.out.println();
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.println();
		
		
		// object creation
		Scanner operation = new Scanner(System.in);
		
		// operation
		System.out.println("Enter the operator : ");
		int symbol = operation.nextInt();

		// value 1
		System.out.println("Enter the first number : ");
		float a = operation.nextFloat();
		
		// value 2
		System.out.println("Enter the second number : ");
		float b = operation.nextFloat();
		
		
		
		if(symbol == 1) {
			add(a, b);
		}else if(symbol == 2){
			sub(a, b);
		}else if(symbol == 3){
			mul(a, b);
		}else {
			div(a, b);
		}
	}

}
