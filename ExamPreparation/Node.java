package ExamPreparation;

public class Node {
	private Node next;
	private double value;

	public Node(double value, Node next) {
		this.value = value;
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	public double getValue() {
		return this.value;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
