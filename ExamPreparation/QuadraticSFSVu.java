package ExamPreparation;

public class QuadraticSFSVu extends ShapeFunctionVu {

	private static int n=3;
	
	public QuadraticSFSVu() {super.n=n;}
	
	public double [] evaluate (double xi) {
		double [] N = new double [n];
		N[0] = 0.5*(1-xi)*xi;
		N[1]=1-xi*xi;
		N[2]=0.5*(1+xi)*xi;
		return N;
	}
}
