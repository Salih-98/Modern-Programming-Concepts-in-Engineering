package chapter6;

public class RectangularCS extends CrossSection {

	private double w;
	private double h;
	
	public RectangularCS ( double width, double height) {
		this.w=width;
		this.h=height;}
	
	public double getArea () {
		return w*h;}
	
	public double [] [] getOutline () {
		double [] [] outline = new double [4] [2];
		outline [0][0] = - w / 2.0;
		outline [0][1] = -h/2.0;
		outline [1][0] =  w / 2.0;
		outline [1][1] = -h/2.0;
		outline [2][0] =  w / 2.0;
		outline [2][1] =  h/2.0;
		outline [3][0] = - w / 2.0;
		outline [3][1] =  h / 2.0;
		return outline;
	}
	
	public double getHeight () {
		return h;
	}
	
	public double getWidth() {
		return w;
	}
}
