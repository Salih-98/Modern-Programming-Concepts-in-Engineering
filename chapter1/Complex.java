package chapter1;

public class Complex {

	private double real;
	private double imag;
	
	public Complex (double real, double imag) { //definisanje metode - constructora 
												//constructor se koristi kada je kreira objekat
		this.real=real; //odnosi se na trenutni objekat, to jeste atribute
		this.imag=imag;														}
	
	void print () {
		System.out.println("The complex number is z= " + real + " + "+ imag + "i");
	}
	
	public Complex add (Complex z) {
		
		double r = this.real + z.real;
		double i= this.imag + z.imag;
		
		Complex result= new Complex(r,i);
		return result;
	}
	
	public Complex sub(Complex p) {
		double r = this.real - p.real;
		double i = this.imag - p.imag;
		Complex resultS=new Complex (r,i);
	
		return resultS;
	}
	
	public double abs () {
		double resultA;
		return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
	}
	
	public Complex multiply (Complex z) {
		double r = this.real*z.real-this.imag*z.imag;
		double i = this.real*z.imag + this.imag*z.real;
		Complex res = new Complex (r,i);
		return res;
	}
	
	public Complex division (Complex z) {
		double r = ((this.real*z.real) + (this.imag*z.imag))/(Math.pow(z.real,2)+Math.pow(z.imag,2));
		double i = ((z.real*this.imag -  this.real*z.imag))/(Math.pow(z.real,2)+Math.pow(z.imag,2));
		Complex result = new Complex (r,i);
		return result;
	}
	public static void main (String [] args) {
	//Definisanje i ispis kompleksnog broja
	Complex z1 = new Complex (3,4);
	z1.print();
	
	//sabiranje
	Complex z2= new Complex (3,4); 
	Complex z3 = z1.add(z2);//this se odnosi na z1, parametri su z2
	z3.print();
	
	//oduzimanje 
	Complex z4 = z1.sub(z2);
	z4.print();
	
	//Apsolutna vrijednost
		System.out.println("Apsoultna vrijednost z1 je:" + z1.abs());
		
	//Mnozenje
	Complex z5 = z1.multiply(z2);
	z5.print();
	
	//Dijeljejne
	Complex z6 = z1.division(z2);
	z6.print();
	
	//Izraz 1
	
	Complex z7 = new Complex (3,4);
	Complex res1= z7.multiply(z7);
	System.out.println( "Rezultat prvog izraza je");
	res1.print();
	
	//Izraz 2
	Complex z8 = new Complex (3,4);
	Complex res2= z8.multiply(z8);
	Complex res3=res2.multiply(z8);
	Complex res4=res3.multiply(z8);
	Complex res5=res4.multiply(z8);
	
	System.out.println( "Rezultat drugog izraza je");
	res5.print();
	
	//izraz 3
	Complex z9= new Complex (6,0);
	Complex z10= new Complex (4,-1);
	Complex res6 = z9.sub(z10); 
	System.out.println( "Rezultat treceg izraza je");
	res6.print();
	
	//izraz 4
	
	Complex z11 = new Complex (25,0);
	Complex z12 = new Complex (3,5);
	Complex z13 = new Complex (3,-4);
	Complex z14 = new Complex (11,0);
	Complex z15= new Complex (27,0);
	
	Complex res7 = (((z11.multiply(z12)).division(z13)).add(z14));
	Complex res8 = res7.division(z15);
	Complex res9 = res8.multiply(res8);
	System.out.println( "Rezultat cetvrtog izraza je");
	res9.print();
	
	
	}
}
