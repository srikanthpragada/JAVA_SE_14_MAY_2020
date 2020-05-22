package oop;

class Player {
	protected String name, country;

	public Player(String name, String country) {
		super();
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
	
	public void print() {
		super.print();
		System.out.println(this.runs);
		System.out.println(this.wickets);
	}
}

class Footballer extends Player {
    public Footballer() {
    	super();
    }
}

public class TestPlayer {

	public static void main(String[] args) {

	}

}
