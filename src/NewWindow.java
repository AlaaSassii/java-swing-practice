import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame("newWindow");
	JLabel label = new JLabel("hello !"); ;
	NewWindow(){
		
		label.setBounds(10,10,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("new Title");
		frame.setSize(400,250);
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	
}

