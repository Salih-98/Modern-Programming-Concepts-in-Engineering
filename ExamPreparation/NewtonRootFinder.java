package ExamPreparation;

import inf.math.UserFunction;

public class NewtonRootFinder {
	
	private static final double DELTA = 1e-7;
	private static final double EPS = 1e-10;
	private static final int MAX_ITER = 15;
	private static final int N_PIECES=20;
	private double a;
	private double b;
	private UserFunction f;
	
	public NewtonRootFinder (double a, double b, UserFunction f) {
			this.a = a;
			this.b = b;
			this.f = f; 										 }
	
	public double findInitialGuess( ) {
		double bestX = 0; 
		double bestFx = Double.POSITIVE_INFINITY; //Highest possible value, in order that the first best guess is at the initial position
		double dx = (this.b-this.a)/N_PIECES; //Splitting the interval on N_PIECES equal intervals dx
		
		
		for (int i=0; i<=N_PIECES; i++) {
			double x = this.a + i*dx;
			double fx = this.f.valueAt(x);
			if(Math.abs(fx)<bestFx) {
				bestFx = Math.abs(fx);
				bestX = x; }}
			return bestX;	 }
	
	public double findRoot() {
		double x = this.findInitialGuess();
		double fx=this.f.valueAt(x);
		int steps=0;
		
		while (Math.abs(fx)>=EPS && steps<=MAX_ITER && x>=this.a && x<=this.b) { //check if the needed value is find, check if 
																				//maximum number of iterations is reached, and
																				//check if we are in the correct interval
			double dfx = (this.f.valueAt(x+DELTA)-fx)/DELTA; //calculate the derivative
			x = x - fx/dfx; //calculate next x
			fx = this.f.valueAt(x); // calculate the value for next x
			steps = steps +1; // increase number of steps
		}
		
		if (Math.abs(fx) < EPS) {
			return x;
		} else {
			return Double.NaN;
		}
	}
	}
	
	
	
