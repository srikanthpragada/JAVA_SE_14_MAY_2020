package oop;

import java.util.Arrays;

class Rectangle implements Comparable<Rectangle> {
	private int length, width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return this.length + "," + this.width;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Rectangle))
			return false;
		
		Rectangle other = (Rectangle) obj; // Downcasting
		return this.length == other.length &&
			   this.width == other.width;
	}
	
	@Override 
	public int hashCode() {
		// return  this.length * this.width;
		return 1;
	}
	 
	public int compareTo(Rectangle other) {
		return (this.length * this.width) - (other.length * other.width);
	}
}

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(11, 25);
		System.out.println(r1.compareTo(r2));
		
//		System.out.println(r1.toString());
//		System.out.println(r1.hashCode());
//		System.out.println(r2.hashCode());
//		System.out.println(r1.equals(r2));
//		System.out.println(r1.equals("Abc"));
		
		Rectangle objects[] = {
				new Rectangle(10,10),
				new Rectangle(11, 5), 
				new Rectangle(20, 6),
				new Rectangle(22,4)
	    };
		
		Arrays.sort(objects);
		for(Rectangle r : objects)
			System.out.println(r);
	}
}
