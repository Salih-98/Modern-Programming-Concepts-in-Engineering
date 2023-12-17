package chapter1;

public class EigenvalueProblem {
	
	private Matrix M;
	private static final double EPS=1e-10;
	private Vector V;
	private int MAX_ITER = 40;
	
	public EigenvalueProblem (Matrix M) { //We define the matrix we are dealing with
		this.M=M;
	}
	
	public Vector getEigenvector () {
		if (this.V!=null) {
			return this.V;}
		int i= M.getM();		
		double [] x = new double [i];
		Vector v= new Vector (x);
		v.fill(1);
		Vector vnew = new Vector (i);
		double lambdaOld = 1;
		int steps=0;
		double lambdaNew;
	do { 
				vnew = M.multiply(v);
				v=vnew;
				lambdaNew=vnew.maxNorm();
				double alpha = 1/lambdaNew;
				v = v.multiply(alpha);
				steps++;
	} while (Math.abs(lambdaOld-lambdaNew) > EPS && steps < MAX_ITER);
			this.V=v;
			return v;}
	
		public double getEigenvalue () {
				int i= M.getM();		
				double [] x = new double [i];
				Vector v= new Vector (x);
				v.fill(1);
				Vector vnew = new Vector (i);
				double lambdaOld = 1;
				int steps=0;
				double lambdaNew;
			do { 
						vnew = M.multiply(v);
						v=vnew;
						lambdaNew=vnew.maxNorm();
						double alpha = 1/v.maxNorm();
						v = v.multiply(alpha);
						steps++;
			} while (Math.abs(lambdaOld-lambdaNew) > EPS && steps < MAX_ITER);
		this.V=v;
		return (v.scalar(M.multiply(v)))/v.scalar(v);
}
		
	public Vector preEigenvector () {
		if (this.V!=null) {
			System.out.print("Eigenvector has been retrieved and his value is:	" );
			this.V.print("Eigenvector");
			return this.V;
		} else {
			System.out.println("Eigen vector has not been calculated yet");
			return null;
		}
	}
		
	public static void main (String [] args) {
		
		double [] [] x = {{1,2,},{3,4}};
		Matrix M = new Matrix (x);
		EigenvalueProblem M1 = new EigenvalueProblem (M);
		Vector v = M1.getEigenvector();
		v.print("Eigenvector is");
		double lambda=M1.getEigenvalue();
		System.out.println("\n"+"Eigen value is:"+lambda);	
		Vector v1 = M1.preEigenvector();
	}
}
