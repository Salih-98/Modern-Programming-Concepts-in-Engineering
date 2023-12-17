package ExamPreparation;

public abstract class Test {

	public abstract void testSomething();
	
	public static void main(String [] args) {
		Test2 t = new Test2();
		Test t1 = t;
		
		t1.testSomething();
	}
}
