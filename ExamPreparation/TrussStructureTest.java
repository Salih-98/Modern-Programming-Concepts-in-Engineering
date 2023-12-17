package ExamPreparation;

import inf.v3d.view.Viewer;

public class TrussStructureTest {
	public static void main (String [] args) {
	TrussStructure ts = new TrussStructure ();
	
	CircleCS ccs = new CircleCS (0.01);
	RectangleCS rcs = new RectangleCS (0.01,0.02);
	Viewer v = new Viewer ();
	ts.addCrossSection(ccs);
	ts.addCrossSection(rcs);
	ts.addNode(0, 0, 0);
	ts.addNode(1.0, 0, 1.0);
	ts.addNode(2.0,0.0,0.0);
	ts.addElement(0, 1, 0);
	ts.addElement(1,2,0);
	ts.addElement(0, 2, 1);
	
	ts.draw(v);
	System.out.println("The Volume of the structure is :" + ts.getVolume());
}}
