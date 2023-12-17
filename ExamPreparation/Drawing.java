package ExamPreparation;

import java.util.List;
import inf.v3d.view.Viewer;
public class Drawing {

	private List <Shape> shape;
	
	public void addShape (Shape s) {
		this.shape.add(s);
	}
	
	public void draw(Viewer v) {
		for (Shape s:this.shape) { //goes every shape in the list
			s.draw(v);
		}
	}
}
