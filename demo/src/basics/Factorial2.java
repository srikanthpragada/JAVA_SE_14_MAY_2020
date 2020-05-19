package basics;

public class Factorial2 {
	public static void main(String[] args) {
		
		 if(args.length == 0)
		 {
			 System.out.println("java basics.Factorial  <number>");
			 return;
		 }
		 
         int num = Integer.parseInt(args[0]);  // String to int
         
         int fact = 1;
         for(int i = 2; i <= num ; i ++)
        	 fact *= i;
         
         System.out.printf("Factorial of %d is %d", num,fact);
	}
}
