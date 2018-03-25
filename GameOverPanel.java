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
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameOverPanel extends JPanel
{	
	
	
	public GameOverPanel()
	{
	setPreferredSize(new Dimension(1200,800));
	setBackground(Color.BLACK);
	
	JLabel gameOver = new JLabel("GAME OVER!!!");
	JButton startButton = new JButton("Start Screen");
	startButton.addActionListener(new buttonHandler());
	add(startButton);
		
	}	

	//Start button...
	private class buttonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Frame.startScreen();
		}
	}
}
