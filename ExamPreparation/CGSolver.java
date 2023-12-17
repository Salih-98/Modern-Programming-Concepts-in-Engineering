package ExamPreparation;

public class CGSolver {

	private Matrix A;
	private Vector b;
	private static final double EPS = 1e-10;
	private static final int MAX_ITER = 20;
	
	public CGSolver (Matrix A) {
		this.A=A;
	}
	
	public Vector solveCG ( Vector b) {
		Vector x = new Vector (b.getN()); // Solution vector
		
	
		Vector d = new Vector (b.getN()); //Vector p from the algorithm in wikipedia
		d=d.add(1.0, b); //Setting the initial value of p
		
		Vector r = new Vector (b.getN()); //Vector r from the algorithm in wikipedia
		r=r.add(1.0, b);//Setting the initial value of r 
		r.print("r");
		double rOld = r.scalar(r);
		
		System.out.print(rOld);
		if (rOld<EPS) { //Check if vector x with all zeros is the solution
			return x;
		}
		
		int steps = 0;
		
		while (rOld>EPS && steps<MAX_ITER) {
			
			Vector ad = this.A.multiply(1, d); //Get A * pk
			double alpha = rOld/(d.scalar(ad)); //Calculating alpha as r/p*A*p
			
			x = x.add(alpha, d); //Next value of x
			x.print("x");
			r=r.add(-1*alpha, ad); // Next value of r
			double rNew = r.scalar(r); //Value of r for the new vector
			
			d = r.add(rNew/rOld, d); // New value for p
			rOld=rNew;
			
			steps++;
		}
		
		return x;
	}
	
}
