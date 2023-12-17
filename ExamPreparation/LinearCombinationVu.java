package ExamPreparation;

public class LinearCombinationVu {

	private double [] p;
	private ShapeFunctionVu N;
	
	public LinearCombinationVu(double [] p, ShapeFunctionVu N) {
		this.p=p;
		this.N=N;
	}
	
	public double evaluate (double xi) {
		double result = 0;
		double [] Nxi = N.evaluate(xi);
		
		for (int i=0; i<this.N.n;i++) {
			result += p[i]*Nxi[i];
		}
		
		return result;
	}
}
