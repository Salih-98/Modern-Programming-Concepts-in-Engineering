package chapter1;

public class LinkedListOfDoubles implements ListOfDoubles {
 
	private NodePoint head = new NodePoint (null, 0.0);
			
	public void addFirst (double x) {
		NodePoint n = new NodePoint ( this.head.getNext(),x);
		this.head.setNext(n);
	}

	public void print (String l) {
		NodePoint n= this.head.getNext();
		
		System.out.print(l + "<");
		while (n!=null) {
			System.out.print(n.getValue() + " ");
			n=n.getNext();
		}
		System.out.println(">");
	}
	
	public static void main (String [] args) {
		
		ListOfDoubles l1 = new ArrayListOfDoubles ();
		ListOfDoubles l2 = new LinkedListOfDoubles ();
		
		l1.addFirst(1.1);
		l1.addFirst(6.2);
		l1.addFirst(9.4);
		l2.addFirst(1.1);
		l2.addFirst(6.2);
		l2.addFirst(9.4);
		l1.print("l1=");
		l2.print("l2=");
	}
}
