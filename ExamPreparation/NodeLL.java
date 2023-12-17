package ExamPreparation;

public class NodeLL {

	private String data;
	private NodeLL next;
	
	public NodeLL(String data, NodeLL next) {
		this.data=data;
		this.next=next;
	}
	
	public NodeLL getNext() {return this.next;}
	
	public void setNext(NodeLL n) {this.next=n;}
	
	public void print() {

		System.out.print("" + data + " ");
		if(this.next.data!=null) {
		this.next.print();}
		
	}
}
