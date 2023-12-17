package ExamPreparation;

public abstract class CrossSection {

	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract double getArea();
	
	public abstract double [][] getOutline();
	
}
