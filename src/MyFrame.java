
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {
	

	JRadioButton pizza ;
	JRadioButton burger ;
	JRadioButton donuts ;
	
		
	MyFrame(){
		pizza = new JRadioButton("pizza");
		burger = new JRadioButton("burger");
		donuts = new JRadioButton("donut");
		
		// IMPORTANT
		pizza.addActionListener(this);
		burger.addActionListener(this);
		donuts.addActionListener(this);
		
		// ICONS
		ImageIcon pizzaIcon = new ImageIcon("pizza.png");
		ImageIcon donutIcon = new ImageIcon("donut.jpg");
		ImageIcon burgetIcon = new ImageIcon("burger.png");
		
		// SET ICONS
		pizza.setIcon(pizzaIcon);
		donuts.setIcon(donutIcon);
		pizza.setIcon(burgetIcon);
		
		// GROUP
		ButtonGroup group = new ButtonGroup();
		group.add(pizza);
		group.add(burger);
		group.add(donuts);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(pizza);
		this.add(burger);
		this.add(donuts);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pizza) {
			System.out.println("you ordered pizza");
		}
		if(e.getSource() == burger) {
			System.out.println("you ordered burger");
		}
		if(e.getSource() == donuts) {
			System.out.println("you ordered donuts");
		}
	}
	
		}
