package ExamPreparation;

public class TimeSeriesDemo {

	public static void main (String [] args ) {
		//For loop to create a time series with random values
				double [] x = new double [10];
				for (int i = 0; i<10; i++) {
					x [i] = Math.random()*10;}
				TimeSeries ts = new TimeSeries (x, 1.0, 0.5);
				
				//For loop to create an ascending time series
				double [] x1= new double [10];
				for (int i = 0; i<10; i++) {
							x1 [i] = i;}
				TimeSeries tsA= new TimeSeries (x1, 1.0, 0.5);
				
				//For loop to create a descending time series
				double [] x2= new double [10];
				for (int i = 0; i<10; i++) {
							x2 [i] = (10-i);}
				TimeSeries tsD= new TimeSeries (x2, 1.0, 0.5);
				
				//Testing our methods
				ts.print();
				ts.getDuration();
				int measurement = 4;
				double f = ts.getTime(measurement);
				System.out.println("\n"+"Value of time at the position " + measurement + " is " + f);
				ts.count(2.4, 3.8);
				ts.valueAt(3.8);
				ts.isMonotonous();
				tsA.isMonotonous();
				tsD.isMonotonous();
	}
}
