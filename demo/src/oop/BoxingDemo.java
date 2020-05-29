package oop;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj;
		
		obj = "String";  // Upcasting 
		System.out.println(obj.getClass());
		
		obj = 20; // Boxing
		System.out.println(obj.getClass());
		
		int a = (Integer) obj;  // Downcasting, Unboxing
		System.out.println(a);
		
		process(10); // boxing 
	}
	
	public static void process(Integer obj) {
		
	}

}
