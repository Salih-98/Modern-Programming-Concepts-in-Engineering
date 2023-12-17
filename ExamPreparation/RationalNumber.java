package ExamPreparation;

public class RationalNumber {

	private int m;
	private int n;
	
	public RationalNumber(int m, int n) {
		this.m=m;
		this.n=n;
	}
	
	public RationalNumber add(RationalNumber rn) {
		return new RationalNumber(this.m*rn.n + this.n*rn.m, this.n*rn.n);
	}
	
	public RationalNumber multiply (RationalNumber rn) {
		return new RationalNumber(this.m*rn.m, this.n*rn.n);
	}
	
	public RationalNumber inverse() { return new RationalNumber(this.n, this.m);}
	
	public boolean isEqual(RationalNumber m) {
		return this.m*m.n==this.n*m.m;
	}
	
	public static void main(String[] args) {
		RationalNumber p = new RationalNumber(3,4);
		RationalNumber q = new RationalNumber(1,3);
		RationalNumber one = new RationalNumber(1,1);
		RationalNumber three = new RationalNumber(3,1);
		RationalNumber mone = new RationalNumber(-1,1);
		RationalNumber r = p.add(one);
		System.out.println("r = " + r.m + "/" + r.n);
		
		RationalNumber s = (three.multiply(q.inverse()).add(mone.multiply(p)));
		System.out.println("s = " + s.m + "/" + s.n);
	}
}

