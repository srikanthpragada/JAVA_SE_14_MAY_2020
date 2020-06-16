package coll;

import oop.Product;

public class GenericMethods {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3 };
        print(a);
        
        Product prods[] = new Product[5];
        // print(prods);
        
	}

	public static <T extends Comparable<T>> void print(T a[]) {

	}

}
