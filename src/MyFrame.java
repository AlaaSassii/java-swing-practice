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
			// Create ImageIcon objects with specified image file paths.
			ImageIcon icon = new ImageIcon("star.jpg");
			ImageIcon icon2 = new ImageIcon("images.jpg");

			// Create a JLabel component.
			label = new JLabel();

			// Set the icon of the label to the second image.
			label.setIcon(icon2);

			// Set the bounds (position and size) of the label.
			label.setBounds(150, 250, 10, 15);

			// Set the label to initially be invisible.
			label.setVisible(false);

			// Create a JButton component.
			button = new JButton();

			// Set the bounds (position and size) of the button.
			button.setBounds(100, 100, 25, 25);

			// Set the text displayed on the button.
			button.setText("Click Me!");

			// Ensure the button does not receive focus when clicked.
			button.setFocusable(false);

			// Add an action listener to the button using lambda expression.
			button.addActionListener(e -> {
			    // Print "poo" to the console when the button is clicked.
			    System.out.println("poo");

			    // Make the label visible when the button is clicked.
			    label.setVisible(true);

			    // Disable the button when clicked.
			    //button.setEnabled(false);
			});

			// Set the icon of the button to the first image.
			button.setIcon(icon);

			// Set the horizontal position of the text relative to the icon (CENTER).
			button.setHorizontalTextPosition(JButton.CENTER);

			// Set the vertical position of the text relative to the icon (BOTTOM).
			button.setVerticalTextPosition(JButton.BOTTOM);

			// Set the font of the text on the button.
			button.setFont(new Font("Comic sans", Font.BOLD, 25));

			// Set the gap between the icon and text on the button.
			button.setIconTextGap(-10);

			// Set the color of the text on the button to red.
			button.setForeground(Color.red);

			// Set the background color of the button to white.
			button.setBackground(Color.white);

			// Enable the button.
			button.setEnabled(true);

			// Set the default close operation for the JFrame.
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			// Set the layout of the JFrame to null layout.
			this.setLayout(null);

			// Set the size of the JFrame.
			this.setSize(500, 500);

			// Make the JFrame visible.
			this.setVisible(true);

			// Add the button to the JFrame.
			this.add(button);

			// Set the icon image of the JFrame to the first image.
			this.setIconImage(icon.getImage());

			// Add the label to the JFrame.
			this.add(label);

		}

		
			
		
}
