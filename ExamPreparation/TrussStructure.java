package ExamPreparation;

import java.util.LinkedList;

import inf.v3d.view.Viewer;


public class TrussStructure {

	private LinkedList <CrossSection> cs = new LinkedList<CrossSection>();
	private LinkedList <ElementTS> el = new LinkedList<ElementTS> ();
	private LinkedList <NodeTS> nodes = new LinkedList<NodeTS>();
	
	public void addNode (double x, double y, double z) {
		this.nodes.add(new NodeTS(x,y,z));
	}
	
	public void addElement(int idxN1, int idxN2, int idxCS) {
		this.el.add(new ElementTS( this.nodes.get(idxN1),this.nodes.get(idxN2), this.cs.get(idxCS)));
	}
	
	public void addCrossSection(CrossSection cs) {
		this.cs.add(cs);
	}
	
	public void draw(Viewer v) {
		for (ElementTS e : this.el ) {
			e.draw(v);
		}
	}
	
	public double getVolume() {
		double s=0;
		for (ElementTS e: this.el) {
			s = s+ e.getVolume();
		}
		return s;
	}
}
