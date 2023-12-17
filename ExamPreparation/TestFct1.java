package ExamPreparation;

public class TestFct1 extends Function {

	public double eval(double x, double y) {
		return y-x*x+1;
	}
	
	public double [] rungeKutta(Function f, double x0, double y0, double h, int n) {
		double [] x = new double [n];
		double [] y = new double [n];
		
		y[0]=y0;
		x[0]=x0;
		
		for (int i=0; i<n-1;i++) {
			
			double k1 = this.eval(x[i], y[i]);
			
				
			double k2 = this.eval(x[i] + h/2, y[i]+h*k1/2);
	
			
			double k3 = this.eval(x[i]+h/2, y[i] + h*k2/2);
			
			
			double k4 = this.eval(x[i] + h, y[i] + h*k3);
			
			
			x[i+1] = x[i] + h;
			y[i+1] = y[i] + (k1+2*k2+2*k3+k4)*h/6;
			
		}
	
		return y;
	}

}
