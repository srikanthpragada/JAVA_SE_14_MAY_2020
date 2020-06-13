package coll;

import java.util.TreeSet;

class Time  implements Comparable<Time> {
	private int h, m, s;

	public Time(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
	}

	public int hashCode() {
		return 1;
	}

	public boolean equals(Object obj) {
		Time other = (Time) obj;
		return this.h == other.h && this.m == other.m && this.s == other.s;
	}

	public int totalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}
	@Override
	public int compareTo(Time other) {
		// System.out.println("Called!");
	    return  this.totalSeconds() - other.totalSeconds();
	}
}

public class ListTimes {

	public static void main(String[] args) {
		var times = new TreeSet<Time>();

		times.add(new Time(10, 20, 30));
		times.add(new Time(22, 22, 33));
		times.add(new Time(20, 20, 30));
		times.add(new Time(5, 5, 5));

		for (Time t : times) {
			System.out.println(t);
			// System.out.println(t.hashCode());
		}
	}
}
