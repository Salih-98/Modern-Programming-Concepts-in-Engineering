package ExamPreparation;

public class EigenvalueProblem {

	private Matrix M;
	private static final double EPS=1e-15;
	private Vector eigenvector;
	private static final double MAX_ITER=50;
	
	public EigenvalueProblem (Matrix M) {
		this.M = M;
	}
	
	public Vector findEigenvector () {
		
		if (this.getEigenvector()!=null) { //First we check if our eigenvector is already calculated
			return this.getEigenvector();}
		
		int i = this.M.getM();
		Vector v = new Vector (i);
		v.fill(1);//Make the new vector have all ones
		double lambdaOld;
		double lambdaNew =1; 
		
		int steps = 0;
		do { 
		lambdaOld=lambdaNew;
		Vector xnew = 	 M.multiply(1,v);
		v = xnew;
		lambdaNew = xnew.maxNorm();
		double alpha = 1/lambdaNew;
		v = v.multiply(alpha);
		steps=steps+1;
		} while(Math.abs(lambdaOld - lambdaNew)>EPS && steps <MAX_ITER);
		this.eigenvector=v;
		System.out.println("EigenValue is " + lambdaNew);
		return v;
	}
	
	public Vector getEigenvector() {
		if (this.eigenvector!=null) {
			return this.eigenvector;
		} else {
			return null;
		}
	} 
	
}
