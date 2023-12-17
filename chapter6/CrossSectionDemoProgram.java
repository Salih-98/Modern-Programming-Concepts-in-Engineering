package chapter6;

import inf.v3d.obj.Extrusion;
import inf.v3d.view.*;

public class CrossSectionDemoProgram {

	public static void main (String [] args) {
		
		RectangularCS r = new RectangularCS (1,1);
		CrossSection r1 = r;
		
		double [] [] outline = r1.getOutline();
		
		Extrusion e1 = new Extrusion (); e1.setOutline(outline);
		e1.setPoint1(0, 0, 0);
		e1.setPoint2(0, 1, 0);
		
		CircleCS c = new CircleCS (0.2);
		CrossSection c1 = c;	
		double [] [] outline1 = c1.getOutline();
		
		Extrusion e2 = new Extrusion (); e2.setOutline(outline1);
		e2.setColor("blue");
		e2.setPoint1(0,0,0);
		e2.setPoint2(0,1,0);
		
		Viewer v = new Viewer ();
		v.addObject3D(e1);
		v.addObject3D(e2);
		v.setVisible(true);
		
		System.out.println("Area of figure 1 is " + c1.getArea());
		System.out.println("Area of figure 2 is " + r1.getArea());
	}
}
