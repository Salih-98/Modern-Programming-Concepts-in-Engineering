package ExamPreparation;

public abstract class ShapeFunctionSet {

	public abstract double [] eval  (double eta);
	
	public static void main (String [] args) {
		LinearSFS lsfs = new LinearSFS ();
		ShapeFunctionSet s1 = lsfs;
		
		double [] x = s1.eval(3.5);
		System.out.println("Result 1 ");
		for (int i=0; i<x.length;i++) {
			System.out.println("" + x[i]);
		}
		
		QuadraticSFS qsfs  = new QuadraticSFS();
		ShapeFunctionSet s2=qsfs;
		
		double [] y = s2.eval(2.7);
		System.out.println("Result 2 ");
		for (int i=0; i<y.length;i++) {
			System.out.println("" + y[i]);
		}
		
		double [] p = new double [3];
		p[0]=2;
		p[1]=1;
		p[2]=2;
		
		LinearCombination lc = new LinearCombination(p,qsfs);
		ShapeFunctionSet s3 = lc;
		double [] z = s3.eval(2.7);
		System.out.println("Result 3 ");
		for (int i=0; i<z.length;i++) {
			System.out.println("" + z[i]);
		}
	}
}
