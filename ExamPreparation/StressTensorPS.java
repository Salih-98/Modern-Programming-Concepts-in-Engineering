package ExamPreparation;

public class StressTensorPS {

	private double sigma11;
	private double sigma22;
	private double sigma12;
	
	public StressTensorPS(double sigma11, double sigma12, double sigma22) {
		this.sigma11=sigma11;
		this.sigma12=sigma12;
		this.sigma22=sigma22;
	}
	
	public StressTensorPS add(StressTensorPS s) {
		return new StressTensorPS(this.sigma11+s.sigma11, this.sigma12+s.sigma12, this.sigma22+s.sigma22);
	}
	
	public StressTensorPS scale (double alpha) {
		return new StressTensorPS(this.sigma11*alpha, this.sigma12*alpha, this.sigma22*alpha);
	}
	
	public double invariantOne() {
		return sigma11+sigma22;
	}
	
	public double invariantTwo() {
		return sigma11*sigma22 - sigma12*sigma12;}
	
	public void print() {
		double [] [] sigma = new double [3][3];
		
		for (int i =0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if (i==0 && j==0) {
					sigma [i][j] = sigma11;
				} else if (i==0 && j==1) {
					sigma[i][j]=sigma12;
				} else if (i==1 && j==1) {
					sigma[i][j]=sigma22;
				} else {
					sigma[i][j]=0;
				}
			}
		}
		
		System.out.println("Stress tensor: ");
		
		for (int i=0; i<3;i++) {
			for (int j=0; j<3; j++) {
			if (j==0) { System.out.print("|	" + sigma[i][j]+",		");
			} else if (j==2) {
				System.out.print(sigma[i][j]+"    |" + "\n");
			} else {
				System.out.print(sigma[i][j]+",    ");
			}
		}}
	
		}
	
	public static void main(String [] args) {
		StressTensorPS st = new StressTensorPS (1,2,3);
		st.print();
		
		StressTensorPS st1 = st.add(new StressTensorPS(4,3,2));
		st1.print();
		
		StressTensorPS st2 = st.scale(3);
		st2.print();
		
		System.out.println("Invariant one of tensor st2 is " + st2.invariantOne());
		
		System.out.println("Invariant two of tensor st2 is " + st2.invariantTwo());
	}
}
