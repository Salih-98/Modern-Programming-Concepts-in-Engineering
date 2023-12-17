package chapter1;

import inf.v3d.obj.Object3D;
import inf.v3d.obj.*;
import inf.v3d.view.*;

public class AddObjects {

public static void main (String [] args) {
	
	Box box1 = new Box (0.0, 0.0, 0.0);
	box1.setSize(4.0,4.0,4.0);
	box1.setColor("red");

	Cone cone1 = new Cone ();
	cone1.setCenter(6.0,0.0,2.0);
	cone1.setHeight(7);
	cone1.setColor("yellow");
	cone1.setRadius(2);
	
	Sphere sphere= new Sphere(6.0,8.0,2.0);
	sphere.setRadius(1.0);
	sphere.setColor("blue");
	
	Box b2 = new Box(8.0,0.0,1.0);
	b2.setSize(2.0,2.0,2.0);
	b2.setColor("green");

	Viewer v= new Viewer ();
	v.addObject3D(cone1);
	v.addObject3D(box1);
	v.addObject3D(sphere);
	v.addObject3D(b2);
	
	
	v.setVisible(true);
}
}
