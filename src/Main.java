
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class Main {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
//		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		frame.setLayout(new GridLayout(3,3,10,10)); // 3 rows 3 cols and 10 gap first one horzontal and sec one is vertical
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		
		
		
		frame.setVisible(true);
		
		
		
		
		
	}
}