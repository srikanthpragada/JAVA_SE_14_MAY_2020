package basics;

public class VaryArgsDemo {

	public static void main(String[] args) {
  
        System.out.println(add(10,20));
        System.out.println(total(10,20,30));
        System.out.println(total(10,20,30,100,200));
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int total(int ... values) {
		int sum = 0;
		
		for (int n : values)
			sum += n;
		
		return sum;
	}

}
