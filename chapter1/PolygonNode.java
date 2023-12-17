package chapter1;

public class PolygonNode {

	private Point element;
	private PolygonNode next;
	
	public PolygonNode(PolygonNode next, Point e) {
		this.element = e;
		this.next = next;
	}

	public PolygonNode getNext() {
		return next;
	}

	public void setNext(PolygonNode next) {
		this.next = next;
	}

	public Point getElement() {
		return element;
	}
}
