package ExamPreparation;

import inf.v3d.view.*;
import inf.v3d.obj.Circle;
import inf.v3d.obj.UnstructuredMesh;

public class Triangle {

	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	public Triangle () {
		this.x1=0.0;
		this.y1=0.0;
		
		this.x2=0.0;
		this.y2=1.0;
		
		this.x3=1.0;
		this.y3=0.0;
	}
	
	public Triangle (double x1, double x2, double x3, double y1, double y2, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x2;
		this.y2 = y2;
		
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public double getLengthA () {
		return Math.sqrt(Math.pow(this.x1 - this.x2,2) + Math.pow(this.y1-this.y2,2));
	}
	
	public double getLengthC() {
		return Math.sqrt(Math.pow(this.x1 - this.x3,2) + Math.pow(this.y1-this.y3,2));
	}
	
	public double getLengthB () {
		return Math.sqrt(Math.pow(this.x3 - this.x2,2) + Math.pow(this.y3-this.y2,2));
	}
	
	public void draw (String color, Viewer v) {
		UnstructuredMesh um = new UnstructuredMesh ();
		
		int id1 = um.addPoint(this.x1, this.y1, 0);
		int id2 = um.addPoint(this.x2, this.y2, 0);
		int id3 = um.addPoint(this.x3, this.y3, 0);
		
		um.addCell(id1,id2,id3);
		um.setColor(color);
		um.setOutlinesVisible(true);
		
		v.addObject3D(um);
		//v.setVisible(true);
		
	}
	
	public double getArea () {
		return 0.5 * Math.abs(this.x1 * (this.y2 - this.y3) + this.x2 * (this.y3 - this.y1) + this.x3 * (this.y1 - this.y2));	
	}
	
	public boolean isInside (double px, double py) {
		double A = this.getArea();
		Triangle t1 = new Triangle (px,py,this.x1, this.y1, this.x2,this.y2);
		Triangle t2 = new Triangle (px,py, this.x2,this.y2,this.x3,this.y3);
		Triangle t3 = new Triangle (px,py,this.x1,this.y1,this.x3,this.y3);
		
		double A1 = t1.getArea();
		double A2 = t2.getArea();
		double A3 = t3.getArea();
		
		return A==A1+A2+A3;
	}
	
	public void drawCircumcircle (Viewer v) {
		
		double D = 2 * (this.x1 * (this.y2 - this.y3) + this.x2*(this.y3 - this.y1) + this.x3 * (this.y1 - this.y2));
		double Ux = ((Math.pow(this.x1, 2)+Math.pow(this.y1, 2)) * (this.y2 - this.y3) 
				    + (Math.pow(this.x2, 2)+Math.pow(this.y2, 2)) * (this.y3 - this.y1) 
				    + (Math.pow(this.x3, 2)+Math.pow(this.y3, 2)) * (this.y1 - this.y2))/D;
		
		double Uy = ((Math.pow(this.x1, 2)+Math.pow(this.y1, 2)) * (this.x3 - this.x2) 
			        + (Math.pow(this.x2, 2)+Math.pow(this.y2, 2)) * (this.x1 - this.x3) 
			        + (Math.pow(this.x3, 2)+Math.pow(this.y3, 2)) * (this.x2 - this.x1))/D;
		
		System.out.println("Dx is " + Ux + "Dy is " + Uy);
		double a = this.getLengthA();
		double b= this.getLengthB();
		double c = this.getLengthC();
		
		double R = (a*b*c)/(4*this.getArea());
		
		Circle cc = new Circle (R);
		cc.setCenter(Ux, Uy, 0);
		cc.setRadius(R);
		v.addObject3D(cc);
		//v.setVisible(true);
	}
	
	public double getAlpha () {
		double a = this.getLengthA();
		double b = this.getLengthB();
		double c = this.getLengthC();
		return Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2))/(2*b*c));
	}
	
	public double getBeta () {
		double a = this.getLengthA();
		double b = this.getLengthB();
		double c = this.getLengthC();
		return Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2*a*c));
	}
	
	public double getGama() {
		double a = this.getLengthA();
		double b = this.getLengthB();
		double c = this.getLengthC();
		return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b));
	}
	
	public void print() {
		
		System.out.println("The coordinates of the triangle are: (x1,y1) = (" + x1 + "," + y1 + "), " +
																"(x2,y2) = (" + x2 + "," + y2 + "),"  +
																"(x3,y3) = (" + x3 + "," + y3 + ")." );
		
		System.out.println("The length of triangle sides are: a = " + this.getLengthA() + ", " +
															  "b = " + this.getLengthB() + ", "
															+ "c = 	" + this.getLengthC() + "." );
		
		System.out.println("The area of the triangle is: " + this.getArea());
	}
}
