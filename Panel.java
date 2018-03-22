package project;
/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Panel.java
 * Panel for displaying graphics of the game (instantiates each other class and prints a test toString)
 */
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Panel extends JPanel
{
	
	String membersName;
	
	

	//instantiate Player class for player picture
	Player myPlayer = new Player(membersName, this, 500,50, "./src/Jon Snow.jpg");
	ImageIcon myIcon = new ImageIcon(myPlayer.getImagePath());
	//scale image
	Image newimg = myIcon.getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT);
	
	
	
	//instantiate Movement class for enemy picture
	Movement myEnemy = new Movement(0,0, "./src/Night King.jpg");//needs to be Enemy myEnemy = new Enemy(this, this, 0,0, ect...)
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getImagePath());
	//scale image
	Image newimg2 = myIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	
	
	//instantiate timer
	Timer myTimer = new Timer(10, new timerListener()); //needs to be in Enemy class or ItemsToCollect class
	
	
	
	public Panel()
	{
	setPreferredSize(new Dimension(400,400));
	setBackground(Color.WHITE);
	

	//start timer needs to be in Enemy class
	myTimer.start();	
	
	
	//set both icons to scaled images
	myIcon.setImage(newimg);
	myIcon2.setImage(newimg2);

		
	}
	
	
	//Draws a new picture every time it is called using repaint()
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myEnemy.getX(), myEnemy.getY(), null);
	}


	

	//THE FOLLOWING CODE NEEDS TO BE IN ENEMY CLASS...
/*************************************************************************/	
	private class timerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			//makes enemy chase player
			if(myEnemy.getX() < myPlayer.getX())
			{myEnemy.setX(myEnemy.getX()+1);}
			else if(myEnemy.getX() > myPlayer.getX())
			{myEnemy.setX(myEnemy.getX()-1);}
			else if(myEnemy.getY() < myPlayer.getY())
			{myEnemy.setY(myEnemy.getY()+1);}
			else if(myEnemy.getY() > myPlayer.getY())
			{myEnemy.setY(myEnemy.getY()-1);}
			repaint();
		}
		
	}	
/**************************************************************************/	
	
	//Start button...

	private class buttonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
		}
	
	}
	
}
