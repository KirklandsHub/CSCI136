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
	
	private int speed, x, y;
	private String imagePath;
	private GamePanel gamePanel;
	Player myPlayer;
	final static int WIDTH = 100, HEIGHT = 100;
	Timer myTimer = new Timer(500, new timerListener());
	
	public Enemy(Player myPlayer, GamePanel gamePanel, int x, int y, String imagePath)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;
		this.myPlayer = myPlayer;
		this.gamePanel = gamePanel;
		myTimer.start();
	
	}

	private class timerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			if(getX() < myPlayer.getX())
			{setX(getX()+5);}
			if(getY() < myPlayer.getY())
			{setY(getY()+5);}
			if(getX() > myPlayer.getX())
			{setX(getX()-5);}
			if(getY() > myPlayer.getY())
			{setY(getY()-5);}
			gamePanel.repaint();
		}
	}
	
	public void stopTimer() {
		myTimer.stop();
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