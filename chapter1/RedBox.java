package chapter1;

import inf.v3d.obj.*;
import inf.v3d.view.*;
public class RedBox {

	public static void main (String [] args) {
		Box box1= new Box ();
		box1.setColor("red");
	//	Box box2= new Box( 0.75, 0.5, 1.0);
	//	box2.setColor("blue");

//Sphere sphere= new Sphere(1.5,1.7,0.5);
//sphere.setRadius(0.2);
//sphere.setColor("blue");
		
		
		Viewer viewer =new Viewer();
		
		viewer.addObject3D(box1);
	//	viewer.addObject3D(box2);
//viewer.addObject3D(sphere);
		
		viewer.setVisible(true);
}
}
