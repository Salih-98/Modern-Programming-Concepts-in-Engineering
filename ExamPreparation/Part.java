package ExamPreparation;

public class Part {

	private PointTWS start;
	private PointTWS end;
	private double thickness;
	
	public Part (PointTWS sp, PointTWS ep, double thickness) {
		this.start=sp;
		this.end=ep;
		this.thickness=thickness;
	}
	
	public double getArea() {
		return this.start.getDistance(this.end) * this.thickness;
	}
}
