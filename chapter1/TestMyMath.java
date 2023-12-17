package chapter1;

public class TestMyMath {

	public static void main (String [] args)
 {
		int r1;
		MyMath mm = new MyMath ();
		r1=mm.add2(3,48);
		double maxn = mm.max(-5, -7);
		double fct = mm.factorial(17);
		System.out.println("mm.add2 (3, 48) returns: " + r1);
		System.out.println("mm.max (3,7) returns: " + maxn);
		System.out.println("mm.factorial (17) returns: " + fct);
	
		
 }}
