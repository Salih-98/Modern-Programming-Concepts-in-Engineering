package ExamPreparation;

public class LinkedList {

	private int size;
	private NodeLL head;
	
	public LinkedList() {this.size=0; this.head=new NodeLL(null,null);}
	
	public void insert (String data) {
		size = size +1;
		NodeLL oh = head;
		head = new NodeLL (data, oh);
		
	}
	
	public void print() {
		head.print();
	}
	public static void main (String [] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insert("Glass");
		linkedList.insert("Stone");
		linkedList.insert("Wood");
		linkedList.insert("Steel");
		linkedList.print();
	}
}
