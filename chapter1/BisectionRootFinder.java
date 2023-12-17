package chapter1;
import inf.math.UserFunction;

public class BisectionRootFinder {
	
	private double a;
	private double b;
	private UserFunction f ;
	private static final double EPS=1e-10;
	
	public BisectionRootFinder (double a, double b, UserFunction f) {
		this.a = a;
		this.b = b;
		this.f = f;
	}
	
	public double bisection ( ) {
		int n=1;
		double a = this.a;
		double b = this.b;
		double c = (a + b)/2;;
		double fc;
		double fa;
		while (n<=1000000) {
		c = (a + b)/2;
		fc = f.valueAt(c);
		fa = f.valueAt(a);
		
		if (fc==0 || (b-a)/2<EPS) {
			return c;
		} else { 
			if (  Math.signum(fc) == Math.signum(fa)) {
				a=c;
			} else {	b=c; }
			n++;
		}} 
		return 0;
}
	
	public double bisection2 ( ) {
		int n=1;
		int n_final= (int) Math.ceil(Math.log((b-a)/EPS)/Math.log(2));
		double a = this.a;
		double b = this.b;
		double c = (a + b)/2;;
		double fc;
		double fa;
		while (n<=n_final) {
		c = (a + b)/2;
		fc = f.valueAt(c);
		fa = f.valueAt(a);
		
		if (fc==0 || (b-a)/2<EPS) {
			return c;
		} else { 
			if (  Math.signum(fc) == Math.signum(fa)) {
				a=c;
			} else {	b=c; }
			n++;
		}} 
		return 0;
}
	
	public static void main (String [] args) throws Exception {
		
		UserFunction f = new UserFunction("x*x-2", "x");
		double a=-2;
		double b=2;
		double result;
		double result2;
		
		BisectionRootFinder br = new BisectionRootFinder (a,b,f);
		result = br.bisection();
		System.out.print("The root is:" + result+ "\n");
		double k=Math.sqrt(2);
		System.out.print("The root with Math.sqrt function is:" + k + "\n");
		
		double difference = Math.abs(Math.abs(result) - Math.abs(k));
		double accuracy = EPS - difference;
		System.out.println("Difference between the value of functions at two calculated roots is :" + difference);
		System.out.println("The value of epsilon is :" + EPS);
		double accuracyPercent = accuracy/EPS*100;
		System.out.println("Difference between the epsilon values is :" + accuracy + "\n");
		System.out.println("Accuracy of the computed solution with respect to EPS is" + accuracyPercent + "%");
		
		result2 = br.bisection2();
		System.out.print("The root is:" + result2 + "\n");
		double k2=Math.sqrt(2);
		System.out.print("The root with Math.sqrt function is:" + k2 + "\n");
		
		double difference2 = Math.abs(Math.abs(result2) - Math.abs(k2));
		double accuracy2 = EPS - difference2;
		double accuracyPercent2 = accuracy2/EPS*100;
		System.out.println("Difference between the value of functions at two calculated roots is :" + difference2);
		System.out.println("The value of epsilon is :" + EPS);
		System.out.println("Difference between the epsilon values is :" + accuracy2 + "\n");
		System.out.println("Accuracy of the computed solution with respect to EPS is" + accuracyPercent2 + "%");
		
		double c=0;
		double d = Math.PI;
		UserFunction f1 = new UserFunction ("tan(x/4)-1 ", "x");
		BisectionRootFinder br1 = new BisectionRootFinder (c,d,f1);
		double res3 = br1.bisection2();
		System.out.println("Calculated PI is " + res3);
		System.out.println("Value of PI by Math.PI is " + Math.PI);
		
		double l=0;
		double m=3*Math.PI/2;
		UserFunction f3 = new UserFunction("E - 0.093*sin(E)-(270.0/180.0)*PI", "E");
		BisectionRootFinder br2 = new BisectionRootFinder (l,m,f3);
		double res4 = br2.bisection2();
		System.out.println("Calculated E is " + res4/Math.PI*180);
	}
	
}
