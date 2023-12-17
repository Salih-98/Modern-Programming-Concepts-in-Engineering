package ExamPreparation;

import inf.v3d.view.Viewer;

public class ShapeDemoProgram {

	public static void main (String [] args) {
		Viewer v = new Viewer ();
		Line l = new Line (0.0,0.0,2.0,2.0);
		Circle c = new Circle (0.0,0.0,1.0);
		RectangleS r = new RectangleS (0.0, 0.0,1.0,4.0);
		Shape s = c;
		
		l.moveTo(1, 0);
		r.moveTo(3,-2);
		
		l.draw(v);
		r.draw(v);
		c.draw(v);

		v.setVisible(true);
	}
}
