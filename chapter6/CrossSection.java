package chapter6;

public abstract class CrossSection {
	
	private String name;
	
	public CrossSection () { }
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	public abstract double  getArea();
	
	public abstract double [][] getOutline();
	
}
