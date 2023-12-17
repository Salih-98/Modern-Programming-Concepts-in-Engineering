package chapter1;

import inf.v3d.view.*;
import inf.v3d.obj.Polyline;

public class Polygon {


		private PolygonNode head;

		public Polygon() {
			this.head = new PolygonNode(null, null);
		}

		public void addLast(Point p) {
			PolygonNode node = head;
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(new PolygonNode(null, p));
		}

		public void draw(Viewer v) {
			Polyline polyline = new Polyline();
			PolygonNode node = head;
			while (node.getNext() != null) {
				node = node.getNext();
				polyline.addVertex(node.getElement().getX(), 
						node.getElement().getY(), 0, 0);
			}
			if (head.getNext() != null) {
				polyline.addVertex(head.getNext().getElement().getX(), 
						head.getNext().getElement().getY(), 0, 0);		
			}
			polyline.setColor("black");
			v.addObject3D(polyline);
		}
	
	public PolygonNode findNode(Point x) {
		PolygonNode node = this.head;
		
		while (node!=null) {
			if (node.getElement()==x) {
				return node;
			} else {
				node=node.getNext();
			}
		}
		return null;
	}
	
	public void insertAfter (Point x, Point y) {
		PolygonNode node = findNode(y);
		
		if (node!= null) {
			PolygonNode newNode = new PolygonNode (node.getNext(),x);
			node.setNext(newNode);
		} else {
			return;
		}
		
	}
	
	public double getLength () {
		
		double l=0.0;
		PolygonNode node = head.getNext();
		
		while (node!= null && node.getNext()!=null) {
			l = l + node.getElement().distance(node.getNext().getElement());
			node = node.getNext();
		}
		l = l + node.getElement().distance(head.getNext().getElement());
		return l;
	}
	
public static void main(String[] args) {
		
		Polygon polygon = new Polygon();
		
		polygon.addLast(new Point(1.0, 0.0));
		polygon.addLast(new Point(2.0, 5.0));
		polygon.addLast(new Point(4.0, 7.0));
		polygon.addLast(new Point(8.0, 4.0));
		
		Viewer viewer = new Viewer();
		polygon.draw(viewer);
		viewer.setVisible(true);
	}
}
