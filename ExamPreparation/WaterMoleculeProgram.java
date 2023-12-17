package ExamPreparation;

import inf.v3d.view.*;
import inf.v3d.obj.Sphere;

public class WaterMoleculeProgram {

	public static void main (String [] args) {
	Viewer v = new Viewer ();
	Sphere oxygen = new Sphere(0.0, 0.0, 0.0);
	Sphere hydrogen1 = new Sphere (-0.75, 0.59, 0.0);
	Sphere hydrogen2 = new Sphere (0.75, 0.59, 0.0);
	
	hydrogen1.setRadius(0.675);
	hydrogen2.setRadius(0.675);
	hydrogen1.setColor("red");
	hydrogen2.setColor("red");
	
	v.addObject3D(hydrogen2);
	v.addObject3D(hydrogen1);
	v.addObject3D(oxygen);
	v.setVisible(true);
	
}
}

