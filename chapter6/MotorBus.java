package chapter6;

public class MotorBus implements MotorVehicle, PublicTransport {

	public int getCapacity () { return 30;}
	
	public double getEnginePower () { return 154.2;};
	
	public void printCapacity (PublicTransport p) {
		System.out.println(p.getCapacity());
	}
	
	public void printEnginePower (MotorVehicle m) {
		System.out.println(m.getEnginePower());
	}
	
	public static void main (String [] args) {
		
		MotorBus mb = new MotorBus ();
		mb.printCapacity(mb);
		mb.printEnginePower(mb);
		
		
	}
}
