package oop;

abstract class Player {
	protected String name, country;

	public Player(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.country);
	}
	
	public abstract int getPoints();
	

	@Override
	public String toString() {
		return  name + "," + country;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof Player))
			return false;
		
		Player other = (Player) obj;
		return this.name.equals(other.name);
	}
}

class Cricketer extends Player {
	protected int runs, wickets;

	public Cricketer(String name, String country, int runs, int wickets) {
		super(name, country);
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.runs);
		System.out.println(this.wickets);
	}

	public int getPoints() {
		return this.runs / 100 + this.wickets / 5;
	}
}

class Footballer extends Player {
	protected int goals, appearances;

	public Footballer(String name, String country, int appearances, int goals) {
		super(name, country);
		this.goals = goals;
		this.appearances = appearances;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.appearances);
		System.out.println(this.goals);
	}

	public int getPoints() {
		return this.appearances * 1 + this.goals * 2;
	}
}

public class TestPlayer {

	public static void main(String[] args) {
		// Upcasting
		Player p;
		p = new Cricketer("Kholi", "India", 5000, 10);
		p.print();  // Runtime polymorphism
		System.out.println(p.getPoints()); // Runtime Polymorphism 
		
        p  = new Footballer("Messi", "Arg", 100,70);
        p.print();  // Runtime polymorphism 
        System.out.println(p.getPoints());
	
	}

}
