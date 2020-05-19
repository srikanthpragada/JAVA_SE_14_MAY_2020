package basics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number :");
         int num = scanner.nextInt();     // read int from keyboard 
         
         int fact = 1;
         for(int i = 2; i <= num ; i ++)
        	 fact *= i;
         
         System.out.printf("Factorial of %d is %d", num,fact);
	}
}
