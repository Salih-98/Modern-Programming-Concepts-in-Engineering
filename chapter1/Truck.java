package chapter1;

import java.util.LinkedList;

public class Truck {

	private LinkedList <Crate> crates = new LinkedList<Crate>();
	
	public double totalWeight() {
		double w = 0;
		for (Crate c: crates) {
			w = w + c.totalWeight;
			System.out.println(c.totalWeight);
		}
		System.out.println("Total weight is " + w);
		return w;
	}
	
	public void addCrate(Crate c) {
		crates.add(c);
	}
	
	public static void main (String [] args) {
		Truck truck = new Truck();
		truck.addCrate(new TVCrate(30));
		truck.addCrate(new DVDCrate(50));
		truck.addCrate(new CDCrate(100));
		
		truck.totalWeight();
	}
}
