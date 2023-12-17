package chapter1;

import inf.v3d.view.*;
import inf.v3d.obj.UnstructuredMesh;
import inf.v3d.obj.Circle;

public class Triangle {
	
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;

	
	//Prvo definisemo objekat (constructor)
	public Triangle (double x1, double x2, double x3, double y1, double y2, double y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3=  x3 ;
		this.y1=  y1;
		this.y2=  y2;
		this.y3=  y3;
	}
	
	//Ukoliko trouglu zelimo dodijeliti default vrijednost
	void defaultTriangle() {
		this.x1=0.0;
		this.x2=0.0;
		this.x3=1.0;
		this.y1=0.0;
		this.y2=1.0;
		this.y3=0.0;
}
	//odredjivanje duzina stranica trougla
	public double getLength1() {
		double l1 = Math.sqrt(Math.pow(this.x1-this.x2,2)+ Math.pow(this.y1 - this.y2, 2));
		return l1;
	}
	
	public double getLength2() {
	double l2= Math.sqrt(Math.pow(this.x1-this.x3,2)+ Math.pow(this.y1 - this.y3, 2));
	return l2;
	}
	
	public double getLength3() {
	double l3 = Math.sqrt(Math.pow(this.x3-this.x2,2)+ Math.pow(this.y3 - this.y2, 2));
		return l3;
		}
	
	//crtanje trougla u viewer
	void draw (String s, Viewer v) {
	
		UnstructuredMesh um = new UnstructuredMesh();
		int p1=um.addPoint(this.x1, this.y1, 0);
		int p2=um.addPoint(this.x2, this.y2, 0);
		int p3=um.addPoint(this.x3, this.y3, 0);
		um.addCell(p1,p2,p3);
		
		um.setColor(s);
		um.setOutlinesVisible(true);
		
		v.addObject3D(um);
		v.setVisible(true);
	}
	
	//Odredjivanje povrsine trougla
	public double getArea () {
		double a= 0.5*Math.abs(this.x1*(this.y2-this.y3) +
				this.x2*(this.y3 - this.y1) + this.x3*(this.y1 - this.y2));
		return a;	}
	
	//Provjeravanje da li je tacka unutar trougla
	public boolean isInside(double xp,double yp) {
		
		double a= this.getArea();
		Triangle t1=new Triangle(this.x1,this.x2,xp,this.y1,this.y2,yp);
		Triangle t2=new Triangle(this.x2,this.x3,xp,this.y2,this.y3,yp);
		Triangle t3=new Triangle(this.x1,this.x3,xp,this.y1,this.y3,yp);
		double a1= t1.getArea(); System.out.print(a1);
		double a2= t2.getArea();System.out.print(a2);
		double a3=t3.getArea();System.out.print(a3);
		boolean res;
		if(a==a1+a2+a3) {
			res=true;
		}
		else {res=false;}
		return res;
	}
	
	//Odredjivanje circumcirle-a
	void circumcircle (Viewer v) {
	double D= 2*(this.x1*(this.y2-this.y3)+this.x2*(this.y3-this.y1)+this.x3*(this.y1-this.y2));
	double mx= ((Math.pow(x1,2)+Math.pow(y1,2))*(this.y2-this.y3)  
				+ ((Math.pow(x2,2)+Math.pow(y2,2))* (this.y3-this.y1))
				+  ((Math.pow(x3,2)+Math.pow(y3,2))* (this.y1-this.y2)))/D;
	double my= ((Math.pow(x1,2)+Math.pow(y1,2))*(this.x3-this.x2)  
			+ ((Math.pow(x2,2)+Math.pow(y2,2))* (this.x1-this.x3))
			+  ((Math.pow(x3,2)+Math.pow(y3,2))* (this.x2-this.x1)))/D;
	System.out.println("Dx is " + mx + "Dy is " + my);
	double a=this.getLength1();
	double b=this.getLength2();
	double c=this.getLength3();
	
	double p=this.getArea();
	double r= (a*b*c)/(4*p);
	Circle c1 = new Circle (r);
	c1.setCenter(mx, my, 0);
	c1.setRadius(r);
	v.addObject3D(c1);
	v.setVisible(true);	}
	
	//Odredjivanje jednog ugla - alpha
	public double Alpha () {
	double alpha;
	double a= this.getLength1();
	double b=this.getLength2();
	double c= this.getLength3();
	
	alpha=Math.acos((Math.pow(b, 2)+ Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c));
	return alpha;
	}
	

	//Odredjivanje jednog ugla - beta
	public double Beta () {
	double beta;
	double a= this.getLength1();
	double b=this.getLength2();
	double c= this.getLength3();

	beta=Math.acos((Math.pow(a, 2)+ Math.pow(c, 2)-Math.pow(b, 2))/(2*a*c));
	return beta;
	}
	

	//Odredjivanje jednog ugla - gama
	public double Ghama () {
	double ghama;
	double a= this.getLength1();
	double b=this.getLength2();
	double c= this.getLength3();
	
	ghama=Math.acos((Math.pow(a, 2)+ Math.pow(b, 2)-Math.pow(c, 2))/(2*b*a));
	return ghama;
	}
	
	//Metoda za printanje
	void print() {
		double l1 = this.getLength1();
		double l2 =this.getLength2();
		double l3 =this.getLength3();
		double a = this.getArea();
		System.out.println("Triangle vertices have following coordinates:" + "\n");
		System.out.println("A( x1, y1) :("  + this.x1 + "," + this.y1 + ")" + "\n"); 
		System.out.println("B( x2, 21) :" + " (" + this.x2 + "," + this.y2 + ")" + "\n"); 
		System.out.println("C( x3, y3) :" + " (" + this.x3 + "," + this.y3 + ")" + "\n");
		System.out.print("The length of the triangle side between A and B is:" + l1 + "\n");
		System.out.print("The length of the triangle side between A and C is:" + l2 + "\n");
		System.out.print("The length of the triangle side between C and B is:" + l3 + "\n");
		System.out.print("The area of the triangle is:" + a + "\n");
		}
	
	//Test case
	public static void main (String[] args) {
		
		Triangle z1 = new Triangle(7, 12, 4.0, 6,8.0,11.0);
		z1.print();
		Viewer v = new Viewer ();
		z1.circumcircle(v);
		z1.draw("blue", v);
		double xp=1;
		double yp=4;
		boolean b = z1.isInside(xp, yp);
		double a=z1.Alpha();
		double be=z1.Beta();
		double g=z1.Ghama();
		System.out.println("\n"+"The angle alpha is " + a + "\n");
		System.out.println("The angle beta is " + be + "\n");
		System.out.println("The angle ghama is " + g + "\n");
		System.out.println("Is the point in the triangle ?  " + b + "\n");

	}
}
