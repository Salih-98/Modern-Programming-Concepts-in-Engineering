package chapter1;

import java.util.LinkedList;

public class Shipment {

	private LinkedList <Cont> containers = new LinkedList<Cont>();
	
	public double totalVolume() {
		double res = 0;
		
		for (Cont c : containers) {
			res = res + c.volume;
		}
		
		return res;
	}	
	
	public void addCon(Cont c) {
		containers.add(c);
	}
	
	public static void main (String [] args) {
	
	Shipment shipment = new Shipment();
	
	shipment.addCon(new StdCon(40));
	shipment.addCon(new FreezeCon(20,-20));
	shipment.addCon(new SafeCon(20,10000));
	
	System.out.println("Total volume is " + shipment.totalVolume());
	
	}
	}

