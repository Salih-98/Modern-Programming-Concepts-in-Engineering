package ExamPreparation;

public class LinearSFS extends ShapeFunctionSet {

	public double [] eval (double eta) {
		double [] x = new double [2];
		x[0] = 0.5*(1-eta);
		x[1] = 0.5*(1+eta);
		return x;
	}
}
