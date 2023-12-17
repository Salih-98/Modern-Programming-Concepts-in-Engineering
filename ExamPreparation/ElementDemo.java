package ExamPreparation;

public class ElementDemo {

	public static void main (String [] args) {
		NodeA n1 = new NodeA (1);
		NodeA n2 = new NodeA (2);
		NodeA n3 = new NodeA (3);
		
		Element e1 = new Element (10, n1, n2);
		Element e2 = new Element (11, n1, n3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(e1);
		System.out.println(e2);
 	}
}
