package ExamPreparation;

public class NodePoint {

	private NodePoint next;
	private Point element;
	
	public NodePoint(NodePoint next, Point e ) {
		this.next=next;
		this.element=e;
	}
	
	public NodePoint getNext() { return this.next;}
	
	public Point getElement() {return this.element;}
	
	public void setNext (NodePoint next) {
		this.next=next;
	}
	
	
}
