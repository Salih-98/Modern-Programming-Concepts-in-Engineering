package ExamPreparation;

public class NodeTS {

	private double x;
	private double y;
	private double z;
	
	public NodeTS (double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double distance (NodeTS n) {
		return Math.sqrt(Math.pow(this.x-n.x, 2) + Math.pow(this.y-n.y, x)+Math.pow(this.z-n.z, x));
	}
	
	public double getX() {return this.x;}
	
	public double getY() {return this.y;}
	
	public double getZ() {return this.z;}
	
}
