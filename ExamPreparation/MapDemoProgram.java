package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoProgram {
 
	public static void main(String[] args) {
	Map <Character, Integer> hm = new HashMap <Character, Integer> ();
	hm.put('a',99);
	hm.put('b', 11);
	hm.put('c', 6);
	hm.put('d', 85);
	
	for (char key:hm.keySet()) {
		System.out.print(key + "----->" + hm.get(key) + "\n");
	}
	
	

		Map <Character, Integer> tm = new TreeMap <Character, Integer> ();
		tm.put('a',99);
		tm.put('b', 11);
		tm.put('c', 6);
		tm.put('d', 85);
		
		for (char key:tm.keySet()) {
			System.out.print(key + "----->" + tm.get(key)+ "\n");
		
		}
	}
	
}
