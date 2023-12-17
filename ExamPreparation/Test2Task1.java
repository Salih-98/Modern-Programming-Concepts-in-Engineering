package ExamPreparation;

public class Test2Task1 {

	public static void main (String [] args) {
		//Matrix M = new Matrix (6,6 , 3.4430, -0.3963,  2.5012,  0.9525,  0.6084, -1.2728, 
					//	-0.3963,  0.6015, -0.4108, -0.1359, -0.0295,  0.2630,
						//2.5012, -0.4108,  2.5927,  0.7072,  0.5587, -1.0613,
					//	0.9525, -0.1359,  0.7072,  1.1634,  0.1920, -0.4344,
					//	0.6084, -0.0295,  0.5587,  0.1920,  0.7636, -0.3261,
					//	-1.2728,  0.2630, -1.0613, -0.4344, -0.3261,  1.0869) ;
		
		//Vector b = new Vector (3.0685,  0.0484,  2.5783,  1.2865,  0.8671, -0.8230);
		
	Matrix M = new Matrix (3,3,0.744,-0.5055,-0.0851,-0.5055,3.4858,0.0572,-0.0851,0.0572,0.4738);
	Vector b = new Vector (-0.0043, 2.2501, 0.2798);
		int n = M.getN();
		
		double [] xOld = new double [n];
		double [] xNew = new double [n];
		
		double e=1; 
		
		while (e > 1e-7) {
			for (int i=0; i<n;i++) {
			double s1=0;
			
			for(int j=0; j<i;j++) { s1 = s1 + M.elements[i][j] * xNew [j];}
			
			double s2 =0 ; 
			
			for (int j = i+1; j<n;j++) {s2 = s2 +M.elements[i][j]*xOld[j];}
			
			xNew[i] = (b.get(i)- s1 - s2)/M.elements[i][i];}
			
			e=0;
			
			for (int i=0; i<n;i++) { 
				e = Math.max(e,Math.abs(xOld[i] - xNew[i]));
				xOld[i]=xNew[i];				
			}
			}
			
		Vector result = new Vector (xNew);
		result.print("The result xNew is");
		
			}
		
	}

