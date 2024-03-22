
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Main {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10)); // lezem t7otha besh border 
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JPanel panel11 = new JPanel();
		JPanel panel22 = new JPanel();
		JPanel panel33 = new JPanel();
		JPanel panel44 = new JPanel();
		JPanel panel55 = new JPanel();
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.red);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.pink);
		panel5.setBackground(Color.yellow);
		
		panel11.setBackground(Color.orange);
		panel22.setBackground(Color.black);
		panel33.setBackground(Color.gray);
		panel44.setBackground(Color.red);
		panel55.setBackground(Color.white);
		
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		panel5.setLayout(new BorderLayout());
		
		panel11.setPreferredSize(new Dimension(50,50));
		panel22.setPreferredSize(new Dimension(50,50));
		panel33.setPreferredSize(new Dimension(50,50));
		panel44.setPreferredSize(new Dimension(50,50));
		panel55.setPreferredSize(new Dimension(50,50));
		
		
		panel5.add(panel11,BorderLayout.NORTH);
		panel5.add(panel22,BorderLayout.EAST);
		panel5.add(panel33,BorderLayout.SOUTH);
		panel5.add(panel44,BorderLayout.WEST);
		panel5.add(panel55,BorderLayout.CENTER);
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.EAST);
		frame.add(panel3,BorderLayout.SOUTH);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);
		
	
		
		
		
		
		
	}
}