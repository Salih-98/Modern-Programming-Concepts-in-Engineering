package ExamPreparation;

import java.util.ArrayList;

public class ThinWalledSection {

	private ArrayList <Part> parts = new ArrayList<Part>();
	
	public void addPart (Part p) {
		this.parts.add(p);
	}
	
	public double getArea() {
		double a=0;
		
		for (Part p: parts) {
			a = a + p.getArea();
		}
		
		return a;
	}
	
	
	
	
}
