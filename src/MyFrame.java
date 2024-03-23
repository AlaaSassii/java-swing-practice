import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {

	
	JLabel label;
	
   MyFrame(){
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(500,500);
	   this.setLayout(null);
	   
	   label = new JLabel();
	   label.setBounds(0,0,100,100);
	   label.setBackground(new Color(0,192,255));
	   label.setOpaque(true);
	   label.addMouseListener(this);
	   this.add(label);
	   
	   this.setVisible(true);
   }

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("public void mouseClicked(MouseEvent e) ");
	label.setBackground(Color.black);
	label.setText("mouseClicked");
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("public void mousePressed(MouseEvent e)");
	label.setBackground(Color.red);
	label.setText("mousePressed");
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("public void mouseReleased(MouseEvent e)");
	label.setBackground(Color.yellow);
	label.setText("mouseReleased");
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("public void mouseEntered(MouseEvent e)");
	label.setBackground(Color.green);
	label.setText("mouseEntered");
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("public void mouseExited(MouseEvent e)");
	label.setBackground(Color.blue);
	label.setText("mouseExited");
}
}
