
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {
	
	
	JButton button;
	JLabel label;
	

	MyFrame(){
		button = new JButton("pick a color");
		button.addActionListener(this);
		
		label = new JLabel("this is Some Text :D");
		label.setBackground(Color.white);
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(button);
		this.add(label);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null,"pick a color .. I guess",Color.black);
			label.setForeground(color);
		}
		// nicec
	
	
		}}
