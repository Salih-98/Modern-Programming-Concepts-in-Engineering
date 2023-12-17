package chapter1;

public class DVDCrate extends Crate {
	private double totalWeight;
	private int number;
	
	public DVDCrate(int numb) {
		super.number=numb;
		super.totalWeight=numb*2;
		//this.number = numb;
		//this.totalWeight=numb*2;
		
		}
	
}
