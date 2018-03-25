package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Panel.java
 * Panel for displaying graphics of the game (instantiates each other class and prints a test toString)
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class StartPanel extends JPanel
{	
	
	public StartPanel()
	{
	setPreferredSize(new Dimension(1200,800));
	setBackground(Color.BLACK);
	
	JButton startButton = new JButton("Start Game");
	startButton.addActionListener(new buttonHandler());
	add(startButton);
		
	}	

	//Start button...
	private class buttonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Frame.startGame();
		}
	}
}
