package ExamPreparation;

public class PostFixCalculatorDemo {

	public static void main (String [] args) {
	
	PostFixCalculator pfc = new PostFixCalculator ();
	
	pfc.push(1.0);
	pfc.push(2.0);
	pfc.performOperation('+');
	pfc.push(4.0);
	pfc.performOperation('*');
	pfc.push(3.0);
	pfc.performOperation('+');
	double k=pfc.getResult();
	System.out.println("K is " + k);
	pfc.print();
	}
}
