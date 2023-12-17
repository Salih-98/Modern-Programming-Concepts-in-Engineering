package ExamPreparation;

public class Complex {

	private double imag;
	private double real;
	
	public Complex (double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public Complex add(Complex z) {
		Complex res = new Complex(this.real+z.real, this.imag+z.imag);
		return res;
	}
	
	public Complex sub (Complex z) {
		Complex res = new Complex (this.real-z.real, this.imag-z.imag);
		return res;
	}
	
	public double abs () {
	return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
	}
	
	public void print () {
		System.out.println(this.real + " + " + this.imag +"i");
	}
	
	public Complex mul (Complex z) {
		Complex res = new Complex((this.real * z.real - this.imag*z.imag), (this.real*z.imag + z.real*this.imag));
		return res;
	}
	
	public Complex div (Complex z) {
		Complex res = new Complex ((this.real*z.real + this.imag*z.imag)/(Math.pow(z.real, 2)+Math.pow(z.imag, 2)),
				(z.real*this.imag-this.real*z.imag)/(Math.pow(z.real, 2)+Math.pow(z.imag, 2)));
		return res;
	}
	
	
}
