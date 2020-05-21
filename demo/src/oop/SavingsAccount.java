package oop;

public class SavingsAccount {
	private int acno;
	private String ahname;
	private double balance;
	private static int minbalance = 5000;

	public SavingsAccount(int acno, String ahname, double balance) {
		this(acno,ahname);  // Call another constructor
		this.balance = balance;
	}
	
	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

}
