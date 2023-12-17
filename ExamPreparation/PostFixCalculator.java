package ExamPreparation;

import java.util.Stack;

public class PostFixCalculator {

	private Stack <Double> numbers;
	
	public PostFixCalculator() {
		this.numbers= new Stack<Double>();
	}
	
	public void push(double x) {
		this.numbers.push(x);
	}
	
	public void performOperation (char type) {
		double a = this.numbers.pop();
		double b = this.numbers.pop();
		double c;
		if (type == '+') {
			c = a+b;
			this.push(c);
		}
		
		if (type == '-') {
			c=a-b;
			this.push(c);
		}
		
		if (type == '*') {
			c=a*b;
			this.push(c);
		}
		
		if (type == '/') {
			c=a/b;
			this.push(c);
		}
	}
	
	public double getResult() {
		return this.numbers.lastElement();
	}
	
	void print ( ) {
		System.out.println("The result of the calculation is " + this.getResult());
	}
	
	
}
