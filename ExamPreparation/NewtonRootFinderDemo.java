package ExamPreparation;

import inf.math.UserFunction;
import inf.v3d.obj.Sphere;
import inf.v3d.view.Viewer;
import gnu.jel.CompilationException;

public class NewtonRootFinderDemo {

	public static void main (String [] args) throws CompilationException {
		
		UserFunction f = new UserFunction("cos((PI/5)*pow(x,2))","x");
		
		double a = 0.806871;
		double b = 5;
		NewtonRootFinder rf = new NewtonRootFinder (a,b,f);
		
		double x = rf.findRoot();
		System.out.println("Found approximate root x="+x+" with f(x)=" +f.valueAt(x));
		
		Viewer v = new Viewer();
		FunctionPlotter1D fp = new FunctionPlotter1D(a,b,f);
		fp.plot(v);
		
		Sphere root = new Sphere (x, 0.0 ,0.0);
		root.setColor("green");
		root.setRadius((b-a)/100);
		v.addObject3D(root);
		v.setVisible(true);
	}
}
