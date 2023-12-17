package ExamPreparation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ListDemoProgram {

	public static void main (String [] args) {
		
	List <Double> l1 = new ArrayList <Double>();
	List <String> l2 = new LinkedList <String>();
	
	l1.add(1.0);
	l1.add(Math.PI);
	l1.add(1.0);
	l2.add("Beethowen");
	l2.add("Bach");
	l2.add("Strawinsky");
	
	System.out.println(" Numbers:");
	for (double d:l1) { //for each double in the list l1
		System.out.print(d+ " ");
	}
	
	for (String s : l2) { //for each string in the list l2
		System.out.print(s + " "); 
	}
	}
}
