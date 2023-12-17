package ExamPreparation;

import inf.v3d.view.*;

public class RectangleTest {

	public static void main (String [] args) {
		
		Rectangle r1 = new Rectangle (1.0,1.0,4.0,4.0);
		Rectangle r2 = new Rectangle (2.0,4.0,8.0,2.0);
		Rectangle r3 = new Rectangle (6.0,2.0,2.0,5.0);
		
		Viewer v = new Viewer ();
		r1.draw("red", v);
		r2.draw("blue", v);
		r3.draw("green", v);
		
		System.out.println("Area of the rectangle 1 is " + r1.getArea());
		
		Rectangle r = r1.createUnion(r2);
		r.draw("black", v);
		r2.createUnion(r3).draw("black", v);
		
		double px = 3.5;
		double py = 4.5;
		
		boolean b1 = r1.isInside(px, py);
		boolean b2 = r2.isInside(px, py);
		boolean b3 = r3.isInside(px, py);
		
		System.out.println("Rectangle 1 contains p: " + b1);
		System.out.println("Rectangle 2 contains p: " + b2);
		System.out.println("Rectangle 3 contains p: " + b3);
		
		boolean b4 = r1.isIntersecting(r2);
		boolean b5 = r1.isIntersecting(r3);
		boolean b6 = r2.isIntersecting(r3);
		
		System.out.println("Rectangle 1 intersects Rectangle 2: " + b4);
		System.out.println("Rectangle 1 intersects Rectangle 3: " + b5);
		System.out.println("Rectangle 2 intersects Rectangle 3: " + b6);
		
		v.setVisible(true);
		
	}
	
}
