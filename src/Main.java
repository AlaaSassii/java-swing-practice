
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
class Main {
	public static void main(String[]args) {

//		#1
		int answer = JOptionPane.showConfirmDialog(null, "are you sure","confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(answer);
		
//		#2
		 String name = JOptionPane.showInputDialog("what is your name?");
		 System.out.println("Hello " + name);
		
//		 #3
		String[] responses = {"no, You are awesome","Thank you","*Blush*"};
		int number = JOptionPane.showOptionDialog(null,"You are awesome!","Secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,responses,0);
		System.out.println(number);
	}
}