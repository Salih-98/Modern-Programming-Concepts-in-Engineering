package chapter6;

import java.util.*;
import inf.v3d.obj.Extrusion;
import inf.v3d.view.Viewer;

public class TrussStructure {

	private ArrayList<Node> nodes;
	private ArrayList<CrossSection> cs;
	private ArrayList<Element>  e;
	
	public TrussStructure () {
		this.nodes=new ArrayList <Node> ();
		this.cs=new ArrayList <CrossSection> ();
		this.e=new ArrayList <Element> ();
	
	}
	
	public void addNode (double x, double y, double z) {
		Node n = new Node (x, y, z);
		nodes.add(n);
	}
	
	public void addCrossSection (CrossSection cs) { 	
	
		this.cs.add(cs); }
	
	public void addElement(int idxN1, int idxN2, int idxCs) {
		Element e1 = new Element (this.nodes.get(idxN1), this.nodes.get(idxN2), this.cs.get(idxCs));
		this.e.add(e1);
	}
	
	public void draw () {
		
		Viewer v = new Viewer ();
		
		
		for (int i = 0; i< this.e.size(); i++) {	
		Extrusion extrusion = new Extrusion();
		extrusion.setOutline(this.e.get(i).cs.getOutline());
	
		extrusion.setPoint1(this.e.get(i).Nodes[0].getX(),this.e.get(i).Nodes[0].getY(),this.e.get(i).Nodes[0].getZ());
		extrusion.setPoint2(this.e.get(i).Nodes[1].getX(),this.e.get(i).Nodes[1].getY(),this.e.get(i).Nodes[1].getZ());
	
		v.addObject3D(extrusion);
		}
		v.setVisible(true);
	}
	
	public double getVolume () {
		double volume = 0;
		for (int i=0; i< this.e.size(); i++) {
			volume = volume + this.e.get(i).getVolume();
		}
		return volume;
	}
}
