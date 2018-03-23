package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


/*
 * Kirk and Ben Game Project
 * 3/10/18
 * Enemy.java
 * This class controls the attributes and methods associated with the Enemy object
 */

public class Enemy {
	
	private int speed;
	private int x;
	private int y;
	private String imagePath;
	private Panel myEnemy;
	private Player myPlayer;
	Timer myTimer = new Timer(15, new timerListener());
	
	public Enemy(Panel myEnemy, Player myPlayer, int x, int y, String imagePath)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;
		this.myEnemy = myEnemy;
		this.myPlayer = myPlayer;
		myTimer.start();
	
	}

	private class timerListener implements ActionListener
	{
		

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			
			if(getX() < myPlayer.getX())
			{setX(getX()+1);}
			else if(getY() < myPlayer.getY())
			{setY(getY()+1);}
			if(getX() > myPlayer.getX())
			{setX(getX()-1);}
			else if(getY() > myPlayer.getY())
			{setY(getY()-1);}
			myEnemy.repaint();
			
		}
		
	}	
	
	//maybe needs to get put into movement class???
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getImagePath() 
	{
		return imagePath;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	// speed getter and setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}