package ExamPreparation;

import javax.help.plaf.basic.BasicFavoritesNavigatorUI.FavoritesTree;

public class QuadraticForm {

	private double a;
	private double b;
	private double c;
	
	public QuadraticForm (double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public QuadraticForm(double alpha, QuadraticForm g) {
		this.a=g.a * alpha;
		this.b=g.b * alpha;
		this.c=g.c * alpha;
	}
	
	public QuadraticForm (QuadraticForm f, QuadraticForm g) {
		this.a = f.a  + g.a;
		this.b = f.b + g.b;
		this.c=f.c + g.c;
	}
	
	public QuadraticForm (QuadraticForm f, double alpha, QuadraticForm g, double beta) {
		this.a = alpha * f.a + beta * g.a;
		this.b = alpha * f.b + beta * g.b;
		this.c = alpha * f.c + beta * g.c;
	}
}
