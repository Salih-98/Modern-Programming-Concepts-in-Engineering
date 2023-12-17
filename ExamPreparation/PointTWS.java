package ExamPreparation;

public class PointTWS {

	private double x;
	private double y;
	
	public PointTWS (double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double getDistance(PointTWS p) {
		return Math.sqrt(Math.pow(this.x -  p.x,2) + Math.pow(this.y-p.y, 2));
	}
}
