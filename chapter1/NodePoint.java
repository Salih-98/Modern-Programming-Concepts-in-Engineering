package chapter1;

public class NodePoint {

	private NodePoint next;
	private double value;

	public NodePoint(NodePoint next, double value) {
		this.value = value;
		this.next = next;
	}

	public NodePoint getNext() {
		return this.next;
	}

	public double getValue() {
		return this.value;
	}

	public void setNext(NodePoint next) {
		this.next = next;
	}

}
