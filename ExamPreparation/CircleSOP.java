package ExamPreparation;

public class CircleSOP extends SetOfPoints {

	private double x;
	private double y;
	private double r;
	
	public CircleSOP (double x, double y, double r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public boolean contains (double px, double py) {
		
		System.out.println("Value of r is" + this.r);
		System.out.println("Value of this.x is " + this.x );
		System.out.println("Value of this.y is " + this.y);
		System.out.println("Value of this. x - px is "+ (this.x-px));
		System.out.println("Vaule of this.y - py is " + (this.y-py));
		return Math.sqrt(Math.pow(this.x-px, 2) + Math.pow(this.y-py, 2))<=this.r;
	}
}
