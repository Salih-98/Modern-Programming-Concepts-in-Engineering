package chapter1;

import java.util.HashMap;
import java.util.Map;

public class MapDemoProgram {

	public static void main(String[] args) throws Exception {
		Map<Character,Integer> cm = new HashMap<Character,Integer>();
		cm.put('a', 99);
		cm.put('b', 1);
		cm.put('c', 6);
		cm.put('d', 85);

		for (char key : cm.keySet()) {
			System.out.print(key + "->" + cm.get(key) + " ");
		}
	}
}