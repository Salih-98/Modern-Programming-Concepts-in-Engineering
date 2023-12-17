package Lecture10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AListener implements ActionListener{

	public void actionPerformed (ActionEvent e) { //method actionPerfomed is contained in the ActionListener interface
		System.out.println("Button A is clicked...");
	}
}
