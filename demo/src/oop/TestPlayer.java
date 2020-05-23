package oop;

class Player {
	protected String name, country;

	public Player(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.country);
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
		p.print();
        p  = new Footballer("Messi", "Arg", 100,70);
        p.print();

		Footballer f;
		if (p instanceof Footballer) 
		{
	    	 f = (Footballer) p;  // Downcasting
	         System.out.println(f.getPoints());
		}
   
//        System.out.println(c.getPoints());
	
	}

}
