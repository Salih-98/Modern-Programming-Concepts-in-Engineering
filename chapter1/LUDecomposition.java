package chapter1;


public class LUDecomposition {

	private Matrix a;
	private static final double EPS=1e-14;
	
	public LUDecomposition (Matrix a) {
	initialize(a);
	decompose();
	}
	
	//Private method for initializing a local matrix inside the constructor so we don't modify the outside matrix
	private void initialize (Matrix a) {
		int n = a.getM();
		this.a = new Matrix (n,n);
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				this.a.set(i, j, a.get(i, j));
									}
								}
									}
	
	//Private method for decomposing of our local matrix in the constructor
	private void decompose () {
		int n=this.a.getM();
		
		for (int i = 0; i < n-1; i++) {
			
			double aii = this.a.get(i,i);
			this.checkDiagonalElement(i,aii);
			
				for (int j= i+1; j<n; j++) {
					
					double aji = this.a.get(j, i)/aii;
					this.a.set(j, i, aji);
					
						for (int k=i+1; k<n; k++) {
							
							double aik = this.a.get(i, k);
							double ajk = this.a.get(j, k) - aik*aji;
							this.a.set(j, k, ajk);
												}
											}
									}
		double ann = this.a.get(n-1, n-1);
		checkDiagonalElement (n-1,ann);
							   }
	
		//Method for checking if diagonal elements are too small
		private void checkDiagonalElement (int i, double aii) {
			System.out.println(i + " je i " + " and " + aii + " is aii");
			if (Math.abs(aii) < EPS) {
				String msg = "Zero diagonal element in row " + i;
				throw new IllegalArgumentException (msg);
			}
		}
		
		//Method to get the L matrix
		public Matrix getL () {
			int n=this.a.getM();
			Matrix l = new Matrix (n,n);
			
			for (int j=0; j<n;j++) {
				l.set(j, j, 1);
				for (int i=j+1; i<n; i++) {
					l.set(i, j, this.a.get(i, j));
				}
			}
			return l;
		}
		
		//Method to get the U matrix
		public Matrix getU () {
			int n=this.a.getM();
			Matrix u = new Matrix (n,n);
			
			for (int i=0; i<n;i++) {
				for (int j=i; j<n; j++) {
					u.set(i, j, this.a.get(i, j));
				}
			}
			return u;
		}
				
		public Vector computeY (Vector b) {
			int n = a.getM();
			Vector y = new Vector (n);
			y.set(0, b.get(0));
			
			for (int i=1; i<n; i++) {
				double s = 0;
				for (int j=0; j<i;j++) {
					s = s + a.get(i, j)*y.get(j);
				}
				y.set(i, b.get(i)-s);
			}
			return y;
		}
		
		public Vector computeX(Vector y) {
			int n=a.getM();
			Vector x=new Vector (n);
			x.set(n-1, y.get(n-1)/a.get(n-1, n-1));
			for (int i=n-2; i<=0;i=i-1) {
				double s=0;
				for (int j=i+1; j<n; j=j+1) {
					s=s+a.get(i, j)*x.get(j);
				}
			x.set(i, (y.get(i)-s)/this.a.get(i, i));
			}
			return x;
		}
		
		public Vector solveFor (Vector b) {
			Vector y = computeY(b);
			Vector x = computeX(y);
			return x;
		}
		
		public static void main (String [] arg) {
			
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
				
		}
}

