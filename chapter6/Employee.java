package chapter6;

public abstract class Employee {
	
	private String name;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public abstract void doWork();
	
	
}
