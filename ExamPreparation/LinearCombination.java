package ExamPreparation;

public class LinearCombination extends ShapeFunctionSet{

	private double [] p;
	private ShapeFunctionSet s;
	
	public LinearCombination (double []m, ShapeFunctionSet k) {
		if (m.length!= k.eval(1).length) {
			throw new IllegalArgumentException("Too many coefficients.");
		}
		this.p=m;
		this.s=k;
		}
	
	public double [] eval (double eta) {
		double [] y = new double [1];
		y[0]=0;
		double [] x = this.s.eval(eta);
		
		for (int i=0; i<x.length;i++ ) {
			y[0]=y[0] + p[i]*x[i];
		} 
		return y;
	}
	}

