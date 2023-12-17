package chapter1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoProgram {

	public static void main(String[] args) {
		Set<Double> l1 = new HashSet<Double>();
		Set<String> l2 = new TreeSet<String>();

		l1.add(1.0);
		l1.add(Math.PI);
		l1.add(1.0);
		l2.add("Beethoven");
		l2.add("Strawinsky");
		l2.add("Bach");
		l2.add("Beethoven");

		System.out.print("  Numbers: ");
		for (double d : l1) {
			System.out.print(d + " ");
		}
		System.out.print("\nComposers: ");
		for (String s : l2) {
			System.out.print(s + " ");
		}
	}
}
