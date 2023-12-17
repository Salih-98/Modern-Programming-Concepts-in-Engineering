package ExamPreparation;

public class TestFct extends Function {
public double eval(double x, double y) {
	return Math.sin(x);
}

public double integrate(Function f, int n, double xa, double xb, double ya, double yb) {
	double deltaX=(xb-xa)/n;
	double deltaY=(yb-ya)/n;


	double s=0;
	
	for (int i = 0; i<n; i++) {
		for(int j=0; j<n;j++) {
		s = s + this.eval(xa + (i+0.5)*deltaX, ya + (j+0.5)*deltaY)*deltaX*deltaY;
	}}
		System.out.println("S is " + s); 
	return s;

}

public static void main(String []  args) {
	TestFct f = new TestFct();
	
	System.out.println("The value is :" + f.integrate(f, 10000, 0, Math.PI, 0, Math.PI) );
}
}
