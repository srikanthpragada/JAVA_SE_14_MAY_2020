package oop;

public class TestProduct {

	public static void main(String[] args) {
		System.out.println(Product.getTaxrate());
		
		Product p1;  // object reference 
		
		p1 = new Product("iPhone 11", 80000);
        p1.print();
        
        
        Product p2 = new Product("Dell Laptop");
        p2.print(); 
    }

}
