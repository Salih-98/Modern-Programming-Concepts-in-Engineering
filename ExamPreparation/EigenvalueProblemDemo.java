package ExamPreparation;

public class EigenvalueProblemDemo {
 
	public static void main (String [] args) {
		Matrix M = new Matrix (2,2, 1,2,3,4) ;
		M.print("M");
		EigenvalueProblem M1 = new EigenvalueProblem (M);
		System.out.print("The precalculated value of the eigenvector is: " + M1.getEigenvector() + "\n");
		Vector v = M1.findEigenvector();
		v.print("Eigenvector is");
	}
}
