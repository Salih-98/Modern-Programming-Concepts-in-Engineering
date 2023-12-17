package ExamPreparation;

public class ExamVector {

	private double [] x = new double [2];
	
	public ExamVector (double x1, double x2) {
		this.x[0]=x1;
		this.x[1]=x2;
	}
	
	public void setX1(double value) {this.x[0]=value;}
	public void setX2(double value) {this.x[1]=value;}
	
	public double getX1() {return this.x[0];}
	public double getX2() {return this.x[1];}
	
	
}
