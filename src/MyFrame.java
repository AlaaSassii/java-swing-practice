
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyFrame extends JFrame  implements ActionListener {

	JCheckBox checkBox;
	JButton button;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame(){
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		xIcon = new ImageIcon("images.png");
		checkIcon = new ImageIcon("star.png");
		
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());	
		this.add(checkBox);
		this.add(button);
		this.add(xIcon);
		this.add(checkIcon);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}

		}
