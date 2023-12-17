package ExamPreparation;

import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class Line extends Shape {

	private double x;
	private double y;
	private double dx;
	private double dy;
	
	public Line (double x, double y, double dx, double dy) {
		super(x,y);
		this.dx=dx;
		this.dy=dy;
	}
	
	public void moveTo (double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void draw(Viewer v) {
		Polyline pl = new Polyline ();
		
		pl.addVertex(this.x,this.y,0);
		pl.addVertex(this.x + this.dx, this.y+this.dy,0);
		pl.setColor("black");
		v.addObject3D(pl);
	}
}
