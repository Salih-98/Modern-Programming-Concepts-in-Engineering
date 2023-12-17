package ExamPreparation;

public abstract class SetOfPoints {

	private double x;
	private double y;
	
	
	public abstract boolean contains (double px, double py) ;
	
	public static void main (String[] args) {
		CircleSOP c = new CircleSOP (2,3,3);
		
		RectangleSOP r = new RectangleSOP(2,2,2,2);
		SetOfPoints s1=c;
		SetOfPoints s2=r;
		System.out.println("Point (px,py) is in the set of points s2 " + s1.contains(2.5,3.5));
		System.out.println("Point (px,py) is in the set of points s2 " + s2.contains(2, 2));
		
	}
	}
