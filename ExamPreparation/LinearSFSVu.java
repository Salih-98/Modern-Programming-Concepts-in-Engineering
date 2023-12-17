package ExamPreparation;

public class LinearSFSVu extends ShapeFunctionVu {

	private static int n=2;
	
	public LinearSFSVu() {super.n=2;}
	
	public double [] evaluate(double xi) {
		double [] N= new double [n];
		N[0] = 0.5*(1-xi);
		N[1] = 0.5*(1+xi);
		return N;
	}
}
