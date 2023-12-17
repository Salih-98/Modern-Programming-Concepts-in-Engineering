package ExamPreparation;

public class Intersection extends SetOfPoints {

	private SetOfPoints s1;
	private SetOfPoints s2;

	public Intersection(SetOfPoints s1, SetOfPoints s2 ) {
		this.s1=s1;
		this.s2=s2;
	}
	
	public boolean contains (double px, double py) {
		return s1.contains(px, py) && s2.contains(px, py);
	}
}
