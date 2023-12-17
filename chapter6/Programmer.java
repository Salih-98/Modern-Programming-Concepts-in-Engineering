package chapter6;

public class Programmer extends Employee {
	
	private String language;
	
	public void setLanguage (String language) {
		this.language=language;
	}
	
	public String getLanguage () {
		return language;
	}
	
	public void doWork() {
		System.out.println("Programs in " + language + ".");
		System.out.println("Drinks a cup of coffee.");}
	}

