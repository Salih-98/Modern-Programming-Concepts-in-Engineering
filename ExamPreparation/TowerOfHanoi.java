package ExamPreparation;

import java.util.Stack;

import inf.v3d.obj.Cylinder;
import inf.v3d.view.Viewer;

public class TowerOfHanoi {
	

	private Stack <Integer> source;
	private Stack <Integer> temp;
	private Stack <Integer> target;
	private int n;
	
public TowerOfHanoi (int n) {
	this.n=n;
	Stack <Integer> source = new Stack <Integer> ();
	this.source = source;
	Stack <Integer> temp = new Stack <Integer> ();
	this.temp = temp;
	Stack <Integer> target = new Stack <Integer>();
	this.target=target;
	for (int i=n; i>0; i--) {
		source.push(i);
	}
}

public void start() {
	this.moveDiscs(source, temp, target , n);
	}

public void moveDiscs (Stack <Integer> source, Stack <Integer> temp, Stack <Integer> target, int n) {
	
	if (n==0) {
		return; 
	} 
	
		moveDiscs(source, target, temp, n-1);
		System.out.println("Step 1");
		target.push(source.pop());
		
		this.print();
		System.out.print("----------------");
		
		Viewer view = new Viewer();
		this.draw(view);
		
		System.out.println("Step 2");
		moveDiscs(temp, source, target, n-1);
	
}
		
public void print () {
	System.out.println("Source = " + source);
	System.out.print("Temp = " + temp);
	System.out.print("Target = " + target);
}

public void draw(Viewer v) {
	Cylinder ColSource = new Cylinder(0.0, 0.0, 0.0, 0.0, 10.0, 0.0);
	Cylinder ColTemp = new Cylinder(7.0, 0.0, 0.0, 7.0, 10.0, 0.0);
	Cylinder ColTarget = new Cylinder(14.0, 0.0, 0.0, 14.0, 10.0, 0.0);
	v.addObject3D(ColTarget);
	v.addObject3D(ColTemp);
	v.addObject3D(ColSource);
	
	Cylinder [] Disks = new Cylinder[n];
	
	 double R = 1;
	 double H = 1;
	 if (this.source.empty()==false) {
	 for (int i = 0; i < source.size(); i++) {
	 Disks[i] = new Cylinder (0.0, i*H, 0.0, 0.0, (i+1)*H, 0.0);
	 Disks[i].setRadius(R*source.get(i));
	 Disks[i].setColor("blue");
	 v.addObject3D(Disks[i]);
	 }
	 }
	
	 if (this.temp.empty()==false) {
	 for (int i = 0; i < temp.size(); i++) {
	 Disks[i] = new Cylinder (7.0, i*H, 0.0, 7.0, (i+1)*H, 0.0);
	 Disks[i].setRadius(R*temp.get(i));
	 Disks[i].setColor("green");
	 v.addObject3D(Disks[i]);
	 }
	 }
	 if (this.target.empty()==false) {
	 for (int i = 0; i < target.size(); i++) {
	 Disks[i] = new Cylinder (14.0, i*H, 0.0, 14.0, (i+1)*H, 0.0);
	 Disks[i].setRadius(R*target.get(i));
	 Disks[i].setColor("red");
	 v.addObject3D(Disks[i]);
	 }
	 }
	
	 v.setVisible(true);
}}

