
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class Main {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());//zeyda mais haka ken t7b trod layout flow
		
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
		
	}
}