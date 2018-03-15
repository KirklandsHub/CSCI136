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

import javax.swing.JPanel;

public class Panel extends JPanel
{
	
	String membersName;
	
	
	
	public Panel()
	{
	setPreferredSize(new Dimension(400,400));
	setBackground(Color.WHITE);
	
	
	//instantiation of every other class
	Game myGame = new Game(membersName, 1, 2, 3);
	ItemToCollect myItems = new ItemToCollect();
	Player myPlayer = new Player("Kirk");
	Enemy myEnemy = new Enemy();
	Movement myMovement = new Movement();
	
	
	//prints out test toString from every class instantiated to test them
	//a blank panel will be displayed and all the toStrings will be printed in the console when the frame is called
	System.out.println(myGame.toString());
	System.out.println(myItems.toString());
	System.out.println(myPlayer.toString());
	System.out.println(myEnemy.toString());
	System.out.println(myMovement.toString());
	
		
	}
	
	
	private static void Timer()
	{
		//determines how often the screen is repainted and how often the enemy moves
		//called at an presently unknown time increment
	}
	
	
	private class buttonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//event handler just for start button
			
		}
	
	}	
	
	public static void Repaint()
	{
		//repaints screen
	}
	
}