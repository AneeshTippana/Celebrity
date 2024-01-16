import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SimpleGUIRunner
{
	public static void main(String[] args)
	{
		JFrame sample = new JFrame();
		
		//look through the setters of the class. Is there one
		//to set the size?
		sample.setSize(800, 600);
		
		//set a layout manager to manage how things
		//are placed on the JFrame
		sample.setLayout(new FlowLayout());
		
		
		//assign closing x button to stopping the program
		sample.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
		
//		//adding components or widgets to the JFrame
//		JButton start= new JButton("You are awesome");
//		
//		//Ok, exploration time. How do you add this 
//		//to the JFrame object?!
//		sample.add(start); // <-- there's an add method!!!
//		
//		//Can you try and add a 2nd button!
//		//have it say "poop"
//		JButton poops = new JButton("poops");
//		
//		sample.add(poops);
//		
//		JCheckBox hello = new JCheckBox("hello");
//		
//		sample.add(hello);
//		
//		JRadioButton buzz = new JRadioButton("buzz");
//		
//		sample.add(buzz);
//		/**
//		 * Additional exploration:
//		 * 		Set the color of your buttons Gold.
//		 * make one of the buttons be as wide as the JFrame width
//		 */
//		Color goldColor = Color.decode("#FFD700");
//		start.setBackground(goldColor);
//		poops.setBackground(goldColor);
//		start.setPreferredSize(new Dimension(800,200));
		
		JTextField celebrity = new JTextField("Type celebrity here(4 letters minimum thx Cher)");
		sample.add(celebrity);
		celebrity.setPreferredSize(new Dimension(750,20));
		
		JLabel clued = new JLabel("Enter the clue for the celebrity below");
		sample.add(clued);
		
		
		
		JTextField clue = new JTextField("Type celebrity clue here(4 letters minimum)");
		sample.add(clue);
		clue.setPreferredSize(new Dimension(750,20));
		
		JButton current = new JButton("Add current celebrity");
		sample.add(current);
		current.setPreferredSize(new Dimension(750, 30));
		
		
		sample.setVisible(true);
	}

}
