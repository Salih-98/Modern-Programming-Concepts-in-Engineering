package ExamPreparation;

public class QuadraticSFS extends ShapeFunctionSet{

	public double [] eval (double eta) {
		double [] x = new double [3];
		
		x[0]=0.5*(eta-1)*eta;
		x[1] = 1 - eta*eta;
		x[2]=0.5*(1+eta)*eta;
		
		return x;
	}
}
