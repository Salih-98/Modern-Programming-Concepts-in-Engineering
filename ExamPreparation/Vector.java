package ExamPreparation;

public class Vector {

	private double [] elements;
	
	public Vector (int n) {
		this.elements = new double [n];
	}
	
	public Vector (double ... x) { //if we put "....x" in the constructor it means that it can have different number of parameter
		this.elements=x;
	}
	
	public double get(int idx) {
		return this.elements[idx];
	}
	
	public void set(int idx, double v) {
		this.elements[idx]=v;
	}
	
	public int getN () {
		return this.elements.length;
	}
	
	public void print(String I) {
		for (int i=0; i<this.elements.length; i++) {
		if (i==0) {
		System.out.print(I + " = (" + this.elements[i]+ ", ");
		} else if (i>0 && i<this.getN()-1) {
			System.out.print(this.elements[i] + ", " );
		} else {
			System.out.print(this.elements[i] + ")^T" + "\n");
		}
		}
	}
	
	public double scalar (Vector v) throws IllegalArgumentException {
		double s=0;
		
		if (this.getN()!= v.getN()) {throw new  IllegalArgumentException ("Vectors have to be the same size.");}
		for (int i=0; i<this.getN(); i++) {
			s = s + this.elements[i] * v.elements[i];
		}
		return s;	}
	
	public double twoNorm () {
		return Math.sqrt(this.scalar(this));
	}
	
	public Vector multiply (double alpha) {
		Vector res = new Vector (this.getN());
		for (int i=0; i<this.getN(); i++) {
			res.elements[i] = this.elements[i] * alpha;
		}
		return res;
	}
	
	public Vector add(double alpha, Vector y) {
		Vector res = new Vector (this.getN());
		for (int i=0; i<this.getN(); i++) {
			res.set(i, this.get(i) + alpha*y.get(i));
		}
		return res;
	}
	
	public double oneNorm () {
		double om = 0;
		for (int i=0; i<this.getN(); i++) {
			om = om + Math.abs(this.elements[i]);
	} return om;
	}
	
	public double maxNorm() {
		double max = this.elements[0];
		for (int i=0; i<this.getN(); i++) {
			if (this.elements[i] > max) {
				max = this.elements[i];
			}
		} return max;
	}
	
	public void fill (double v) {
		for (int i=0; i<this.getN(); i++) { this.elements[i] = v;}
	}
}
