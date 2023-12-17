package ExamPreparation;

public class TestMyMath {

	public static void main (String[] args) {
		
		MyMath mm = new MyMath();
		int r1;
		
		r1 = mm.add2(0, 1);
		
		System.out.print("mm.add2(3,48) returns " + r1 + "\n");
		
		System.out.print("Number r1 is an even number: " + mm.isEven(r1) + "\n");
		
		System.out.print("Root of the number 81 is: " + mm.sqrt(81.0)+"\n");
		
		System.out.print("Factorial of 10 is :" + mm.factorial(10)+"\n");
	}
}
