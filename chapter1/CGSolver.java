package chapter1;

public class CGSolver {
	private Matrix M;
	private final static double EPS = 1e-10;
	private Vector b;
	
	public CGSolver (Matrix M) {	this.M=M;	}
	
	public Vector solveCG (Matrix M, Vector b) {
		
		int max_iter = 25;
		int k=0;
		int n = b.getN();
		
		//Creating the solution vector x
		double [] xe = new double [n];
		
		//Initializing x
		Vector x = new Vector (n);
		
		// If we use following expressions for r and p it is the same as if we set the initial x, i.e. x0 to be all zeros
		//Initializing the first r vector
		Vector r = new Vector (n);
		r = r.add(1, b);
		double rOld=r.scalar(r);
		
		//Initializing the first vector p 
		Vector p = new Vector (n);
		p=p.add(1, b);
		
		//We are checking if x with all zeros is the solution
		if (rOld<EPS) {
			return x;
		}
		
		//Declaring variables we will use in the while loop
		double alpha;
		Vector ad;
		
		//Setting up maximum number of iterations
		while (k<max_iter ) {
		
		//Finding the vector which is the result of M*p
		ad = M.multiply(p);
		
		//Calculating alpha
		alpha = rOld/(p.scalar(ad));
		
		//Calculating new x and r
		x = x.add(alpha, p);
		r=r.add(-1*alpha, ad);
		
		//Checking if the residual r is small enough, i.e. the solution is approximate enough
		double rNew=r.scalar(r);
		
		if (rNew<EPS) {
			System.out.println("\n"+"Solution has been found.");
			x.print("Solution is the vector :");
			return x;}

		// IF the solution has not yet been found, we have to calculate new vector p for our next point/iteration
		double beta = rNew/rOld;
		p = r.add(beta, p);
		
		//number of iteration increases
		k++;
		
		//We use our next r for next iteration
		rOld=rNew;
		} 
		System.out.println("The solution has not been found for the maximum number of iterations. x from the last iteration is:" + "\n");
		return x;
		}


	public static void main (String [] args) {
		
		double [] [] x = {{ 3.4430, -0.3963,  2.5012,  0.9525,  0.6084, -1.2728}, 
						  {-0.3963,  0.6015, -0.4108, -0.1359, -0.0295,  0.2630},
						  {2.5012, -0.4108,  2.5927,  0.7072,  0.5587, -1.0613},
						  {0.9525, -0.1359,  0.7072,  1.1634,  0.1920, -0.4344},
						  {0.6084, -0.0295,  0.5587,  0.1920,  0.7636, -0.3261},
						  {-1.2728,  0.2630, -1.0613, -0.4344, -0.3261,  1.0869}};
		Matrix M = new Matrix (x);
		Vector b = new Vector (3.0685,  0.0484,  2.5783,  1.2865,  0.8671, -0.8230);
		M.print("Matrica M");
		b.print("b");
		CGSolver A = new CGSolver(M);
		Vector l = A.solveCG(M,b);
	}
}
