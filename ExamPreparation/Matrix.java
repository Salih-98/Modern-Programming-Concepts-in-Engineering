package ExamPreparation;

public class Matrix {

	public double [][] elements;
	
	public Matrix (int m, int n) {
		this.elements = new double [m][n]; 
	}
	
	public Matrix (int m, int n, double...values) {
		this(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.set(i, j, values[i * n + j]);
			}
		}
	}
	
	public int getM() { //number of rows
		return this.elements.length;
	}
	
	public int getN() {
		return this.elements[0].length; //every row has an array of elements
	}
	
	public void set(int i, int j, double wert) {
		this.elements[i][j] = wert;
	}
	
	public void setRow(int i, double...value) {
		for (int j=0; j<this.getN(); i++) {
			this.set(i, j, value [j]);
		}	}
	
	public double get(int i, int j) {
		return this.elements[i][j];
	}

	
	public void print(String l) {
		int m = this.getM();
		System.out.println(l + " = ");
		for (int i = 0; i < m; i++) {
			System.out.print("|");
			for (int j = 0; j < this.getN(); j++) {
				System.out.printf(" %12.5e", get(i, j));
			}
			System.out.println(" |");
		}}
	
	public Matrix transpose () {
		int m= this.getM();
		int n = this.getN();
		Matrix r = new Matrix (m,n);
		
		for (int i=0;i<m;i++) {
			for (int j=0; j<n; j++) {
				r.set(i,j,this.get(i,j));
			}
		}
		return r;
	}
	
	public double maxNorm () {
		int m=this.getM();
		int n=this.getN();
		double max = Double.NEGATIVE_INFINITY;
		
		for (int i=0;i<m;i++) {
			for(int j=0; j<n;j++) {
				if (max< Math.abs(this.get(i, j))) {
					max = Math.abs(this.get(i, j));
				}
			}
		} return max;
	}
	
	public Matrix add (double alpha, Matrix M) {
		int m = this.getM();
		int n= this.getN();
		Matrix r = new Matrix (m,n);
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n;j++) {
				r.set(i, j, this.get(i, j)+M.get(i, j)*alpha);
			}
		}
		return r;
	}
	
	public Vector multiply (double alpha, Vector x) {
		Vector r = new Vector(this.getM());
		for (int i=0; i<this.getM(); i++) {
			double s=0;
			for (int j=0; j<this.getN();j++) {
				s = s + this.get(i, j)*x.get(j);
			}
		r.set(i, s*alpha);
		}
		return r;
	}
	
	public Matrix multiply (double alpha, Matrix M) {
		Matrix r = new Matrix (this.getM(), this.getN());
		for (int i = 0; i<this.getM();i++) {//for loop for every row
			for (int j=0; j<this.getN(); j++) { //for loop for every element of the row
 			double s=0;
 				for (int k=0; k<this.getN();k++) {
 					s = s + this.get(i, k)*M.get(k, j);
 				} r.set(i, j, s*alpha); }
		
		}	return r;
	}
	
	public static Matrix createRandomMatrix(int m, int n) {
		Matrix r = new Matrix(m, n);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				r.set(i, j, Math.random()*10);
			}
		}
		return r;
	}

	
	public static Matrix createSingularMatrix(int n, int d) {
		Matrix r;
		if (d == n) {
			r = new Matrix(n, n);
		} else {
			
			r=createRandomMatrix(n,n);
			
			for (int i = n - d; i < n; i++) {
				for (int j = 0; j < n; j++) {
					r.set(i, j, r.get(i - n + d, j));
				}
			}}
		return r;
	}
}