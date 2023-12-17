package ExamPreparation;

public class Statistics {

	private double [] x;
	
	public Statistics (double [] x) {
		this.x=x;
	}
	
	public double mean() {
		int n = this.x.length;
		double sum = 0;
		
		for (int i =0; i<n; i++) {
			sum = sum + x[i]/n;
		}
		
		return sum;
	}
	
	public double variance() {
		int n = this.x.length;
		double sum = 0;
		double mu = this.mean();
		
		for (int i=0; i<n; i++) {
			sum = sum + Math.pow(x[i]-mu, 2)/(n-1);
		}
		
		return sum;
	}
	
	public static void main(String [] args) {
		double [] x = {-9,-8,10, 14,16};
		
		Statistics s = new Statistics (x);
		System.out.println("Variance of number set is " + s.variance());
	}
}
