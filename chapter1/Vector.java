package chapter1;

public class Vector {

	private double [] elements;
	
	public Vector ( int n) {
		this.elements = new double [n]; // Kazemo ovi elementi su niz //inicijaliziraju se na nula po defaultu}
		}
	
	public Vector (double ... x) {
		this.elements=x;
	}
	
	public double get (int idx) {
		return this.elements [idx];
	}
	
	void set(int idx, double v) {
		this.elements [idx] = v;
	}
	
	public int getN ( ) {
		return this.elements.length;
	}
	
	public double oneNorm () {
		double sum=0;
		for (int i=0; i<this.getN(); i++) {
			sum = sum + Math.abs(this.elements [i]);
		} return sum;
	}
	
	public double maxNorm () {
		double max = Math.abs(this.elements[0]);
		for (int i=0; i<this.getN(); i++) {
			if (Math.abs (this.elements[i]) > max) {
				max = this.elements [i];
			}
			
		}
		return max;
	}
	public Vector add(double alpha, Vector v) {
		int n = this.getN();
		double [] x = new double [n];
		for (int i=0; i<this.getN(); i++) {
			x [i] = this.elements [i] + v.elements[i]*alpha;
		}
	Vector res = new Vector (x);
	return res;
	}
	
	public Vector multiply (double alpha) {
		int n= this.getN();
		double [] x = new double [n];
		
		for (int i=0; i<n; i++) {
			x [i] = this.elements [i] * alpha;
		}
		Vector res = new Vector (x);
		return res;
	}
	
	public void fill (double v) {
		for (int i=0; i< this.getN();i++) {
			this.elements[i] = v;
		}
	}	
	public double scalar (Vector y) {
		double s=0;
		for (int i=0; i<this.getN();i++) {
			s = s + this.get(i)*y.get(i);
		}
		return s;
		}
		
	public double twoNorm() {
		return Math.sqrt(this.scalar(this));
	}
	
	void print(String s) {
		System.out.print(s + "= (");
		for (int i=0; i<this.getN();i++) {
			if (i<(this.getN()-1) && i!=(this.getN()-2)) {
				System.out.print(this.elements[i] + ",");
			} else if  (i<(this.getN()-1) && i==(this.getN()-2)) {
				System.out.print(this.elements[i]);
			} else {
				System.out.print(","+this.elements[i]+")^T");}
			}  
			
		}
	
	
	public static void main (String [] args) {
	
		Vector v1 = new Vector (1.1,2.0,3.0,4.0,5.0,9.0,13); 
		int k=v1.getN();
		System.out.println("The length of the vector is "+ k);
		System.out.println ("The oneNorm of the vector is :" + v1.oneNorm());
		System.out.println ("The max norm of the vector is :" + v1.maxNorm());
		v1.print("x");
		Vector v2 = new Vector (1,2,3,4,5,6,7);
		double alpha = 1.5;
		Vector v3=v1.add(alpha, v2);
		System.out.println("\n"+"The result of addition method is " + v3);
	}
}

