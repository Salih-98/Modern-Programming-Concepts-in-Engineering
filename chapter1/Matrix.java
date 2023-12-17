package chapter1;

public class Matrix {

	public double [] [] elements;
	
	public Matrix (int m, int n) {
	this.elements = new double [m][n];
	}
	
	public  Matrix (double [][] x) {
		int n = x.length;
		int m = x[0].length;
		this.elements=new double [n][m];
				for (int i = 0; i< n ; i++) {
			for(int j=0; j<m; j++) {
			this.elements [i][j]= x [i][j];
		}}

	}
	
	public Matrix copyMatrix (Matrix M) {
		Matrix res = new Matrix (M.elements);
		return res;
	}
	
	public double get (int i, int j) {
		return this.elements[i][j];
	}
	
	void set (int i, int j, double v) {
		this.elements[i][j]=v;
	}
	
	public int getM () {
		return this.elements.length;
	}
	
	public int getN( ) {
		return this.elements[0].length;
	}
	
	void setRow (int i, double vs) {
		int n= this.elements[i].length;
		for (int j=0; j<n; j++) {
		this.elements[i][j]=vs;
		}
	}
	
	void print(String s) {
		System.out.println("Defined matrix is " + s + ": ");
		for (int i=0; i<this.elements.length;i++) {
			for (int j=0; j< this.elements[0].length; j++) {
			if (j==0) { System.out.print("|	" + this.elements[i][j]+",		");
			} else if (j==this.elements[0].length - 1) {
				System.out.print(this.elements[i][j]+"    |" + "\n");
			} else {
				System.out.print(this.elements[i][j]+",    ");
			}
		}}
	}
	public Matrix transpose () {
		int n= this.elements.length;
		int m= this.elements[0].length;
		double [][] Mte = new double  [m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				Mte[i][j]=this.elements[j][i];
			}
		}Matrix Mt = new Matrix (Mte);
		return Mt;
		 }
	
	public double maxNorm() {
		double max = Math.abs(this.elements[0][0]);
		
		for (int i=0; i< this.elements.length; i++) {
			
			for (int j=0; j < this.elements[0].length; j++) {
				
				if (Math.abs(this.elements[i][j]) > max) {
					max = Math.abs(this.elements[i][j]);
				}
			}
		}
		return max;
	}
	
	public Matrix add (double alpha, Matrix M) {
		int n = this.elements.length;
		int m = this.elements[0].length;
		Matrix resM = new Matrix (n,m);
		for (int i=0; i < n; i++) {
			for (int j=0; j<m; j++) {
				resM.elements[i][j] = this.elements[i][j] + M.elements[i][j]*alpha;
			}
		}
		return resM;
	}
	
	public Vector multiply (Vector v) {
		int n = this.elements.length;
		int m = this.elements[0].length;
		Vector resM = new Vector (n);
		for (int i=0; i < n; i++) {
		double sum=0;
			for (int j=0; j<m; j++) {
			sum = sum + this.elements[i][j] * v.get(j);
			}	
		resM.set(i,sum);
		}
		return resM;
	}
	
	public Matrix multiply (double alpha, Matrix M) {
		int n = this.elements.length;
		int m = this.elements[0].length;
		Matrix resM = new Matrix (n,m);
		for (int k=0; k<n; k++) {
		
		for (int i=0; i < n; i++) {
			double sum=0;
				for (int j=0; j<m; j++) {
				sum = sum + this.elements[k][j] * alpha* M.elements[j][i];
				}	
			resM.elements[k][i]=sum;
		}}
			return resM;
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
	
public static void main (String [] abs) {
	
	Matrix M1 = new Matrix (5,5);
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j<5; j++) {
		M1.elements[i][j]=2; 
	}}
	M1.print("M");
	double [] [] d = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
	Matrix M2 = new Matrix (d) ;
	Matrix M3 = new Matrix (3,3);
	M3=M3.copyMatrix(M2);
	System.out.println("Broj redova matrice je " + M2.getM());
	System.out.println("Broj kolona matrice je " + M2.getN());
	M2.print("M2");
	
	
	M3=M2.transpose();
	M3.print("M2 transpose");
	M3.setRow(1,5.0);
	M3.print("M2 transpoed with row 1 set to 5" );
	System.out.print("The max norm of the matrix is" + M2.maxNorm());
	Matrix M4=M2.add(2, M3);
	M4.print("M4");
	Vector v = new Vector (1,3,4,5);
	Vector M5=M2.multiply(v);
	v.print("Vector v is");
	M5.print("Vector M5");
	Matrix M6 = M2.multiply(1,M3);
	M6.print("M6");
}
}

