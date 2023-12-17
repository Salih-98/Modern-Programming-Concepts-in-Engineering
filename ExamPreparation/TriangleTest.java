package ExamPreparation;

import inf.v3d.view.*;

public class TriangleTest {

	public static void main (String [] args) {
		
		Triangle z1 = new Triangle(7, 12, 4.0, 6,8.0,11.0);
		z1.print();
		Viewer v = new Viewer ();
		z1.drawCircumcircle(v);
		z1.draw("blue", v);
		double xp=1;
		double yp=4;
		boolean b = z1.isInside(xp, yp);
		double a=z1.getAlpha();
		double be=z1.getBeta();
		double g=z1.getGama();
		System.out.println("\n"+"The angle alpha is " + a + "\n");
		System.out.println("The angle beta is " + be + "\n");
		System.out.println("The angle ghama is " + g + "\n");
		System.out.println("Is the point in the triangle ?  " + b + "\n");
		v.setVisible(true);
	}
}
