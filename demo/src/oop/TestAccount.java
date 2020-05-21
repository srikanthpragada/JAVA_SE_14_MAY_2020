package oop;

public class TestAccount {

	public static void main(String[] args) {
		SavingsAccount a = new SavingsAccount(1001,"Scott",10000);
		a.deposit(10000);
		System.out.println(a.getBalance());
		
		SavingsAccount a2 = new SavingsAccount(1002,"Mike");
		System.out.println(a2.getBalance());
	}

}
