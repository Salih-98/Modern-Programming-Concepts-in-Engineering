package ExamPreparation;

import gnu.jel.CompilationException;
import inf.math.UserFunction;


public class BisectionRootFinder  {

	private static final double EPS = 1e-10;
	private double a;
	private double b;
	private UserFunction f;
	
	public BisectionRootFinder(double a, double b, UserFunction f) throws IllegalArgumentException{
		
			if (a>b) {
				throw new IllegalArgumentException("The value a is smaller than value b");
			         }
			
			//if( Math.signum(f.valueAt(a)) == Math.signum(f.valueAt(b)) ) {
			//	throw new IllegalArgumentException("Sign of the function on both end points is equal.");
			//}
			
		 this.a=a;
		 this.b=b;
		 this.f=f;
	}
	
	public double bisect() {
		int N = 1;
		int MAX_ITER=1000000;
		double a = this.a;
		double b = this.b;
		
		while (N<= MAX_ITER) {
			
			double c = (a + b) /2;
			
			double fc = f.valueAt(c);
			double fa = f.valueAt(a);
			
			if (fc == 0 || (b-a)/2<EPS) {
				return c;}
				else {
					N=N+1;
					if(Math.signum(fc) == Math.signum(fa)) {
						a=c;}
					else {
						b=c;
					}}
				}
			System.out.println("The root has not been found.");
			return Double.NaN; //If the function has no root or the root hasn't been found
                               //in the maximum number of iterations, the method will display NaN 
			}
			
	public double bisect2 () {
		int N = 1;
		int MAX_ITER= (int) Math.ceil(Math.log((b-a)/EPS)/Math.log(2));
		System.out.println("Required number of iterations is " + MAX_ITER);
		
		double a = this.a;
		double b = this.b;
		
		while (N<= MAX_ITER) {
			
			double c = (a + b) /2;
			
			double fc = f.valueAt(c);
			double fa = f.valueAt(a);
			
			if (fc == 0 || (b-a)/2<EPS) {
				return c;}
				else {
					N=N+1;
					if(Math.signum(fc) == Math.signum(fa)) {
						a=c;}
					else {
						b=c;
					}}
				}
			System.out.println("The root has not been found.");
			return Double.NaN; //If the function has no root or the root hasn't been found
                               //in the maximum number of iterations, the method will display NaN 
	}
	public static void main (String [] args) throws CompilationException {
		UserFunction f= new UserFunction ("pow(x,2)-2","x");
		BisectionRootFinder br = new BisectionRootFinder(1,2, f);
		System.out.println("The result obtained by using the bisect() methos is "+br.bisect2());
		System.out.println("The result obtained by using the sqrt method is " + Math.sqrt(2));
		
		double difference = Math.abs(Math.abs(br.bisect2()) - Math.abs(Math.sqrt(2)));
		double accuracy = EPS - difference;
		System.out.println("Difference between the value of functions at two calculated roots is : " + difference);
		System.out.println("The value of epsilon is : " + EPS);
		double accuracyPercent = accuracy/EPS*100;
		System.out.println("Difference between the epsilon values is : " + accuracy + "\n");
		System.out.println("Accuracy of the computed solution with respect to EPS is " + accuracyPercent + "%");
		
		UserFunction f1= new UserFunction ("tan(x/4)-1","x");
		BisectionRootFinder br2 = new BisectionRootFinder(-4,4, f1);
		System.out.println("The result obtained by using the bisect() methos is "+br2.bisect2());
		System.out.println("The value of PI is " + Math.PI);
		
		double difference1 = Math.abs(Math.abs(br2.bisect2())) - Math.PI;
		double accuracy1 = EPS - difference1;
		System.out.println("Difference between the value of functions at two calculated roots is : " + difference1);
		System.out.println("The value of epsilon is : " + EPS);
		double accuracyPercent1 = accuracy1/EPS*100;
		System.out.println("Difference between the epsilon values is : " + accuracy1 + "\n");
		System.out.println("Accuracy of the computed solution with respect to EPS is " + accuracyPercent1 + "%");
		
		double l=0;
		double m=3*Math.PI/2;
		UserFunction f3 = new UserFunction("E - 0.093*sin(E)-(270.0/180.0)*PI", "E");
		BisectionRootFinder br3 = new BisectionRootFinder (l,m,f3);
		double res4 = br3.bisect2();
		System.out.println("Calculated E is " + res4/Math.PI*180);
	}
		}
		
	

