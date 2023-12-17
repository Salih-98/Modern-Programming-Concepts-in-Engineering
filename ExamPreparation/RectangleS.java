package ExamPreparation;

import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class RectangleS extends Shape {
	
	private double x;
	private double y;
	private double w;
	private double h;
	
	public RectangleS(double x, double y, double w,double h) {
		super (x,y);
		this.w=w;
		this.h=h;
	}
	
	public void moveTo(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void draw(Viewer v) {
		Polyline pl = new Polyline();
		pl.addVertex(this.x,this.y,0);
		pl.addVertex(this.x+this.w,this.y,0);
		pl.addVertex(this.x+this.w,this.y+this.h,0);
		pl.addVertex(this.x,this.y+this.h,0);
		pl.addVertex(this.x,this.y,0);
		pl.setColor("black");
		v.addObject3D(pl);
	}
}
