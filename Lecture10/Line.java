package Lecture10;

import inf.v3d.obj.Polyline;
import inf.v3d.view.*;


public class Line extends Shape{

	
	private double dx;
	private double dy;
	
	public Line (double x, double y, double dx, double dy) {
		super(x,y);
		this.dx = dx;
		this.dy = dy;
	}
	

	
	public void draw (Viewer v) {
		Polyline pl = new Polyline ();
		
		pl.addVertex(this.getX(), this.getY(),0);
		pl.addVertex(this.getX() + this.dx, this.getY() + this.dy, 0);
		pl.setColor("black");
		v.addObject3D(pl);
		
	}
}
