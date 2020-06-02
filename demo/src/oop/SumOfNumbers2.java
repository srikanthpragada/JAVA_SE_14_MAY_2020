package oop;

import java.util.Scanner;

public class SumOfNumbers2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int n = Integer.parseInt(s.nextLine());
				sum += n;
			} catch (NumberFormatException ex) {
                System.out.println("Invalid Number!");
			}
		}

		System.out.println(sum);

	}

}
