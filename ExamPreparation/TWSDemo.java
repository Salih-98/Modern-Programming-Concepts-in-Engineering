package ExamPreparation;

public class TWSDemo {

	public static void main (String [] args) {
	ThinWalledSection tws = new ThinWalledSection ();
	
	tws.addPart(new Part( new PointTWS(600.0,-200), new PointTWS(-600.0,-200.0),15));
	tws.addPart(new Part( new PointTWS(400,-200.0), new PointTWS(300.0,300.0),10));
	tws.addPart(new Part( new PointTWS(300.0,300.0), new PointTWS(-300,300.0),12.5));
	tws.addPart(new Part( new PointTWS(-300.0,300.0), new PointTWS(-400,-200.0),10));
	
	System.out.println("Area of the thin walled cross sections is :" + tws.getArea()); 
	}
}




