package Lecture10;
import java.awt.FlowLayout;
import javax.swing.*;

public class ComponentsDemo extends JFrame {

	public ComponentsDemo() {setLayout (new FlowLayout ());
	add(createButtons());
	add(createCheckBoxes());
	setSize(950,440);
	}
	
	private JPanel createButtons() {
		JPanel p = new JPanel();

		
		p.setBorder(BorderFactory.createTitledBorder("JButton"));
		p.add(new JButton ("Button A"));
		p.add(new JButton("Button B"));
		return p;
	}
	
	private JPanel createCheckBoxes() {
		JPanel p = new JPanel ();
		JCheckBox cbA = new JCheckBox ("Check box A");
		JCheckBox cbB = new JCheckBox ("Check box B", true);
		
		p.setBorder(BorderFactory.createTitledBorder("JCheckBox"));
		p.add(cbA);
		p.add(cbB);
		return p;
		
	}
}
