package ExamPreparation;

import java.util.HashSet;
import java.util.Set;

public class NodeA {

	private int id;
	private Set <Element> elements = new HashSet <Element>();
	
	public NodeA (int id) {
		this.id=id;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public void addElement(Element e) {
		this.elements.add(e);
	}
	
	public String toString() {
		String s = "Node " + this.id + ". Elements: ";
		
		for (Element e: this.elements) {
			s = s + e.getId() + ",";
		}
		return s.substring(0, s.length()-2);
	}
}
