package chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemoProgram {

	public static void main(String[] args) {
		List<Double> l1 = new ArrayList<Double>();
		List<String> l2 = new LinkedList<String>();

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

