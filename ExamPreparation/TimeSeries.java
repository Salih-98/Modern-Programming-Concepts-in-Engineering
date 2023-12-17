package ExamPreparation;


public class TimeSeries {
	
	private double [] data;
	private double deltaT;
	private double t0;
	
	public TimeSeries(double [] data, double t0, double deltaT) {
		this.data=data;
		this.deltaT=deltaT;
		this.t0=t0;
	}
	
	public double getDuration() {
		return getTime(this.getSize()-1) - getTime(0);
	}
	
	public double getTime(int t) {
		return this.getT0() + this.getDeltaT()*t;
	}
	
	public int getSize() {
		return this.data.length;
	}
	
	public double valueAt(int i ) {
		return this.data[i];
	} 
	
	public double getDeltaT() {
		return this.deltaT;
	}
	
	public double getT0 () { return this.t0;}
	
	public int count (double a, double b) {
		int c=0;
		
		for (int i=0; i<this.getSize(); i++) {
			if (this.valueAt(i) >= a && this.valueAt(i)<=b) {
				c=c+1;
			}
		}
		return c;
	}
	
	void print () {
		int n = this.getSize();
		System.out.println("Defined timeseries is:" );
		for ( int i=0; i<n; i++) {
			System.out.println("Element at the measurement number " + i + " has the time " + this.getTime(i) + " and it's value is " + this.valueAt(i)); }}
	
	public double valueAt (double t) {
		int fe=1;
		int pe=0;
		int n = this.getSize();
		
		//We check between which measurements does the inserted value lie
		if (t> this.getTime(n-1) || t<this.getTime(0)){ //First we check if it's inside the limits
			System.out.println("Entered value of t is out of the limits of this time series.");
			return 0;
		} 
		
		for (int i = 0; i<n-1; i++) {
			if ( t>=this.getTime(i) && t<=this.getTime(i+1) &&  i!=this.getSize()-2) {
				fe = i+1; pe = i;
				break;
				}
			else if (t>=this.getTime(i) && t<=this.getTime(i+1) &&  i==this.getSize()-2) {
				fe = this.getSize()-1;
				pe = this.getSize()-2;	
				break;}}
		
		//Printing this results for checking
		System.out.println("\n"+"Entered value is between values of time " + this.getTime(pe) + " and " + this.getTime(fe) + " , which correspond to the number of measurement " + pe + " and "
			+ fe + "\n");
		//Calculating the value of the data point at the time t according to linear interpolation formulae
		double res;	
		res = ((this.valueAt(fe)-this.valueAt(pe))*(t-this.getTime(pe)))/(this.getTime(fe)-this.getTime(pe)) + this.valueAt(pe);
		System.out.println("Calculated value is " + res);
		return res;
	}
	
	public boolean isMonotonous () {
		boolean checkAsc=false;;
		boolean checkDesc=false;
		int n = this.getSize();
		//For loop to check if our time series is ascending
		for (int i = 0; i<n-1; i++) {
			if (this.valueAt(i)>=this.valueAt(i+1)) {
				checkAsc=true;} else {
				checkAsc=false; 
				break;} }
		//For loop to check if our time series is descending
		for (int i = 0; i<n-1; i++) {
			if (this.valueAt(i)<=this.valueAt(i+1)) {
				checkDesc=true;} else {
				checkDesc=false; 
				break;} }
		//If our time series is either ascending or descending we say it is monotonous
		if (checkAsc==true || checkDesc==true) {
		System.out.println("Time series is montonous.");
		return true; }
		else {
			System.out.println("Time series is not montonous.");
			return false;}
	}
	
	
	
}
