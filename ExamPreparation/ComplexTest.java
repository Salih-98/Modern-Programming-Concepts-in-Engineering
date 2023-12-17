package ExamPreparation;

public class ComplexTest {

	public static void main (String [] abs) {
		
		Complex z1 = new Complex (3,4);
		Complex z2 = new Complex (1,-1);
		Complex z3;
		System.out.println("The absolut value of the complex number z1 "  + " is " + z1.abs());
		z2.print();
		z3 = z1.add(z2);
		z3.print();
		z3=z1.sub(z2);
		z3.print();
		
		//Test case for the given examples in the script
		
		//Example 1
		Complex z4 = new Complex (3,4);
		Complex res1 = z4.mul(z4);
		res1.print();
		
		//Example 2
		Complex res2= z4.mul(z4.mul(z4.mul(z4.mul(z4))));
		res2.print();
		
		//Example 3 
		Complex z5 = new Complex(6,0);
		Complex z6 = new Complex (4,-1);
		(z5.sub(z6)).print();
		
		//Example 4
		Complex z7 = new Complex (25,0);
		Complex z8 = new Complex (3,5);
		Complex z9 = new Complex (3,-4);
		Complex z10 = new Complex (11,0);
		Complex z11 = new Complex(27,0);
		Complex res3 = z7.mul(z8);
		Complex res4 = res3.div(z9);
		Complex res5 = res4.add(z10);
		Complex res6 = res5.div(z11);
		Complex res7 = res6.mul(res6);
		res7.print();
		
	}
}
