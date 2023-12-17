package chapter6;

public class Node {

	private double x;
	private double y;
	private double z;
	
	public Node (double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double distance (Node n) {
		return Math.sqrt(Math.pow(this.x-n.x, 2)+Math.pow(this.y - n.y, 2)+Math.pow(this.z - n.z,2));
	}
	
	public double getX() {
		return x;
	}
	
	public double getY () {
		return y;
	}
	
	public double getZ () {
		return z;
	}
}
