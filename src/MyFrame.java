
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("file");
	JMenu editMenu = new JMenu("edit");
	JMenu helpMenu = new JMenu("help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("exit");
	
	MyFrame(){

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_D); // l for load
		editMenu.setMnemonic(KeyEvent.VK_L);
		helpMenu.setMnemonic(KeyEvent.VK_P);
		
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loadItem) {
				System.out.println("loadItem");
		}
		if(e.getSource() == saveItem) {
			System.out.println("saveItem");
		}
		if(e.getSource() == exitItem) {
			System.out.println("exitItem");
			System.exit(0);
		}
	}
	
		}
