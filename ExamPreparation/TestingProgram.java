package ExamPreparation;

public class TestingProgram {

	public static void main (String [] args) {
		
	double lambda = 0;
	double lambdaOld = 1e15;
	//simulate a input of vector x;
	double [] x = new double [2];
	int n = x.length;
	for (int i =0; i<n; i++) {x[i]=1;}
	
	double [] y= new double [n];
	double [] [] M = new double [2][2];
	Matrix a = new Matrix (2,2, 1,2,3,4) ;
	a.print("M");
	M = a.elements;
	
	while (Math.abs(lambda - lambdaOld) > 1e-15) {
		double s1 = 0.0;
		
		for (int i=0; i<n;i++) {
			s1= s1 + Math.pow(x[i], 2);
			System.out.println("s1 "+s1);
		}
		
		double s = Math.sqrt(s1);
		
		for (int i=0; i<n;i++) {y[i]=x[i]/s;
		System.out.println("y[i] " + y[i]);}
		
		for (int i=0; i<n; i++) {
			double s2=0;
			
			for (int j=0; j<n; j++) {
				s2 = s2 + M[i][j]*y[j];
			}
			
			x[i]=s2;
		}
		
		lambdaOld=lambda;
		lambda=0;
		
		for (int i=0; i<n; i++) { lambda = x[i]*y[i] + lambda;}
		System.out.println("Lambda - LambdaOld " + (lambda-lambdaOld));
	}
	x=y;
	System.out.println("Eigenvalue is " + lambda);
	
}}
