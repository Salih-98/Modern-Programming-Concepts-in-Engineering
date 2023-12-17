package chapter6;

public class EmployeeTest {

	public static void main (String [] args) {
		
		Programmer p1 = new Programmer ();
		p1.setName("Valery Miler");
		p1.setLanguage("FORTRAN");
		
		SalesManager sm1 = new SalesManager ();
		sm1.setName("John Wood");
		sm1.setCliens(16);
		
		//programmer
		System.out.println(p1.getName()+" is working.");
		p1.doWork();
		
		//the sales manager
		System.out.println(sm1.getName() + " is working.");
		sm1.doWork();		
		
		Employee e3 = p1;
		System.out.println("Employee 3 is " + e3.getName()+ "\n");
		
		Employee [] employees = new Employee [2];
		employees[0]= p1;
		employees[1] = sm1;
		
		for (int i=0; i < employees.length; i++) {
			System.out.println(employees[i].getName() + " is working: ");
			employees[i].doWork();
			System.out.println();
			
		}
		
		
	}
}
