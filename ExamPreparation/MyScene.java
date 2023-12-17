package ExamPreparation;

 import inf.v3d.obj.*;
 import inf.v3d.view.*;
	
public class MyScene {

	public static void main (String [] args) {
	Viewer v = new Viewer ();
	Box b1 = new Box();
	Box b2 = new Box();
	Cone c = new Cone();
	
	Sphere s = new Sphere(1.5, 1.7, 0.5);
	
	s.setRadius(0.2);
	s.setColor("blue");
	
	b1.setColor("red");
	b2.setVertex(2.0, 0, 0);
	b2.setSize(0.75,0.5,1.0);
	b2.setColor("green");
	
	c.setCenter(1.5,0,0.5);
	c.setRadius(0.5);
	c.setHeight(1.5);
	c.setColor("yellow");
	
	v.addObject3D(c);
	v.addObject3D(b1);
	v.addObject3D(b2);
	v.addObject3D(s);
	
	v.setVisible(true);
	
	
	
	}
}
