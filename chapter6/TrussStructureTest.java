package chapter6;


public class TrussStructureTest {

	public static void main (String [] arg) {
	
	TrussStructure ts = new TrussStructure ();
	
	CircleCS ccs = new CircleCS ( 0.01);
	RectangularCS rcs = new RectangularCS (0.01,0.02);
	
	ts.addCrossSection(ccs);
	ts.addCrossSection(rcs);
	ts.addNode(0, 0, 0);
	ts.addNode(1.0, 0, 1.0);
	ts.addNode(2.0,0.0,0.0);
	ts.addElement(0, 1, 0);
	ts.addElement(1,2,0);
	ts.addElement(0, 2, 1);
	
	ts.draw();
	System.out.println("The Volume of the structure is :" + ts.getVolume());
	
	
	
}}
