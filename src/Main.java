import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[]args) {
		Border border = BorderFactory.createLineBorder(Color.white,10);
		JLabel label = new JLabel("Bro do you even code?");
		ImageIcon image = new ImageIcon("images.jpg");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(20);
		label.setBackground(new Color(0,192,255));
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(65,65,350,350);
		
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.getContentPane().setBackground(Color.white);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}
}