package oop;

public class Product {
	// Instance variables
	private String name;
	private int price;
	// Class or static variable
	private static double taxrate = 12.5;
	
	public static double getTaxrate() {
		return taxrate;
	}
	
	public static void setTaxrate(double taxrate) {
		Product.taxrate = taxrate;
	}

	// Constructor
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String n) {
		this.name = n;
	}

	// Methods
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}

	public void setPrice(int newprice) {
		this.price = newprice;
	}
	
	public double getNetPrice() {
		return this.price + (this.price * Product.taxrate / 100);
	}
}
