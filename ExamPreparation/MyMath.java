package ExamPreparation;

public class MyMath {

	
	public int add2(int a, int b) {
		return a + b;
	}
	
	public int max (int a, int b) {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	public boolean isEven (int a) {
		if (a%2==0 || a==2) {
			return true;
		} else {
			return false;
		}
	}
	
	public double sqrt (double x) {
		double low = 0;
		double mid = 0;
		double high = x;
		
		while (high-low>1e-12) {
			mid = 0.5 * (low+high);
			if (mid*mid >x) {
				high=mid;
			} else {
				low = mid;
			}
		
		}	
		return mid;}	
	

	public int factorial (int n) {
		if (n == 1) {
			return 1;
		} else {
			return this.factorial(n-1)*n;
		}
		
	}

}