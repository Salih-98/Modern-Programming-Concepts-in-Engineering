package chapter1;

public class CDCrate extends Crate{
	private double totalWeight;
	private int number;
	
	public CDCrate(int numb) {
		super.number = numb;
		super.totalWeight=numb*1.2;
		//this.number = numb;
		//this.totalWeight=numb*1.2;
		}
	
}
