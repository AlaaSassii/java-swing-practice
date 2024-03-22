import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame   {
		JButton button ;
		JLabel label;
		MyFrame(){
			ImageIcon icon = new ImageIcon("star.jpg");
			ImageIcon icon2 = new ImageIcon("images.jpg");
			
			label = new JLabel();
			label.setIcon(icon2);
			label.setBounds(150,250,10,15);
			label.setVisible(false);
			
			button = new JButton();
			button.setBounds(100,100,25,25);
			button.setText("Click Me!");
			button.setFocusable(false);
			button.addActionListener(e ->{
				 System.out.println("poo");
				 label.setVisible(true);
//				 button.setEnabled(false);
			});
			button.setIcon(icon);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.setFont(new Font("Comic sans",Font.BOLD,25));
			button.setIconTextGap(-10);
			button.setForeground(Color.red);
			button.setBackground(Color.white);
			//	optional
			button.setEnabled(true);
			
			
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(500,500);
			this.setVisible(true);
			this.add(button);
			this.setIconImage(icon.getImage());
			this.add(label);
		}

		
			
		
}
