import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo  implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	int number;
	SliderDemo(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		
		slider = new JSlider(0,100,50);
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		 number = 50;
		label.setText("C = "+number);
		
		
		label.setFont(new Font("MV Boli",Font.PLAIN,15));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == slider) {
			number = slider.getValue();
			label.setText("C = "+number);
		}
		
	}
	
}
