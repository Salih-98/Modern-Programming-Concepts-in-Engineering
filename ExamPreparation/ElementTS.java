package ExamPreparation;

import inf.v3d.obj.Extrusion;
import inf.v3d.view.Viewer;

public class ElementTS {

	private NodeTS n1;
	private NodeTS n2;
	private CrossSection cs;
	
	public ElementTS (NodeTS n1, NodeTS n2, CrossSection cs) {
		this.n1=n1;
		this.n2=n2;
		this.cs=cs;
	}
	
	public double getVolume () {
		return this.cs.getArea()*(n1.distance(n2));
	}
	
	public void draw (Viewer v) {
		Extrusion e1= new Extrusion();
		e1.setOutline(cs.getOutline());
		e1.setPoint1(this.n1.getX(),this.n1.getY(),this.n1.getZ());
		e1.setPoint2(this.n2.getX(),this.n2.getY(),this.n2.getZ());
		
		v.addObject3D(e1);
		v.setVisible(true);
	} 
}
