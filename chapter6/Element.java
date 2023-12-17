package chapter6;

import inf.v3d.obj.Extrusion;
public class Element {
	
	 Node [] Nodes;
	 CrossSection cs;
	
	public Element (Node n1, Node n2, CrossSection cs) {
		this.Nodes= new Node [2];
		Nodes[0]=n1;
		Nodes[1]=n2;
		this.cs=cs;
	}
	
	public double getVolume () {
		return cs.getArea() * Nodes[0].distance(Nodes[1]);
	}
	
	public void draw() {
		Extrusion e1= new Extrusion();
		e1.setOutline(cs.getOutline());
		e1.setPoint1(Nodes[0].getX(),Nodes[0].getY(),Nodes[0].getZ());
		e1.setPoint2(Nodes[1].getX(),Nodes[1].getY(),Nodes[1].getZ());
		
	//Viewer v = new Viewer();
	//v.addObject3D(e1);
	//v.setVisible(true);
	}
	
	
}
