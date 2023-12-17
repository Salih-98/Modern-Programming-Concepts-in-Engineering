package ExamPreparation;

public class Programmer extends Employee{

	private String language;
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage (String language) {
		this.language=language;
	}
	
	public void doWork() {
		System.out.println("Programs in " + this.getLanguage());
		System.out.println("Drinks a cup of coffee." + "\n");
	}
}
