package ExamPreparation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {

	public static void main(String [] args) {
		Programmer p1 = new Programmer();
		p1.setName("Valery Miller");
		p1.setLanguage("FORTRAN");
		
		SalesManager sm1 = new SalesManager ();
		sm1.setName("John Wood");
		sm1.setClient(16);
		
		//the programmer
		System.out.println(p1.getName()+ " is working: ");
		p1.doWork();
		
		//The sales manager
		System.out.println(sm1.getName() + " is working: ");
		sm1.doWork();
		
		//Using the base class
		Employee e1=p1;
		System.out.println("The employe is:");
		System.out.println(e1.getName());
		
		List <Employee> employees = new ArrayList <Employee> ();
 		employees.add(p1);
 		employees.add(sm1);
 		
 		for (Employee e: employees) {
 			System.out.println(e.getName() + " is working:");
 			e.doWork();
 			System.out.println();
 		}
		
	}
}
