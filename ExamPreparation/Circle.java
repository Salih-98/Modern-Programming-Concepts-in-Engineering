package ExamPreparation;

import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class Circle extends Shape {

	private static final int N=20;
	private double x;
	private double y;
	private double r;
	
	public Circle (double x, double y, double r) {
		super(x,y);
		System.out.println("Constructing a circle ... " + "\n");
		this.r=r;
	}
	
	public void moveTo(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void draw(Viewer v) {
		Polyline pl = new Polyline();
		double dphi = 2 * Math.PI/(N-1); //increment of the angle
		
		for (int i=0; i<N; i++) {
			double px = this.x+this.r*Math.cos(i*dphi);
			double py = this.y + this.r*Math.sin(i*dphi);
			pl.addVertex(px,py,0);
		}
		
		pl.setColor("black");
		v.addObject3D(pl);
	}
}
