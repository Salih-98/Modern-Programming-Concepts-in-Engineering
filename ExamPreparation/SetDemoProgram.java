package ExamPreparation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoProgram {
 
	public static void main (String [] args) {
	Set <Double> s1 = new HashSet <Double> ();
	Set <String> s2 = new TreeSet <String> ();
	
	s1.add(1.0);
	
	s1.add(1.0);
	s1.add(Math.PI);
	
	s2.add("Beethoven");
	s2.add("Strawinsky");
	s2.add("Bach");
	s2.add("Beethoven");
	
	System.out.print("Numbers : ");
	for (double d:s1) {
		System.out.print(d + " ");
	}
	
	System.out.print ("Names :");
	for (String s:s2) {
		System.out.print(s + " ");
	}
	}
}
