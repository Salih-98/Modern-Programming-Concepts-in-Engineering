package ExamPreparation;

public abstract class Function {

	public abstract double eval (double x, double y);
	
	public static void main(String[] args) {
			TestFct1 tf = new TestFct1();
			double [] y = tf.rungeKutta(tf, 0, 0.5, 0.05, 40);
			for(int i=0; i<y.length;i++) {
				System.out.println("y ["+i+"] = " + y[i]); 
			}
					
					
		}
	
}
