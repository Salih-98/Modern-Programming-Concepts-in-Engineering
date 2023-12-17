package Lecture10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventsDemo extends JFrame implements ActionListener{
	
	private JButton aButton = new JButton ("Button A");
	private JButton bButton = new JButton ("Button B");
	
	public EventsDemo () {
		setLayout(new FlowLayout());
	//	add(createButtonA());
		//add(createButtonB());
	this.aButton.addActionListener(this);
	this.bButton.addActionListener(this);
	
	add(this.aButton);
	add(this.bButton);
	pack();
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == this.aButton) {
			System.out.println("Button A clicked..."); }
			else if (e.getSource()==this.bButton) {
				System.out.println("Button B clicked");
			}
		}
	
	
	//private JButton createButtonA() {
		//JButton b = new JButton ("Button A");
		//b.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
			//	System.out.println("Button A clicked...");
			//}
	//	}); //Klasa je kreirana unutar ove klase, anonimna jer je dostupna samo ovdje
	//	return b;
		
	//}
	
	//private JButton createButtonB() {
	//	JButton b = new JButton ("Button B");
	//	return b;
	//}
	
	public static void main (String [] args) {
		new EventsDemo().setVisible(true); 
	}
}
