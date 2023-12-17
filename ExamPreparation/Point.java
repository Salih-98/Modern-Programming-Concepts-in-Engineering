package ExamPreparation;

public class Point {

	private double x;
	private double y;
	
	public Point( double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double getX() {return this.x;}
	
	public double gety() {return this.y;}
	
	public double distance (Point p) {
		return Math.sqrt(Math.pow(this.x - p.x , 2) + Math.pow(this.y - p.y, 2));
	}
}
