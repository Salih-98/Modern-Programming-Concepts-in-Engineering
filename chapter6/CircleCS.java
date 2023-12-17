package chapter6;

public class CircleCS extends CrossSection {

	private double r;
	private static int N=20;
	
	public CircleCS (double r) {
		this.r=r;
	}
	public double getArea() {
		return Math.pow(r, 2)* Math.PI/4;
	}
	
	public double[][] getOutline() {
		
		double [] [] outline = new double [N][2];
		double dphi = 2*Math.PI / (N-1);
		
		for (int i=0; i<N; i++) {
					outline[i][0] = r * Math.cos(i*dphi);
					outline [i][1] = r* Math.sin(i*dphi);
		}
		
		return outline;
	}
	
	public double getRadius () {
		return r;
	}
}
