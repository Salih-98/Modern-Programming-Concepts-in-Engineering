package ExamPreparation;

import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class Polygon {
	
	private NodePoint head;
	
	public Polygon () {
		this.head = new NodePoint(null,null);	
	}
	
	public void addLast(Point p) {
		NodePoint node = head;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		node.setNext(new NodePoint(null, p));
	}
	
	public void draw(Viewer v) {
		Polyline polyline = new Polyline();
		NodePoint node = head;
		while (node.getNext() != null) {
			node = node.getNext();
			polyline.addVertex(node.getElement().getX(), 
					node.getElement().gety() ,0, 0);
		}
		
		if (head.getNext() != null) {
			polyline.addVertex(head.getNext().getElement().getX(), 
					head.getNext().getElement().gety(), 0, 0);		
		}
		polyline.setColor("black");
		v.addObject3D(polyline);
	}
	
	public NodePoint findNode (Point x) {
		NodePoint node = this.head;
		while (node!= null) {
			if (node.getElement()==x) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	public void insertAfter (Point x, Point y) {
		NodePoint node = findNode(y);
		if (node!=null) {
			NodePoint newNode = new NodePoint (node.getNext(),x);
			node.setNext(newNode);
		} else {return;}
	}
	
	public double getLength() {
		double l=0.0;
		NodePoint node = head.getNext();
		while (node!=null && node.getNext()!= null) {
			l = l + node.getElement().distance(node.getNext().getElement());
		}
		
		l = l+ node.getElement().distance(head.getNext().getElement());
		return l;
	}
	
}
