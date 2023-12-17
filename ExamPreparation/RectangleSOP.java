package ExamPreparation;

public class RectangleSOP extends SetOfPoints {

	private double x;
	private double y;
	private double w;
	private double h;
	
	public RectangleSOP(double x, double y, double w, double h) {
	this.x=x;
	this.y=y;
	this.w =w;
	this.h=h;
	}
	
	public boolean contains (double px, double py) {
		
		System.out.println(" this x + this w" + (this.x+this.w));
		System.out.println("This.y + this.h" + (this.y + this.h));
		
		return px>=this.x && px<=this.x+this.w && py>= this.y && py<=this.y+this.h;
	}
	
}
