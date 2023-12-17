package ExamPreparation;


public class GreatestCommonDivider {

	private int p;
	private int q;
	
	public GreatestCommonDivider (int p, int q) {
		this.p=p;
		this.q=q;
	}
	
	public int getValue () {
		
	
		if (p<q) { int a = p; p = q; q = a;};
		
		int N=0;
		int r=1;
		while (r!=0 && N<100) {
		r = p%q;
		System.out.println("r " + r);
		if (r == 0) {
		return q;
		} else {
			p=q;
			q=r;
		} 
		N++;
		}
		return 1;
		}
	
	public static void main (String [] args) {
		
		GreatestCommonDivider gcd = new GreatestCommonDivider (1454,987);
		System.out.println("Greatest common divider is " + gcd.getValue());
		
	}
}
