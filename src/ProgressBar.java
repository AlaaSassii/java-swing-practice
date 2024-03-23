import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ProgressBar  implements ChangeListener{
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	int number;
	ProgressBar(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV  Boli!",Font.BOLD,25));
		bar.setForeground(new Color(0,192,255));
		
		frame.add(bar);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();
	}
	public void fill() {
		int counter = 0;
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			counter+=1;
		}
		bar.setString("Done!!");
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
	}
	
}
