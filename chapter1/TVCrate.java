package chapter1;

public class TVCrate extends Crate{

	private double totalWeight;
	private int number;
	
	public TVCrate(int numb) {
		try { if(numb>25) {throw new Exception();}}
		catch (Exception e){
			System.out.println("THe number of TV crates is limited to 25. ");
			numb = 25;
		}
		
		super.number = numb;
		super.totalWeight=numb*20;
		
		//this.number = numb;
		//this.totalWeight=numb*20;
	}
	}

