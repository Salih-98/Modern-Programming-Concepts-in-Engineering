package chapter6;

public class SalesManager extends Employee {

	private int clients;
	
	public void setCliens (int clients) {
		this.clients=clients;
	}
	
	public int getClients() {
		return clients;
	}
	
	public void doWork () {
		System.out.println("Makes a phone call to one of his " + clients + " clients.");
		System.out.println("Checks the sales of the last month.");
	}
}
