package chapter1;

import java.lang.Double;
import java.util.Stack;

public class PostfixCalculator {

	private  Stack <Double> numbers;
	
	public PostfixCalculator () {
		Stack <Double> numbers = new Stack <Double> ();
		this.numbers=numbers;
	}
	
	public void push (double x) {
		this.numbers.push(x);
	}
	
	public void performOperation (char s) {
		if (s=='+'){
			double element1 = this.numbers.pop() + this.numbers.pop();
			this.numbers.push(element1);
		} else if (s=='-') {
			double element1 = this.numbers.pop() - this.numbers.pop();
			this.numbers.push(element1);
		} else if (s=='/') {
			double element1 = this.numbers.pop()/this.numbers.pop();
			this.numbers.push(element1);
		} else if (s=='*') {
			double element1 = this.numbers.pop()*this.numbers.pop();
			this.numbers.push(element1);
		}
	}
	
	public double getResult () {
		return this.numbers.lastElement();
	}
	
	void print ( ) {
		System.out.println("The result of the calculation is " + this.getResult());
	}
	
	public static void main (String [] args) {
	
	PostfixCalculator pfc = new PostfixCalculator ();
	
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
