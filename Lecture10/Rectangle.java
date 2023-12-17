package Lecture10;

import inf.v3d.obj.Polyline;
import inf.v3d.view.*;

public class Rectangle extends Shape {
	

	private double w;
	private double h;
	//One atribute definisano samo u Shape, ne pisemo u drugim klasama
	public Rectangle (double x, double y, double w, double h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}
	
	
	public void draw (Viewer v) {
		Polyline pl = new Polyline ();
		pl.addVertex(this.getX(),this.getY(),0);
		pl.addVertex(this.getX() + this.w, this.getY(),0);
		pl.addVertex(this.getX() + this.w, this.getY()+ this.h, 0);
		pl.addVertex(this.getX(), this.getY()+this.h,0);
		pl.addVertex(this.getX(), this.getY(),0);
		pl.setColor("black");
		v.addObject3D(pl);
	}
}
