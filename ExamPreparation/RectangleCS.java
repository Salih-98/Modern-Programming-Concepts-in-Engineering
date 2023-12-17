package ExamPreparation;

public class RectangleCS extends CrossSection{

	private double w;
	private double h;
	
	public RectangleCS(double w, double h) {
		this.w=w;
		this.h=h;
	}
	
	public double getArea() { return w *h; }
	
	public double [] [] getOutline(){
		double [][] outline = new double [4][2]; //outline has 4 points
		
		outline [0][0]=-w/2;
		outline [0][1]=-h/2;
		outline [1][0]=w/2;
		outline [1][1]=-h/2;
		outline [2][0]=w/2;
		outline [2][1]=h/2;
		outline [3][0]=-w/2;
		outline [3][1]=h/2;
		
		return outline;						
	}
	
	public double getHeight() {
		return this.h;
	}
	
	public double setWidth() {
		return this.w;
	}
}
