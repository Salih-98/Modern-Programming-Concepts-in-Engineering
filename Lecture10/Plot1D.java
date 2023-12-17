package Lecture10;

import javax.swing.*;
import inf.v3d.obj.MatrixPlot;
import inf.math.UserFunction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ptolemy.plot.Plot;

public class Plot1D extends JFrame implements ActionListener {

	private JTextField atf = new JTextField ("0");
	private JTextField btf = new JTextField ("1");
	private JTextField fctTf = new JTextField ("sin(4*Pl*x)");
	private JCheckBox showGridCb = new JCheckBox ("Show grid");
	private Plot plot = new Plot();
	private static final int NP=200;
	
	public Plot1D () {
		setTitle ("Plot 1D");
		setLayout(new BorderLayout (5,5)); //Pravimo border layout s gaps 5 i 5
		
		add(createWestPanel(), BorderLayout.WEST);
		add(this.plot, BorderLayout.CENTER);
		add(createSouthPanel(), BorderLayout.SOUTH);
		setSize(600,400);
	}
	
	private JPanel createWestPanel() {
		JPanel wp = new JPanel(new BorderLayout());
		wp.add(createSettingsPanel(), BorderLayout.NORTH);
		return wp;
	}
	
	private JPanel createSettingsPanel() {
		JPanel sp = new JPanel (new BorderLayout (5,5));
		JPanel p1 = new JPanel (new GridLayout (3,1,0,2));
		JPanel p2 = new JPanel (new GridLayout (3,1,0,2));
		
		p1.add(new JLabel("f(x) =", JLabel.RIGHT)); //Dodajemo oznake
		p1.add(new JLabel ("a = ", JLabel.RIGHT));
		p1.add(new JLabel ("b = ", JLabel.RIGHT));
		
		p2.add(this.fctTf); //ubacujemo tekst
		p2.add(this.atf);
		p2.add(this.btf);
		
		sp.setBorder(BorderFactory.createTitledBorder("Settings"));
		sp.add(p1, BorderLayout.WEST);
		sp.add(p2, BorderLayout.CENTER);
		sp.add(this.showGridCb, BorderLayout.SOUTH);
		return sp;
		
	}
	
	private JPanel createSouthPanel() {
		JPanel p = new JPanel (new FlowLayout (FlowLayout.RIGHT));
		p.add(createPlotButton());
		p.add(createExitButton());
		return p;
	}
	
	private JButton createExitButton () {
		JButton b = new JButton ("Exit");
		
		b.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				System.exit(0);
			}
		});
		return b;
	}
	
	private JButton createPlotButton() {
		JButton b = new JButton ("Plot");
		
		b.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				plot();
			}
		});
		return b;
	}
	
	private void plot () {
		try {
			double a = Double.parseDouble(this.atf.getText());
			double b = Double.parseDouble(this.btf.getText());
			double dx = (b-a)/(NP-1);
			UserFunction uf = new UserFunction (this.fctTf.getText(), "x");
			
			this.plot.clear(true);
			this.plot.setGrid(this.showGridCb.isSelected());
			
			for (int i = 0; i < NP; i++) {
				double x = a + i*dx;
				double y = uf.valueAt(x);
				
				this.plot.addPoint(0, x, y, true);
			}
			this.plot.repaint();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		}
	
	public static void main (String [] args) {
		new Plot1D().setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
