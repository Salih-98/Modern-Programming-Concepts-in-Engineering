package ExamPreparation;

import inf.v3d.obj.UnstructuredMesh;
import inf.v3d.view.*;

public class Rectangle {

	private double x;
	private double y;
	private double h;
	private double w;
	
	public Rectangle (double x, double y, double w, double h) {
		this.x=x;
		this.y=y;
		this.h=h;
		this.w=w;
	}
	
	public void draw (String color, Viewer v) {
		
		UnstructuredMesh um = new UnstructuredMesh();
		
		int id1 = um.addPoint(this.x,this.y,0);
		int id2 = um.addPoint(this.x+this.w, this.y,0);
		int id3 = um.addPoint(this.x+this.w,this.y+this.h,0);
		int id4 = um.addPoint(this.x,this.y+this.h,0);
		
		um.addCell(id1,id2,id3,id4);
		um.setColor(color);
		um.setOutlinesVisible(true);
		
		v.addObject3D(um);

	}
	
	public double getArea () {
		return this.w*this.h;//it can be done without this, it is obvious which w and h
	}
	
	public boolean isInside (double px, double py) {
		return (px >= this.x && px <=(this.x+this.w) && py>=this.y && py <= this.y + this.h);
	}
	
	public boolean isIntersecting(Rectangle r) {
		return this.x <= ( r.x + r.w )&& (this.x+ this.w )>=r.x && this.y <= (r.y + r.h) && (this.y + this.h ) >= r.y;
	}
	
	public Rectangle createUnion (Rectangle r) {
				
		double xA = Math.max(this.x, r.x);
		double xB = Math.min(this.x+this.w, r.x + r.w);
		
		double yA = Math.max(this.y,r.y);
		double yB = Math.min(this.y + this.h, r.y + r.h);
		
		double width = Math.max(0, xB- xA);//just to make sure they intersect
		double heigth = Math.max(0,yB-yA);//just to make sure they intersect
		
		Rectangle res = new Rectangle (xA, yA, width, heigth);
		return res;
	}
}
