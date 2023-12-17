package ExamPreparation;

import inf.v3d.obj.MatrixPlotGroup;
import inf.v3d.view.Viewer;

public class LUDecompositionDemo {

	public static void main (String [] args) {
	try {
			Matrix A = new Matrix (4,4);
			A = Matrix.createRandomMatrix(4,4);
					
			A.print("A");
			LUDecomposition lud = new LUDecomposition (A);
			
			Matrix l = lud.getL();
			l.print("l");
			
			Matrix u = lud.getU();
			u.print("u");
			
			Matrix r = A.add(-1, l.multiply(1,u));
			r.print("r");
			
			System.out.println("||R||max = " + r.maxNorm());
			l.multiply(1, u).print("the product of matrices l and u ");
			
			} catch (IllegalArgumentException e){
					System.out.println("Solve failed: " + e.getMessage());
			}
}}
