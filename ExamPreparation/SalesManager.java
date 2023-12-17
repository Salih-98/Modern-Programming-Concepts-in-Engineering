package ExamPreparation;

public class SalesManager extends Employee{

	private int clients;
	
	
	public void setClient(int clients) {
		this.clients=clients;
	}
	
	public int getClients() {
		return this.clients;
	}
	
	public void doWork() {
		System.out.println("Makes a phone call to one of his " + " clients.");
		System.out.println("Checks the sales of last month." + "\n");
	}
}
